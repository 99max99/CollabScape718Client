/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class443 {
	int colour = 0;
	public int texture = 328024129;
	public int saturation;
	public boolean aBoolean5596;
	public int scale = -381610496;
	public int hue;
	public boolean blockShadow = true;
	public int lightness;
	public int chroma;

	void computeHsl(final int i, final byte i_0_) {
		try {
			final double r = (i >> 16 & 0xff) / 256.0;
			final double g = (i >> 8 & 0xff) / 256.0;
			final double b = (i & 0xff) / 256.0;
			double maximum = r;
			if (g < maximum)
				maximum = g;
			if (b < maximum)
				maximum = b;
			double minimum = r;
			if (g > minimum)
				minimum = g;
			if (b > minimum)
				minimum = b;
			double h = 0.0;
			double s = 0.0;
			final double l = (maximum + minimum) / 2.0;
			if (maximum != minimum) {
				if (l < 0.5)
					s = (minimum - maximum) / (maximum + minimum);
				if (l >= 0.5)
					s = (minimum - maximum) / (2.0 - minimum - maximum);
				if (r == minimum)
					h = (g - b) / (minimum - maximum);
				else if (minimum == g)
					h = 2.0 + (b - r) / (minimum - maximum);
				else if (minimum == b)
					h = (r - g) / (minimum - maximum) + 4.0;
			}
			h /= 6.0;
			saturation = (int) (256.0 * s) * 10667035;
			lightness = (int) (l * 256.0) * -656706385;
			if (saturation * -620399085 < 0)
				saturation = 0;
			else if (-620399085 * saturation > 255)
				saturation = -1574873371;
			if (656695887 * lightness < 0)
				lightness = 0;
			else if (lightness * 656695887 > 255)
				lightness = 43596369;
			if (l > 0.5)
				chroma = 1823857443 * (int) (512.0 * (s * (1.0 - l)));
			else
				chroma = (int) (512.0 * (s * l)) * 1823857443;
			if (chroma * -813159285 < 1)
				chroma = 1823857443;
			hue = 599548295 * (int) (chroma * -813159285 * h);
		} catch (final RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.b(").append(')').toString());
		}
	}

	void method5881(RsByteBuffer class298_sub53, int i, int i_8_) {
		try {
			if (1 == i) {
				((Class443) this).colour = class298_sub53.read24BitUnsignedInteger((byte) -8) * -1369220863;
				computeHsl(2106435329 * ((Class443) this).colour, (byte) -123);
			} else if (2 == i) {
				texture = class298_sub53.readUnsignedShort() * -328024129;
				if (65535 == texture * 2012295231)
					texture = 328024129;
			} else if (i == 3)
				scale = ((class298_sub53.readUnsignedShort() << 2) * -562782069);
			else if (4 == i)
				blockShadow = false;
			else if (5 == i)
				aBoolean5596 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.f(").append(')').toString());
		}
	}

	Class443() {
		aBoolean5596 = true;
	}

	void method5882(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_9_ = class298_sub53.readUnsignedByte();
				if (0 == i_9_) {
					if (i != 7)
						break;
					break;
				}
				method5881(class298_sub53, i_9_, 1088681663);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.a(").append(')').toString());
		}
	}

	static void method5883(IComponentDefinition class105, Class_ta class_ta, int i, int i_10_, int i_11_, int i_12_,
			Sprite class57, byte i_13_) {
		try {
			if (null != class57) {
				int i_14_;
				if (-863531439 * Class298_Sub1.anInt7164 == 2)
					i_14_ = (int) pb.aFloat8949 & 0x3fff;
				else
					i_14_ = ((int) pb.aFloat8949 + pb.anInt8801 * 1227356013) & 0x3fff;
				int i_15_ = (Math.max(class105.anInt1156 * -2093041337 / 2, 457937409 * class105.anInt1162 / 2) + 10);
				int i_16_ = i_12_ * i_12_ + i_11_ * i_11_;
				if (i_16_ <= i_15_ * i_15_) {
					int i_17_ = Class220.SINE[i_14_];
					int i_18_ = Class220.COSINE[i_14_];
					if (2 != Class298_Sub1.anInt7164 * -863531439) {
						i_17_ = 256 * i_17_ / (256 + pb.anInt8749 * 356727603);
						i_18_ = 256 * i_18_ / (356727603 * pb.anInt8749 + 256);
					}
					int i_19_ = i_12_ * i_17_ + i_11_ * i_18_ >> 14;
					int i_20_ = i_18_ * i_12_ - i_11_ * i_17_ >> 14;
					class57.method654((i_19_ + (class105.anInt1156 * -2093041337 / 2 + i) - class57.method271() / 2),
							(457937409 * class105.anInt1162 / 2 + i_10_ - i_20_ - class57.method626() / 2), class_ta, i,
							i_10_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.t(").append(')').toString());
		}
	}

	static final void method5884(int i, int i_21_) {
		try {
			if (Class378.method4671(i, null, -1926955800))
				Class411.method5578((Class389.aClass119Array4165[i].aClass105Array1405), -1, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.lf(").append(')').toString());
		}
	}

	static final void method5885(Class403 class403, int i) {
		try {
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919
					- 1)] = Class95.anInt923 * -2009663223;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.ami(").append(')').toString());
		}
	}

	static final void method5886(Class403 class403, short i) {
		try {
			String string = (String) (((Class403) class403).anObjectArray5240[(((Class403) class403).anInt5241 -= 969361751)
					* -203050393]);
			Class495.method6194(string, 1988988347);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.vk(").append(')').toString());
		}
	}

	static final void method5887(IComponentDefinition class105, Class119 class119, Class403 class403, int i) {
		try {
			((Class403) class403).anInt5239 -= -1175642067;
			int i_22_ = ((((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]) - 1);
			int i_23_ = (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239 + 1]);
			int i_24_ = (((Class403) class403).anIntArray5244[2 + 681479919 * ((Class403) class403).anInt5239]);
			if (i_22_ < 0 || i_22_ > 9)
				throw new RuntimeException();
			Class127.method1423(class105, i_22_, i_23_, i_24_, class403, 890851226);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.ke(").append(')').toString());
		}
	}
}
