/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
	Interface_ma anInterface_ma604;
	Class348 aClass348_605 = new Class348(256);
	GLToolkit aClass_ra_Sub2_606;

	Class30_Sub2 method715(TextureMetrics i) {
		return method716(i, -1);
	}

	Class30_Sub2 method716(TextureMetrics class53, int i_0_) {
		final Object object = this.aClass348_605.get(class53.textureId);
		if (object != null)
			return (Class30_Sub2) object;
		if (!this.anInterface_ma604.method170(class53.textureId, 0))
			return null;
		if (i_0_ == -1)
			i_0_ = class53.bitLoad;
		Class30_Sub2 class30_sub2;
		if (!class53.hdr || !this.aClass_ra_Sub2_606.method5054()) {
			int[] is;
			if (class53.blendType * -2138060883 == 2 || !Class298_Sub32_Sub31.method3339(class53.effectId, i_0_))
				is = this.anInterface_ma604.method172(class53.textureId, 0.7F, i_0_, i_0_, false, 0);
			else
				is = this.anInterface_ma604.method171(class53.textureId, 0.7F, i_0_, i_0_, true, 0);
			class30_sub2 = new Class30_Sub2(this.aClass_ra_Sub2_606, 3553, i_0_, i_0_, class53.useMipmaps != 0, is, 0,
					0, false);
		} else {
			final float[] fs = this.anInterface_ma604.method181(class53.textureId, 0.7F, i_0_, i_0_, false, (byte) -119);
			class30_sub2 = new Class30_Sub2(this.aClass_ra_Sub2_606, 3553, Class55.aClass55_557, Class77.aClass77_714,
					i_0_, i_0_, class53.useMipmaps != 0, fs, Class55.aClass55_557);
		}
		class30_sub2.method420(class53.repeatS == 1, class53.repeatT == 1);
		this.aClass348_605.put(class30_sub2, class53.textureId);
		return class30_sub2;
	}

	void method717() {
		((Class61) this).aClass348_605.method4186(5, -56778652);
	}

	void method718() {
		((Class61) this).aClass348_605.method4187();
	}

	Class61(GLToolkit class_ra_sub2, Interface_ma interface_ma) {
		((Class61) this).aClass_ra_Sub2_606 = class_ra_sub2;
		((Class61) this).anInterface_ma604 = interface_ma;
	}
}
