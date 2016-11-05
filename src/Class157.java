/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class157 {
	Interface_ma anInterface_ma1614;
	AbstractToolkit aClass_ra_Sub3_1615;
	Class348 aClass348_1616 = new Class348(256);

	Class157(AbstractToolkit class_ra_sub3, Interface_ma interface_ma) {
		((Class157) this).aClass_ra_Sub3_1615 = class_ra_sub3;
		((Class157) this).anInterface_ma1614 = interface_ma;
	}

	Interface9_Impl2 method1695(final TextureMetrics class53, int i_0_) {
		Interface9_Impl2 class155_sub4 = ((Interface9_Impl2) (aClass348_1616.get((long) class53.textureId)));
		if (class155_sub4 != null)
			return class155_sub4;
		if (!this.anInterface_ma1614.method170(class53.textureId, (short) 0))
			return null;
		if (i_0_ == -1)
			i_0_ = class53.bitLoad;
		Interface9_Impl2 interface9_impl2;
		if (!class53.hdr || !this.aClass_ra_Sub3_1615.method5054()) {
			int[] is;
			if (class53.blendType * -2138060883 == 2
					|| !Class298_Sub32_Sub31.method3339(class53.effectId, 0))
				is = this.anInterface_ma1614.method172(class53.textureId, 0.7F, i_0_, i_0_,
						false, 0);
			else
				is = this.anInterface_ma1614.method171(class53.textureId, 0.7F, i_0_, i_0_,
						true, i_0_);
			interface9_impl2 = this.aClass_ra_Sub3_1615.method5350(i_0_, i_0_,
					true, is);
		} else {
			final float[] fs = this.anInterface_ma1614.method181(class53.textureId, 0.7F, i_0_,
					i_0_, false, (byte) -110);
			interface9_impl2 = this.aClass_ra_Sub3_1615.method5352(
					Class55.aClass55_557, i_0_, i_0_, true, fs);
		}
		interface9_impl2.method80(class53.repeatS == 1, class53.repeatT == 1);
		this.aClass348_1616.put(interface9_impl2, (long) class53.textureId);
		return interface9_impl2;
	}

	void method1696() {
		((Class157) this).aClass348_1616.method4186(5, -1019724952);
	}

	void method1697() {
		((Class157) this).aClass348_1616.method4187();
	}

	Interface9_Impl2 method1698(TextureMetrics i) {
		return method1695(i, -1);
	}
}
