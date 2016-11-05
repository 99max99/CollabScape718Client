/* Class438_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class438_Sub2 extends Class438 {
    Class365_Sub1 aClass365_Sub1_8440;

    void method5848(AnimationDefinition class391, int i) {
	Class209.method1938(class391, i, ((Class438_Sub2) this).aClass365_Sub1_8440, -463239640);
    }

    void method5837(AnimationDefinition class391, int i, byte i_0_) {
	try {
	    Class209.method1938(class391, i, ((Class438_Sub2) this).aClass365_Sub1_8440, -1175411035);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aew.l(").append(')').toString());
	}
    }

    Class438_Sub2(Class365_Sub1 class365_sub1, boolean bool) {
	super(bool);
	((Class438_Sub2) this).aClass365_Sub1_8440 = class365_sub1;
    }

    static boolean method5849(Interface3 interface3, byte i) {
	try {
	    ObjectDefinitions class432 = pb.aClass283_8716.method2641(1998541007).getObjectDefinitions(interface3.method32((byte) 21));
	    if (-1 == -1204256389 * class432.anInt5400)
		return true;
	    MapIconDefinitions mapIconDefinitions = ConfigEntry.aClass487_1463.method6159((class432.anInt5400 * -1204256389), -2130110173);
	    if (-1 == 1690480405 * mapIconDefinitions.anInt6097)
		return true;
	    return mapIconDefinitions.loaded((byte) 7);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aew.d(").append(')').toString());
	}
    }
}
