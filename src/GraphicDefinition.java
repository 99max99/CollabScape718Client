/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicDefinition {
	int id;
	int anInt5203;
	int modelId;
	public int animation = -761293581;
	short[] originalColours;
	short[] replacementColours;
	short[] originalTextures;
	short[] replacementTextures;
	Class389 provider;
	int scaleY;
	int rotation;
	int ambience;
	int contrast;
	public boolean aBoolean5215;
	public byte aByte5216;
	int scaleXZ = -1498254464;
	private byte[] aByteArray8432;
	private byte[] aByteArray8431;

	void method4915(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i == -1)
						throw new IllegalStateException();
					break;
				}
				method4916(class298_sub53, i_0_, 84112235);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.a(").append(')').toString());
		}
	}

	void method4916(RsByteBuffer buffer, int opcode, int i_1_) {
		try {
			if (1 == opcode)
				this.modelId = buffer.readBigSmart(0) * 422607467;
			else if (opcode == 2)
				animation = buffer.readBigSmart(0) * 761293581;
			else if (4 == opcode)
				this.scaleXZ = buffer.readUnsignedShort() * -1420991257;
			else if (opcode == 5)
				this.scaleY = buffer.readUnsignedShort() * -586540739;
			else if (opcode == 6)
				this.rotation = buffer.readUnsignedShort() * -79411937;
			else if (7 == opcode)
				this.ambience = buffer.readUnsignedByte() * 1905965041;
			else if (8 == opcode)
				this.contrast = buffer.readUnsignedByte() * -241990007;
			else if (9 == opcode) {
				aByte5216 = (byte) 3;
				this.anInt5203 = -1485189472;
			} else if (10 == opcode)
				aBoolean5215 = true;
			else if (opcode == 11)
				aByte5216 = (byte) 1;
			else if (12 == opcode)
				aByte5216 = (byte) 4;
			else if (opcode == 13)
				aByte5216 = (byte) 5;
			else if (14 == opcode) {
				aByte5216 = (byte) 2;
				this.anInt5203 = buffer.readUnsignedByte() * -497453824;
			} else if (opcode == 15) {
				aByte5216 = (byte) 3;
				this.anInt5203 = buffer.readUnsignedShort() * 48388469;
			} else if (16 == opcode) {
				aByte5216 = (byte) 3;
				this.anInt5203 = buffer.readInt((byte) 0) * 48388469;
			} else if (40 == opcode) {
				final int count = buffer.readUnsignedByte();
				this.originalColours = new short[count];
				this.replacementColours = new short[count];
				for (int i_3_ = 0; i_3_ < count; i_3_++) {
					this.originalColours[i_3_] = (short) buffer.readUnsignedShort();
					this.replacementColours[i_3_] = (short) buffer.readUnsignedShort();
				}
			} else if (41 == opcode) {
				final int count = buffer.readUnsignedByte();
				this.originalTextures = new short[count];
				this.replacementTextures = new short[count];
				for (int i_5_ = 0; i_5_ < count; i_5_++) {
					this.originalTextures[i_5_] = (short) buffer.readUnsignedShort();
					this.replacementTextures[i_5_] = (short) buffer.readUnsignedShort();
				}
			} else if (44 == opcode) {
				int value = buffer.readUnsignedShort();
				int count = 0;
				for (int i_66_ = value; i_66_ > 0; i_66_ >>= 1)
					count++;
				aByteArray8432 = new byte[count];
				byte previous = 0;
				for (int i_68_ = 0; i_68_ < count; i_68_++) {
					if ((value & 1 << i_68_) > 0) {
						aByteArray8432[i_68_] = previous;
						previous++;
					} else
						aByteArray8432[i_68_] = (byte) -1;
				}
			} else if (opcode == 45) {
				int value = buffer.readUnsignedShort();
				int count = 0;
				for (int i_71_ = value; i_71_ > 0; i_71_ >>= 1)
					count++;
				aByteArray8431 = new byte[count];
				byte previous = 0;
				for (int i_73_ = 0; i_73_ < count; i_73_++) {
					if ((value & 1 << i_73_) > 0) {
						aByteArray8431[i_73_] = previous;
						previous++;
					} else
						aByteArray8431[i_73_] = (byte) -1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.f(").append(')').toString());
		}
	}

	public final Model method4917(Toolkit class_ra, int i, Class438 class438, byte i_6_, int i_7_) {
		try {
			return method4918(class_ra, i, false, null, null, 0, 0, 0, class438, i_6_, 1256553464);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.b(").append(')').toString());
		}
	}

	public final Model method4918(Toolkit toolkit, int functionMask, boolean bool, Ground class_xa, Ground class_xa_8_,
			int i_9_, int i_10_, int i_11_, Class438 class438, byte i_12_, int i_13_) {
		try {
			int mask = functionMask;
			bool = bool & 0 != aByte5216;
			if (null != class438)
				mask |= class438.method5829(0);

			if (this.scaleY * -64059883 != 128)
				mask |= 0x2;

			if (128 != this.scaleXZ * -1869386025 || 0 != this.rotation * -614140193)
				mask |= 0x5;

			if (bool) {
				mask |= 0x7;
			}

			Model model;
			synchronized (this.provider.cache) {
				model = ((Model) (this.provider.cache
						.get((this.id = (1757755963 * ((-559444237 * this.id) | (toolkit.id * 580915349 << 29))))
								* -559444237)));
			}
			if (model == null || toolkit.method5017(model.m(), mask) != 0) {
				if (model != null)
					mask = toolkit.mergeFunctionMasks(mask, model.m());

				int attributes = mask;
				if (this.originalColours != null)
					attributes |= 0x4000;
				if (this.originalTextures != null)
					attributes |= 0x8000;

				final ModelDecoder class64 = ModelDecoder.getModel((this.provider.models), (this.modelId * -283549117),
						0);
				if (class64 == null)
					return null;
				if (class64.version < 13)
					class64.method755(2);
				model = (toolkit.createModel(class64, attributes, -258957271 * (this.provider).anInt4163,
						64 + -2043193071 * this.ambience, 850 + 1459867577 * this.contrast));
				if (null != this.originalColours) {
					for (int i_16_ = 0; i_16_ < this.originalColours.length; i_16_++)
						model.X(this.originalColours[i_16_], this.replacementColours[i_16_]);
				}
				if (this.originalTextures != null) {
					for (int i_17_ = 0; i_17_ < this.originalTextures.length; i_17_++)
						model.W(this.originalTextures[i_17_], this.replacementTextures[i_17_]);
				}
				model.KA(mask);
				synchronized (this.provider.cache) {
					this.provider.cache.put(model,
							(this.id = ((this.id * -559444237 | 580915349 * toolkit.id << 29) * 1757755963))
									* -559444237);
				}
			}
			final Model class387_18_ = model.method4755(i_12_, mask, true);
			if (class438 != null)
				class438.method5839(class387_18_, 0, 0);

			if (-1869386025 * this.scaleXZ != 128 || this.scaleY * -64059883 != 128)
				class387_18_.oa(-1869386025 * this.scaleXZ, this.scaleY * -64059883, -1869386025 * this.scaleXZ);
			int yaw = 0;

			if (-614140193 * this.rotation != 0) {
				if (this.rotation * -614140193 == 90)
					yaw = 4096;
				if (-614140193 * this.rotation == 180)
					yaw = 8192;
				if (270 == -614140193 * this.rotation)
					yaw = 12288;
			}

			if (0 != yaw) {
				yaw &= 0x3fff;
				class387_18_.f(yaw);
			}
			if (bool)
				class387_18_.pa(aByte5216, 167177949 * this.anInt5203, class_xa, class_xa_8_, i_9_, i_10_, i_11_);
			class387_18_.KA(functionMask);
			return class387_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.p(").append(')').toString());
		}
	}

	GraphicDefinition() {
		((GraphicDefinition) this).scaleY = -2062770560;
		((GraphicDefinition) this).rotation = 0;
		((GraphicDefinition) this).ambience = 0;
		((GraphicDefinition) this).contrast = 0;
		aBoolean5215 = false;
		aByte5216 = (byte) 0;
		((GraphicDefinition) this).anInt5203 = -48388469;
	}

	public final boolean loaded(byte i) {
		try {
			if (((GraphicDefinition) this).modelId * -283549117 == -1)
				return true;
			return (((Class389) ((GraphicDefinition) this).provider).models
					.containsFile(-283549117 * ((GraphicDefinition) this).modelId, 0));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.i(").append(')').toString());
		}
	}

	static boolean method4920(int i, short i_19_) {
		try {
			if (i == 18 || 19 == i || 20 == i || i == 21 || 22 == i || 1004 == i)
				return true;
			if (17 == i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.bo(").append(')').toString());
		}
	}

	public static boolean method4921(char c, int i) {
		try {
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				return true;
			if (c != 0) {
				char[] cs = Class419.aCharArray5340;
				for (int i_20_ = 0; i_20_ < cs.length; i_20_++) {
					char c_21_ = cs[i_20_];
					if (c_21_ == c)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.f(").append(')').toString());
		}
	}

	public static final void method4922(String string, int i) {
		try {
			if (Class82_Sub6.aClass7Array6846 != null) {
				Class25 class25 = Class429.method5760((short) 512);
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.KICK_FRIEND_CHAT_PACKET,
						class25.aClass449_330, (byte) 6);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class58.method693(string, 1482909411));
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2132300359);
				class25.method390(class298_sub36, (byte) -58);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.mr(").append(')').toString());
		}
	}

	static final void method4923(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_,
			int i_29_) {
		try {
			if (i_23_ >= 1 && i_24_ >= 1 && i_23_ <= pb.aClass283_8716.method2629(-1936425983) - 2
					&& (i_24_ <= pb.aClass283_8716.method2630(-1245034974) - 2)) {
				int i_30_ = i;
				if (i_30_ < 3 && pb.aClass283_8716.method2654(511320643).method2320(i_23_, i_24_, 549965572))
					i_30_++;
				if (pb.aClass283_8716.method2675(-1611682495) != null) {
					pb.aClass283_8716.method2644(-1368274969).method2234(Class373.activeToolkit, i, i_22_, i_23_, i_24_,
							pb.aClass283_8716.getSceneClipDataPlane(i), 366084983);
					if (i_25_ >= 0) {
						int i_31_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547.method5629(-810781268);
						Class422_Sub25.aClass298_Sub48_8425
								.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547), 1, 650835797);
						pb.aClass283_8716.method2644(-630573167).method2243(Class373.activeToolkit, i_30_, i, i_23_,
								i_24_, i_25_, i_26_, i_27_, pb.aClass283_8716.getSceneClipDataPlane(i), i_28_,
								2073430416);
						Class422_Sub25.aClass298_Sub48_8425.method3540(
								(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547), i_31_, 631929348);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.d(").append(')').toString());
		}
	}

	public static int method4924(CharSequence charsequence, int i, byte i_32_) {
		try {
			return Class422.method5619(charsequence, i, true, -566000595);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.k(").append(')').toString());
		}
	}

	static final void method4925(Class403 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub28_7573,
					(((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689)
							* 681479919)]) != 0 ? 1 : 0,
					-856880407);
			Class3.method300(656179282);
			pb.aClass283_8716.method2667(1778418334);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.aip(").append(')').toString());
		}
	}
}
