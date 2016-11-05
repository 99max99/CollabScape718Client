/* Class298_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationFrameBase extends Class298 {
	public static int anInt7266 = 3;
	public static int anInt7267 = 1;
	int count;
	public static int anInt7269 = 0;
	public static int anInt7270 = 5;
	static int anInt7271 = 6;
	public static int anInt7272 = 7;
	public static int anInt7273 = 8;
	public static int anInt7274 = 9;
	boolean[] aBooleanArray7275;
	int id;
	public static int anInt7277 = 10;
	int[] transformationTypes;
	int[][] labels;
	int[] anIntArray7280;
	public static int anInt7281 = 2;

	AnimationFrameBase(int i, byte[] is) {
		id = 1362718155 * i;
		final RsByteBuffer buffer = new RsByteBuffer(is);
		count = buffer.readUnsignedShort() * -1914825713;
		transformationTypes = new int[92429039 * count];
		labels = new int[92429039 * count][];
		aBooleanArray7275 = new boolean[count * 92429039];
		anIntArray7280 = new int[92429039 * count];
		for (int i_0_ = 0; i_0_ < 92429039 * count; i_0_++) {
			transformationTypes[i_0_] = buffer.readUnsignedByte();
			if (transformationTypes[i_0_] == 6)
				transformationTypes[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < count * 92429039; i_1_++)
			aBooleanArray7275[i_1_] = buffer.readUnsignedByte() == 1;
		for (int i_2_ = 0; i_2_ < count * 92429039; i_2_++)
			anIntArray7280[i_2_] = buffer.readUnsignedShort();
		for (int i_3_ = 0; i_3_ < count * 92429039; i_3_++)
			labels[i_3_] = new int[buffer.readSmart((short) 0)];
		for (int i_4_ = 0; i_4_ < count * 92429039; i_4_++) {
			for (int i_5_ = 0; (i_5_ < labels[i_4_].length); i_5_++)
				labels[i_4_][i_5_] = buffer.readSmart((short) 0);
		}
	}

	static final void method2909(Class403 class403, int i) {
		try {
			int i_6_ = (((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689) * 681479919)]);
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = pb.aBooleanArray8957[i_6_] ? 1 : 0;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aax.wu(").append(')').toString());
		}
	}
}
