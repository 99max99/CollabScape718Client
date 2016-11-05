/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationFrame {
	int transformationCount;
	static short[] bufferX;
	static short[] indicesBuffer = new short[500];
	static short[] bufferZ;
	static short[] skipped;
	short[] transformationY;
	AnimationFrameBase base = null;
	static short[] bufferY;
	short[] transformationIndices;
	short[] transformationX;
	static int anInt935 = 2;
	short[] transformationZ;
	short[] skippedRefrences;
	byte[] transformationFlags;
	boolean modifiesAlpha;
	boolean modifiesColour;
	boolean aBoolean941;
	static int anInt942 = 1;
	static int anInt943 = 2;
	static byte[] flagsBuffer;

	AnimationFrame(final byte[] is, final AnimationFrameBase class298_sub15) {
		this.transformationCount = 0;
		this.modifiesAlpha = false;
		this.modifiesColour = false;
		this.aBoolean941 = false;
		this.base = class298_sub15;
		try {
			final RsByteBuffer attributes = new RsByteBuffer(is);
			final RsByteBuffer transformations = new RsByteBuffer(is);
			int version = attributes.readUnsignedByte();
			attributes.index += 232826622;
			final int count = attributes.readUnsignedShort();
			int used = 0;
			int last = -1;
			int lastUsed = -1;
			transformations.index = (attributes.index * 385051775 + count) * 116413311;
			for (int index_ = 0; index_ < count; index_++) {
				final int type = (this.base.transformationTypes[index_]);
				if (type == 0)
					last = index_;
				final int attribute = attributes.readUnsignedByte();
				if (attribute > 0) {
					
					if (type == 0)
						lastUsed = index_;
					
					indicesBuffer[used] = (short) index_;
					short value = 0;
					if (type == 3 || type == 10)
						value = (short) 128;
					
					
					if (version >= 2 && type == 7) {
						if ((attribute & 0x1) != 0) {
							bufferX[used] = (short) transformations.readSmart3(590991010);
							transformations.readSmart3(590991010);
						} else {
							bufferX[used] = value;
						}

						if ((attribute & 0x2) != 0) {
							bufferY[used] = (short) transformations.readSmart3(590991010);
							transformations.readSmart3(590991010);
						} else {
							bufferY[used] = value;
						}

						if ((attribute & 0x4) != 0) {
							bufferZ[used] = (short) transformations.readSmart3(590991010);
							transformations.readSmart3(590991010);
						} else {
							bufferZ[used] = value;
						}
					} else {
						if ((attribute & 0x1) != 0) {
							bufferX[used] = (short) transformations.readSmart3(590991010);
						} else {
							bufferX[used] = value;
						}

						if ((attribute & 0x2) != 0) {
							bufferY[used] = (short) transformations.readSmart3(590991010);
						} else {
							bufferY[used] = value;
						}

						if ((attribute & 0x4) != 0) {
							bufferZ[used] = (short) transformations.readSmart3(590991010);
						} else {
							bufferZ[used] = value;
						}
					}

					flagsBuffer[used] = (byte) (attribute >>> 3 & 0x3);
					if (type == 2 || type == 9) {
						bufferX[used] = (short) (bufferX[used] << 2 & 0x3fff);
						bufferY[used] = (short) (bufferY[used] << 2 & 0x3fff);
						bufferZ[used] = (short) (bufferZ[used] << 2 & 0x3fff);
					}

					skipped[used] = (short) -1;
					if (type == 1 || type == 2 || type == 3) {
						if (last > lastUsed) {
							skipped[used] = (short) last;
							lastUsed = last;
						}
					} else if (type == 5) {
						modifiesAlpha = true;
					} else if (type == 7) {
						modifiesColour = true;
					} else if (type == 9 || type == 10 || type == 8) {
						aBoolean941 = true;
					}
					used++;
				}
			}
			if (transformations.index * 385051775 != is.length)
				throw new RuntimeException();
			this.transformationCount = used;
			this.transformationIndices = new short[used];
			this.transformationX = new short[used];
			this.transformationY = new short[used];
			this.transformationZ = new short[used];
			this.skippedRefrences = new short[used];
			this.transformationFlags = new byte[used];
			for (int i_8_ = 0; i_8_ < used; i_8_++) {
				this.transformationIndices[i_8_] = indicesBuffer[i_8_];
				this.transformationX[i_8_] = bufferX[i_8_];
				this.transformationY[i_8_] = bufferY[i_8_];
				this.transformationZ[i_8_] = bufferZ[i_8_];
				this.skippedRefrences[i_8_] = skipped[i_8_];
				this.transformationFlags[i_8_] = flagsBuffer[i_8_];
			}
		} catch (final Exception exception) {
			this.transformationCount = 0;
			this.modifiesAlpha = false;
			this.modifiesColour = false;
		}
	}

	static {
		bufferX = new short[500];
		bufferY = new short[500];
		bufferZ = new short[500];
		skipped = new short[500];
		flagsBuffer = new byte[500];
	}
}
