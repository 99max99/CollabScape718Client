/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TextureMetrics {
	public byte textureSpeedV;
	public static int anInt510 = 1;
	public static int anInt511 = 2;
	public static int anInt512 = 3;
	public static int anInt513 = 4;
	public static int anInt514 = 5;
	public static int anInt515 = 6;
	public static int anInt516 = 10;
	public static int anInt517 = 8;
	public boolean isHalfSize;
	public int combineMode;
	public static int anInt520 = 7;
	public static int anInt521 = 12;
	public static int anInt522 = 13;
	public static int anInt523 = 16;
	public boolean isGroundMesh;
	public static int anInt525 = 1;
	public static int anInt526 = 2;
	public boolean aBoolean527;
	public int blendType;
	public byte effectId;
	public static int anInt530 = 9;
	public int effectParam2;
	public short color;
	public byte shadowFactor;
	public byte brightness;
	public byte textureSpeedU;
	public byte effectParam1;
	public byte useMipmaps;
	public boolean skipTriangles;
	public static int anInt539 = 0;
	public byte repeatS;
	public byte repeatT;
	public static int anInt542 = 0;
	public boolean hdr;
	public boolean isBrickTile;
	public static int anInt545 = 11;
	byte[] aByteArray1289 = null;
	public int[] anIntArray1268 = null;
	public int bitLoad;
	public byte blendMode;
	public int textureId;

	static void method599(Class119 class119, IComponentDefinition class105, byte i) {
		try {
			if (null != class105) {
				if (-1 != -1309843523 * class105.anInt1154) {
					IComponentDefinition class105_0_ = (class119.aClass105Array1405[class105.anInt1160 * 1573706803 & 0xffff]);
					if (class105_0_ != null) {
						if (class105_0_.aClass105Array1293 == class105_0_.aClass105Array1292) {
							class105_0_.aClass105Array1293 = (new IComponentDefinition[class105_0_.aClass105Array1292.length]);
							class105_0_.aClass105Array1293[0] = class105;
							Class425.arrayCopy(class105_0_.aClass105Array1292, 0, class105_0_.aClass105Array1293, 1, (class105.anInt1154 * -1309843523));
							Class425.arrayCopy(class105_0_.aClass105Array1292, 1 + class105.anInt1154 * -1309843523, class105_0_.aClass105Array1293, 1 + -1309843523 * class105.anInt1154, (class105_0_.aClass105Array1292.length - class105.anInt1154 * -1309843523 - 1));
						}
						else {
							int i_1_ = 0;
							IComponentDefinition[] class105s;
							for (class105s = class105_0_.aClass105Array1293; i_1_ < class105s.length; i_1_++) {
								if (class105 == class105s[i_1_]) {
									if (i >= 0)
										throw new IllegalStateException();
									break;
								}
							}
							if (i_1_ < class105s.length) {
								Class425.arrayCopy(class105s, 0, class105s, 1, i_1_);
								class105s[0] = class105;
							}
						}
					}
				}
				else {
					IComponentDefinition[] class105s = class119.method1296((byte) -3);
					int i_2_;
					for (i_2_ = 0; i_2_ < class105s.length; i_2_++) {
						if (class105s[i_2_] == class105) {
							if (i >= 0) {
								/* empty */
							}
							break;
						}
					}
					if (i_2_ < class105s.length) {
						Class425.arrayCopy(class105s, 0, class105s, 1, i_2_);
						class105s[0] = class105;
					}
				}
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cc.t(").append(')').toString());
		}
	}

	static final void method600(Class403 class403, byte i) {
		try {
			((Class403) class403).anInt5239 -= -1175642067;
			Class136.method1495((((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]), (((Class403) class403).anIntArray5244[1 + ((Class403) class403).anInt5239 * 681479919]), (((Class403) class403).anIntArray5244[2 + ((Class403) class403).anInt5239 * 681479919]), -649427988);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cc.tp(").append(')').toString());
		}
	}

	static final void method601(Class403 class403, int i) {
		try {
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = pb.anInt8834 * 1396956439;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cc.uz(").append(')').toString());
		}
	}

	static final void method602(int i) {
		try {
			Tradution.method6054(pb.aClass105_8850, -1659993558);
			Class82_Sub22.anInt6917 += -1137234765;
			if (!pb.aBoolean8938 || !pb.aBoolean8855) {
				if (379282043 * Class82_Sub22.anInt6917 > 1) {
					pb.aClass105_8850 = null;
					pb.aClass105_8712 = null;
				}
			}
			else {
				int i_3_ = Class165.aClass319_6366.method3894((byte) -21);
				int i_4_ = Class165.aClass319_6366.method3883((byte) -35);
				i_3_ -= -98735103 * pb.anInt8734;
				i_4_ -= -938469429 * pb.anInt8853;
				if (i_3_ < pb.anInt8856 * -343518257)
					i_3_ = -343518257 * pb.anInt8856;
				if (i_3_ + -2093041337 * pb.aClass105_8850.anInt1156 > (pb.anInt8858 * -1221279965 + -343518257 * pb.anInt8856))
					i_3_ = (-343518257 * pb.anInt8856 + pb.anInt8858 * -1221279965 - -2093041337 * pb.aClass105_8850.anInt1156);
				if (i_4_ < 1325631359 * pb.anInt8800)
					i_4_ = 1325631359 * pb.anInt8800;
				if (457937409 * pb.aClass105_8850.anInt1162 + i_4_ > (1325631359 * pb.anInt8800 + -609231901 * pb.anInt8966))
					i_4_ = (-609231901 * pb.anInt8966 + pb.anInt8800 * 1325631359 - 457937409 * pb.aClass105_8850.anInt1162);
				int i_5_;
				int i_6_;
				if (Class82_Sub3.aClass105_6825 == pb.aClass105_8712) {
					i_5_ = i_3_;
					i_6_ = i_4_;
				}
				else {
					i_5_ = (i_3_ - pb.anInt8856 * -343518257 + 684246511 * pb.aClass105_8712.anInt1166);
					i_6_ = (i_4_ - pb.anInt8800 * 1325631359 + pb.aClass105_8712.anInt1167 * -1424956747);
				}
				if (!Class165.aClass319_6366.method3881((byte) 88)) {
					if (pb.aBoolean8863) {
						Class144.method1587((byte) 4);
						if (pb.aClass105_8850.anObjectArray1137 != null) {
							Class298_Sub46 class298_sub46 = new Class298_Sub46();
							class298_sub46.aClass105_7525 = pb.aClass105_8850;
							class298_sub46.anInt7526 = 622624491 * i_5_;
							class298_sub46.anInt7527 = i_6_ * 335112545;
							class298_sub46.aClass105_7529 = pb.aClass105_8854;
							class298_sub46.anObjectArray7530 = pb.aClass105_8850.anObjectArray1137;
							Class444.method5889(class298_sub46, (byte) 83);
						}
						if (pb.aClass105_8854 != null && (pb.method2808(pb.aClass105_8850) != null))
							Class380.method4679(pb.aClass105_8850, pb.aClass105_8854, 1471379856);
					}
					else if ((2089115297 * pb.anInt8830 == 1 || Class58.method694(-1591809416)) && Class436.anInt5506 * -278777595 > 2)
						Class63.method738((-1040412347 * pb.anInt8861 + -98735103 * pb.anInt8734), (pb.anInt8862 * 601707167 + pb.anInt8853 * -938469429), -2029149482);
					else if (Class63.method740(2078410937))
						Class63.method738((pb.anInt8734 * -98735103 + -1040412347 * pb.anInt8861), (pb.anInt8862 * 601707167 + -938469429 * pb.anInt8853), -2029149482);
					pb.aClass105_8850 = null;
					pb.aClass105_8712 = null;
				}
				else {
					if (379282043 * Class82_Sub22.anInt6917 > 2117401247 * pb.aClass105_8850.anInt1235) {
						int i_7_ = i_3_ - pb.anInt8861 * -1040412347;
						int i_8_ = i_4_ - 601707167 * pb.anInt8862;
						if ((i_7_ > pb.aClass105_8850.anInt1239 * -1855449225) || i_7_ < -(-1855449225 * pb.aClass105_8850.anInt1239) || i_8_ > (-1855449225 * pb.aClass105_8850.anInt1239) || i_8_ < -(-1855449225 * pb.aClass105_8850.anInt1239))
							pb.aBoolean8863 = true;
					}
					if (null != pb.aClass105_8850.anObjectArray1291 && pb.aBoolean8863) {
						Class298_Sub46 class298_sub46 = new Class298_Sub46();
						class298_sub46.aClass105_7525 = pb.aClass105_8850;
						class298_sub46.anInt7526 = 622624491 * i_5_;
						class298_sub46.anInt7527 = i_6_ * 335112545;
						class298_sub46.anObjectArray7530 = pb.aClass105_8850.anObjectArray1291;
						Class444.method5889(class298_sub46, (byte) 72);
					}
				}
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cc.lm(").append(')').toString());
		}
	}
}
