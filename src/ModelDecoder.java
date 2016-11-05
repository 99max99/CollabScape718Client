import java.nio.ByteBuffer;

/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ModelDecoder {
	public byte priority;
	public int version = 12;
	public int vertexCount = 0;
	public int faceCount;
	public int texturedFaceCount;
	public int maxVertexUsed = 0;
	public int textureUVCoordCount;
	public float[] textureCoordU;
	public float[] textureCoordV;
	public byte[] uvCoordVertexA;
	public byte[] uvCoordVertexB;
	public byte[] uvCoordVertexC;
	public byte[] facePriorities;
	public byte[] faceAlpha;
	public byte[] faceRenderTypes;
	public byte[] textureRenderTypes;
	public byte[] textureRotationY;
	public byte[] textureUVDirections;
	public int[] particleLifespanZ;
	public int[] textureScaleX;
	public int[] textureScaleY;
	public int[] textureScaleZ;
	public int[] texturePrimaryColor;
	public int[] textureSecondaryColor;
	public int[] faceBones;
	public int[] vertexX;
	public int[] vertexY;
	public int[] vertexZ;
	public int[] vertexBones;
	public int[] vertexUVOffset;
	public short[] faceTextureIndexes;
	public short[] textureTriangleX;
	public short[] textureTriangleY;
	public short[] textureTriangleZ;
	public short[] faceA;
	public short[] faceB;
	public short[] faceC;
	public short[] faceTextures;
	public short[] faceColors;
	public EmitterConfig[] emitterConfigs;
	public MagnetConfig[] magnetConfigs;
	public BillBoardConfig[] billBoardConfigs;
	public short[] aShortArray615;
	public short[] aShortArray620;

	ModelDecoder(byte[] data) {
		vertexCount = 0;
		maxVertexUsed = 0;
		faceCount = 0;
		priority = (byte) 0;
		texturedFaceCount = 0;

		decode(data);
	}

	public ModelDecoder(int i, int i_0_, int i_1_) {
		vertexCount = 0;
		maxVertexUsed = 0;
		faceCount = 0;
		priority = (byte) 0;
		texturedFaceCount = 0;
		vertexX = new int[i];
		vertexY = new int[i];
		vertexZ = new int[i];
		vertexBones = new int[i];
		faceA = new short[i_0_];
		faceB = new short[i_0_];
		faceC = new short[i_0_];
		faceRenderTypes = new byte[i_0_];
		facePriorities = new byte[i_0_];
		faceAlpha = new byte[i_0_];
		faceTextureIndexes = new short[i_0_];
		faceColors = new short[i_0_];
		faceTextures = new short[i_0_];
		faceBones = new int[i_0_];
		if (i_1_ > 0) {
			textureRenderTypes = new byte[i_1_];
			textureTriangleX = new short[i_1_];
			textureTriangleY = new short[i_1_];
			textureTriangleZ = new short[i_1_];
			textureScaleX = new int[i_1_];
			textureScaleY = new int[i_1_];
			textureScaleZ = new int[i_1_];
			textureRotationY = new byte[i_1_];
			textureUVDirections = new byte[i_1_];
			particleLifespanZ = new int[i_1_];
			texturePrimaryColor = new int[i_1_];
			textureSecondaryColor = new int[i_1_];
		}
	}

	public ModelDecoder(ModelDecoder[] class141s, int i) {
		faceCount = 0;
		priority = (byte) 0;
		texturedFaceCount = 0;
		vertexCount = 0;
		faceCount = 0;
		texturedFaceCount = 0;
		textureUVCoordCount = 0;
		int i_90_ = 0;
		int i_91_ = 0;
		int i_92_ = 0;
		boolean bool = false;
		boolean bool_93_ = false;
		boolean bool_94_ = false;
		boolean bool_95_ = false;
		boolean bool_96_ = false;
		boolean bool_97_ = false;
		priority = (byte) -1;
		for (int i_98_ = 0; i_98_ < i; i_98_++) {
			ModelDecoder class141_99_ = class141s[i_98_];
			if (class141_99_ != null) {
				vertexCount += class141_99_.vertexCount;
				faceCount += class141_99_.faceCount;
				texturedFaceCount += class141_99_.texturedFaceCount;
				textureUVCoordCount += class141_99_.textureUVCoordCount;
				if (class141_99_.emitterConfigs != null)
					i_90_ += class141_99_.emitterConfigs.length;
				if (class141_99_.magnetConfigs != null)
					i_91_ += class141_99_.magnetConfigs.length;
				if (class141_99_.billBoardConfigs != null)
					i_92_ += class141_99_.billBoardConfigs.length;
				bool = bool | class141_99_.faceRenderTypes != null;
				if (class141_99_.facePriorities != null)
					bool_93_ = true;
				else {
					if (priority == -1)
						priority = class141_99_.priority;
					if (priority != class141_99_.priority)
						bool_93_ = true;
				}
				bool_94_ = bool_94_ | class141_99_.faceAlpha != null;
				bool_95_ = bool_95_ | class141_99_.faceTextureIndexes != null;
				bool_96_ = bool_96_ | class141_99_.faceTextures != null;
				bool_97_ = bool_97_ | class141_99_.faceBones != null;
			}
		}
		vertexX = new int[vertexCount];
		vertexY = new int[vertexCount];
		vertexZ = new int[vertexCount];
		vertexBones = new int[vertexCount];
		aShortArray620 = new short[vertexCount];
		faceA = new short[faceCount];
		faceB = new short[faceCount];
		faceC = new short[faceCount];
		if (bool)
			faceRenderTypes = new byte[faceCount];
		if (bool_93_)
			facePriorities = new byte[faceCount];
		if (bool_94_)
			faceAlpha = new byte[faceCount];
		if (bool_95_)
			faceTextureIndexes = new short[faceCount];
		faceColors = new short[faceCount];
		if (bool_96_)
			faceTextures = new short[faceCount];
		if (bool_97_)
			faceBones = new int[faceCount];
		aShortArray615 = new short[faceCount];
		if (texturedFaceCount > 0) {
			textureRenderTypes = new byte[texturedFaceCount];
			textureTriangleX = new short[texturedFaceCount];
			textureTriangleY = new short[texturedFaceCount];
			textureTriangleZ = new short[texturedFaceCount];
			textureScaleX = new int[texturedFaceCount];
			textureScaleY = new int[texturedFaceCount];
			textureScaleZ = new int[texturedFaceCount];
			textureRotationY = new byte[texturedFaceCount];
			textureUVDirections = new byte[texturedFaceCount];
			particleLifespanZ = new int[texturedFaceCount];
			texturePrimaryColor = new int[texturedFaceCount];
			textureSecondaryColor = new int[texturedFaceCount];
		}
		if (i_92_ > 0)
			billBoardConfigs = new BillBoardConfig[i_92_];
		if (i_90_ > 0)
			emitterConfigs = new EmitterConfig[i_90_];
		if (i_91_ > 0)
			magnetConfigs = new MagnetConfig[i_91_];
		if (textureUVCoordCount > 0) {
			textureCoordU = new float[textureUVCoordCount];
			textureCoordV = new float[textureUVCoordCount];
			vertexUVOffset = new int[vertexCount];
			uvCoordVertexA = new byte[faceCount];
			uvCoordVertexB = new byte[faceCount];
			uvCoordVertexC = new byte[faceCount];
		}
		int[] is = new int[vertexCount];
		int[] is_100_ = new int[textureUVCoordCount];
		int[] is_101_ = new int[vertexCount];
		int[] is_102_ = new int[vertexCount];
		int[] is_103_ = new int[3];
		vertexCount = 0;
		faceCount = 0;
		texturedFaceCount = 0;
		textureUVCoordCount = 0;
		i_90_ = 0;
		i_91_ = 0;
		i_92_ = 0;
		for (int i_104_ = 0; i_104_ < i; i_104_++) {
			short i_105_ = (short) (1 << i_104_);
			ModelDecoder class141_106_ = class141s[i_104_];
			int i_107_ = faceCount;
			if (class141_106_ != null) {
				boolean[] bools = new boolean[class141_106_.vertexCount];
				if (class141_106_.billBoardConfigs != null) {
					for (int i_108_ = 0; i_108_ < class141_106_.billBoardConfigs.length; i_108_++) {
						BillBoardConfig class142 = class141_106_.billBoardConfigs[i_108_];
						billBoardConfigs[i_92_++] = class142.translateFace((class142.face * 1512514121 + faceCount));
					}
				}
				for (int i_109_ = 0; i_109_ < class141_106_.faceCount; i_109_++) {
					is_103_[0] = class141_106_.faceA[i_109_];
					is_103_[1] = class141_106_.faceB[i_109_];
					is_103_[2] = class141_106_.faceC[i_109_];
					for (int i_110_ = 0; i_110_ < 3; i_110_++) {
						int i_111_ = is_103_[i_110_];
						int i_112_ = class141_106_.vertexX[i_111_];
						int i_113_ = class141_106_.vertexY[i_111_];
						int i_114_ = class141_106_.vertexZ[i_111_];
						int i_115_;
						for (i_115_ = 0; i_115_ < vertexCount; i_115_++) {
							if (i_112_ == vertexX[i_115_] && i_113_ == vertexY[i_115_] && i_114_ == vertexZ[i_115_]) {
								aShortArray620[i_115_] |= i_105_;
								is_101_[i_111_] = i_115_;
								break;
							}
						}
						if (class141_106_.textureUVCoordCount > 0 && !bools[i_111_]) {
							int i_116_ = ((i_111_ < class141_106_.vertexCount - 1
									? class141_106_.vertexUVOffset[i_111_ + 1] : class141_106_.textureUVCoordCount)
									- class141_106_.vertexUVOffset[i_111_]);
							for (int i_117_ = 0; i_117_ < i_116_; i_117_++) {
								textureCoordU[textureUVCoordCount] = (class141_106_.textureCoordU[(class141_106_.vertexUVOffset[i_111_]
										+ i_117_)]);
								textureCoordV[textureUVCoordCount] = (class141_106_.textureCoordV[(class141_106_.vertexUVOffset[i_111_]
										+ i_117_)]);
								is_100_[textureUVCoordCount] = i_115_ << 16 | is[i_115_] + i_117_;
								textureUVCoordCount++;
							}
							is_102_[i_111_] = is[i_115_];
							is[i_115_] += i_116_;
							bools[i_111_] = true;
						}
						if (i_115_ >= vertexCount) {
							vertexX[vertexCount] = i_112_;
							vertexY[vertexCount] = i_113_;
							vertexZ[vertexCount] = i_114_;
							aShortArray620[vertexCount] = i_105_;
							vertexBones[vertexCount] = (class141_106_.vertexBones != null
									? class141_106_.vertexBones[i_111_] : -1);
							is_101_[i_111_] = vertexCount;
							vertexCount++;
						}
					}
				}
				for (int i_118_ = 0; i_118_ < class141_106_.faceCount; i_118_++) {
					if (bool && class141_106_.faceRenderTypes != null)
						faceRenderTypes[faceCount] = class141_106_.faceRenderTypes[i_118_];
					if (bool_93_) {
						if (class141_106_.facePriorities != null)
							facePriorities[faceCount] = class141_106_.facePriorities[i_118_];
						else
							facePriorities[faceCount] = class141_106_.priority;
					}
					if (bool_94_ && class141_106_.faceAlpha != null)
						faceAlpha[faceCount] = class141_106_.faceAlpha[i_118_];
					if (bool_96_) {
						if (class141_106_.faceTextures != null)
							faceTextures[faceCount] = class141_106_.faceTextures[i_118_];
						else
							faceTextures[faceCount] = (short) -1;
					}
					if (bool_97_) {
						if (class141_106_.faceBones != null)
							faceBones[faceCount] = class141_106_.faceBones[i_118_];
						else
							faceBones[faceCount] = -1;
					}
					if (class141_106_.textureUVCoordCount > 0) {
						uvCoordVertexA[faceCount] = (byte) (class141_106_.uvCoordVertexA[i_118_]
								+ is_102_[(class141_106_.faceA[i_118_])]);
						uvCoordVertexB[faceCount] = (byte) (class141_106_.uvCoordVertexB[i_118_]
								+ is_102_[(class141_106_.faceB[i_118_])]);
						uvCoordVertexC[faceCount] = (byte) (class141_106_.uvCoordVertexC[i_118_]
								+ is_102_[(class141_106_.faceC[i_118_])]);
					}
					faceA[faceCount] = (short) (is_101_[class141_106_.faceA[i_118_]]);
					faceB[faceCount] = (short) (is_101_[class141_106_.faceB[i_118_]]);
					faceC[faceCount] = (short) (is_101_[class141_106_.faceC[i_118_]]);
					aShortArray615[faceCount] = i_105_;
					faceColors[faceCount] = class141_106_.faceColors[i_118_];
					faceCount++;
				}
				if (class141_106_.emitterConfigs != null) {
					for (int i_119_ = 0; i_119_ < class141_106_.emitterConfigs.length; i_119_++) {
						int i_120_ = is_101_[(class141_106_.emitterConfigs[i_119_].faceX * -710317103)];
						int i_121_ = is_101_[(class141_106_.emitterConfigs[i_119_].faceY * 1705862021)];
						int i_122_ = is_101_[(class141_106_.emitterConfigs[i_119_].faceZ * 1636170731)];
						emitterConfigs[i_90_] = (class141_106_.emitterConfigs[i_119_].method954(
								class141_106_.emitterConfigs[i_119_].type * 108680029 + i_107_, i_120_, i_121_,
								i_122_));
						i_90_++;
					}
				}
				if (class141_106_.magnetConfigs != null) {
					for (int i_123_ = 0; i_123_ < class141_106_.magnetConfigs.length; i_123_++) {
						int i_124_ = is_101_[(class141_106_.magnetConfigs[i_123_].skin * -180596249)];
						magnetConfigs[i_91_] = class141_106_.magnetConfigs[i_123_].translatePoint(i_124_);
						i_91_++;
					}
				}
			}
		}
		maxVertexUsed = vertexCount;
		if (textureUVCoordCount > 0) {
			method2835(is_100_, textureCoordU, textureCoordV, 2144712346);
			int i_125_ = 0;
			int i_126_ = 0;
			for (/**/; i_125_ < vertexCount; i_125_++) {
				vertexUVOffset[i_125_] = i_126_;
				i_126_ += is[i_125_];
			}
		}
		int i_127_ = 0;
		int i_128_ = 0;
		for (/**/; i_127_ < i; i_127_++) {
			short i_129_ = (short) (1 << i_127_);
			ModelDecoder class141_130_ = class141s[i_127_];
			if (class141_130_ != null) {
				if (bool_95_) {
					int i_131_ = 0;
					while (i_131_ < class141_130_.faceCount) {
						faceTextureIndexes[i_128_] = (class141_130_.faceTextureIndexes != null
								? class141_130_.faceTextureIndexes[i_131_] : (short) -1);
						if (faceTextureIndexes[i_128_] > -1 && faceTextureIndexes[i_128_] < 32766)
							faceTextureIndexes[i_128_] = (short) (faceTextureIndexes[i_128_] + texturedFaceCount);
						i_131_++;
						i_128_++;
					}
				}
				for (int i_132_ = 0; i_132_ < class141_130_.texturedFaceCount; i_132_++) {
					byte i_133_ = (textureRenderTypes[texturedFaceCount] = class141_130_.textureRenderTypes[i_132_]);
					if (i_133_ == 0) {
						textureTriangleX[texturedFaceCount] = (short) method743(class141_130_,
								(class141_130_.textureTriangleX[i_132_]), i_129_);
						textureTriangleY[texturedFaceCount] = (short) method743(class141_130_,
								(class141_130_.textureTriangleY[i_132_]), i_129_);
						textureTriangleZ[texturedFaceCount] = (short) method743(class141_130_,
								(class141_130_.textureTriangleZ[i_132_]), i_129_);
					} else if (i_133_ >= 1 && i_133_ <= 3) {
						textureTriangleX[texturedFaceCount] = class141_130_.textureTriangleX[i_132_];
						textureTriangleY[texturedFaceCount] = class141_130_.textureTriangleY[i_132_];
						textureTriangleZ[texturedFaceCount] = class141_130_.textureTriangleZ[i_132_];
						textureScaleX[texturedFaceCount] = class141_130_.textureScaleX[i_132_];
						textureScaleY[texturedFaceCount] = class141_130_.textureScaleY[i_132_];
						textureScaleZ[texturedFaceCount] = class141_130_.textureScaleZ[i_132_];
						textureRotationY[(this.texturedFaceCount)] = (class141_130_.textureRotationY[i_132_]);
						textureUVDirections[texturedFaceCount] = class141_130_.textureUVDirections[i_132_];
						particleLifespanZ[texturedFaceCount] = class141_130_.particleLifespanZ[i_132_];
					} else if (i_133_ == 2) {
						texturePrimaryColor[texturedFaceCount] = class141_130_.texturePrimaryColor[i_132_];
						textureSecondaryColor[texturedFaceCount] = class141_130_.textureSecondaryColor[i_132_];
					}
					texturedFaceCount++;
				}
			}
		}
	}

	final int method743(ModelDecoder class64_30_, int i, short i_31_) {
		int i_32_ = class64_30_.vertexX[i];
		int i_33_ = class64_30_.vertexY[i];
		int i_34_ = class64_30_.vertexZ[i];
		for (int i_35_ = 0; i_35_ < vertexCount; i_35_++) {
			if (i_32_ == vertexX[i_35_] && i_33_ == vertexY[i_35_] && i_34_ == vertexZ[i_35_]) {
				aShortArray620[i_35_] |= i_31_;
				return i_35_;
			}
		}
		vertexX[vertexCount] = i_32_;
		vertexY[vertexCount] = i_33_;
		vertexZ[vertexCount] = i_34_;
		aShortArray620[vertexCount] = i_31_;
		vertexBones[vertexCount] = (class64_30_.vertexBones != null ? class64_30_.vertexBones[i] : -1);
		return vertexCount++;
	}

	public int method747(int i, int i_97_, int i_98_) {
		for (int i_99_ = 0; i_99_ < vertexCount; i_99_++) {
			if (vertexX[i_99_] == i && vertexY[i_99_] == i_97_ && vertexZ[i_99_] == i_98_)
				return i_99_;
		}
		vertexX[vertexCount] = i;
		vertexY[vertexCount] = i_97_;
		vertexZ[vertexCount] = i_98_;
		maxVertexUsed = vertexCount + 1;
		return vertexCount++;
	}

	public int method748(int i, int i_100_, int i_101_, byte i_102_, byte i_103_, short i_104_, byte i_105_,
			short i_106_) {
		faceA[faceCount] = (short) i;
		faceB[faceCount] = (short) i_100_;
		faceC[faceCount] = (short) i_101_;
		faceRenderTypes[faceCount] = i_102_;
		faceTextureIndexes[faceCount] = i_103_;
		faceColors[faceCount] = i_104_;
		faceAlpha[faceCount] = i_105_;
		faceTextures[faceCount] = i_106_;
		return faceCount++;
	}

	public int[][] method749(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_78_ = bool ? vertexCount : maxVertexUsed;
		for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
			int i_80_ = vertexBones[i_79_];
			if (i_80_ >= 0) {
				is[i_80_]++;
				if (i_80_ > i) {
					i = i_80_;
				}
			}
		}
		int[][] is_81_ = new int[i + 1][];
		for (int i_82_ = 0; i_82_ <= i; i_82_++) {
			is_81_[i_82_] = new int[is[i_82_]];
			is[i_82_] = 0;
		}
		for (int i_83_ = 0; i_83_ < i_78_; i_83_++) {
			int i_84_ = vertexBones[i_83_];
			if (i_84_ >= 0) {
				is_81_[i_84_][is[i_84_]++] = i_83_;
			}
		}
		return is_81_;
	}

	public int[][] method750() {
		int[] is = new int[256];
		int i = 0;
		for (int i_114_ = 0; i_114_ < faceCount; i_114_++) {
			int i_115_ = faceBones[i_114_];
			if (i_115_ >= 0) {
				is[i_115_]++;
				if (i_115_ > i)
					i = i_115_;
			}
		}
		int[][] is_116_ = new int[i + 1][];
		for (int i_117_ = 0; i_117_ <= i; i_117_++) {
			is_116_[i_117_] = new int[is[i_117_]];
			is[i_117_] = 0;
		}
		for (int i_118_ = 0; i_118_ < faceCount; i_118_++) {
			int i_119_ = faceBones[i_118_];
			if (i_119_ >= 0)
				is_116_[i_119_][is[i_119_]++] = i_118_;
		}
		return is_116_;
	}

	public static ModelDecoder getModel(JS5 class243, int i, int i_120_) {
		byte[] is = class243.getFile(i, i_120_);
		if (is == null)
			return null;
		return new ModelDecoder(is);
	}

	public void retexture(short i, short i_121_) {
		if (faceTextures != null) {
			for (int i_122_ = 0; i_122_ < faceCount; i_122_++) {
				if (faceTextures[i_122_] == i)
					faceTextures[i_122_] = i_121_;
			}
		}
	}

	public void translate(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < vertexCount; i_125_++) {
			vertexX[i_125_] += i;
			vertexY[i_125_] += i_123_;
			vertexZ[i_125_] += i_124_;
		}
	}

	public void method754(int i, int i_126_, int i_127_) {
		if (i_127_ != 0) {
			int i_128_ = Class220.COSINE[i_127_];
			int i_129_ = Class220.SINE[i_127_];
			for (int i_130_ = 0; i_130_ < vertexCount; i_130_++) {
				int i_131_ = ((vertexY[i_130_] * i_128_ + vertexX[i_130_] * i_129_) >> 14);
				vertexY[i_130_] = (vertexY[i_130_] * i_129_ - vertexX[i_130_] * i_128_) >> 14;
				vertexX[i_130_] = i_131_;
			}
		}
		if (i != 0) {
			int i_132_ = Class220.COSINE[i];
			int i_133_ = Class220.SINE[i];
			for (int i_134_ = 0; i_134_ < vertexCount; i_134_++) {
				int i_135_ = ((vertexY[i_134_] * i_133_ - vertexZ[i_134_] * i_132_) >> 14);
				vertexZ[i_134_] = (vertexY[i_134_] * i_132_ + vertexZ[i_134_] * i_133_) >> 14;
				vertexY[i_134_] = i_135_;
			}
		}
		if (i_126_ != 0) {
			int i_136_ = Class220.COSINE[i_126_];
			int i_137_ = Class220.SINE[i_126_];
			for (int i_138_ = 0; i_138_ < vertexCount; i_138_++) {
				int i_139_ = ((vertexZ[i_138_] * i_136_ + vertexX[i_138_] * i_137_) >> 14);
				vertexZ[i_138_] = (vertexZ[i_138_] * i_137_ - vertexX[i_138_] * i_136_) >> 14;
				vertexX[i_138_] = i_139_;
			}
		}
	}

	public void method755(int i) {
		for (int i_140_ = 0; i_140_ < vertexCount; i_140_++) {
			vertexX[i_140_] <<= i;
			vertexY[i_140_] <<= i;
			vertexZ[i_140_] <<= i;
		}
		if (texturedFaceCount > 0 && textureScaleX != null) {
			for (int i_141_ = 0; i_141_ < textureScaleX.length; i_141_++) {
				textureScaleX[i_141_] <<= i;
				textureScaleY[i_141_] <<= i;
				if (textureRenderTypes[i_141_] != 1)
					textureScaleZ[i_141_] <<= i;
			}
		}
	}

	public void recolour(short i, short i_142_) {
		for (int i_143_ = 0; i_143_ < faceCount; i_143_++) {
			if (faceColors[i_143_] == i)
				faceColors[i_143_] = i_142_;
		}
	}

	public byte method757(short i, short i_144_, short i_145_, short i_146_, short i_147_, short i_148_, byte i_149_,
			byte i_150_, byte i_151_) {
		if (texturedFaceCount >= 255)
			throw new IllegalStateException();
		textureRenderTypes[texturedFaceCount] = (byte) 3;
		textureTriangleX[texturedFaceCount] = i;
		textureTriangleY[texturedFaceCount] = i_144_;
		textureTriangleZ[texturedFaceCount] = i_145_;
		textureScaleX[texturedFaceCount] = i_146_;
		textureScaleY[texturedFaceCount] = i_147_;
		textureScaleZ[texturedFaceCount] = i_148_;
		textureRotationY[texturedFaceCount] = i_149_;
		textureUVDirections[texturedFaceCount] = i_150_;
		particleLifespanZ[texturedFaceCount] = i_151_;
		return (byte) texturedFaceCount++;
	}

	void decode(byte[] is) {
		faceCount = 0;
		priority = (byte) 0;
		texturedFaceCount = 0;

		ByteBuffer[] buffers = new ByteBuffer[7];
		for (int i = 0; i < buffers.length; i++)
			buffers[i] = ByteBuffer.wrap(is);

		int modelType = buffers[0].get() & 0xFF;
		if (modelType != 1)
			System.out.println("Invalid model identifier: " + modelType);
		else {
			buffers[0].get();
			version = buffers[0].get() & 0xFF;
			buffers[0].position(is.length - 26);
			vertexCount = buffers[0].getShort() & 0xFFFF;
			faceCount = buffers[0].getShort() & 0xFFFF;
			texturedFaceCount = buffers[0].getShort() & 0xFFFF;
			int flags = buffers[0].get() & 0xFF;
			boolean hasFaceRenderTypes = (flags & 0x1) == 1;
			boolean hasParticleEffects = (flags & 0x2) == 2;
			boolean hasBillboards = (flags & 0x4) == 4;
			boolean hasExternalVertexBones = (flags & 0x10) == 16;
			boolean hasExternalFaceBones = (flags & 0x20) == 32;
			boolean hasExternalPriorities = (flags & 0x40) == 64;
			boolean hasTextureUV = (flags & 0x80) == 128;
			int modelPriority = buffers[0].get() & 0xFF;
			int hasFaceAlpha = buffers[0].get() & 0xFF;
			int hasFaceBones = buffers[0].get() & 0xFF;
			int hasFaceTextures = buffers[0].get() & 0xFF;
			int hasVertexBones = buffers[0].get() & 0xFF;
			int vertexXDataSize = buffers[0].getShort() & 0xFFFF;
			int vertexYDataSize = buffers[0].getShort() & 0xFFFF;
			int vertexZDataSize = buffers[0].getShort() & 0xFFFF;
			int faceDataSize = buffers[0].getShort() & 0xFFFF;
			int faceTextureIndexSize = buffers[0].getShort() & 0xFFFF;
			int vertexBoneDataSize = buffers[0].getShort() & 0xFFFF;
			int faceBoneDataSize = buffers[0].getShort() & 0xFFFF;
			if (!hasExternalVertexBones) {
				if (hasVertexBones == 1)
					vertexBoneDataSize = vertexCount;
				else
					vertexBoneDataSize = 0;
			}
			if (!hasExternalFaceBones) {
				if (hasFaceBones == 1)
					faceBoneDataSize = faceCount;
				else
					faceBoneDataSize = 0;
			}
			int simpleTexFaceCnt = 0;
			int complexTexFaceCnt = 0;
			int cubeTexFaceCnt = 0;
			if (texturedFaceCount > 0) {
				textureRenderTypes = new byte[texturedFaceCount];
				buffers[0].position(3);
				for (int tri = 0; tri < texturedFaceCount; tri++) {
					byte renderType = textureRenderTypes[tri] = buffers[0].get();
					if (renderType == 0)
						simpleTexFaceCnt++;
					if (renderType >= 1 && renderType <= 3)
						complexTexFaceCnt++;
					if (renderType == 2)
						cubeTexFaceCnt++;
				}
			}
			int accumulator = 3 + texturedFaceCount;
			int vertexReadFlagOffset = accumulator;
			accumulator += vertexCount;
			int face_render_info_offset = accumulator;
			if (hasFaceRenderTypes)
				accumulator += faceCount;
			int face_read_flag_offset = accumulator;
			accumulator += faceCount;
			int face_priority_offset = accumulator;
			if (modelPriority == 255)
				accumulator += faceCount;
			int face_bone_offset = accumulator;
			accumulator += faceBoneDataSize;
			int vertex_bone_offset = accumulator;
			accumulator += vertexBoneDataSize;
			int face_alpha_offset = accumulator;
			if (hasFaceAlpha == 1)
				accumulator += faceCount;
			int face_data_offset = accumulator;
			accumulator += faceDataSize;
			int face_texture_offset = accumulator;
			if (hasFaceTextures == 1)
				accumulator += faceCount * 2;
			int face_texture_index_offset = accumulator;
			accumulator += faceTextureIndexSize;
			int face_colour_offset = accumulator;
			accumulator += faceCount * 2;
			int vertex_x_data_offset = accumulator;
			accumulator += vertexXDataSize;
			int vertex_y_data_offset = accumulator;
			accumulator += vertexYDataSize;
			int vertex_z_data_offset = accumulator;
			accumulator += vertexZDataSize;
			int simple_tex_pmn_offset = accumulator;
			accumulator += simpleTexFaceCnt * 6;
			int complex_tex_pmn_offset = accumulator;
			accumulator += complexTexFaceCnt * 6;
			int tex_chunk_size = 6;
			if (version == 14)
				tex_chunk_size = 7;
			else if (version >= 15)
				tex_chunk_size = 9;
			int tex_scale_offset = accumulator;
			accumulator += complexTexFaceCnt * tex_chunk_size;
			int tex_rot_offset = accumulator;
			accumulator += complexTexFaceCnt;
			int tex_dir_offset = accumulator;
			accumulator += complexTexFaceCnt;
			int particleZLifespanAndTextureColorOffset = accumulator;
			accumulator += complexTexFaceCnt + cubeTexFaceCnt * 2;
			int extras_offset = accumulator;
			int face_uv_index_offset = is.length;
			int vertex_uv_offset = is.length;
			int tex_coord_u_offset = is.length;
			int tex_coord_v_offset = is.length;
			if (hasTextureUV) {
				ByteBuffer uvBuffer = ByteBuffer.wrap(is);
				uvBuffer.position(is.length - 26);
				uvBuffer.position(uvBuffer.position() - is[uvBuffer.position() - 1]);
				textureUVCoordCount = uvBuffer.getShort() & 0xFFFF;
				int extras_data_size = uvBuffer.getShort() & 0xFFFF;
				int uv_index_data_size = uvBuffer.getShort() & 0xFFFF;
				face_uv_index_offset = extras_offset + extras_data_size;
				vertex_uv_offset = face_uv_index_offset + uv_index_data_size;
				tex_coord_u_offset = vertex_uv_offset + vertexCount;
				tex_coord_v_offset = tex_coord_u_offset + textureUVCoordCount * 2;
			}
			vertexX = new int[vertexCount];
			vertexY = new int[vertexCount];
			vertexZ = new int[vertexCount];
			faceA = new short[faceCount];
			faceB = new short[faceCount];
			faceC = new short[faceCount];
			if (hasVertexBones == 1)
				vertexBones = new int[vertexCount];
			if (hasFaceRenderTypes)
				faceRenderTypes = new byte[faceCount];
			if (modelPriority == 255)
				facePriorities = new byte[faceCount];
			else
				priority = (byte) modelPriority;
			if (hasFaceAlpha == 1)
				faceAlpha = new byte[faceCount];
			if (hasFaceBones == 1)
				faceBones = new int[faceCount];
			if (hasFaceTextures == 1)
				faceTextures = new short[faceCount];
			if (hasFaceTextures == 1 && (texturedFaceCount > 0 || textureUVCoordCount > 0))
				faceTextureIndexes = new short[faceCount];
			faceColors = new short[faceCount];
			if (texturedFaceCount > 0) {
				textureTriangleX = new short[texturedFaceCount];
				textureTriangleY = new short[texturedFaceCount];
				textureTriangleZ = new short[texturedFaceCount];
				if (complexTexFaceCnt > 0) {
					textureScaleX = new int[complexTexFaceCnt];
					textureScaleY = new int[complexTexFaceCnt];
					textureScaleZ = new int[complexTexFaceCnt];
					textureRotationY = new byte[complexTexFaceCnt];
					textureUVDirections = new byte[complexTexFaceCnt];
					particleLifespanZ = new int[complexTexFaceCnt];
				}
				if (cubeTexFaceCnt > 0) {
					texturePrimaryColor = new int[cubeTexFaceCnt];
					textureSecondaryColor = new int[cubeTexFaceCnt];
				}
			}
			buffers[0].position(vertexReadFlagOffset);
			buffers[1].position(vertex_x_data_offset);
			buffers[2].position(vertex_y_data_offset);
			buffers[3].position(vertex_z_data_offset);
			buffers[4].position(vertex_bone_offset);
			int prevX = 0;
			int prevY = 0;
			int prevZ = 0;
			for (int point = 0; point < vertexCount; point++) {
				int component_flags = buffers[0].get() & 0xFF;
				int dx = 0;
				if ((component_flags & 0x1) != 0)
					dx = ByteBufferUtils.getSmart1(buffers[1]);
				int dy = 0;
				if ((component_flags & 0x2) != 0)
					dy = ByteBufferUtils.getSmart1(buffers[2]);
				int dz = 0;
				if ((component_flags & 0x4) != 0)
					dz = ByteBufferUtils.getSmart1(buffers[3]);
				vertexX[point] = prevX + dx;
				vertexY[point] = prevY + dy;
				vertexZ[point] = prevZ + dz;
				prevX = vertexX[point];
				prevY = vertexY[point];
				prevZ = vertexZ[point];
				if (hasVertexBones == 1) {
					if (hasExternalVertexBones)
						vertexBones[point] = ByteBufferUtils.getSmart2(buffers[4]);
					else {
						vertexBones[point] = buffers[4].get() & 0xFF;
						if (vertexBones[point] == 255)
							vertexBones[point] = -1;
					}
				}
			}
			if (textureUVCoordCount > 0) {
				buffers[0].position(vertex_uv_offset);
				buffers[1].position(tex_coord_u_offset);
				buffers[2].position(tex_coord_v_offset);
				vertexUVOffset = new int[vertexCount];
				int coord = 0;
				int size = 0;
				for (; coord < vertexCount; coord++) {
					vertexUVOffset[coord] = size;
					size += buffers[0].get() & 0xFF;
				}
				uvCoordVertexA = new byte[faceCount];
				uvCoordVertexB = new byte[faceCount];
				uvCoordVertexC = new byte[faceCount];
				textureCoordU = new float[textureUVCoordCount];
				textureCoordV = new float[textureUVCoordCount];
				for (coord = 0; coord < textureUVCoordCount; coord++) {
					textureCoordU[coord] = (buffers[1].getShort() / 4096.0F);
					textureCoordV[coord] = (buffers[2].getShort() / 4096.0F);
				}
			}
			buffers[0].position(face_colour_offset);
			buffers[1].position(face_render_info_offset);
			buffers[2].position(face_priority_offset);
			buffers[3].position(face_alpha_offset);
			buffers[4].position(face_bone_offset);
			buffers[5].position(face_texture_offset);
			buffers[6].position(face_texture_index_offset);
			for (int tri = 0; tri < faceCount; tri++) {
				faceColors[tri] = (short) (buffers[0].getShort() & 0xFFFF);
				if (hasFaceRenderTypes)
					faceRenderTypes[tri] = buffers[1].get();
				if (modelPriority == 255)
					facePriorities[tri] = buffers[2].get();
				if (hasFaceAlpha == 1)
					faceAlpha[tri] = buffers[3].get();
				if (hasFaceBones == 1) {
					if (hasExternalFaceBones)
						faceBones[tri] = ByteBufferUtils.getSmart2(buffers[4]);
					else {
						faceBones[tri] = buffers[4].get() & 0xFF;
						if (faceBones[tri] == 255)
							faceBones[tri] = -1;
					}
				}
				if (hasFaceTextures == 1)
					faceTextures[tri] = (short) ((buffers[5].getShort() & 0xFFFF) - 1);
				if (faceTextureIndexes != null) {
					if (faceTextures[tri] != -1) {
						if (version >= 16)
							faceTextureIndexes[tri] = (short) (ByteBufferUtils.getSmart(buffers[6]) - 1);
						else
							faceTextureIndexes[tri] = (short) ((buffers[6].get() & 0xFF) - 1);
					} else
						faceTextureIndexes[tri] = (short) -1;
				}
			}
			maxVertexUsed = -1;
			buffers[0].position(face_data_offset);
			buffers[1].position(face_read_flag_offset);
			buffers[2].position(face_uv_index_offset);
			calculateMaxDepth(buffers[0], buffers[1], buffers[2]);
			buffers[0].position(simple_tex_pmn_offset);
			buffers[1].position(complex_tex_pmn_offset);
			buffers[2].position(tex_scale_offset);
			buffers[3].position(tex_rot_offset);
			buffers[4].position(tex_dir_offset);
			buffers[5].position(particleZLifespanAndTextureColorOffset);
			decodeTexturedTriangles(buffers[0], buffers[1], buffers[2], buffers[3], buffers[4], buffers[5]);
			buffers[0].position(extras_offset);
			if (hasParticleEffects) {
				int emitterCount = buffers[0].get() & 0xFF;
				if (emitterCount > 0) {
					emitterConfigs = new EmitterConfig[emitterCount];
					for (int idx = 0; idx < emitterCount; idx++) {
						int type = buffers[0].getShort() & 0xFFFF;
						int face = buffers[0].getShort() & 0xFFFF;
						byte pri;
						if (modelPriority == 255)
							pri = facePriorities[face];
						else
							pri = (byte) modelPriority;
						emitterConfigs[idx] = new EmitterConfig(type, faceA[face], face, faceB[face], faceC[face], pri);
					}
				}
				int magnetCount = buffers[0].get() & 0xFF;
				if (magnetCount > 0) {
					magnetConfigs = new MagnetConfig[magnetCount];
					for (int face = 0; face < magnetCount; face++) {
						int skin = buffers[0].getShort() & 0xFFFF;
						int point = buffers[0].getShort() & 0xFFFF;
						magnetConfigs[face] = new MagnetConfig(skin, point);
					}
				}
			}
			if (hasBillboards) {
				int billBoardCount = buffers[0].get() & 0xFF;
				if (billBoardCount > 0) {
					billBoardConfigs = new BillBoardConfig[billBoardCount];
					for (int vertex = 0; vertex < billBoardCount; vertex++) {
						int type = buffers[0].getShort() & 0xFFFF;
						int face = buffers[0].getShort() & 0xFFFF;
						int priority;
						if (hasExternalPriorities)
							priority = ByteBufferUtils.getSmart2(buffers[0]);
						else {
							priority = buffers[0].get() & 0xFF;
							if (priority == 255)
								priority = -1;
						}
						byte magnitude = buffers[0].get();
						billBoardConfigs[vertex] = new BillBoardConfig(type, face, priority, magnitude);
					}
				}
			}
		}
	}

	void calculateMaxDepth(ByteBuffer class475_sub17, ByteBuffer class475_sub17_288_, ByteBuffer class475_sub17_289_) {
		short i = 0;
		short i_290_ = 0;
		short i_291_ = 0;
		int i_292_ = 0;
		for (int i_293_ = 0; i_293_ < faceCount; i_293_++) {
			int i_294_ = class475_sub17_288_.get() & 0xFF;
			int i_295_ = i_294_ & 0x7;
			if (i_295_ == 1) {
				faceA[i_293_] = i = (short) (ByteBufferUtils.getSmart1(class475_sub17) + i_292_);
				i_292_ = i;
				faceB[i_293_] = i_290_ = (short) (ByteBufferUtils.getSmart1(class475_sub17) + i_292_);
				i_292_ = i_290_;
				faceC[i_293_] = i_291_ = (short) (ByteBufferUtils.getSmart1(class475_sub17) + i_292_);
				i_292_ = i_291_;
				if (i > maxVertexUsed)
					maxVertexUsed = i;
				if (i_290_ > maxVertexUsed)
					maxVertexUsed = i_290_;
				if (i_291_ > maxVertexUsed)
					maxVertexUsed = i_291_;
			}
			if (i_295_ == 2) {
				i_290_ = i_291_;
				i_291_ = (short) (ByteBufferUtils.getSmart1(class475_sub17) + i_292_);
				i_292_ = i_291_;
				faceA[i_293_] = i;
				faceB[i_293_] = i_290_;
				faceC[i_293_] = i_291_;
				if (i_291_ > maxVertexUsed)
					maxVertexUsed = i_291_;
			}
			if (i_295_ == 3) {
				i = i_291_;
				i_291_ = (short) (ByteBufferUtils.getSmart1(class475_sub17) + i_292_);
				i_292_ = i_291_;
				faceA[i_293_] = i;
				faceB[i_293_] = i_290_;
				faceC[i_293_] = i_291_;
				if (i_291_ > maxVertexUsed)
					maxVertexUsed = i_291_;
			}
			if (i_295_ == 4) {
				short i_296_ = i;
				i = i_290_;
				i_290_ = i_296_;
				i_291_ = (short) (ByteBufferUtils.getSmart1(class475_sub17) + i_292_);
				i_292_ = i_291_;
				faceA[i_293_] = i;
				faceB[i_293_] = i_290_;
				faceC[i_293_] = i_291_;
				if (i_291_ > maxVertexUsed)
					maxVertexUsed = i_291_;
			}
			if (textureUVCoordCount > 0 && (i_294_ & 0x8) != 0) {
				uvCoordVertexA[i_293_] = (byte) (class475_sub17_289_.get() & 0xFF);
				uvCoordVertexB[i_293_] = (byte) (class475_sub17_289_.get() & 0xFF);
				uvCoordVertexC[i_293_] = (byte) (class475_sub17_289_.get() & 0xFF);
			}
		}
		maxVertexUsed++;
	}

	void decodeTexturedTriangles(ByteBuffer class475_sub17, ByteBuffer class475_sub17_142_,
			ByteBuffer class475_sub17_143_, ByteBuffer class475_sub17_144_, ByteBuffer class475_sub17_145_,
			ByteBuffer class475_sub17_146_) {
		for (int i = 0; i < texturedFaceCount; i++) {
			int i_147_ = textureRenderTypes[i] & 0xff;
			if (i_147_ == 0) {
				textureTriangleX[i] = (short) (class475_sub17.getShort() & 0xFFFF);
				textureTriangleY[i] = (short) (class475_sub17.getShort() & 0xFFFF);
				textureTriangleZ[i] = (short) (class475_sub17.getShort() & 0xFFFF);
			}
			if (i_147_ == 1) {
				textureTriangleX[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				textureTriangleY[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				textureTriangleZ[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				if (version < 15) {
					textureScaleX[i] = class475_sub17_143_.getShort() & 0xFFFF;
					if (version < 14)
						textureScaleY[i] = class475_sub17_143_.getShort() & 0xFFFF;
					else
						textureScaleY[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleZ[i] = class475_sub17_143_.getShort() & 0xFFFF;
				} else {
					textureScaleX[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleY[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleZ[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
				}
				textureRotationY[i] = class475_sub17_144_.get();
				textureUVDirections[i] = class475_sub17_145_.get();
				particleLifespanZ[i] = class475_sub17_146_.get();
			}
			if (i_147_ == 2) {
				textureTriangleX[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				textureTriangleY[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				textureTriangleZ[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				if (version < 15) {
					textureScaleX[i] = class475_sub17_143_.getShort() & 0xFFFF;
					if (version < 14)
						textureScaleY[i] = class475_sub17_143_.getShort() & 0xFFFF;
					else
						textureScaleY[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleZ[i] = class475_sub17_143_.getShort() & 0xFFFF;
				} else {
					textureScaleX[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleY[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleZ[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
				}
				textureRotationY[i] = class475_sub17_144_.get();
				textureUVDirections[i] = class475_sub17_145_.get();
				particleLifespanZ[i] = class475_sub17_146_.get();
				texturePrimaryColor[i] = class475_sub17_146_.get();
				textureSecondaryColor[i] = class475_sub17_146_.get();
			}
			if (i_147_ == 3) {
				textureTriangleX[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				textureTriangleY[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				textureTriangleZ[i] = (short) (class475_sub17_142_.getShort() & 0xFFFF);
				if (version < 15) {
					textureScaleX[i] = class475_sub17_143_.getShort() & 0xFFFF;
					if (version < 14)
						textureScaleY[i] = class475_sub17_143_.getShort() & 0xFFFF;
					else
						textureScaleY[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleZ[i] = class475_sub17_143_.getShort() & 0xFFFF;
				} else {
					textureScaleX[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleY[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
					textureScaleZ[i] = ByteBufferUtils.getMedium(class475_sub17_143_);
				}
				textureRotationY[i] = class475_sub17_144_.get();
				textureUVDirections[i] = class475_sub17_145_.get();
				particleLifespanZ[i] = class475_sub17_146_.get();
			}
		}
	}

	public int[][] method759() {
		int[] is = new int[256];
		int i = 0;
		for (int i_223_ = 0; i_223_ < billBoardConfigs.length; i_223_++) {
			int i_224_ = billBoardConfigs[i_223_].priority * -1606786303;
			if (i_224_ >= 0) {
				is[i_224_]++;
				if (i_224_ > i)
					i = i_224_;
			}
		}
		int[][] is_225_ = new int[i + 1][];
		for (int i_226_ = 0; i_226_ <= i; i_226_++) {
			is_225_[i_226_] = new int[is[i_226_]];
			is[i_226_] = 0;
		}
		for (int i_227_ = 0; i_227_ < billBoardConfigs.length; i_227_++) {
			int i_228_ = billBoardConfigs[i_227_].priority * -1606786303;
			if (i_228_ >= 0)
				is_225_[i_228_][is[i_228_]++] = i_227_;
		}
		return is_225_;
	}

	public static void method2835(int[] is, float[] fs, float[] fs_5_, int i) {
		method6887(is, fs, fs_5_, 0, is.length - 1, (byte) -51);
	}

	static void method6887(int[] is, float[] fs, float[] fs_1_, int i, int i_2_, byte i_3_) {
		if (i < i_2_) {
			int i_4_ = (i_2_ + i) / 2;
			int i_5_ = i;
			int i_6_ = is[i_4_];
			is[i_4_] = is[i_2_];
			is[i_2_] = i_6_;
			float f = fs[i_4_];
			fs[i_4_] = fs[i_2_];
			fs[i_2_] = f;
			float f_7_ = fs_1_[i_4_];
			fs_1_[i_4_] = fs_1_[i_2_];
			fs_1_[i_2_] = f_7_;
			int i_8_ = (long) i_6_ == 9223372036854775807L ? 0 : 1;
			for (int i_9_ = i; i_9_ < i_2_; i_9_++) {
				if (is[i_9_] < (i_9_ & i_8_) + i_6_) {
					int i_10_ = is[i_9_];
					is[i_9_] = is[i_5_];
					is[i_5_] = i_10_;
					float f_11_ = fs[i_9_];
					fs[i_9_] = fs[i_5_];
					fs[i_5_] = f_11_;
					float f_12_ = fs_1_[i_9_];
					fs_1_[i_9_] = fs_1_[i_5_];
					fs_1_[i_5_] = f_12_;
					i_5_++;
				}
			}
			is[i_2_] = is[i_5_];
			is[i_5_] = i_6_;
			fs[i_2_] = fs[i_5_];
			fs[i_5_] = f;
			fs_1_[i_2_] = fs_1_[i_5_];
			fs_1_[i_5_] = f_7_;
			method6887(is, fs, fs_1_, i, i_5_ - 1, (byte) -63);
			method6887(is, fs, fs_1_, i_5_ + 1, i_2_, (byte) -53);
		}
	}
}
