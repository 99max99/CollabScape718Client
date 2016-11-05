/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EmitterConfig {
	public int anInt771;
	public int anInt772;
	public int faceX;
	public int faceY;
	public int faceZ;
	public EmitterConfig aClass85_776;
	public int anInt777;
	int type;
	public int anInt779;
	public byte priority;
	public int anInt781;
	public int anInt782;
	public int anInt783;
	public int anInt784;
	public int anInt785;

	EmitterConfig(final int i, final int i_0_, final int i_4_, final int i_1_, final int i_2_, final byte i_3_) {
		((EmitterConfig) this).type = i * 2033948917; //face
		faceX = 1451019569 * i_0_;//x
		faceY = i_1_ * 1631001933;//y
		faceZ = 383276227 * i_2_;//z
		priority = i_3_;//pri
	}

	public ParticleDefinitions method953(int i) {
		try {
			return Class151.getParticleDefinition(((EmitterConfig) this).type * 108680029, 675004457);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dl.a(").append(')').toString());
		}
	}

	EmitterConfig method954(final int i, final int i_6_, final int i_4_, final int i_5_) {
		try {
			return new EmitterConfig(108680029 * this.type, i_6_, i, i_4_, i_5_, priority);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dl.f(").append(')').toString());
		}
	}

	public static Interface27 method955(int i) {
		try {
			if (null == Class506.anInterface27_6203)
				throw new IllegalStateException("");
			return Class506.anInterface27_6203;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dl.f(").append(')').toString());
		}
	}

	static final void method956(Class403 class403, byte i) {
		try {
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1097409519 * (((Class403) class403).aClass365_Sub1_Sub1_Sub2_5242.anInt10132);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dl.aow(").append(')').toString());
		}
	}

	static final void method957(int i) {
		try {
			Class360.aLong3874 = 2742373017286080113L;
			Class360.aLong3911 = 0L;
			Class360.anInt3873 = -2035975497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dl.p(").append(')').toString());
		}
	}

	public static void method958(int i, int i_7_, byte i_8_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(19, (long) i_7_ << 32 | (long) i);
			class298_sub37_sub12.method3445(-1669117818);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dl.ad(").append(')').toString());
		}
	}
}
