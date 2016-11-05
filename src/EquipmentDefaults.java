/* Class82_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EquipmentDefaults extends Class82 {
    int anInt6890;
    int anInt6891;
    public static Class405 aClass405_6892;

    public void method869() {
	Class136.method1495(((EquipmentDefaults) this).anInt6890 * 115033111, 0, ((EquipmentDefaults) this).anInt6891 * -1734052405, -649427988);
    }

    public void method866(int i) {
	try {
	    Class136.method1495(((EquipmentDefaults) this).anInt6890 * 115033111, 0, ((EquipmentDefaults) this).anInt6891 * -1734052405, -649427988);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("yl.f(").append(')').toString());
	}
    }

    public void method868() {
	Class136.method1495(((EquipmentDefaults) this).anInt6890 * 115033111, 0, ((EquipmentDefaults) this).anInt6891 * -1734052405, -649427988);
    }

    EquipmentDefaults(RsByteBuffer class298_sub53) {
	super(class298_sub53);
	((EquipmentDefaults) this).anInt6890 = class298_sub53.readUnsignedShort() * 2089431975;
	((EquipmentDefaults) this).anInt6891 = class298_sub53.readUnsignedByte() * 779683811;
    }

    public static final void method922(byte i) {
	try {
	    if (!pb.aBoolean8762) {
		pb.aFloat8759 += (24.0F - pb.aFloat8759) / 2.0F;
		pb.aBoolean8763 = true;
		pb.aBoolean8762 = true;
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("yl.hc(").append(')').toString());
	}
    }

    static final void method923(Class403 class403, short i) {
	try {
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = pb.aBoolean8638 ? 1 : 0;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("yl.afb(").append(')').toString());
	}
    }
}
