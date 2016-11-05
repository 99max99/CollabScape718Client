import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/* Class298_Sub37_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TextureDecoder extends Class298_Sub37 {
	static int[] anIntArray9586;
	static double aDouble9587 = -1.0;

	boolean method3420(JS5 class243, Interface_ma interface_ma, byte b) {
		return idx.method2291(textureId, 0);
	}

	/*
	 * request pic, with background
	 */
	int[] method3421(JS5 class243, Interface_ma interface_ma, double d, int i, int i_3_, boolean bool, int j) {
		try {
			byte[] data = idx.getTextureData(textureId, (byte) 0);
			if (data == null)
				return null;
			return getRGBArray(data, i, i_3_);
		}
		catch (IOException e) {
			return null;
		}
	}

	float[] method3422(JS5 class243, Interface_ma interface_ma, int i, int i_20_, boolean bool, int j) {
		try {
			byte[] data = idx.getTextureData(textureId, (byte) 0);
			if (data == null)
				return null;
			int[] rgbArray = getRGBArray(data, i, i_20_);
			int[] rgbArray2 = null;
			final byte[] data2 = idx.getTextureData(textureId, (byte) 0);
			if (data2 != null && idx.containsFile(textureId, 1)) {
				rgbArray2 = getRGBArray(data2, i, i_20_);
				for (int index = 0; index < rgbArray2.length; index++)
					rgbArray2[index] = rgbArray2[index] & 0xfff;
			}
			if (rgbArray2 == null)
				rgbArray2 = new int[rgbArray.length];
			final float[] fs = new float[rgbArray.length * 4];
			int i_51_ = 0;
			for (int i_52_ = 0; i_52_ < rgbArray.length; i_52_++) {
				final int i_53_ = rgbArray[i_52_];
				final int i_54_ = i_53_ >>> 24;
				final int i_55_ = (i_53_ & 0xff0000) >> 16;
				final int i_56_ = (i_53_ & 0xff00) >> 8;
				final int i_57_ = i_53_ & 0xff;
				final float f = 1.0F + rgbArray2[i_52_] * 31.0F / 4096.0F;
				fs[i_51_++] = f * i_55_ / 255.0F;
				fs[i_51_++] = f * i_56_ / 255.0F;
				fs[i_51_++] = f * i_57_ / 255.0F;
				fs[i_51_++] = i_54_ / 255.0F;
			}
			return fs;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	static {
		anIntArray9586 = new int[256];
	}

	private int textureId;
	private JS5 idx;

	int[] getRGBArray(final byte[] is, int width, int height) throws IOException {
		BufferedImage bi = ImageIO.read(new ByteArrayInputStream(is));
		int[] array = getRGBArray(bi);
		if (width != bi.getWidth() || height != bi.getHeight()) {
			int[] newArray = new int[width * height];
			int ratio = newArray.length / array.length;
			for (int i = 0; i < newArray.length; i++)
				newArray[i] = array[ratio];
			return newArray;
		}
		return array;
	}

	public static int[] getRGBArray(final BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			final int[] is_1_ = new int[bufferedimage.getWidth() * bufferedimage.getHeight()];
			if (bufferedimage.getType() == 10) {
				for (int i_2_ = 0; i_2_ < is_1_.length; i_2_++) {
					is_1_[i_2_] = -16777216 + is[i_2_] + (is[i_2_] << 8) + (is[i_2_] << 16);
				}
			}
			else {
				for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++) {
					final int i_4_ = i_3_ * 2;
					is_1_[i_3_] = (is[1 + i_4_] << 24) + is[i_4_] + (is[i_4_] << 16) + (is[i_4_] << 8);
				}
			}
			return is_1_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	TextureDecoder(int textureId, JS5 idx) {
		this.textureId = textureId;
		this.idx = idx;
	}

	int[] method3423(JS5 class243, Interface_ma interface_ma, double d, int i, int i_44_, boolean bool, boolean bool_45_, int j) {
		try {
			byte[] data = idx.getTextureData(textureId, (byte) 0);
			if (data == null)
				return null;
			int[] is = getRGBArray(data, i, i_44_);
			for (int index = 0; index < is.length; index++) {
				if ((is[index] & 0xffffff) != 0) {
					is[index] = is[index] | ~0xffffff;
				}
				else {
					is[index] = is[index] & 0xffffff;
				}
			}
			return is;
		}
		catch (IOException e) {
			return null;
		}
	}
}
