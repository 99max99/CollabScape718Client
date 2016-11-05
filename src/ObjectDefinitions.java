import java.util.Arrays;

/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectDefinitions {
	byte aByte5363;
	public int anInt5364;
	public int objectId;
	public int[] morphisms;
	public short[] replacementColours;
	public String name = "null";
	short[] originalColours;
	public int[] anIntArray5370;
	byte[] recolourPalette;
	short[] originalTextures;
	public short[] destTextures;
	public int[][] models;
	byte aByte5375;
	public int occludes;
	byte aByte5377 = 0;
	int[] anIntArray5378;
	int offsetX;
	public int clip_type;
	public boolean aBoolean5381;
	public int anInt5382;
	public int sizeY;
	int anInt5384;
	public boolean aBoolean5385;
	public int sizeX = -2144855351;
	public int anInt5387;
	public int anInt5388;
	public boolean bloom;
	int[] anIntArray5390;
	public int anInt5391;
	int shadow;
	int lightness;
	public String[] options;
	public boolean aBoolean5395;
	int offsetY;
	public int anInt5397;
	public int anInt5398;
	public int anInt5399;
	public int anInt5400;
	public boolean aBoolean5401;
	public int anInt5402;
	Class433 provider;
	public boolean mirrorModel;
	public boolean castsShadow;
	int modelSizeX;
	int modelSizeY;
	public int anInt5408;
	public int holdsItemPiles;
	public boolean aBoolean5410;
	int offsetZ;
	int anInt5412;
	int anInt5413;
	int modelSizeZ;
	byte aByte5415;
	public boolean clip_unknown;
	byte aByte5417;
	public int anInt5418;
	int anInt5419;
	int varbit;
	int varp;
	public int anInt5422;
	public static short[] COLORS_ARRAY = new short[256];
	public boolean clip_solid;
	public int anInt5425;
	public boolean aBoolean5426;
	public int anInt5427;
	public int anInt5428;
	public int[] anIntArray5429;
	public byte[] modelTypes;
	public boolean aBoolean5431;
	public boolean aBoolean5432;
	public boolean aBoolean5433;
	public boolean aBoolean5434;
	HashTable aClass437_5435;
	public int anInt5436;
	public int anInt5437;
	public int anInt5438;
	public int anInt5439;
	public boolean aBoolean5440;
	public boolean aBoolean5441;
	static int anInt5442 = 127007;

	public int rotationFlags = 0;

	void decode(RsByteBuffer stream, int opcode, int i_0_) {
		try {
			if (1 == opcode) {
				int i_1_ = stream.readUnsignedByte();
				modelTypes = new byte[i_1_];
				models = new int[i_1_][];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					modelTypes[i_2_] = stream.readByte();
					int i_3_ = stream.readUnsignedByte();
					models[i_2_] = new int[i_3_];
					for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
						models[i_2_][i_4_] = stream.readBigSmart(1235052657);
				}
			} else if (opcode == 2)
				name = stream.readString(-1849485656);
			else if (14 == opcode)
				sizeX = stream.readUnsignedByte() * -2144855351;
			else if (opcode == 15)
				sizeY = stream.readUnsignedByte() * 44056569;
			else if (opcode == 17) {
				clip_type = 0;
				clip_solid = false;
			} else if (opcode == 18)
				clip_solid = false;
			else if (19 == opcode)
				anInt5382 = stream.readUnsignedByte() * 455422743;
			else if (21 == opcode)
				aByte5363 = (byte) 1;
			else if (opcode == 22)
				aBoolean5385 = true;
			else if (opcode == 23)
				occludes = -580315545;
			else if (24 == opcode) {
				int i_5_ = stream.readBigSmart(1235052657);
				if (i_5_ != -1)
					anIntArray5378 = new int[] { i_5_ };
			} else if (opcode == 27)
				clip_type = 268680417;
			else if (28 == opcode)
				anInt5391 = ((stream.readUnsignedByte() << 2) * 803995289);
			else if (opcode == 29)
				shadow = stream.readByte() * -62240291;
			else if (39 == opcode)
				lightness = stream.readByte() * -1530589831;
			else if (opcode >= 30 && opcode < 35)
				options[opcode - 30] = stream.readString(2140843487);
			else if (opcode == 40) {
				int i_6_ = stream.readUnsignedByte();
				originalColours = new short[i_6_];
				replacementColours = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					originalColours[i_7_] = (short) stream.readUnsignedShort();
					replacementColours[i_7_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 41) {
				int i_8_ = stream.readUnsignedByte();
				originalTextures = new short[i_8_];
				destTextures = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					originalTextures[i_9_] = (short) stream.readUnsignedShort();
					destTextures[i_9_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_10_ = stream.readUnsignedByte();
				recolourPalette = new byte[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					recolourPalette[i_11_] = stream.readByte();
			} else if (44 == opcode) {
				int i_86_ = (short) stream.readUnsignedShort();
				int i_87_ = 0;
				for (int i_88_ = i_86_; i_88_ > 0; i_88_ >>= 1)
					i_87_++;
				byte[] unknownArray3 = new byte[i_87_]; // UNKOWN
				byte i_89_ = 0;
				for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
					if ((i_86_ & 1 << i_90_) > 0) {
						unknownArray3[i_90_] = i_89_;
						i_89_++;
					} else
						unknownArray3[i_90_] = (byte) -1;
				}
			} else if (opcode == 45) {
				int i_91_ = (short) stream.readUnsignedShort();
				int i_92_ = 0;
				for (int i_93_ = i_91_; i_93_ > 0; i_93_ >>= 1)
					i_92_++;
				byte[] unknownArray4 = new byte[i_92_]; // UNKOWN
				byte i_94_ = 0;
				for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
					if ((i_91_ & 1 << i_95_) > 0) {
						unknownArray4[i_95_] = i_94_;
						i_94_++;
					} else
						unknownArray4[i_95_] = (byte) -1;
				}
			} else if (opcode == 62)
				mirrorModel = true;
			else if (64 == opcode)
				castsShadow = false;
			else if (65 == opcode)
				modelSizeX = stream.readUnsignedShort() * 929519655;
			else if (66 == opcode)
				modelSizeY = stream.readUnsignedShort() * -1076239419;
			else if (opcode == 67)
				modelSizeZ = stream.readUnsignedShort() * 1192395179;
			else if (opcode == 69) {
				rotationFlags = stream.readUnsignedByte();
			} else if (opcode == 70)
				offsetX = (stream.readShort(1954619354) << 2) * 804752437;
			else if (opcode == 71)
				offsetY = ((stream.readShort(1981333343) << 2) * -830213317);
			else if (opcode == 72)
				offsetZ = ((stream.readShort(2079097901) << 2) * 1957563615);
			else if (opcode == 73)
				aBoolean5410 = true;
			else if (opcode == 74) {
				clip_unknown = true;
			} else if (opcode == 75)
				holdsItemPiles = stream.readUnsignedByte() * 1763780945;
			else if (77 == opcode || 92 == opcode) {
				varbit = stream.readUnsignedShort() * -1228374415;
				if (65535 == 1064010385 * varbit)
					varbit = 1228374415;
				varp = stream.readUnsignedShort() * -2115564225;
				if (65535 == -1128963393 * varp)
					varp = 2115564225;
				int i_12_ = -1;
				if (92 == opcode)
					i_12_ = stream.readBigSmart(1235052657);
				int i_13_ = stream.readUnsignedByte();
				morphisms = new int[2 + i_13_];
				for (int i_14_ = 0; i_14_ <= i_13_; i_14_++)
					morphisms[i_14_] = stream.readBigSmart(1235052657);
				morphisms[i_13_ + 1] = i_12_;
			} else if (opcode == 78) {
				anInt5422 = stream.readUnsignedShort() * -349046175;
				anInt5408 = stream.readUnsignedByte() * -634552289;
			} else if (opcode == 79) {
				anInt5427 = stream.readUnsignedShort() * 1882310759;
				anInt5428 = stream.readUnsignedShort() * 1376401661;
				anInt5408 = stream.readUnsignedByte() * -634552289;
				int i_15_ = stream.readUnsignedByte();
				anIntArray5429 = new int[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
					anIntArray5429[i_16_] = stream.readUnsignedShort();
			} else if (81 == opcode) {
				aByte5363 = (byte) 2;
				anInt5384 = stream.readUnsignedByte() * -1868938496;
				if ((1762198123 * anInt5384) == 16384) {
					aByte5363 = 1;
					anInt5384 = 242181565; // -1
				}
			} else if (opcode == 82)
				aBoolean5432 = true;
			else if (88 == opcode)
				aBoolean5433 = false;
			else if (opcode == 89)
				aBoolean5431 = false;
			else if (91 == opcode)
				aBoolean5434 = true;
			else if (opcode == 93) {
				aByte5363 = (byte) 3;
				anInt5384 = stream.readUnsignedShort() * -242181565;
			} else if (opcode == 94)
				aByte5363 = (byte) 4;
			else if (95 == opcode) {
				aByte5363 = (byte) 5;
				anInt5384 = stream.readShort(2013201622) * -242181565;
			} else if (97 == opcode)
				aBoolean5401 = true;
			else if (98 == opcode)
				aBoolean5381 = true;
			else if (99 == opcode) {
				anInt5397 = stream.readUnsignedByte() * 2064530465;
				anInt5436 = stream.readUnsignedShort() * -1320066331;
			} else if (100 == opcode) {
				anInt5398 = stream.readUnsignedByte() * 1406097311;
				anInt5364 = stream.readUnsignedShort() * 474865427;
			} else if (101 == opcode)
				anInt5402 = stream.readUnsignedByte() * 1747447869;
			else if (opcode == 102)
				anInt5400 = stream.readUnsignedShort() * 475870643;
			else if (103 == opcode)
				occludes = 0;
			else if (104 == opcode)
				anInt5425 = stream.readUnsignedByte() * 1861040235;
			else if (opcode == 105)
				aBoolean5440 = true;
			else if (106 == opcode) {
				int i_17_ = stream.readUnsignedByte();
				int i_18_ = 0;
				anIntArray5378 = new int[i_17_];
				anIntArray5390 = new int[i_17_];
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					anIntArray5378[i_19_] = stream.readBigSmart(1235052657);
					i_18_ += anIntArray5390[i_19_] = stream.readUnsignedByte();
				}
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++)
					anIntArray5390[i_20_] = (65535 * anIntArray5390[i_20_] / i_18_);
			} else if (opcode == 107)
				anInt5399 = stream.readUnsignedShort() * -779127471;
			else if (opcode >= 150 && opcode < 155) {
				options[opcode - 150] = stream.readString(67859332);
				if (!((Class433) provider).aBoolean5445)
					options[opcode - 150] = null;
			} else if (160 == opcode) {
				int i_21_ = stream.readUnsignedByte();
				anIntArray5370 = new int[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray5370[i_22_] = stream.readUnsignedShort();
			} else if (opcode == 162) {
				aByte5363 = (byte) 3;
				anInt5384 = stream.readInt((byte) 30) * -242181565;
			} else if (opcode == 163) {
				aByte5417 = stream.readByte();
				aByte5375 = stream.readByte();
				aByte5415 = stream.readByte();
				aByte5377 = stream.readByte();
			} else if (opcode == 164)
				anInt5412 = stream.readShort(2119621102) * -1121469985;
			else if (165 == opcode)
				anInt5413 = stream.readShort(1762145274) * 1097094883;
			else if (166 == opcode)
				anInt5419 = stream.readShort(1892618723) * -870210675;
			else if (opcode == 167)
				anInt5418 = stream.readUnsignedShort() * 597954411;
			else if (168 == opcode)
				aBoolean5426 = true;
			else if (169 == opcode)
				aBoolean5395 = true;
			else if (170 == opcode)
				anInt5387 = stream.readUnsignedSmart(1723054621) * -1277797453;
			else if (171 == opcode)
				anInt5388 = stream.readUnsignedSmart(1723054621) * 883280249;
			else if (opcode == 173) {
				anInt5438 = stream.readUnsignedShort() * 1097791615;
				anInt5439 = stream.readUnsignedShort() * -127624289;
			} else if (opcode == 177)
				bloom = true;
			else if (178 == opcode)
				anInt5437 = stream.readUnsignedByte() * -1122029857;
			else if (opcode == 186 || opcode == 196 || opcode == 197)
				stream.readUnsignedByte();
			else if (opcode == 189)
				aBoolean5441 = true;
			else if (opcode >= 190 && opcode < 196) {
				int[] aj = null;
				if (aj == null) {
					aj = new int[6];
					Arrays.fill(aj, -1);
				}
				aj[opcode - 190] = stream.readUnsignedShort();
			} else if (opcode == 201) {
				stream.readUnsignedSmart(0);
				stream.readUnsignedSmart(0);
				stream.readUnsignedSmart(0);
				stream.readUnsignedSmart(0);
				stream.readUnsignedSmart(0);
				stream.readUnsignedSmart(0);
			} else if (opcode == 198) {

			} else if (opcode == 249) {
				int i_23_ = stream.readUnsignedByte();
				if (aClass437_5435 == null) {
					int i_24_ = Class416.nextPowerOfTwo(i_23_, (byte) 16);
					aClass437_5435 = new HashTable(i_24_);
				}
				for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_26_ = stream.read24BitUnsignedInteger((byte) 44);
					Class298 class298;
					if (bool)
						class298 = new Class298_Sub29(stream.readString(-2143557829));
					else
						class298 = new Class298_Sub35(stream.readInt((byte) -68));
					aClass437_5435.method5817(class298, (long) i_26_);
				}
			} else
				System.out.println("Missing object opcode: " + opcode);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.f(").append(')').toString());
		}
	}

	public String method5770(int i, String string, int i_27_) {
		try {
			if (aClass437_5435 == null)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) aClass437_5435.get((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.q(").append(')').toString());
		}
	}

	public final boolean method5771(int i, byte i_28_) {
		try {
			if (models == null)
				return true;
			boolean bool = true;
			synchronized (((Class433) provider).aClass243_5447) {
				for (int i_29_ = 0; i_29_ < modelTypes.length; i_29_++) {
					if (modelTypes[i_29_] == i) {
						for (int i_30_ = 0; i_30_ < models[i_29_].length; i_30_++) {
							if (!((Class433) provider).aClass243_5447.containsFile(models[i_29_][i_30_], 0))
								bool = false;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.p(").append(')').toString());
		}
	}

	public final boolean method5772(int i) {
		try {
			if (models == null)
				return true;
			boolean bool = true;
			synchronized (((Class433) provider).aClass243_5447) {
				for (int i_31_ = 0; i_31_ < models.length; i_31_++) {
					for (int i_32_ = 0; i_32_ < models[i_31_].length; i_32_++)
						bool &= (((Class433) provider).aClass243_5447.containsFile(models[i_31_][i_32_], 0));
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.i(").append(')').toString());
		}
	}

	public boolean method5773(int i, int i_33_) {
		try {
			if (anIntArray5378 != null && -1 != i) {
				for (int i_34_ = 0; i_34_ < anIntArray5378.length; i_34_++) {
					if (anIntArray5378[i_34_] == i)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.h(").append(')').toString());
		}
	}

	public final synchronized Model method5774(Toolkit toolkit, int i, int objectType, int rotation, Ground class_xa,
			Ground class_xa_37_, int i_38_, int i_39_, int i_40_, Class438 class438, ObjectOverride class435,
			byte i_41_) {
		try {
			if (Class355.notValidType(objectType))
				objectType = GameObjectType.T4.type * -1976050083;
			long modelHash = (long) (rotation + ((objectType << 3) + (1181652947 * objectId << 10)));
			int mask = i;
			modelHash |= (long) (toolkit.id * 580915349 << 29);
			if (null != class435) // ignore. only used by a packet
				modelHash |= (((ObjectOverride) class435).id * 2595045048596347611L << 32);
			if (class438 != null)
				i |= class438.method5829(-1790708337);
			if (aByte5363 == 3)
				i |= 0x7;
			else {
				if (aByte5363 != 0 || 0 != 52797131 * anInt5413)
					i |= 0x2;
				if (945504799 * anInt5412 != 0)
					i |= 0x1;
				if (0 != anInt5419 * 1782732613)
					i |= 0x4;
			}
			if (GameObjectType.T10.type * -1976050083 == objectType && rotation > 3)
				i |= 0x5;
			Model class387;
			synchronized (((Class433) provider).aClass348_5451) {
				class387 = (Model) ((Class433) provider).aClass348_5451.get(modelHash);
			}
			if (class387 == null || toolkit.method5017(class387.m(), i) != 0) {
				if (class387 != null)
					i = toolkit.mergeFunctionMasks(i, class387.m());
				class387 = method5775(toolkit, i, objectType, rotation, class435, 1981902641);
				if (null == class387)
					return null;
				synchronized (((Class433) provider).aClass348_5451) {
					((Class433) provider).aClass348_5451.put(class387, modelHash);
				}
			}
			boolean bool = false;
			if (class438 != null) {
				class387 = class387.method4755((byte) 1, i, true);
				bool = true;
				class438.method5839(class387, rotation & 0x3, 1865606525);
			}
			if (objectType == -1976050083 * GameObjectType.T10.type && rotation > 3) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.f(2048);
			}
			if (aByte5363 != 0) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.pa(aByte5363, 1762198123 * anInt5384, class_xa, class_xa_37_, i_38_, i_39_, i_40_);
			}
			if (945504799 * anInt5412 != 0 || 0 != anInt5413 * 52797131 || 0 != 1782732613 * anInt5419) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.ia(945504799 * anInt5412, anInt5413 * 52797131, 1782732613 * anInt5419);
			}
			if (bool)
				class387.KA(mask);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.d(").append(')').toString());
		}
	}

	Model method5775(Toolkit toolkit, int attributes, int type, int orientation, ObjectOverride override, int i_45_) {
		try {
			int shadowValue = shadow * -1536403851 + 64;
			int lightnessValue = -2019557395 * lightness + 850;
			int i_48_ = attributes;
			boolean bool = (mirrorModel || (type == GameObjectType.T2.type * -1976050083 && orientation > 3));
			if (bool)
				attributes |= 0x10;
			if (orientation == 0) {
				if (-166422633 * modelSizeX != 128 || offsetX * -1514641891 != 0)
					attributes |= 0x1;
				if (128 != modelSizeZ * -895192829 || 0 != 2145431327 * offsetZ)
					attributes |= 0x4;
			} else
				attributes |= 0xd;
			if (128 != 668312333 * modelSizeY || offsetY * 1536191987 != 0)
				attributes |= 0x2;
			if (null != originalColours)
				attributes |= 0x4000;
			if (originalTextures != null)
				attributes |= 0x8000;
			if (aByte5377 != 0)
				attributes |= 0x80000;

			Model model = null;
			if (null != modelTypes) {
				int match = -1;
				for (int index = 0; index < modelTypes.length; index++) {
					if (type == modelTypes[index]) {
						match = index;
						break;
					}
				}
				if (match == -1)
					return null;
				int[] ids = ((override != null && override.anIntArray5463 != null) ? override.anIntArray5463
						: models[match]);
				int length = ids.length;
				if (length > 0) {
					long key = (long) (580915349 * toolkit.id);
					for (int i_52_ = 0; i_52_ < length; i_52_++)
						key = (long) ids[i_52_] + 67783L * key;
					synchronized (((Class433) provider).aClass348_5450) {
						model = ((Model) ((Class433) provider).aClass348_5450.get(key));
					}

					if (null != model) {
						if (shadowValue != model.c())
							attributes |= 0x1000;
						if (lightnessValue != model.Z())
							attributes |= 0x2000;
					}

					if (null == model || toolkit.method5017(model.m(), attributes) != 0) {
						int i_53_ = attributes | 0x1f01f;
						if (model != null)
							i_53_ = toolkit.mergeFunctionMasks(i_53_, model.m());
						ModelDecoder class64 = null;
						synchronized (((Class433) provider).aClass64Array5443) {
							for (int index = 0; index < length; index++) {
								synchronized (((Class433) (provider)).aClass243_5447) {
									class64 = (ModelDecoder.getModel((((Class433) (provider)).aClass243_5447),
											ids[index], 0));
								}
								if (null == class64) {
									Model class387_55_ = null;
									return class387_55_;
								}
								if (class64.version < 13)
									class64.method755(2);
								if (length > 1)
									((Class433) provider).aClass64Array5443[index] = class64;
							}
							if (length > 1)
								class64 = new ModelDecoder((((Class433) (provider)).aClass64Array5443), length);
						}
						model = toolkit.createModel(class64, i_53_, (((Class433) (provider)).anInt5453) * -914670477,
								shadowValue, lightnessValue);
						synchronized (((Class433) provider).aClass348_5450) {
							((Class433) provider).aClass348_5450.put(model, key);
						}
					}
				}
			}
			
			if (null == model)
				return null;
			Model result = model.method4755((byte) 0, attributes, true);
			if (shadowValue != model.c())
				result.p(shadowValue);
			if (lightnessValue != model.Z())
				result.Q(lightnessValue);
			if (bool)
				result.wa();
			if (type == GameObjectType.T4.type * -1976050083 && orientation > 3) {
				result.S(2048);
				result.ia(180, 0, -180);
			}
			
			orientation &= 0x3;
			if (1 == orientation)
				result.S(4096);
			else if (2 == orientation)
				result.S(8192);
			else if (orientation == 3)
				result.S(12288);
			
			if (null != originalColours) {
				short[] replacements;
				if (override != null && override.destColours != null)
					replacements = override.destColours;
				else
					replacements = replacementColours;
				for (int index = 0; index < originalColours.length; index++) {
					if (recolourPalette != null && index < recolourPalette.length)
						result.X((originalColours[index]), COLORS_ARRAY[(recolourPalette[index]) & 0xff]);
					else
						result.X((originalColours[index]), replacements[index]);
				}
			}
			
			if (null != originalTextures) {
				short[] replacement;
				if (null != override && null != override.destTextures)
					replacement = override.destTextures;
				else
					replacement = destTextures;
				for (int i_58_ = 0; i_58_ < originalTextures.length; i_58_++)
					result.W(originalTextures[i_58_], replacement[i_58_]);
			}
			if (0 != aByte5377)
				result.PA(aByte5417, aByte5375, aByte5415, aByte5377 & 0xff);
			if (-166422633 * modelSizeX != 128 || 668312333 * modelSizeY != 128 || 128 != -895192829 * modelSizeZ)
				result.oa(modelSizeX * -166422633, modelSizeY * 668312333, modelSizeZ * -895192829);
			if (0 != offsetX * -1514641891 || 0 != 1536191987 * offsetY || 0 != offsetZ * 2145431327)
				result.ia(-1514641891 * offsetX, offsetY * 1536191987, offsetZ * 2145431327);
			result.KA(i_48_);
			return result;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.u(").append(')').toString());
		}
	}

	public int method5776(int i, int i_59_, byte i_60_) {
		try {
			if (null == aClass437_5435)
				return i_59_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) aClass437_5435.get((long) i));
			if (null == class298_sub35)
				return i_59_;
			return -774922497 * class298_sub35.anInt7394;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.r(").append(')').toString());
		}
	}

	public final ObjectDefinitions method5777(Interface23 interface23, int i) {
		try {
			int i_61_ = -1;
			if (varbit * 1064010385 != -1)
				i_61_ = interface23.method250((varbit * 1064010385), (byte) 36);
			else if (-1128963393 * varp != -1)
				i_61_ = interface23.method252((varp * -1128963393), (byte) 99);
			if (i_61_ < 0 || i_61_ >= morphisms.length - 1 || -1 == morphisms[i_61_]) {
				int i_62_ = morphisms[morphisms.length - 1];
				if (-1 != i_62_)
					return provider.getObjectDefinitions(i_62_);
				return null;
			}
			return provider.getObjectDefinitions(morphisms[i_61_]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.x(").append(')').toString());
		}
	}

	void method5778(int i) {
		try {
			if (1532834983 * anInt5382 == -1) {
				anInt5382 = 0;
				if (null != modelTypes && 1 == modelTypes.length
						&& (modelTypes[0] == GameObjectType.T10.type * -1976050083))
					anInt5382 = 455422743;
				for (int i_63_ = 0; i_63_ < 5; i_63_++) {
					if (null != options[i_63_]) {
						anInt5382 = 455422743;
						break;
					}
				}
			}
			if (512737201 * holdsItemPiles == -1)
				holdsItemPiles = 1763780945 * (clip_type * -2144543407 != 0 ? 1 : 0);
			if (method5779(934270378) || aBoolean5381 || null != morphisms)
				bloom = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.b(").append(')').toString());
		}
	}

	public boolean method5779(int i) {
		try {
			return anIntArray5378 != null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.s(").append(')').toString());
		}
	}

	public boolean method5780(int i) {
		try {
			return (anIntArray5378 != null && anIntArray5378.length > 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.z(").append(')').toString());
		}
	}

	public int method5781(byte i) {
		try {
			if (null != anIntArray5378) {
				if (anIntArray5378.length > 1) {
					int i_64_ = (int) (Math.random() * 65535.0);
					for (int i_65_ = 0; i_65_ < anIntArray5378.length; i_65_++) {
						if (i_64_ <= anIntArray5390[i_65_])
							return anIntArray5378[i_65_];
						i_64_ -= anIntArray5390[i_65_];
					}
				} else
					return anIntArray5378[0];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	public int[] method5782(int i) {
		try {
			return anIntArray5378;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.t(").append(')').toString());
		}
	}

	void method5783(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_66_ = class298_sub53.readUnsignedByte();
				if (i_66_ == 0) {
					if (i != -1780393822) {
						/* empty */
					}
					break;
				}
				decode(class298_sub53, i_66_, -537941504);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	ObjectDefinitions() {
		sizeY = 44056569;
		clip_type = -2019485854;
		clip_solid = true;
		anInt5382 = -455422743;
		aByte5363 = (byte) 0;
		anInt5384 = 242181565;
		aBoolean5385 = false;
		occludes = 325083707;
		anInt5387 = 1675091776;
		anInt5388 = 0;
		anIntArray5378 = null;
		anIntArray5390 = null;
		anInt5391 = -83909056;
		shadow = 0;
		lightness = 0;
		anInt5436 = 1320066331;
		anInt5364 = -474865427;
		anInt5397 = -2064530465;
		anInt5398 = -1406097311;
		anInt5399 = 779127471;
		anInt5400 = -475870643;
		aBoolean5401 = false;
		anInt5402 = 0;
		aBoolean5440 = false;
		mirrorModel = false;
		castsShadow = true;
		modelSizeX = -1280568448;
		modelSizeY = -319692160;
		modelSizeZ = -1992239744;
		offsetX = 0;
		offsetY = 0;
		offsetZ = 0;
		anInt5412 = 0;
		anInt5413 = 0;
		anInt5419 = 0;
		aBoolean5410 = false;
		clip_unknown = false;
		holdsItemPiles = -1763780945;
		anInt5418 = 0;
		varbit = 1228374415;
		varp = 2115564225;
		anInt5422 = 349046175;
		anInt5408 = 0;
		anInt5437 = 0;
		anInt5425 = 2118857365;
		aBoolean5426 = false;
		anInt5427 = 0;
		anInt5428 = 0;
		aBoolean5395 = false;
		aBoolean5431 = true;
		aBoolean5432 = false;
		aBoolean5433 = true;
		aBoolean5434 = false;
		aBoolean5381 = false;
		anInt5438 = 1861779200;
		anInt5439 = 1687920384;
		bloom = false;
		aBoolean5441 = false;
	}

	public boolean method5784(int i) {
		try {
			if (null == morphisms)
				return anInt5422 * 393750945 != -1 || anIntArray5429 != null;
			for (int i_67_ = 0; i_67_ < morphisms.length; i_67_++) {
				if (morphisms[i_67_] != -1) {
					ObjectDefinitions class432_68_ = provider.getObjectDefinitions(morphisms[i_67_]);
					if (-1 != 393750945 * class432_68_.anInt5422 || null != class432_68_.anIntArray5429)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.n(").append(')').toString());
		}
	}

	public final synchronized Tuple method5785(Toolkit toolkit, int i, int objectType, int i_70_, Ground class_xa,
			Ground class_xa_71_, int i_72_, int i_73_, int i_74_, boolean bool, ObjectOverride class435, int i_75_) {
		try {
			if (Class355.notValidType(objectType))
				objectType = GameObjectType.T4.type * -1976050083;

			long key = (long) ((1181652947 * objectId << 10) + (objectType << 3) + i_70_);
			key |= (long) (toolkit.id * 580915349 << 29);
			if (class435 != null)
				key |= (2595045048596347611L * ((ObjectOverride) class435).id << 32);
			int mask = i;
			if (3 == aByte5363)
				mask |= 0x7;
			else {
				if (0 != aByte5363 || 52797131 * anInt5413 != 0)
					mask |= 0x2;
				if (945504799 * anInt5412 != 0)
					mask |= 0x1;
				if (1782732613 * anInt5419 != 0)
					mask |= 0x4;
			}
			if (bool)
				mask |= 0x40000;
			boolean bool_78_ = (aByte5363 != 0 && (null != class_xa || class_xa_71_ != null));
			boolean bool_79_ = (anInt5412 * 945504799 != 0 || anInt5413 * 52797131 != 0 || 0 != anInt5419 * 1782732613);
			Tuple tuple;
			synchronized (((Class433) provider).tuples) {
				tuple = (Tuple) ((Class433) provider).tuples.get(key);
			}
			Model model = (Model) (tuple != null ? tuple.first : null);
			Shadow shadow = null;
			do {
				if (model == null || toolkit.method5017(model.m(), mask) != 0) {
					if (null != model)
						mask = toolkit.mergeFunctionMasks(mask, model.m());
					int attributes = mask;
					if ((objectType == GameObjectType.T10.type * -1976050083) && i_70_ > 3)
						attributes |= 0x5;
					model = method5775(toolkit, attributes, objectType, i_70_, class435, 1553510063);
					if (model == null)
						return null;
					if ((objectType == GameObjectType.T10.type * -1976050083) && i_70_ > 3)
						model.f(2048);
					if (bool && !bool_78_ && !bool_79_)
						shadow = model.ga(null);
					model.KA(mask);
					tuple = new Tuple(model, shadow);
					synchronized (((Class433) provider).tuples) {
						((Class433) provider).tuples.put(tuple, key);
						break;
					}
				}
				shadow = (Shadow) tuple.second;
				if (bool && shadow == null)
					shadow = (Shadow) (tuple.second = model.ga(null));
			} while (false);
			if (bool_78_ || bool_79_) {
				model = model.method4755((byte) 0, mask, true);
				if (bool_78_) {
					model.pa(aByte5363, 1762198123 * anInt5384, class_xa, class_xa_71_, i_72_, i_73_, i_74_);
				}
				if (bool_79_)
					model.ia(anInt5412 * 945504799, 52797131 * anInt5413, anInt5419 * 1782732613);
				if (bool)
					shadow = model.ga(null);
				model.KA(i);
			} else
				model = model.method4755((byte) 0, i, true);
			((Class433) provider).aClass454_5456.first = model;
			((Class433) provider).aClass454_5456.second = shadow;
			return (((Class433) provider).aClass454_5456);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.k(").append(')').toString());
		}
	}

	public static Interface19 method5786(RsByteBuffer class298_sub53, byte i) {
		try {
			Class337 class337 = Class291.method2789(class298_sub53.readUnsignedByte(), (byte) -73);
			if (Class337.aClass337_3627 == class337)
				return Class238.method2201(class298_sub53, -1749563274);
			if (class337 == Class337.aClass337_3625)
				return Class237.method2195(class298_sub53, (byte) 1);
			if (class337 == Class337.aClass337_3624)
				return Class422_Sub7.method5651(class298_sub53, (byte) -67);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	static final void method5787(Class403 class403, int i) {
		try {
			if (null != pb.aByteArray8843)
				((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919)
						- 1] = 1;
			else
				((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919)
						- 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.ahp(").append(')').toString());
		}
	}

	public static boolean method5788(char c, short i) {
		try {
			return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	static void method5789(int i) {
		try {
			Class305.method3751((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.aa(").append(')').toString());
		}
	}
}
