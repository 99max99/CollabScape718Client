
/* Class302_Sub3_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Particle extends Class302_Sub3_Sub1 {
	int speed;
	short aShort10033;
	short lifespan;
	short lifetime;
	short aShort10036;
	Class342 emitter;
	short aShort10038;
	short aShort10039;
	int intermediateColour;

	Particle(final Class342 class342, final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_,
			final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_,
			final boolean bool, final boolean bool_10_) {
		this.emitter = class342;
		x = i << 12;
		y = i_0_ << 12;
		z = i_1_ << 12;
		colour = i_7_;
		this.lifespan = this.lifetime = (short) i_6_;
		size = i_8_;
		anInt9794 = i_9_;
		aBoolean9787 = bool_10_;
		this.aShort10036 = (short) i_2_;
		this.aShort10039 = (short) i_3_;
		this.aShort10038 = (short) i_4_;
		this.speed = i_5_;
		aByte9793 = (this.emitter.aClass85_3662.priority);
		method3725();
	}

	void method3724(final Class342 class342, final int i, final int i_11_, final int i_12_, final int i_13_,
			final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_, final int i_19_,
			final int i_20_, final boolean bool, final boolean bool_21_) {
		this.emitter = class342;
		x = i << 12;
		y = i_11_ << 12;
		z = i_12_ << 12;
		colour = i_18_;
		this.lifespan = this.lifetime = (short) i_17_;
		size = i_19_;
		anInt9794 = i_20_;
		aBoolean9787 = bool_21_;
		this.aShort10036 = (short) i_13_;
		this.aShort10039 = (short) i_14_;
		this.aShort10038 = (short) i_15_;
		this.speed = i_16_;
		aByte9793 = (this.emitter.aClass85_3662.priority);
		method3725();
	}

	void method3725() {
		final int i = ((this.emitter).parent.anInt3763);
		if (((this.emitter).parent.aClass302_Sub3_Sub1_Sub1Array3762[i]) != null)
			(this.emitter).parent.aClass302_Sub3_Sub1_Sub1Array3762[i].method3726();
		(this.emitter.parent).aClass302_Sub3_Sub1_Sub1Array3762[i] = this;
		this.aShort10033 = (short) (this.emitter.parent).anInt3763;
		(this.emitter).parent.anInt3763 = i + 1 & 0x1fff;
		this.emitter.aClass442_3648.method5870(this, 0);
	}

	void method3726() {
		(this.emitter).parent.aClass302_Sub3_Sub1_Sub1Array3762[this.aShort10033] = null;
		Class344.aClass302_Sub3_Sub1_Sub1Array3676[(Class344.anInt3686 * 146335501)] = this;
		Class344.anInt3686 = (Class344.anInt3686 * 146335501 + 1 & 0x3ff) * 901922757;
		method3714(0);
		method3721(-850214067);
	}

	void method3727(final Class331 class331, final Toolkit class_ra, final long l) {
		final int i = x >> 12 + class331.anInt3504 * -1688804109;
		final int i_22_ = z >> 12 + class331.anInt3504 * -1688804109;
		final int i_23_ = y >> 12;
		if (i_23_ > 0 || i_23_ < -262144 || i < 0 || i >= class331.anInt3514 * 1988988347 || i_22_ < 0
				|| i_22_ >= class331.anInt3549 * 1340714547)
			method3726();
		else {
			final ParticleSystem class351 = ((this.emitter).parent);
			final ParticleDefinitions class182 = ((this.emitter).definition);
			final Ground[] class_xas = class331.aClass_xaArray3517;
			int i_24_ = class351.anInt3767;
			Class326 class326 = (class331.aClass326ArrayArrayArray3516[class351.anInt3767][i][i_22_]);
			if (class326 != null)
				i_24_ = class326.aByte3466;
			final int i_25_ = class_xas[i_24_].method6341(i, i_22_);
			int i_26_;
			if (i_24_ < class331.anInt3548 * 1678382205 - 1)
				i_26_ = class_xas[i_24_ + 1].method6341(i, i_22_);
			else
				i_26_ = i_25_ - (8 << class331.anInt3504 * -1688804109);
			if (class182.aBoolean1864) {
				if (class182.anInt1850 * -275612851 == -1 && i_23_ > i_25_) {
					method3726();
					return;
				}
				if (class182.anInt1850 * -275612851 >= 0
						&& i_23_ > class_xas[class182.anInt1850 * -275612851].method6341(i, i_22_)) {
					method3726();
					return;
				}
				if (class182.anInt1851 * -1831524931 == -1 && i_23_ < i_26_) {
					method3726();
					return;
				}
				if (class182.anInt1851 * -1831524931 >= 0
						&& i_23_ < class_xas[class182.anInt1851 * -1831524931 + 1].method6341(i, i_22_)) {
					method3726();
					return;
				}
			}
			int i_27_;
			for (i_27_ = class331.anInt3548 * 1678382205 - 1; i_27_ > 0
					&& i_23_ > class_xas[i_27_].method6341(i, i_22_); i_27_--) {
				/* empty */
			}
			if (class182.aBoolean1863 && i_27_ == 0 && i_23_ > class_xas[0].method6341(i, i_22_))
				method3726();
			else if (i_27_ == class331.anInt3548 * 1678382205 - 1
					&& (class_xas[i_27_].method6341(i, i_22_) - i_23_) > 8 << class331.anInt3504 * -1688804109)
				method3726();
			else {
				class326 = class331.aClass326ArrayArrayArray3516[i_27_][i][i_22_];
				if (class326 == null) {
					if (i_27_ == 0 || (class331.aClass326ArrayArrayArray3516[0][i][i_22_] == null))
						class326 = class331.aClass326ArrayArrayArray3516[0][i][i_22_] = new Class326(0);
					final boolean bool = ((class331.aClass326ArrayArrayArray3516[0][i][i_22_].aClass326_3455) != null);
					if (i_27_ == 3 && bool) {
						method3726();
						return;
					}
					for (int i_28_ = 1; i_28_ <= i_27_; i_28_++) {
						if ((class331.aClass326ArrayArrayArray3516[i_28_][i][i_22_]) == null) {
							class326 = class331.aClass326ArrayArrayArray3516[i_28_][i][i_22_] = new Class326(i_28_);
							if (bool)
								class326.aByte3466++;
						}
					}
				}
				if (class182.aBoolean1862) {
					final int i_29_ = x >> 12;
					final int i_30_ = z >> 12;
					if (class326.aClass365_Sub1_Sub5_3457 != null) {
						final Class334 class334 = class326.aClass365_Sub1_Sub5_3457.method4358(class_ra, (byte) 0);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
					if (class326.aClass365_Sub1_Sub5_3458 != null) {
						final Class334 class334 = class326.aClass365_Sub1_Sub5_3458.method4358(class_ra, (byte) 0);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
					if (class326.aClass365_Sub1_Sub2_3461 != null) {
						final Class334 class334 = class326.aClass365_Sub1_Sub2_3461.method4358(class_ra, (byte) 0);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
					for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
						final Class334 class334 = class322.aClass365_Sub1_Sub1_3359.method4358(class_ra, (byte) 0);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
				}
				class351.aClass69_3765.aClass448_680.method5908(this, (byte) -3);
			}
		}
	}

	void method3728(final long l, final int dt) {
		this.lifetime -= dt;
		if (this.lifetime <= 0)
			method3726();
		else {
			final int tileX = x >> 12;
			final int tileY = y >> 12;
			final int plane = z >> 12;
			final ParticleSystem system = ((this.emitter).parent);
			final ParticleDefinitions definition = ((this.emitter).definition);
			if (definition.fadeColour * 1558182711 != 0) {
				if ((this.lifespan - this.lifetime) <= definition.colourFadeStart * -1703669099) {
					int r = ((colour >> 8 & 0xff00) + (this.intermediateColour >> 16 & 0xff)
							+ definition.fadeRedStep * -1778169623 * dt);
					int g = ((colour & 0xff00) + (this.intermediateColour >> 8 & 0xff)
							+ definition.fadeBlueStep * 936719777 * dt);
					int b = ((colour << 8 & 0xff00) + (this.intermediateColour & 0xff)
							+ definition.fadeGreenStep * 1137945971 * dt);
					if (r < 0)
						r = 0;
					else if (r > 65535)
						r = 65535;
					if (g < 0)
						g = 0;
					else if (g > 65535)
						g = 65535;
					if (b < 0)
						b = 0;
					else if (b > 65535)
						b = 65535;
					colour &= ~0xffffff;
					colour |= (((r & 0xff00) << 8) + (g & 0xff00) + ((b & 0xff00) >> 8));
					this.intermediateColour &= ~0xffffff;
					this.intermediateColour |= (((r & 0xff) << 16) + ((g & 0xff) << 8) + (b & 0xff));
				}
				if ((this.lifespan - this.lifetime) <= definition.alphaFadeStart * -966201447) {
					int i_37_ = ((colour >> 16 & 0xff00) + (this.intermediateColour >> 24 & 0xff)
							+ definition.fadeAlphaStep * 825667009 * dt);
					if (i_37_ < 0)
						i_37_ = 0;
					else if (i_37_ > 65535)
						i_37_ = 65535;
					colour &= 0xffffff;
					colour |= (i_37_ & 0xff00) << 16;
					this.intermediateColour &= 0xffffff;
					this.intermediateColour |= (i_37_ & 0xff) << 24;
				}
			}
			if (definition.endSpeed * 799607235 != -1
					&& ((this.lifespan - this.lifetime) <= definition.startSpeedChange * -1035489121))
				this.speed += definition.speedStep * 1185897849 * dt;
			if (definition.endSize * -1628433875 != -1
					&& ((this.lifespan - this.lifetime) <= definition.startSizeChange * -1648307777))
				size += definition.sizeChangeStep * 308094979 * dt;
			double directionX = this.aShort10036;
			double directionZ = this.aShort10039;
			double directionY = this.aShort10038;
			boolean bool = false;
			if (definition.anInt1819 * 166927215 == 1) {
				final int i_40_ = (tileX - (this.emitter.current).centerX * 60582813);
				final int i_41_ = (tileY - (this.emitter.current).centerY * 915630045);
				final int i_42_ = plane - ((this.emitter).current.centerZ) * -1989166667;
				final int i_43_ = ((int) Math.sqrt(i_40_ * i_40_ + i_41_ * i_41_ + i_42_ * i_42_) >> 2);
				final long l_44_ = definition.anInt1847 * 1305957559 * i_43_ * dt;
				this.speed -= (this.speed * l_44_) >> 18;
			} else if (definition.anInt1819 * 166927215 == 2) {
				final int i_45_ = (tileX - (this.emitter.current).centerX * 60582813);
				final int i_46_ = (tileY - (this.emitter.current).centerY * 915630045);
				final int i_47_ = plane - ((this.emitter).current.centerZ) * -1989166667;
				final int i_48_ = i_45_ * i_45_ + i_46_ * i_46_ + i_47_ * i_47_;
				final long l_49_ = definition.anInt1847 * 1305957559 * i_48_ * dt;
				this.speed -= (this.speed * l_49_) >> 28;
			}
			if (definition.anIntArray1823 != null) {
				final Iterator iterator = system.aList3768.iterator();
				while (iterator.hasNext()) {
					final Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
					final Class190 class190 = class298_sub45.aClass190_7514;
					if (class190.anInt1940 * -1955592777 != 1) {
						boolean found = false;
						for (int i_51_ = 0; i_51_ < definition.anIntArray1823.length; i_51_++) {
							if (definition.anIntArray1823[i_51_] == class190.anInt1930 * 618361365) {
								found = true;
								break;
							}
						}
						if (found) {
							final double d_52_ = tileX - (class298_sub45.anInt7516 * -1108687965);
							final double d_53_ = tileY - (class298_sub45.anInt7517 * 80933881);
							final double d_54_ = plane - (class298_sub45.anInt7519 * -78566587);
							final double d_55_ = (d_52_ * d_52_ + d_53_ * d_53_ + d_54_ * d_54_);
							if (!(d_55_ > class190.aLong1931 * 6688605316592129449L)) {
								double distance = Math.sqrt(d_55_);
								if (distance == 0.0)
									distance = 1.0;
								final double d_57_ = ((d_52_ * (class298_sub45.aFloat7515)
										+ d_53_ * (class190.anInt1934 * -739294135)
										+ d_54_ * (class298_sub45.aFloat7520)) * 65535.0
										/ (class190.distance * 1414342983 * distance));
								if (!(d_57_ < class190.anInt1943 * -1188833415)) {
									double d_58_ = 0.0;
									if (class190.anInt1936 * -1660029223 == 1)
										d_58_ = (distance / 16.0 * (class190.anInt1920 * -1595714959));
									else if (class190.anInt1936 * -1660029223 == 2)
										d_58_ = (distance / 16.0 * (distance / 16.0) * (class190.anInt1920 * -1595714959));
									if (class190.anInt1939 * 91019621 == 0) {
										if (class190.anInt1942 * 162409547 == 0) {
											directionX += ((class298_sub45.aFloat7515) - d_58_) * dt;
											directionZ += ((class190.anInt1934) * -739294135 - d_58_) * dt;
											directionY += ((class298_sub45.aFloat7520) - d_58_) * dt;
											bool = true;
										} else {
											x += ((class298_sub45.aFloat7515) - d_58_) * dt;
											y += ((class190.anInt1934) * -739294135 - d_58_) * dt;
											z += ((class298_sub45.aFloat7520) - d_58_) * dt;
										}
									} else {
										final double d_59_ = (d_52_ / distance * (class190.distance * 1414342983));
										final double d_60_ = (d_53_ / distance * (class190.distance * 1414342983));
										final double d_61_ = (d_54_ / distance * (class190.distance * 1414342983));
										if (class190.anInt1942 * 162409547 == 0) {
											directionX += d_59_ * dt;
											directionZ += d_60_ * dt;
											directionY += d_61_ * dt;
											bool = true;
										} else {
											x += d_59_ * dt;
											y += d_60_ * dt;
											z += d_61_ * dt;
										}
									}
								}
							}
						}
					}
				}
			}
			if (definition.anIntArray1846 != null) {
				for (int i_62_ = 0; i_62_ < definition.anIntArray1846.length; i_62_++) {
					Class298_Sub45 class298_sub45 = ((Class298_Sub45) (Class344.aClass437_3684
							.get(definition.anIntArray1846[i_62_])));
					while (class298_sub45 != null) {
						final Class190 class190 = class298_sub45.aClass190_7514;
						final double d_63_ = tileX - (class298_sub45.anInt7516) * -1108687965;
						final double d_64_ = tileY - (class298_sub45.anInt7517) * 80933881;
						final double d_65_ = plane - (class298_sub45.anInt7519) * -78566587;
						final double d_66_ = d_63_ * d_63_ + d_64_ * d_64_ + d_65_ * d_65_;
						if (d_66_ > class190.aLong1931 * 6688605316592129449L)
							class298_sub45 = ((Class298_Sub45) Class344.aClass437_3684.method5813(0));
						else {
							double d_67_ = Math.sqrt(d_66_);
							if (d_67_ == 0.0)
								d_67_ = 1.0;
							final double d_68_ = ((d_63_ * (class298_sub45.aFloat7515)
									+ d_64_ * (class190.anInt1934 * -739294135) + d_65_ * (class298_sub45.aFloat7520))
									* 65535.0 / (class190.distance * 1414342983 * d_67_));
							if (d_68_ < class190.anInt1943 * -1188833415)
								class298_sub45 = ((Class298_Sub45) Class344.aClass437_3684.method5813(0));
							else {
								double d_69_ = 0.0;
								if (class190.anInt1936 * -1660029223 == 1)
									d_69_ = (d_67_ / 16.0 * (class190.anInt1920 * -1595714959));
								else if (class190.anInt1936 * -1660029223 == 2)
									d_69_ = (d_67_ / 16.0 * (d_67_ / 16.0) * (class190.anInt1920 * -1595714959));
								if (class190.anInt1939 * 91019621 == 0) {
									if (class190.anInt1942 * 162409547 == 0) {
										directionX += ((class298_sub45.aFloat7515) - d_69_) * dt;
										directionZ += (class190.anInt1934 * -739294135 - d_69_) * dt;
										directionY += ((class298_sub45.aFloat7520) - d_69_) * dt;
										bool = true;
									} else {
										x += ((class298_sub45.aFloat7515) - d_69_) * dt;
										y += (class190.anInt1934 * -739294135 - d_69_) * dt;
										z += ((class298_sub45.aFloat7520) - d_69_) * dt;
									}
								} else {
									final double d_70_ = (d_63_ / d_67_ * (class190.distance * 1414342983));
									final double d_71_ = (d_64_ / d_67_ * (class190.distance * 1414342983));
									final double d_72_ = (d_65_ / d_67_ * (class190.distance * 1414342983));
									if (class190.anInt1942 * 162409547 == 0) {
										directionX += d_70_ * dt;
										directionZ += d_71_ * dt;
										directionY += d_72_ * dt;
										bool = true;
									} else {
										x += d_70_ * dt;
										y += d_71_ * dt;
										z += d_72_ * dt;
									}
								}
								class298_sub45 = ((Class298_Sub45) Class344.aClass437_3684.method5813(0));
							}
						}
					}
				}
			}
			if (definition.anIntArray1829 != null) {
				if (definition.anIntArray1848 == null) {
					definition.anIntArray1848 = new int[definition.anIntArray1829.length];
					for (int i_73_ = 0; i_73_ < definition.anIntArray1829.length; i_73_++) {
						Class140.method1554(definition.anIntArray1829[i_73_], 1300932054);
						definition.anIntArray1848[i_73_] = (((Class298_Sub35) (Class190.aClass437_1928
								.get(definition.anIntArray1829[i_73_]))).anInt7394) * -774922497;
					}
				}
				for (int i_74_ = 0; i_74_ < definition.anIntArray1848.length; i_74_++) {
					final Class190 class190 = (Class190.aClass190Array1926[definition.anIntArray1848[i_74_]]);
					if (class190.anInt1942 * 162409547 == 0) {
						directionX += class190.anInt1933 * 1776313545 * dt;
						directionZ += class190.anInt1934 * -739294135 * dt;
						directionY += class190.anInt1935 * -1849369705 * dt;
						bool = true;
					} else {
						x += class190.anInt1933 * 1776313545 * dt;
						y += class190.anInt1934 * -739294135 * dt;
						z += class190.anInt1935 * -1849369705 * dt;
					}
				}
			}
			if (bool) {
				while (directionX > 32767.0 || directionZ > 32767.0 || directionY > 32767.0 || directionX < -32767.0 || directionZ < -32767.0
						|| directionY < -32767.0) {
					directionX /= 2.0;
					directionZ /= 2.0;
					directionY /= 2.0;
					this.speed <<= 1;
				}
				this.aShort10036 = (short) (int) directionX;
				this.aShort10039 = (short) (int) directionZ;
				this.aShort10038 = (short) (int) directionY;
			}
			x += (((long) this.aShort10036 * (long) (this.speed << 2)) >> 23) * dt;
			y += (((long) this.aShort10039 * (long) (this.speed << 2)) >> 23) * dt;
			z += (((long) this.aShort10038 * (long) (this.speed << 2)) >> 23) * dt;
		}
	}
}
