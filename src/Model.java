/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Model {
	static float aFloat4147 = 3.1415927F;
	protected boolean aBoolean4148 = false;

	public abstract int ec();

	public abstract MagnetConfig[] method4728();

	int method4729(float f, float f_196_, float f_197_) {
		float f_198_ = f < 0.0F ? -f : f;
		float f_199_ = f_196_ < 0.0F ? -f_196_ : f_196_;
		float f_200_ = f_197_ < 0.0F ? -f_197_ : f_197_;

		if (f_199_ > f_198_ && f_199_ > f_200_) {
			if (f_196_ > 0.0F) {
				return 0;
			}

			return 1;
		} else if (f_200_ > f_198_ && f_200_ > f_199_) {
			if (f_197_ > 0.0F) {
				return 2;
			}

			return 3;
		} else if (f > 0.0F) {
			return 4;
		}

		return 5;
	}

	void method4730(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, long i_33_, float[] fs, int i_34_,
			float f, float f_35_, float f_36_, float[] fs_37_) {
		i -= i_30_;
		i_28_ -= i_31_;
		i_29_ -= i_32_;
		float f_38_ = i * fs[0] + i_28_ * fs[1] + i_29_ * fs[2];
		float f_39_ = i * fs[3] + i_28_ * fs[4] + i_29_ * fs[5];
		float f_40_ = i * fs[6] + i_28_ * fs[7] + i_29_ * fs[8];
		float f_41_;
		float f_42_;
		if (i_33_ == 0) {
			f_41_ = f_38_ + f + 0.5F;
			f_42_ = -f_40_ + f_36_ + 0.5F;
		} else if (i_33_ == 1) {
			f_41_ = f_38_ + f + 0.5F;
			f_42_ = f_40_ + f_36_ + 0.5F;
		} else if (i_33_ == 2) {
			f_41_ = -f_38_ + f + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		} else if (i_33_ == 3) {
			f_41_ = f_38_ + f + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		} else if (i_33_ == 4) {
			f_41_ = f_40_ + f_36_ + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		} else {
			f_41_ = -f_40_ + f_36_ + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		}
		if (i_34_ == 1) {
			float f_43_ = f_41_;
			f_41_ = -f_42_;
			f_42_ = f_43_;
		} else if (i_34_ == 2) {
			f_41_ = -f_41_;
			f_42_ = -f_42_;
		} else if (i_34_ == 3) {
			float f_44_ = f_41_;
			f_41_ = f_42_;
			f_42_ = -f_44_;
		}
		fs_37_[0] = f_41_;
		fs_37_[1] = f_42_;
	}

	public abstract void dd(int i);

	float[] method4731(int i, int i_0_, int i_1_, int i_2_, float f, float f_3_, float f_4_) {
		float[] fs = new float[9];
		float[] fs_5_ = new float[9];
		float f_6_ = (float) Math.cos(i_2_ * 0.024543693F);
		float f_7_ = (float) Math.sin(i_2_ * 0.024543693F);
		float f_8_ = 1.0F - f_6_;
		fs[0] = f_6_;
		fs[1] = 0.0F;
		fs[2] = f_7_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_7_;
		fs[7] = 0.0F;
		fs[8] = f_6_;
		float[] fs_9_ = new float[9];
		float f_10_ = 1.0F;
		float f_11_ = 0.0F;
		f_6_ = i_0_ / 32767.0F;
		f_7_ = -(float) Math.sqrt(1.0F - f_6_ * f_6_);
		f_8_ = 1.0F - f_6_;
		float f_12_ = (float) Math.sqrt(i * i + i_1_ * i_1_);
		if (f_12_ == 0.0F && f_6_ == 0.0F) {
			fs_5_ = fs;
		} else {
			if (f_12_ != 0.0F) {
				f_10_ = -i_1_ / f_12_;
				f_11_ = i / f_12_;
			}
			fs_9_[0] = f_6_ + f_10_ * f_10_ * f_8_;
			fs_9_[1] = f_11_ * f_7_;
			fs_9_[2] = f_11_ * f_10_ * f_8_;
			fs_9_[3] = -f_11_ * f_7_;
			fs_9_[4] = f_6_;
			fs_9_[5] = f_10_ * f_7_;
			fs_9_[6] = f_10_ * f_11_ * f_8_;
			fs_9_[7] = -f_10_ * f_7_;
			fs_9_[8] = f_6_ + f_11_ * f_11_ * f_8_;
			fs_5_[0] = fs[0] * fs_9_[0] + fs[1] * fs_9_[3] + fs[2] * fs_9_[6];
			fs_5_[1] = fs[0] * fs_9_[1] + fs[1] * fs_9_[4] + fs[2] * fs_9_[7];
			fs_5_[2] = fs[0] * fs_9_[2] + fs[1] * fs_9_[5] + fs[2] * fs_9_[8];
			fs_5_[3] = fs[3] * fs_9_[0] + fs[4] * fs_9_[3] + fs[5] * fs_9_[6];
			fs_5_[4] = fs[3] * fs_9_[1] + fs[4] * fs_9_[4] + fs[5] * fs_9_[7];
			fs_5_[5] = fs[3] * fs_9_[2] + fs[4] * fs_9_[5] + fs[5] * fs_9_[8];
			fs_5_[6] = fs[6] * fs_9_[0] + fs[7] * fs_9_[3] + fs[8] * fs_9_[6];
			fs_5_[7] = fs[6] * fs_9_[1] + fs[7] * fs_9_[4] + fs[8] * fs_9_[7];
			fs_5_[8] = fs[6] * fs_9_[2] + fs[7] * fs_9_[5] + fs[8] * fs_9_[8];
		}
		fs_5_[0] *= f;
		fs_5_[1] *= f;
		fs_5_[2] *= f;
		fs_5_[3] *= f_3_;
		fs_5_[4] *= f_3_;
		fs_5_[5] *= f_3_;
		fs_5_[6] *= f_4_;
		fs_5_[7] *= f_4_;
		fs_5_[8] *= f_4_;
		return fs_5_;
	}

	public abstract void by(int i);

	public abstract void KA(int i);

	public abstract int m();

	abstract boolean ea();

	public abstract int Z();

	public abstract void S(int i);

	public abstract void t(int i);

	public abstract void ia(int i, int i_35_, int i_36_);

	public abstract void wa();

	public abstract void oa(int i, int i_37_, int i_38_);

	public abstract void bu(int i, int i_39_, int i_40_);

	void method4732(Ground class120, int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		int i_87_ = -i_81_ / 2;
		int i_88_ = -i_82_ / 2;
		int i_89_ = class120.averageHeight(i + i_87_, i_80_ + i_88_, 0);
		int i_90_ = i_81_ / 2;
		int i_91_ = -i_82_ / 2;
		int i_92_ = class120.averageHeight(i + i_90_, i_80_ + i_91_, 0);
		int i_93_ = -i_81_ / 2;
		int i_94_ = i_82_ / 2;
		int i_95_ = class120.averageHeight(i + i_93_, i_80_ + i_94_, 0);
		int i_96_ = i_81_ / 2;
		int i_97_ = i_82_ / 2;
		int i_98_ = class120.averageHeight(i + i_96_, i_80_ + i_97_, 0);
		int i_99_ = i_89_ < i_92_ ? i_89_ : i_92_;
		int i_100_ = i_95_ < i_98_ ? i_95_ : i_98_;
		int i_101_ = i_92_ < i_98_ ? i_92_ : i_98_;
		int i_102_ = i_89_ < i_95_ ? i_89_ : i_95_;
		if (i_82_ != 0) {
			int i_103_ = (int) (Math.atan2(i_99_ - i_100_, i_82_) * 2607.5945876176133) & 0x3fff;
			if (i_103_ != 0) {
				if (i_83_ != 0) {
					if (i_103_ > 8192) {
						int i_104_ = 16384 - i_83_;
						if (i_103_ < i_104_) {
							i_103_ = i_104_;
						}
					} else if (i_103_ > i_83_) {
						i_103_ = i_83_;
					}
				}
				t(i_103_);
			}
		}
		if (i_81_ != 0) {
			int i_105_ = (int) (Math.atan2(i_102_ - i_101_, i_81_) * 2607.5945876176133) & 0x3fff;
			if (i_105_ != 0) {
				if (i_84_ != 0) {
					if (i_105_ > 8192) {
						int i_106_ = 16384 - i_84_;
						if (i_105_ < i_106_) {
							i_105_ = i_106_;
						}
					} else if (i_105_ > i_84_) {
						i_105_ = i_84_;
					}
				}
				EA(i_105_);
			}
		}
		int i_107_ = i_89_ + i_98_;
		if (i_92_ + i_95_ < i_107_) {
			i_107_ = i_92_ + i_95_;
		}
		i_107_ = (i_107_ >> 1) - i_79_;
		if (i_107_ != 0) {
			ia(0, i_107_, 0);
		}
	}

	abstract void method4733();

	abstract void method4734();

	public final void method4735(final Class298_Sub37_Sub4 class298_sub37_sub4, final int i,
			final Class298_Sub37_Sub4 class298_sub37_sub4_70_, final int i_71_, final int i_72_, final int i_73_,
			final int i_74_, final boolean bool) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				final AnimationFrame class96 = (class298_sub37_sub4.frames[i]);
				final AnimationFrameBase class298_sub15 = class96.base;
				AnimationFrame class96_75_ = null;
				if (class298_sub37_sub4_70_ != null) {
					class96_75_ = (class298_sub37_sub4_70_.frames[i_71_]);
					if (class96_75_.base != class298_sub15)
						class96_75_ = null;
				}
				method4767(class298_sub15, class96, class96_75_, i_72_, i_73_, i_74_, null, false, bool, 65535, null);
				ka();
				method4734();
			}
		}
	}

	public abstract void pa(int i, int i_76_, Ground class_xa, Ground class_xa_77_, int i_78_, int i_79_, int i_80_);

	public final void method4736(final Class298_Sub37_Sub4 class298_sub37_sub4, final int i,
			final Class298_Sub37_Sub4 class298_sub37_sub4_81_, final int i_82_, final int i_83_, final int i_84_,
			final Class298_Sub37_Sub4 class298_sub37_sub4_85_, final int i_86_,
			final Class298_Sub37_Sub4 class298_sub37_sub4_87_, final int i_88_, final int i_89_, final int i_90_,
			final boolean[] bools, final boolean bool) {
		if (i != -1) {
			if (bools == null || i_86_ == -1)
				method4735(class298_sub37_sub4, i, class298_sub37_sub4_81_, i_82_, i_83_, i_84_, 0, bool);
			else {
				method4733();
				if (!ea())
					method4734();
				else {
					final AnimationFrame class96 = (class298_sub37_sub4.frames[i]);
					final AnimationFrameBase class298_sub15 = class96.base;
					AnimationFrame class96_91_ = null;
					if (class298_sub37_sub4_81_ != null) {
						class96_91_ = (class298_sub37_sub4_81_.frames[i_82_]);
						if (class96_91_.base != class298_sub15)
							class96_91_ = null;
					}
					method4767(class298_sub15, class96, class96_91_, i_83_, i_84_, 0, bools, false, bool, 65535, null);
					final AnimationFrame class96_92_ = (class298_sub37_sub4_85_.frames[i_86_]);
					AnimationFrame class96_93_ = null;
					if (class298_sub37_sub4_87_ != null) {
						class96_93_ = (class298_sub37_sub4_87_.frames[i_88_]);
						if (class96_93_.base != class298_sub15)
							class96_93_ = null;
					}
					method4738(0, new int[0], 0, 0, 0, 0, bool);
					method4767(class96_92_.base, class96_92_, class96_93_, i_89_, i_90_, 0, bools, true, bool, 65535,
							null);
					ka();
					method4734();
				}
			}
		}
	}

	public final void method4737(final Class298_Sub37_Sub4 class298_sub37_sub4, final int i) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				final AnimationFrame class96 = (class298_sub37_sub4.frames[i]);
				final AnimationFrameBase class298_sub15 = class96.base;
				for (int i_94_ = 0; i_94_ < class96.transformationCount; i_94_++) {
					final short i_95_ = class96.transformationIndices[i_94_];
					if (class298_sub15.aBooleanArray7275[i_95_]) {
						if (class96.skippedRefrences[i_94_] != -1)
							w(0, 0, 0, 0);
						w((class298_sub15.transformationTypes[i_95_]), class96.transformationX[i_94_],
								class96.transformationY[i_94_], class96.transformationZ[i_94_]);
					}
				}
				ka();
				method4734();
			}
		}
	}

	abstract void method4738(int i, int[] is, int i_96_, int i_97_, int i_98_, int i_99_, boolean bool);

	public abstract void method4739(Class222 class222, Class302_Sub1 class302_sub1, int i);

	abstract void cl(int i, int[] is, int i_100_, int i_101_, int i_102_, boolean bool, int i_103_, int[] is_104_);

	abstract void e(int i, int[] is, int i_105_, int i_106_, int i_107_, boolean bool, int i_108_, int[] is_109_);

	abstract void w(int i, int i_110_, int i_111_, int i_112_);

	public abstract void method4740(Class222 class222, Class302_Sub1 class302_sub1, int i);

	public abstract void method4741(Class222 class222, int i, boolean bool);

	public abstract void bo(int i);

	public abstract int N();

	public abstract int n();

	abstract void cw(int i, int i_113_, int i_114_, int i_115_);

	public abstract void eb(short i, short i_116_);

	public abstract int YA();

	public abstract int o();

	public abstract int AA();

	public abstract int ha();

	public abstract void p(int i);

	public abstract void Q(int i);

	public abstract int c();

	public abstract byte[] ah();

	public abstract void X(short i, short i_117_);

	public abstract void method4742(byte i, byte[] is);

	public abstract void W(short i, short i_118_);

	public abstract void PA(int i, int i_119_, int i_120_, int i_121_);

	public abstract boolean method4743();

	public abstract boolean i();

	public abstract void ey(short i, short i_122_);

	void method4744(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, float[] fs, float f, int i_18_,
			float f_19_, float[] fs_20_) {
		i -= i_15_;
		i_13_ -= i_16_;
		i_14_ -= i_17_;
		float f_21_ = i * fs[0] + i_13_ * fs[1] + i_14_ * fs[2];
		float f_22_ = i * fs[3] + i_13_ * fs[4] + i_14_ * fs[5];
		float f_23_ = i * fs[6] + i_13_ * fs[7] + i_14_ * fs[8];
		float f_24_ = (float) Math.atan2(f_21_, f_23_) / 6.2831855F + 0.5F;
		if (f != 1.0F) {
			f_24_ *= f;
		}
		float f_25_ = f_22_ + 0.5F + f_19_;
		if (i_18_ == 1) {
			float f_26_ = f_24_;
			f_24_ = -f_25_;
			f_25_ = f_26_;
		} else if (i_18_ == 2) {
			f_24_ = -f_24_;
			f_25_ = -f_25_;
		} else if (i_18_ == 3) {
			float f_27_ = f_24_;
			f_24_ = f_25_;
			f_25_ = -f_27_;
		}
		fs_20_[0] = f_24_;
		fs_20_[1] = f_25_;
	}

	public abstract void bw(int i, int i_138_, int i_139_);

	public abstract int ce();

	public abstract void method4745(Model class387_140_, int i, int i_141_, int i_142_, boolean bool);

	public abstract boolean method4746(int i, int i_143_, Class222 class222, boolean bool, int i_144_);

	public abstract void method4747(Model class387_145_, int i, int i_146_, int i_147_, boolean bool);

	public abstract Model method4748(byte i, int i_148_, boolean bool);

	public abstract boolean eg();

	public abstract Model method4749(byte i, int i_149_, boolean bool);

	public abstract Model method4750(byte i, int i_150_, boolean bool);

	public abstract boolean ev();

	public abstract void au(int i);

	public abstract void ar(int i);

	public abstract void method4751(Class222 class222);

	public abstract void method4752();

	public abstract int ya();

	public abstract void bf(int i);

	public abstract void be(int i);

	public abstract MagnetConfig[] method4753();

	public abstract void bm(int i);

	public abstract void bc(int i);

	public abstract void bx(int i);

	abstract void method4754();

	public abstract void bb(int i);

	public abstract void bl(int i, int i_151_, int i_152_);

	public abstract void f(int i);

	public abstract Model method4755(byte i, int i_153_, boolean bool);

	abstract void method4756();

	public abstract void bq(int i, int i_154_, int i_155_);

	public abstract void bg(int i, int i_156_, Ground class_xa, Ground class_xa_157_, int i_158_, int i_159_,
			int i_160_);

	public abstract void bs(int i, int i_161_, Ground class_xa, Ground class_xa_162_, int i_163_, int i_164_,
			int i_165_);

	public abstract void bp(int i, int i_166_, Ground class_xa, Ground class_xa_167_, int i_168_, int i_169_,
			int i_170_);

	abstract void method4757();

	abstract boolean bj();

	abstract void method4758();

	abstract boolean bt();

	public abstract Shadow ct(Shadow class_na);

	abstract void br();

	public abstract void method4759(Class222 class222, Class302_Sub1 class302_sub1, int i);

	abstract void cm();

	abstract void bz();

	abstract void method4760(int i, int[] is, int i_171_, int i_172_, int i_173_, int i_174_, boolean bool);

	abstract void method4761(int i, int[] is, int i_175_, int i_176_, int i_177_, int i_178_, boolean bool);

	abstract void co(int i, int[] is, int i_179_, int i_180_, int i_181_, boolean bool, int i_182_, int[] is_183_);

	abstract void cv(int i, int i_184_, int i_185_, int i_186_);

	public abstract boolean u();

	public abstract void method4762(Class222 class222, int i, boolean bool);

	public abstract void dx(int i);

	public abstract boolean method4763(int i, int i_187_, Class222 class222, boolean bool, int i_188_);

	public abstract void dv(short i, short i_189_);

	public abstract void EA(int i);

	Model() {
		/* empty */
	}

	public abstract int ca();

	public abstract int ci();

	public abstract void di(short i, short i_190_);

	public abstract int cb();

	public abstract int cr();

	public abstract int cu();

	public abstract int cp();

	public abstract void method4764();

	public abstract int cf();

	public abstract int dh();

	public abstract int dg();

	public abstract int dl();

	public abstract int dq();

	public abstract int ds();

	public final void method4765(final Class298_Sub37_Sub4 class298_sub37_sub4, final int i,
			final Class298_Sub37_Sub4 class298_sub37_sub4_191_, final int i_192_, final int i_193_, final int i_194_,
			final int i_195_, final int i_196_, final boolean bool, final int[] is) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				final AnimationFrame class96 = (class298_sub37_sub4.frames[i]);
				final AnimationFrameBase class298_sub15 = class96.base;
				AnimationFrame class96_197_ = null;
				if (class298_sub37_sub4_191_ != null) {
					class96_197_ = (class298_sub37_sub4_191_.frames[i_192_]);
					if (class96_197_.base != class298_sub15)
						class96_197_ = null;
				}
				method4767(class298_sub15, class96, class96_197_, i_193_, i_194_, i_195_, null, false, bool, i_196_,
						is);
				ka();
				method4734();
			}
		}
	}

	void method4766(int type, int[] labels, int dx, int dy, int dz, int i_164_, boolean bool, int i_165_,
			int[] is_166_) {
		if (i_164_ == 1) {
			if (type == 0 || type == 1) {
				int tmp = -dx;
				dx = dz;
				dz = tmp;
			} else if (type == 3) {
				int tmp = dx;
				dx = dz;
				dz = tmp;
			} else if (type == 2) {
				int tmp = dx;
				dx = -dz & 0x3fff;
				dz = tmp & 0x3fff;
			}
		} else if (i_164_ == 2) {
			if (type == 0 || type == 1) {
				dx = -dx;
				dz = -dz;
			} else if (type == 2) {
				dx = -dx & 0x3fff;
				dz = -dz & 0x3fff;
			}
		} else if (i_164_ == 3) {
			if (type == 0 || type == 1) {
				int i_170_ = dx;
				dx = -dz;
				dz = i_170_;
			} else if (type == 3) {
				int i_171_ = dx;
				dx = dz;
				dz = i_171_;
			} else if (type == 2) {
				int i_172_ = dx;
				dx = dz & 0x3fff;
				dz = -i_172_ & 0x3fff;
			}
		}

		if (i_165_ != 65535) {
			e(type, labels, dx, dy, dz, bool, i_165_, is_166_);
		} else {
			method4738(type, labels, dx, dy, dz, i_164_, bool);
		}
	}

	void method4767(AnimationFrameBase base, AnimationFrame class142, AnimationFrame class142_128_, int i, int i_129_,
			int i_130_, boolean[] bools, boolean bool, boolean bool_131_, int i_132_, int[] is) {
		if (class142_128_ == null || i == 0) {
			for (int transformation = 0; transformation < class142.transformationCount; transformation++) {
				short indices = class142.transformationIndices[transformation];
				if (bools == null || bools[indices] == bool || base.transformationTypes[indices] == 0) {
					short skipped = class142.skippedRefrences[transformation];
					if (skipped != -1) {
						method4766(0, base.labels[skipped], 0, 0, 0, i_130_, bool_131_,
								i_132_ & base.anIntArray7280[skipped], is);
					}

					method4766(base.transformationTypes[indices], base.labels[indices],
							class142.transformationX[transformation], class142.transformationY[transformation],
							class142.transformationZ[transformation], i_130_, bool_131_,
							i_132_ & base.anIntArray7280[indices], is);
				}
			}
		} else {
			int i_136_ = 0;
			int i_137_ = 0;
			for (int index = 0; index < base.count * 92429039; index++) {
				boolean bool_139_ = false;
				if (i_136_ < class142.transformationCount && class142.transformationIndices[i_136_] == index) {
					bool_139_ = true;
				}

				boolean bool_140_ = false;
				if (i_137_ < class142_128_.transformationCount
						&& class142_128_.transformationIndices[i_137_] == index) {
					bool_140_ = true;
				}

				if (bool_139_ || bool_140_) {
					if (bools != null && bools[index] != bool && base.transformationTypes[index] != 0) {
						if (bool_139_) {
							i_136_++;
						}
						if (bool_140_) {
							i_137_++;
						}
					} else {
						int defaultTransformation = 0;
						int type = base.transformationTypes[index];
						if (type == 3 || type == 10) {
							defaultTransformation = 128;
						}

						int dx;
						int dy;
						int dz;
						short skipped;
						byte flags;

						if (bool_139_) {
							dx = class142.transformationX[i_136_];
							dy = class142.transformationY[i_136_];
							dz = class142.transformationZ[i_136_];
							skipped = class142.skippedRefrences[i_136_];
							flags = class142.transformationFlags[i_136_];
							i_136_++;
						} else {
							dx = defaultTransformation;
							dy = defaultTransformation;
							dz = defaultTransformation;
							skipped = (short) -1;
							flags = (byte) 0;
						}

						int i_148_;
						int i_149_;
						int i_150_;
						short i_151_;
						byte i_152_;

						if (bool_140_) {
							i_148_ = class142_128_.transformationX[i_137_];
							i_149_ = class142_128_.transformationY[i_137_];
							i_150_ = class142_128_.transformationZ[i_137_];
							i_151_ = class142_128_.skippedRefrences[i_137_];
							i_152_ = class142_128_.transformationFlags[i_137_];
							i_137_++;
						} else {
							i_148_ = defaultTransformation;
							i_149_ = defaultTransformation;
							i_150_ = defaultTransformation;
							i_151_ = (short) -1;
							i_152_ = (byte) 0;
						}

						int i_153_;
						int i_154_;
						int i_155_;
						if ((flags & 0x2) != 0 || (i_152_ & 0x1) != 0) {
							i_153_ = dx;
							i_154_ = dy;
							i_155_ = dz;
						} else if (type == 2) {
							int i_156_ = i_148_ - dx & 0x3fff;
							int i_157_ = i_149_ - dy & 0x3fff;
							int i_158_ = i_150_ - dz & 0x3fff;
							if (i_156_ >= 8192) {
								i_156_ -= 16384;
							}
							if (i_157_ >= 8192) {
								i_157_ -= 16384;
							}
							if (i_158_ >= 8192) {
								i_158_ -= 16384;
							}
							i_153_ = dx + i_156_ * i / i_129_ & 0x3fff;
							i_154_ = dy + i_157_ * i / i_129_ & 0x3fff;
							i_155_ = dz + i_158_ * i / i_129_ & 0x3fff;
						} else if (type == 9) {
							int i_159_ = i_148_ - dx & 0x3fff;
							if (i_159_ >= 8192) {
								i_159_ -= 16384;
							}
							i_153_ = dx + i_159_ * i / i_129_ & 0x3fff;
							i_155_ = 0;
							i_154_ = 0;
						} else if (type == 7) {
							int i_160_ = i_148_ - dx & 0x3f;
							if (i_160_ >= 32) {
								i_160_ -= 64;
							}
							i_153_ = dx + i_160_ * i / i_129_ & 0x3f;
							i_154_ = dy + (i_149_ - dy) * i / i_129_;
							i_155_ = dz + (i_150_ - dz) * i / i_129_;
						} else {
							i_153_ = dx + (i_148_ - dx) * i / i_129_;
							i_154_ = dy + (i_149_ - dy) * i / i_129_;
							i_155_ = dz + (i_150_ - dz) * i / i_129_;
						}
						if (skipped != -1) {
							method4766(0, base.labels[skipped], 0, 0, 0, i_130_, bool_131_,
									i_132_ & base.anIntArray7280[skipped], is);
						} else if (i_151_ != -1) {
							method4766(0, base.labels[i_151_], 0, 0, 0, i_130_, bool_131_,
									i_132_ & base.anIntArray7280[i_151_], is);
						}
						method4766(type, base.labels[index], i_153_, i_154_, i_155_, i_130_, bool_131_,
								i_132_ & base.anIntArray7280[index], is);
					}
				}
			}
		}
	}

	public abstract void dc(int i);

	public abstract int dk();

	public abstract int db();

	public abstract int dn();

	public abstract byte[] method_do();

	public abstract void method4768(byte i, byte[] is);

	public abstract void method4769(byte i, byte[] is);

	public abstract void du(short i, short i_243_);

	public abstract Model method4770(byte i, int i_244_, boolean bool);

	abstract void cd();

	public abstract void df(short i, short i_245_);

	public abstract void dz(short i, short i_246_);

	public abstract void dt(int i, int i_247_, int i_248_, int i_249_);

	public abstract void dj(int i, int i_250_, int i_251_, int i_252_);

	public abstract void dr(int i, int i_253_, int i_254_, int i_255_);

	public abstract EmitterConfig[] method4771();

	public abstract EmitterConfig[] method4772();

	public abstract MagnetConfig[] method4773();

	public abstract MagnetConfig[] method4774();

	public abstract int dp();

	public abstract MagnetConfig[] method4775();

	public abstract void method4776(Class222 class222, int i, boolean bool);

	public abstract boolean method4777();

	public abstract boolean method4778();

	public abstract void method4779(Model class387_256_, int i, int i_257_, int i_258_, boolean bool);

	abstract void ka();

	public abstract boolean ek();

	public abstract void em();

	void method4780(int i, int i_259_, int i_260_, final int i_261_, final int i_262_, final int i_263_,
			final float[] fs, final int i_264_, final float f, final float[] fs_265_) {
		i -= i_261_;
		i_259_ -= i_262_;
		i_260_ -= i_263_;
		final float f_266_ = (i * fs[0] + i_259_ * fs[1] + i_260_ * fs[2]);
		final float f_267_ = (i * fs[3] + i_259_ * fs[4] + i_260_ * fs[5]);
		final float f_268_ = (i * fs[6] + i_259_ * fs[7] + i_260_ * fs[8]);
		final float f_269_ = (float) Math.sqrt(f_266_ * f_266_ + f_267_ * f_267_ + f_268_ * f_268_);
		float f_270_ = (((float) Math.atan2(f_266_, f_268_) / 6.2831855F) + 0.5F);
		float f_271_ = ((float) Math.asin(f_267_ / f_269_) / 3.1415927F + 0.5F + f);
		if (i_264_ == 1) {
			final float f_272_ = f_270_;
			f_270_ = -f_271_;
			f_271_ = f_272_;
		} else if (i_264_ == 2) {
			f_270_ = -f_270_;
			f_271_ = -f_271_;
		} else if (i_264_ == 3) {
			final float f_273_ = f_270_;
			f_270_ = f_271_;
			f_271_ = -f_273_;
		}
		fs_265_[0] = f_270_;
		fs_265_[1] = f_271_;
	}

	public abstract int an();

	public abstract EmitterConfig[] method4781();

	public abstract void method4782(Class222 class222);

	public abstract void method4783(Class222 class222);

	public abstract Shadow cc(Shadow class_na);

	public abstract void method4784();

	public abstract void bk(int i, int i_274_, int i_275_);

	Class76 method4785(ModelDecoder class144, int[] is, int i) {
		int[] is_45_ = null;
		int[] is_46_ = null;
		int[] is_47_ = null;
		float[][] fs = null;
		if (class144.faceTextureIndexes != null) {
			int i_48_ = class144.texturedFaceCount;
			int[] is_49_ = new int[i_48_];
			int[] is_50_ = new int[i_48_];
			int[] is_51_ = new int[i_48_];
			int[] is_52_ = new int[i_48_];
			int[] is_53_ = new int[i_48_];
			int[] is_54_ = new int[i_48_];
			for (int i_55_ = 0; i_55_ < i_48_; i_55_++) {
				is_49_[i_55_] = 2147483647;
				is_50_[i_55_] = -2147483647;
				is_51_[i_55_] = 2147483647;
				is_52_[i_55_] = -2147483647;
				is_53_[i_55_] = 2147483647;
				is_54_[i_55_] = -2147483647;
			}
			for (int i_56_ = 0; i_56_ < i; i_56_++) {
				int i_57_ = is[i_56_];
				short i_58_ = class144.faceTextureIndexes[i_57_];
				if (i_58_ > -1 && i_58_ < 32766) {
					for (int i_59_ = 0; i_59_ < 3; i_59_++) {
						short i_60_;
						if (i_59_ == 0) {
							i_60_ = class144.faceA[i_57_];
						} else if (i_59_ == 1) {
							i_60_ = class144.faceB[i_57_];
						} else {
							i_60_ = class144.faceC[i_57_];
						}
						int i_61_ = class144.vertexX[i_60_];
						int i_62_ = class144.vertexY[i_60_];
						int i_63_ = class144.vertexZ[i_60_];
						if (i_61_ < is_49_[i_58_]) {
							is_49_[i_58_] = i_61_;
						}
						if (i_61_ > is_50_[i_58_]) {
							is_50_[i_58_] = i_61_;
						}
						if (i_62_ < is_51_[i_58_]) {
							is_51_[i_58_] = i_62_;
						}
						if (i_62_ > is_52_[i_58_]) {
							is_52_[i_58_] = i_62_;
						}
						if (i_63_ < is_53_[i_58_]) {
							is_53_[i_58_] = i_63_;
						}
						if (i_63_ > is_54_[i_58_]) {
							is_54_[i_58_] = i_63_;
						}
					}
				}
			}
			is_45_ = new int[i_48_];
			is_46_ = new int[i_48_];
			is_47_ = new int[i_48_];
			fs = new float[i_48_][];
			for (int i_64_ = 0; i_64_ < i_48_; i_64_++) {
				byte i_65_ = class144.textureRenderTypes[i_64_];
				if (i_65_ > 0) {
					is_45_[i_64_] = (is_49_[i_64_] + is_50_[i_64_]) / 2;
					is_46_[i_64_] = (is_51_[i_64_] + is_52_[i_64_]) / 2;
					is_47_[i_64_] = (is_53_[i_64_] + is_54_[i_64_]) / 2;
					float f;
					float f_66_;
					float f_67_;
					if (i_65_ == 1) {
						int i_68_ = class144.textureScaleX[i_64_];
						if (i_68_ == 0) {
							f = 1.0F;
							f_67_ = 1.0F;
						} else if (i_68_ > 0) {
							f = 1.0F;
							f_67_ = i_68_ / 1024.0F;
						} else {
							f_67_ = 1.0F;
							f = -i_68_ / 1024.0F;
						}
						f_66_ = 64.0F / class144.textureScaleY[i_64_];
					} else if (i_65_ == 2) {
						f = 64.0F / class144.textureScaleX[i_64_];
						f_66_ = 64.0F / class144.textureScaleY[i_64_];
						f_67_ = 64.0F / class144.textureScaleZ[i_64_];
					} else {
						f = class144.textureScaleX[i_64_] / 1024.0F;
						f_66_ = class144.textureScaleY[i_64_] / 1024.0F;
						f_67_ = class144.textureScaleZ[i_64_] / 1024.0F;
					}
					fs[i_64_] = method4731(class144.textureTriangleX[i_64_], class144.textureTriangleY[i_64_],
							class144.textureTriangleZ[i_64_], class144.textureRotationY[i_64_] & 0xff, f, f_66_, f_67_);
				}
			}
		}
		return new Class76(this, is_45_, is_46_, is_47_, fs);
	}

	public abstract void method4786(Class222 class222);

	public abstract boolean method4787(int i, int i_300_, Class222 class222, boolean bool, int i_301_);

	public abstract boolean method4788();

	public abstract int RA();

	public abstract int cq();

	public abstract boolean ex();

	public abstract Shadow ga(Shadow class_na);

	public abstract void ac(int i);

	abstract void cj(int i, int[] is, int i_302_, int i_303_, int i_304_, boolean bool, int i_305_, int[] is_306_);
}
