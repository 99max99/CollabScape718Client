/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144 {
    JS5 idx2;
    JS5 aClass243_1560;
    Class348 aClass348_1561 = new Class348(64);
    static Sprite aClass57_1562;
    public static Class381 aClass381_1563;

    public PlayerLookDefinitions method1579(int i, int i_0_) {
	try {
	    PlayerLookDefinitions playerLookDefinitions;
	    synchronized (((Class144) this).aClass348_1561) {
		playerLookDefinitions = (PlayerLookDefinitions) ((Class144) this).aClass348_1561.get((long) i);
	    }
	    if (playerLookDefinitions != null)
		return playerLookDefinitions;
	    byte[] is;
	    synchronized (((Class144) this).idx2) {
		is = (((Class144) this).idx2.getFile(ConfigEntry.aClass120_1425.anInt1460 * -1006924897, i));
	    }
	    playerLookDefinitions = new PlayerLookDefinitions();
	    ((PlayerLookDefinitions) playerLookDefinitions).aClass144_1500 = this;
	    if (is != null)
		playerLookDefinitions.method1472(new RsByteBuffer(is), 1546025245);
	    synchronized (((Class144) this).aClass348_1561) {
		((Class144) this).aClass348_1561.put(playerLookDefinitions, (long) i);
	    }
	    return playerLookDefinitions;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.a(").append(')').toString());
	}
    }

    public void method1580(byte i) {
	try {
	    synchronized (((Class144) this).aClass348_1561) {
		((Class144) this).aClass348_1561.method4187();
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.f(").append(')').toString());
	}
    }

    public void method1581(int i) {
	try {
	    synchronized (((Class144) this).aClass348_1561) {
		((Class144) this).aClass348_1561.method4189();
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.p(").append(')').toString());
	}
    }

    public void method1582(int i, int i_1_) {
	try {
	    synchronized (((Class144) this).aClass348_1561) {
		((Class144) this).aClass348_1561.method4186(i, -1045157545);
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.b(").append(')').toString());
	}
    }

    public Class144(Class411 class411, Class429 class429, JS5 class243, JS5 class243_2_) {
	((Class144) this).idx2 = class243;
	((Class144) this).aClass243_1560 = class243_2_;
	((Class144) this).idx2.getFileCountForArchive((-1006924897 * (ConfigEntry.aClass120_1425.anInt1460)), -2109974583);
    }

    static final void method1583(Class403 class403, int i) {
	try {
	    Class390 class390 = (((Class403) class403).aBoolean5261 ? ((Class403) class403).aClass390_5247 : ((Class403) class403).aClass390_5246);
	    IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
	    Class119 class119 = ((Class390) class390).aClass119_4167;
	    Class377.method4665(class105, class119, class403, (short) 14954);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.fz(").append(')').toString());
	}
    }

    static final void method1584(Class403 class403, int i) {
	try {
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((Class403) class403).aClass162_5252.deputyOwnerWithLeaderPriorityID * 873199607;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.xc(").append(')').toString());
	}
    }

    static final void method1585(Class403 class403, int i) {
	try {
	    int i_3_ = (((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689) * 681479919)]);
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub10_7548.method5612(i_3_, 1352882135);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.aog(").append(')').toString());
	}
    }

    static final void method1586(Class403 class403, int i) {
	try {
	    NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((Class403) class403).aClass365_Sub1_Sub1_Sub2_5242);
	    NPCDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
	    if (class503.anIntArray6188 != null)
		class503 = class503.method6240(Class128.aClass148_6331, 1999627505);
	    ((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = class503 != null ? 1 : 0;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.apl(").append(')').toString());
	}
    }

    public static void method1587(byte i) {
	try {
	    if (pb.aBoolean8835) {
		IComponentDefinition class105 = Class140.method1558(Class379.anInt4099 * 1262526353, 392084321 * pb.anInt8836, -156511736);
		if (null != class105 && class105.anObjectArray1120 != null) {
		    Class298_Sub46 class298_sub46 = new Class298_Sub46();
		    class298_sub46.aClass105_7525 = class105;
		    class298_sub46.anObjectArray7530 = class105.anObjectArray1120;
		    Class444.method5889(class298_sub46, (byte) 77);
		}
		pb.anInt8937 = 280458557;
		pb.usedId = -398138063;
		pb.aBoolean8835 = false;
		if (class105 != null)
		    Tradution.method6054(class105, -1858273017);
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.kb(").append(')').toString());
	}
    }

    static final void method1588(Class403 class403, byte i) {
	try {
	    ((Class403) class403).anInt5239 -= -783761378;
	    int i_4_ = (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239]);
	    int i_5_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919 + 1]);
	    if (Class287.myPlayer.aClass366_10209 != null)
		Class287.myPlayer.aClass366_10209.method4541(i_4_, i_5_, Class298_Sub32_Sub14.aClass477_9400, (byte) -1);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.cv(").append(')').toString());
	}
    }
}
