/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class226 {
	int checksum;
	int[] entryVersions;
	byte[] digest;
	byte[][] entryHashes;
	int[] childSizes;
	int[] entryIndices;
	int[] entryNames;
	LookupTable entries;
	int entrySize;
	int[] entryCrcs;
	int[][] childNames;
	static int anInt2524 = 7;
	int[] childCounts;
	int[][] childIndices;
	int entryCount;
	LookupTable[] children;
	int version;

	void method2104(byte[] is, int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(Class236.method2188(is, -1012105553));
			int i_0_ = class298_sub53.readUnsignedByte();
			if (i_0_ < 5 || i_0_ > 7)
				throw new RuntimeException();
			if (i_0_ >= 6)
				((Class226) this).version = class298_sub53.readInt((byte) -6) * 967231547;
			else
				((Class226) this).version = 0;
			int i_1_ = class298_sub53.readUnsignedByte();
			boolean bool = 0 != (i_1_ & 0x1);
			boolean bool_2_ = 0 != (i_1_ & 0x2);
			if (i_0_ >= 7)
				((Class226) this).entryCount = class298_sub53.method3607(-2145456050) * -1409433829;
			else
				((Class226) this).entryCount = class298_sub53.readUnsignedShort() * -1409433829;
			int i_3_ = 0;
			int i_4_ = -1;
			((Class226) this).entryIndices = new int[-2145352941 * ((Class226) this).entryCount];
			if (i_0_ >= 7) {
				for (int i_5_ = 0; i_5_ < ((Class226) this).entryCount * -2145352941; i_5_++) {
					((Class226) this).entryIndices[i_5_] = i_3_ += class298_sub53.method3607(-1791555856);
					if (((Class226) this).entryIndices[i_5_] > i_4_)
						i_4_ = ((Class226) this).entryIndices[i_5_];
				}
			} else {
				for (int i_6_ = 0; i_6_ < -2145352941 * ((Class226) this).entryCount; i_6_++) {
					((Class226) this).entryIndices[i_6_] = i_3_ += class298_sub53.readUnsignedShort();
					if (((Class226) this).entryIndices[i_6_] > i_4_)
						i_4_ = ((Class226) this).entryIndices[i_6_];
				}
			}
			((Class226) this).entrySize = (i_4_ + 1) * 1621334929;
			((Class226) this).entryCrcs = new int[-1583970959 * ((Class226) this).entrySize];
			if (bool_2_)
				((Class226) this).entryHashes = new byte[((Class226) this).entrySize * -1583970959][];
			((Class226) this).entryVersions = new int[-1583970959 * ((Class226) this).entrySize];
			((Class226) this).childCounts = new int[-1583970959 * ((Class226) this).entrySize];
			((Class226) this).childIndices = new int[((Class226) this).entrySize * -1583970959][];
			((Class226) this).childSizes = new int[((Class226) this).entrySize * -1583970959];
			if (bool) {
				((Class226) this).entryNames = new int[-1583970959 * ((Class226) this).entrySize];
				for (int i_7_ = 0; i_7_ < -1583970959 * ((Class226) this).entrySize; i_7_++)
					((Class226) this).entryNames[i_7_] = -1;
				for (int i_8_ = 0; i_8_ < ((Class226) this).entryCount * -2145352941; i_8_++)
					((Class226) this).entryNames[(((Class226) this).entryIndices[i_8_])] = class298_sub53.readInt((byte) -104);
				((Class226) this).entries = new LookupTable(((Class226) this).entryNames);
			}
			for (int i_9_ = 0; i_9_ < ((Class226) this).entryCount * -2145352941; i_9_++)
				((Class226) this).entryCrcs[(((Class226) this).entryIndices[i_9_])] = class298_sub53.readInt((byte) -119);
			if (bool_2_) {
				for (int i_10_ = 0; i_10_ < ((Class226) this).entryCount * -2145352941; i_10_++) {
					byte[] is_11_ = new byte[64];
					class298_sub53.readBytes(is_11_, 0, 64, -953523806);
					((Class226) this).entryHashes[((Class226) this).entryIndices[i_10_]] = is_11_;
				}
			}
			for (int i_12_ = 0; i_12_ < -2145352941 * ((Class226) this).entryCount; i_12_++)
				((Class226) this).entryVersions[(((Class226) this).entryIndices[i_12_])] = class298_sub53.readInt((byte) -83);
			if (i_0_ >= 7) {
				for (int i_13_ = 0; i_13_ < -2145352941 * ((Class226) this).entryCount; i_13_++)
					((Class226) this).childCounts[(((Class226) this).entryIndices[i_13_])] = class298_sub53.method3607(-2118512247);
				for (int i_14_ = 0; i_14_ < ((Class226) this).entryCount * -2145352941; i_14_++) {
					int i_15_ = ((Class226) this).entryIndices[i_14_];
					int i_16_ = ((Class226) this).childCounts[i_15_];
					i_3_ = 0;
					int i_17_ = -1;
					((Class226) this).childIndices[i_15_] = new int[i_16_];
					for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
						int i_19_ = (((Class226) this).childIndices[i_15_][i_18_] = i_3_ += class298_sub53.method3607(-1695883199));
						if (i_19_ > i_17_)
							i_17_ = i_19_;
					}
					((Class226) this).childSizes[i_15_] = 1 + i_17_;
					if (i_16_ == 1 + i_17_)
						((Class226) this).childIndices[i_15_] = null;
				}
			} else {
				for (int i_20_ = 0; i_20_ < ((Class226) this).entryCount * -2145352941; i_20_++)
					((Class226) this).childCounts[(((Class226) this).entryIndices[i_20_])] = class298_sub53.readUnsignedShort();
				for (int i_21_ = 0; i_21_ < -2145352941 * ((Class226) this).entryCount; i_21_++) {
					int i_22_ = ((Class226) this).entryIndices[i_21_];
					int i_23_ = ((Class226) this).childCounts[i_22_];
					i_3_ = 0;
					int i_24_ = -1;
					((Class226) this).childIndices[i_22_] = new int[i_23_];
					for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
						int i_26_ = (((Class226) this).childIndices[i_22_][i_25_] = i_3_ += class298_sub53.readUnsignedShort());
						if (i_26_ > i_24_)
							i_24_ = i_26_;
					}
					((Class226) this).childSizes[i_22_] = 1 + i_24_;
					if (i_23_ == 1 + i_24_)
						((Class226) this).childIndices[i_22_] = null;
				}
			}
			if (bool) {
				((Class226) this).childNames = new int[1 + i_4_][];
				((Class226) this).children = new LookupTable[1 + i_4_];
				for (int i_27_ = 0; i_27_ < -2145352941 * ((Class226) this).entryCount; i_27_++) {
					int i_28_ = ((Class226) this).entryIndices[i_27_];
					int i_29_ = ((Class226) this).childCounts[i_28_];
					((Class226) this).childNames[i_28_] = new int[((Class226) this).childSizes[i_28_]];
					for (int i_30_ = 0; i_30_ < ((Class226) this).childSizes[i_28_]; i_30_++)
						((Class226) this).childNames[i_28_][i_30_] = -1;
					for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
						int i_32_;
						if (((Class226) this).childIndices[i_28_] != null)
							i_32_ = (((Class226) this).childIndices[i_28_][i_31_]);
						else
							i_32_ = i_31_;
						((Class226) this).childNames[i_28_][i_32_] = class298_sub53.readInt((byte) 46);
					}
					((Class226) this).children[i_28_] = new LookupTable(((Class226) this).childNames[i_28_]);
				}
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jo.a(").append(')').toString());
		}
	}

	Class226(byte[] is, int i, byte[] is_33_) {
		((Class226) this).checksum = Class271.method2548(is, is.length, -1939068825) * -720041561;
		if (i != 1600327191 * ((Class226) this).checksum)
			throw new RuntimeException();
		if (is_33_ != null) {
			if (is_33_.length != 64)
				throw new RuntimeException();
			((Class226) this).digest = Class152.method1654(is, 0, is.length, (byte) 28);
			for (int i_34_ = 0; i_34_ < 64; i_34_++) {
				if (((Class226) this).digest[i_34_] != is_33_[i_34_])
					throw new RuntimeException();
			}
		}
		method2104(is, -1483175870);
	}

	public static Class343_Sub1 method2105(int i, byte i_35_) {
		try {
			if (!Class338.aBoolean3631 || i < Class395.anInt5190 * -1648308965 || i > Class338.anInt3630 * -499146007)
				return null;
			return (Class131.aClass343_Sub1Array1498[i - Class395.anInt5190 * -1648308965]);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jo.a(").append(')').toString());
		}
	}

	static final void method2106(Class403 class403, int i) {
		try {
			int i_36_ = (((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_36_, (byte) -58);
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1508815983 * class105.anInt1210;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jo.rs(").append(')').toString());
		}
	}

	static final void method2107(Class403 class403, byte i) {
		try {
			Class82_Sub12.method909((String) (((Class403) class403).anObjectArray5240[(((Class403) class403).anInt5241 -= 969361751) * -203050393]), -1257906929);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jo.sa(").append(')').toString());
		}
	}

	static final void method2108(Class403 class403, short i) {
		try {
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1)] = (null == pb.aClass105_8819 ? -1 : -440872681 * pb.aClass105_8819.ihash);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jo.api(").append(')').toString());
		}
	}
}
