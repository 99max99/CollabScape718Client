/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectOverride {
    long id;
    short[] destTextures;
    short[] destColours;
    int[] anIntArray5463;

    public ObjectOverride(long l, int[] is, short[] is_0_, short[] is_1_) {
	((ObjectOverride) this).id = l * 8069314464859468115L;
	((ObjectOverride) this).anIntArray5463 = is;
	((ObjectOverride) this).destColours = is_0_;
	((ObjectOverride) this).destTextures = is_1_;
    }

    public static boolean method5804(int i, byte i_2_) {
	try {
	    return 0 == i || i == 17 || 6 == i;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("rz.ff(").append(')').toString());
	}
    }
}
