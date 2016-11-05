
/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ParticleDefinitions {
	static Class348 aClass348_1815 = new Class348(64);
	public static int anInt1816 = 1;
	public static int anInt1817 = 2;
	public boolean aBoolean1818;
	public int anInt1819 = 0;
	public short minimumAngleH;
	static JS5 aClass243_1821;
	public short minimumAngleV;
	public int[] anIntArray1823;
	public int minimumSpeed;
	int anInt1825;
	public int anInt1826;
	int anInt1827;
	public int endSpeed = -460402411;
	public int[] anIntArray1829;
	int speedChange = 551876020;
	public int maximumSize;
	public int endSize = -1186467237;
	int sizeChange = -82525436;
	int minimumStartColour;
	int maximumStartColour;
	public boolean activeFirst;
	public int fadeColour;
	int colourFading;
	int alphaFading;
	public int anInt1840;
	public int minimumLifetime;
	public int maximumLifetime;
	public int minimumParticleRate;
	public int maximumParticleRate;
	public int alphaFadeStart;
	public int[] anIntArray1846;
	public int anInt1847;
	public int[] anIntArray1848;
	public static int anInt1849 = -1;
	public int anInt1850;
	public int anInt1851;
	public int anInt1852;
	public short maximumAngleH;
	public boolean periodic;
	public int anInt1855;
	public int anInt1856;
	public int minimumSetting;
	public int maximumSpeed;
	public int lifetime;
	public boolean uniformColourVariance = true;
	static int anInt1861 = 0;
	public boolean aBoolean1862;
	public boolean aBoolean1863;
	public boolean aBoolean1864;
	public int anInt1865;
	int anInt1866;
	public int anInt1867;
	public int anInt1868;
	public int minimumSize;
	public int anInt1870;
	public int anInt1871;
	int anInt1872;
	public int anInt1873;
	public boolean aBoolean1874;
	public short maximumAngleV;
	public int anInt1876;
	public boolean aBoolean1877;
	public int sizeChangeStep;
	public int fadeRedStep;
	public int fadeBlueStep;
	public int fadeGreenStep;
	public int fadeAlphaStep;
	public int startSpeedChange;
	public int speedStep;
	public int startSizeChange;
	public int colourFadeStart;

	// RS3 Added
	public boolean aBool3604;
	public int anInt3627;
	public int anInt3616;
	public int anInt3597;
	public int anInt3593;
	public int anInt3596;
	public int anInt3595;
	int anInt3550;

	void method1843(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i <= 0) {
						/* empty */
					}
					break;
				}
				decodeParticles(class298_sub53, i_0_, (short) 3276);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.b(").append(')').toString());
		}
	}

	ParticleDefinitions() {
		((ParticleDefinitions) this).colourFading = -1351633244;
		((ParticleDefinitions) this).alphaFading = 59539036;
		anInt1840 = -313955239;
		anInt1850 = 894014710;
		anInt1851 = -1054767914;
		anInt1852 = 0;
		activeFirst = true;
		periodic = true;
		anInt1855 = -1971154607;
		lifetime = -2053470659;
		minimumSetting = 0;
		aBoolean1877 = true;
		anInt1873 = -891363123;
		aBoolean1818 = false;
		aBoolean1874 = true;
		aBoolean1862 = false;
		aBoolean1863 = true;
		aBoolean1864 = false;
		anInt3595 = 0;
	}

	void decodeParticles(RsByteBuffer buffer, int i, short i_1_) {
		try {
			if (1 == i) {// +
				minimumAngleH = (short) buffer.readUnsignedShort();
				maximumAngleH = (short) buffer.readUnsignedShort();
				minimumAngleV = (short) buffer.readUnsignedShort();
				maximumAngleV = (short) buffer.readUnsignedShort();
				int i_2_ = 3;
				minimumAngleH <<= i_2_;
				maximumAngleH <<= i_2_;
				minimumAngleV <<= i_2_;
				maximumAngleV <<= i_2_;
			} else if (2 == i) // +
				buffer.readUnsignedByte();
			else if (3 == i) {// +
				minimumSpeed = buffer.readInt((byte) 43) * -387057077;
				maximumSpeed = buffer.readInt((byte) -103) * -1853520269;
			} else if (i == 4) {// +
				anInt1819 = buffer.readUnsignedByte() * -687561841;
				anInt1847 = buffer.readByte() * -1070610169;
			} else if (5 == i) // +
				minimumSize = (maximumSize = (buffer.readUnsignedShort() << 12 << 2) * -1969619697) * -2077217427;
			else if (6 == i) {// +
				((ParticleDefinitions) this).minimumStartColour = buffer.readInt((byte) 100) * -1365954181;
				((ParticleDefinitions) this).maximumStartColour = buffer.readInt((byte) -15) * 902519911;
			} else if (7 == i) {// +
				minimumLifetime = buffer.readUnsignedShort() * 704499925;
				maximumLifetime = buffer.readUnsignedShort() * -1653481859;
			} else if (i == 8) {// +
				minimumParticleRate = buffer.readUnsignedShort() * -517504949;
				maximumParticleRate = buffer.readUnsignedShort() * -1502909185;
			} else if (9 == i) {// +
				int i_3_ = buffer.readUnsignedByte();
				anIntArray1823 = new int[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
					anIntArray1823[i_4_] = buffer.readUnsignedShort();
			} else if (10 == i) {// +
				int i_5_ = buffer.readUnsignedByte();
				anIntArray1829 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
					anIntArray1829[i_6_] = buffer.readUnsignedShort();
			} else if (12 == i)
				anInt1850 = buffer.readByte() * 1700476293;
			else if (i == 13)
				anInt1851 = buffer.readByte() * -1620099691;
			else if (14 == i)
				anInt1852 = buffer.readUnsignedShort() * -629947759;
			else if (15 == i)
				anInt1840 = buffer.readUnsignedShort() * 313955239;
			else if (i == 16) {
				activeFirst = buffer.readUnsignedByte() == 1;
				anInt1855 = buffer.readUnsignedShort() * 1971154607;
				lifetime = buffer.readUnsignedShort() * 2053470659;
				periodic = buffer.readUnsignedByte() == 1;
			} else if (i == 17)
				anInt1873 = buffer.readUnsignedShort() * 891363123;
			else if (18 == i)
				fadeColour = buffer.readInt((byte) 24) * 661695111;
			else if (i == 19)
				minimumSetting = buffer.readUnsignedByte() * 709275159;
			else if (i == 20)
				((ParticleDefinitions) this).colourFading = buffer.readUnsignedByte() * 587779089;
			else if (21 == i)
				((ParticleDefinitions) this).alphaFading = buffer.readUnsignedByte() * 1460884271;
			else if (i == 22)
				endSpeed = buffer.readInt((byte) -1) * 460402411;
			else if (23 == i)
				((ParticleDefinitions) this).speedChange = buffer.readUnsignedByte() * -853474699;
			else if (24 == i)
				uniformColourVariance = false;
			else if (25 == i) {
				int i_7_ = buffer.readUnsignedByte();
				anIntArray1846 = new int[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
					anIntArray1846[i_8_] = buffer.readUnsignedShort();
			} else if (i == 26)
				aBoolean1877 = false;
			else if (i == 27)
				endSize = ((buffer.readUnsignedShort() << 12 << 2) * 1186467237);
			else if (i == 28)
				((ParticleDefinitions) this).sizeChange = buffer.readUnsignedByte() * -1461114135;
			else if (29 == i) {
				if (buffer.readUnsignedByte() == 0)
					anInt3596 = ((anInt3550 = buffer.readShort(1655872053) * -2102816424) * 1179824099);
				else {
					anInt3596 = buffer.readShort(1655872053) * 1692862728;
					anInt3550 = buffer.readShort(1655872053) * -2102816424;
				}
			} else if (30 == i)
				aBoolean1818 = true;
			else if (i == 31) {
				minimumSize = ((buffer.readUnsignedShort() << 12 << 2) * 1138516579);
				maximumSize = (buffer.readUnsignedShort() << 12 << 2) * -1969619697;
			} else if (32 == i)
				aBoolean1874 = false;
			else if (33 == i)
				aBoolean1862 = true;
			else if (34 == i)
				aBoolean1863 = false;
			else if (35 == i) {
				if (buffer.readUnsignedByte() == 0)
					anInt3593 = ((anInt3597 = buffer.readShort(-710976385) * 548863000) * 965682527);
				else {
					anInt3593 = buffer.readShort(-710976385) * -1078000408;
					anInt3597 = buffer.readShort(-710976385) * 548863000;
					anInt3595 = buffer.readUnsignedByte() * -1163572539;
				}
			} else if (36 == i)
				aBool3604 = true;

		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.p(").append(')').toString());
		}
	}

	void init(int i) {
		try {
			if (anInt1850 * -275612851 > -2 || -1831524931 * anInt1851 > -2)
				aBoolean1864 = true;
			anInt1865 = 1630521741 * (737478067 * ((ParticleDefinitions) this).minimumStartColour >> 16 & 0xff);
			((ParticleDefinitions) this).anInt1866 = ((1522532183 * ((ParticleDefinitions) this).maximumStartColour >> 16 & 0xff)
					* -231735957);
			anInt1867 = (((ParticleDefinitions) this).anInt1866 * 147388659 - anInt1865 * -902341611);
			anInt1868 = 313528669 * (((ParticleDefinitions) this).minimumStartColour * 737478067 >> 8 & 0xff);
			((ParticleDefinitions) this).anInt1825 = -339699839
					* (((ParticleDefinitions) this).maximumStartColour * 1522532183 >> 8 & 0xff);
			anInt1870 = (((ParticleDefinitions) this).anInt1825 * -1096760557 - 1588068271 * anInt1868);
			anInt1871 = ((((ParticleDefinitions) this).minimumStartColour * 737478067 & 0xff) * -573588505);
			((ParticleDefinitions) this).anInt1827 = ((1522532183 * ((ParticleDefinitions) this).maximumStartColour & 0xff)
					* -1720855383);
			anInt1856 = (-844298861 * ((ParticleDefinitions) this).anInt1827 - 1351662653 * anInt1871);
			anInt1826 = ((737478067 * ((ParticleDefinitions) this).minimumStartColour >> 24 & 0xff) * -1453810947);
			((ParticleDefinitions) this).anInt1872 = 1322388433
					* (1522532183 * ((ParticleDefinitions) this).maximumStartColour >> 24 & 0xff);
			anInt1876 = (((ParticleDefinitions) this).anInt1872 * 1784226905 - 1139279133 * anInt1826);
			if (0 != 1558182711 * fadeColour) {
				colourFadeStart = -1525995331
						* (1395500273 * ((ParticleDefinitions) this).colourFading * (1940196053 * maximumLifetime) / 100);
				alphaFadeStart = -323160919
						* (maximumLifetime * 1940196053 * (-1087319089 * ((ParticleDefinitions) this).alphaFading) / 100);
				if (0 == -1703669099 * colourFadeStart)
					colourFadeStart = -1525995331;
				fadeRedStep = 220598105 * ((((fadeColour * 1558182711 >> 16 & 0xff)
						- (anInt1867 * -447935375 / 2 + anInt1865 * 1443995973)) << 8) / (-1703669099 * colourFadeStart));
				fadeBlueStep = 1551625825 * ((((1558182711 * fadeColour >> 8 & 0xff)
						- (-1237529867 * anInt1868 + -1154628453 * anInt1870 / 2)) << 8) / (colourFadeStart * -1703669099));
				fadeGreenStep = (((1558182711 * fadeColour & 0xff)
						- (anInt1871 * -1297143849 + anInt1856 * -564637277 / 2)) << 8) / (colourFadeStart * -1703669099)
						* 1145782203;
				if (0 == alphaFadeStart * -966201447)
					alphaFadeStart = -323160919;
				fadeAlphaStep = 756703809 * ((((1558182711 * fadeColour >> 24 & 0xff)
						- (629527125 * anInt1826 + anInt1876 * 1235129497 / 2)) << 8) / (-966201447 * alphaFadeStart));
				ParticleDefinitions class182_9_ = this;
				class182_9_.fadeRedStep = (class182_9_.fadeRedStep + 220598105 * (-1778169623 * fadeRedStep > 0 ? -4 : 4));
				ParticleDefinitions class182_10_ = this;
				class182_10_.fadeBlueStep = (class182_10_.fadeBlueStep + (fadeBlueStep * 936719777 > 0 ? -4 : 4) * 1551625825);
				ParticleDefinitions class182_11_ = this;
				class182_11_.fadeGreenStep = (class182_11_.fadeGreenStep + 1145782203 * (fadeGreenStep * 1137945971 > 0 ? -4 : 4));
				ParticleDefinitions class182_12_ = this;
				class182_12_.fadeAlphaStep = (class182_12_.fadeAlphaStep + 756703809 * (fadeAlphaStep * 825667009 > 0 ? -4 : 4));
			}
			if (endSpeed * 799607235 != -1) {
				startSpeedChange = -1215468705
						* (((ParticleDefinitions) this).speedChange * 635387357 * (maximumLifetime * 1940196053) / 100);
				if (startSpeedChange * -1035489121 == 0)
					startSpeedChange = -1215468705;
				speedStep = (799607235 * endSpeed
						- (minimumSpeed * 373784419 + ((maximumSpeed * -439251269 - 373784419 * minimumSpeed) / 2)))
						/ (startSpeedChange * -1035489121) * -1441694519;
			}
			if (-1628433875 * endSize != -1) {
				startSizeChange = (1204309337 * ((ParticleDefinitions) this).sizeChange * (1940196053 * maximumLifetime) / 100
						* -1190650305);
				if (-1648307777 * startSizeChange == 0)
					startSizeChange = -1190650305;
				sizeChangeStep = ((-1628433875 * endSize
						- ((-769306129 * maximumSize - -992661685 * minimumSize) / 2 + -992661685 * minimumSize))
						/ (-1648307777 * startSizeChange) * -1770208597);
			}
			anInt3616 = anInt3597 - anInt3593;
			anInt3627 = anInt3550 - anInt3596;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.i(").append(')').toString());
		}
	}

	static final void method1846(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			if (pb.anInt8724 * 1596783995 == 3) {
				int i_20_ = Class10.anInt129 * 1168366243;
				int[] is = Class10.anIntArray135;
				for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
					Player class365_sub1_sub1_sub2_sub2 = (pb.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_21_]]);
					if (class365_sub1_sub1_sub2_sub2 != null)
						class365_sub1_sub1_sub2_sub2.method4441(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, (byte) 12);
				}
				for (int i_22_ = 0; i_22_ < -1230451913 * pb.anInt8703; i_22_++) {
					int i_23_ = pb.anIntArray8699[i_22_];
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) pb.aClass437_8696.get((long) i_23_));
					if (class298_sub29 != null)
						((Entity) class298_sub29.anObject7366).method4441(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_,
								(byte) 12);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.js(").append(')').toString());
		}
	}

	static void method1847(byte i) {
		try {
			Class298_Sub37_Sub12.aClass437_9621.method5811((byte) -40);
			Class298_Sub37_Sub12.aClass461_9607.method5988(1028697182);
			Class298_Sub37_Sub12.aClass461_9638.method5988(1342386694);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.f(").append(')').toString());
		}
	}
}
