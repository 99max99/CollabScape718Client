/* Class372_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372_Sub2 extends Class372 {
    static int anInt7728 = 4096;
    static int anInt7729 = 12;

    Class372_Sub2() throws Throwable {
	throw new Error();
    }

    static final void method4598(Class403 class403, int i) {
	try {
	    ((Class403) class403).anInt5239 -= -1567522756;
	    pb.aShort8839 = (short) (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239]);
	    if (pb.aShort8839 <= 0)
		pb.aShort8839 = (short) 1;
	    pb.aShort8743 = (short) (((Class403) class403).anIntArray5244[1 + 681479919 * ((Class403) class403).anInt5239]);
	    if (pb.aShort8743 <= 0)
		pb.aShort8743 = (short) 32767;
	    else if (pb.aShort8743 < pb.aShort8839)
		pb.aShort8743 = pb.aShort8839;
	    pb.aShort8934 = (short) (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239 + 2]);
	    if (pb.aShort8934 <= 0)
		pb.aShort8934 = (short) 1;
	    pb.aShort8935 = (short) (((Class403) class403).anIntArray5244[3 + 681479919 * ((Class403) class403).anInt5239]);
	    if (pb.aShort8935 <= 0)
		pb.aShort8935 = (short) 32767;
	    else if (pb.aShort8935 < pb.aShort8934)
		pb.aShort8935 = pb.aShort8934;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("adr.aki(").append(')').toString());
	}
    }
}
