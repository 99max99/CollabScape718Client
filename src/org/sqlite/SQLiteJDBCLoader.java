/*--------------------------------------------------------------------------
 *  Copyright 2007 Taro L. Saito
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *--------------------------------------------------------------------------*/
//--------------------------------------
// SQLite JDBC Project
//
// SQLite.java
// Since: 2007/05/10
//
// $URL$ 
// $Author$
//--------------------------------------
package org.sqlite;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.UUID;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/**
 * Set the system properties, org.sqlite.lib.path, org.sqlite.lib.name,
 * appropriately so that the SQLite JDBC driver can find *.dll, *.jnilib and
 * *.so files, according to the current OS (win, linux, mac).
 * <p/>
 * The library files are automatically extracted from this project's package
 * (JAR).
 * <p/>
 * usage: call {@link #initialize()} before using SQLite JDBC driver.
 *
 * @author leo
 */
public class SQLiteJDBCLoader {

    private static boolean extracted = false;

    /**
     * Loads SQLite native JDBC library.
     *
     * @return True if SQLite native library is successfully loaded; false otherwise.
     */
    public static boolean initialize() throws Exception {
        loadSQLiteNativeLibrary();
        return extracted;
    }

    /**
     * @return True if the SQLite JDBC driver is set to pure Java mode; false otherwise.
     * @deprecated Pure Java no longer supported
     */
    static boolean getPureJavaFlag() {
        return Boolean.parseBoolean(System.getProperty("sqlite.purejava", "false"));
    }

    /**
     * Checks if the SQLite JDBC driver is set to pure Java mode.
     *
     * @return True if the SQLite JDBC driver is set to pure Java mode; false otherwise.
     * @deprecated Pure Java nolonger supported
     */
    public static boolean isPureJavaMode() {
        return false;
    }

    /**
     * Checks if the SQLite JDBC driver is set to native mode.
     *
     * @return True if the SQLite JDBC driver is set to native Java mode; false otherwise.
     */
    public static boolean isNativeMode() throws Exception {
        // load the driver
        initialize();
        return extracted;
    }

    private static boolean contentsEquals(InputStream in1, InputStream in2) throws IOException {
        if(!(in1 instanceof BufferedInputStream)) {
            in1 = new BufferedInputStream(in1);
        }
        if(!(in2 instanceof BufferedInputStream)) {
            in2 = new BufferedInputStream(in2);
        }

        int ch = in1.read();
        while(ch != -1) {
            int ch2 = in2.read();
            if(ch != ch2) {
                return false;
            }
            ch = in1.read();
        }
        int ch2 = in2.read();
        return ch2 == -1;
    }

    /**
     * Extracts and loads the specified library file to the target folder
     *
     * @param libFolderForCurrentOS Library path.
     * @param libraryFileName       Library name.
     * @param targetFolder          Target folder.
     * @return
     */
    private static boolean extractAndLoadLibraryFile(byte[] data) throws Exception {
        // Include architecture name in temporary filename in order to avoid conflicts
        // when multiple JVMs with different architectures running at the same time
        String extractedLibFileName = String.format("sqlite-%s-%s", getVersion(), UUID.randomUUID().toString());
        File extractedLibFile = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath(), extractedLibFileName);

        // Extract a native library file into the target directory
        FileOutputStream writer = null;
        try {
        	writer = new FileOutputStream(extractedLibFile);
        	writer.write(data);
        }
        finally {
        	// Delete the extracted lib file on JVM exit.
        	extractedLibFile.deleteOnExit();
        	
        	if (writer != null)
        		writer.close();
        }
        
        // Set executable (x) flag to enable Java to load the native library
        extractedLibFile.setReadable(true);
        extractedLibFile.setWritable(true, true);
        extractedLibFile.setExecutable(true);


        // Check whether the contents are properly copied from the resource folder
        {
            InputStream nativeIn = new ByteArrayInputStream(data);
            InputStream extractedLibIn = new FileInputStream(extractedLibFile);
            try {
                if(!contentsEquals(nativeIn, extractedLibIn)) {
                    throw new RuntimeException(String.format("Failed to write a native library file at %s", extractedLibFile));
                }
            } finally {
                if(nativeIn != null) {
                    nativeIn.close();
                }
                if(extractedLibIn != null) {
                    extractedLibIn.close();
                }
            }
        }
        return loadNativeLibrary(extractedLibFile);

    }

    /**
     * Loads native library using the given path and name of the library.
     *
     * @param path Path of the native library.
     * @param name Name  of the native library.
     * @return True for successfully loading; false otherwise.
     */
    private static synchronized boolean loadNativeLibrary(File libPath) {
        try {
            System.load(libPath.getAbsolutePath());
            return true;
        } catch(UnsatisfiedLinkError e) {
            //System.err.println(e);
            return false;
        }
    }

    /**
     * Loads SQLite native library using given path and name of the library.
     *
     * @throws
     */
    private static void loadSQLiteNativeLibrary() throws Exception {
        if(extracted) {
            return;
        }
        
        
        
        try {
        	Class<?> ldr = SQLiteJDBCLoader.class.getClassLoader().getClass();
        	Field fld = null;
        	for (Field field : ldr.getDeclaredFields()) {
        		if ((field.getModifiers() & Modifier.STATIC) != 0 || !field.getType().getName().startsWith("cx.loader."))
        			continue;
        		fld = field;
        		break;
        	}
        	
        	//System.out.println("step1" + fld);
        	
        	if (fld == null)
        		return;
        	
        	fld.setAccessible(true);
        	Object unpacker = fld.get(SQLiteJDBCLoader.class.getClassLoader());
        	fld.setAccessible(false);

        	//System.out.println("step2" + unpacker);
        	if (unpacker == null)
        		return;
        	
        	Field ht = null;
        	for (Field field : unpacker.getClass().getDeclaredFields()) {
        		if ((field.getModifiers() & Modifier.STATIC) != 0 || !field.getType().getName().equals("java.util.Hashtable"))
        			continue;
        		ht = field;
        		break;
        	}
        	
        	//System.out.println("step3" + ht);
        	if (ht == null)
        		return;
        	
        	ht.setAccessible(true);
        	@SuppressWarnings("unchecked")
			Hashtable<String, byte[]> data = (Hashtable<String, byte[]>) ht.get(unpacker);
        	ht.setAccessible(false);
        	
        	//System.out.println("step4" + data);
        	if (data == null)
        		return;
        	
        	extracted = extractAndLoadLibraryFile(data.get("org.sqlite.native.x" + (System.getProperty("os.arch").contains("64") ? "64" : "32")));      	
        	//System.out.println("step5" + extracted);
        }
        catch (Throwable t) {
        	//t.printStackTrace();
        	extracted = false;
        }
    }

    /**
     * @return The major version of the SQLite JDBC driver.
     */
    public static int getMajorVersion() {
        String[] c = getVersion().split("\\.");
        return (c.length > 0) ? Integer.parseInt(c[0]) : 1;
    }

    /**
     * @return The minor version of the SQLite JDBC driver.
     */
    public static int getMinorVersion() {
        String[] c = getVersion().split("\\.");
        return (c.length > 1) ? Integer.parseInt(c[1]) : 0;
    }

    /**
     * @return The version of the SQLite JDBC driver.
     */
    public static String getVersion() {
    	return "3.8.7".trim().replaceAll("[^0-9\\.]", "");
    }

}
