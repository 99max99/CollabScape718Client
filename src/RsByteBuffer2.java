import java.math.BigInteger;

public class RsByteBuffer2 extends Class298 {

	public byte[] buffer;
	public int offset;
	static int[] anIntArray7614 = new int[256];
	static int anInt7615 = -306674912;
	public static int anInt7616 = 5000;
	static long aLong7617 = -3932672073523589310L;
	public static int anInt7618 = 100;
	public static long[] aLongArray7619;

	static {
		int i;
		for (i = 0; i < 256; ++i) {
			int l = i;

			for (int i_63_ = 0; i_63_ < 8; ++i_63_) {
				if ((l & 1) == 1) {
					l = l >>> 1 ^ -306674912;
				}
				else {
					l >>>= 1;
				}
			}

			anIntArray7614[i] = l;
		}

		aLongArray7619 = new long[256];

		for (i = 0; i < 256; ++i) {
			long var4 = (long) i;

			for (int i_64_ = 0; i_64_ < 8; ++i_64_) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				}
				else {
					var4 >>>= 1;
				}
			}

			aLongArray7619[i] = var4;
		}

	}

	public void method3584(long l) {
		try {
			this.buffer[this.offset++] = (byte) ((int) (l >> 32));
			this.buffer[this.offset++] = (byte) ((int) (l >> 24));
			this.buffer[this.offset++] = (byte) ((int) (l >> 16));
			this.buffer[this.offset++] = (byte) ((int) (l >> 8));
			this.buffer[this.offset++] = (byte) ((int) l);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.r(" + ')');
		}
	}

	public void writeByte(int i) {
		try {
			this.buffer[this.offset++] = (byte) i;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.p(" + ')');
		}
	}

	public void writeShort(int i, int i_1_) {
		try {
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) i;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.i(" + ')');
		}
	}

	public void method3587(int i, int i_2_) {
		try {
			this.buffer[this.offset++] = (byte) i;
			this.buffer[this.offset++] = (byte) (i >> 8);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.k(" + ')');
		}
	}

	public void writeInt(int i, int i_3_) {
		try {
			this.buffer[this.offset++] = (byte) (i >> 24);
			this.buffer[this.offset++] = (byte) (i >> 16);
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) i;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.u(" + ')');
		}
	}

	public void writeLEInt(int i, int i_4_) {
		try {
			this.buffer[this.offset++] = (byte) i;
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) (i >> 16);
			this.buffer[this.offset++] = (byte) (i >> 24);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.x(" + ')');
		}
	}

	public void writeString(String string, int i) {
		try {
			int runtimeexception = string.indexOf(0);
			if (runtimeexception >= 0) {
				throw new IllegalArgumentException("");
			}
			else {
				this.offset += Class361.method4304(string, 0, string.length(), this.buffer, this.offset, (byte) 41) * 116413311;
				this.buffer[this.offset++] = 0;
			}
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.z(" + ')');
		}
	}

	public int readShort(int i) {
		try {
			this.offset += 2;
			int runtimeexception = ((this.buffer[this.offset - 2] & 255) << 8) + (this.buffer[this.offset - 1] & 255);
			if (runtimeexception > 32767) {
				runtimeexception -= 65536;
			}

			return runtimeexception;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ao(" + ')');
		}
	}

	public void writeIntV1(int i, byte i_7_) {
		try {
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) i;
			this.buffer[this.offset++] = (byte) (i >> 24);
			this.buffer[this.offset++] = (byte) (i >> 16);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.ba(" + ')');
		}
	}

	public void method3593(int i, int i_8_) {
		try {
			this.buffer[this.offset - i - 2] = (byte) (i >> 8);
			this.buffer[this.offset - i - 1] = (byte) i;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.j(" + ')');
		}
	}

	public void method3594(int i, byte i_9_) {
		try {
			if (i >= 0 && i < 128) {
				this.writeByte(i);
			}
			else {
				if (i < 0 || i >= '\u8000') {
					throw new IllegalArgumentException();
				}

				this.writeShort('\u8000' + i, 16711935);
			}

		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.l(" + ')');
		}
	}

	public int readUnsignedByte() {
		try {
			return this.buffer[this.offset++] & 255;
		}
		catch (RuntimeException var2) {
			throw Class346.method4175(var2, "acx.aa(" + ')');
		}
	}

	public byte readByte(int i) {
		try {
			return this.buffer[this.offset++];
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ak(" + ')');
		}
	}

	final int readCustomUnsignedShort() {
		int v = this.readUnsignedShort();
		return v == '\uffff' ? -1 : v;
	}

	public int readUnsignedShort() {
		try {
			this.offset += 2;
			int runtimeexception = (this.buffer[this.offset - 1] & 255) + ((this.buffer[this.offset - 2] & 255) << 8);
			return runtimeexception;
		}
		catch (RuntimeException var2) {
			throw Class346.method4175(var2, "acx.ae(" + ')');
		}
	}

	public long readLong(short i) {
		try {
			long runtimeexception = (long) this.readInt((byte) 35) & 4294967295L;
			long l_10_ = (long) this.readInt((byte) 13) & 4294967295L;
			return (runtimeexception << 32) + l_10_;
		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.al(" + ')');
		}
	}

	public void method3599(int i, int i_11_) {
		try {
			this.buffer[this.offset - i - 4] = (byte) (i >> 24);
			this.buffer[this.offset - i - 3] = (byte) (i >> 16);
			this.buffer[this.offset - i - 2] = (byte) (i >> 8);
			this.buffer[this.offset - i - 1] = (byte) i;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.w(" + ')');
		}
	}

	public int method3600(int i) {
		try {
			this.offset += 4;
			return ((this.buffer[this.offset - 1] & 255) << 24) + ((this.buffer[this.offset - 2] & 255) << 16) + ((this.buffer[this.offset - 3] & 255) << 8) + (this.buffer[this.offset - 4] & 255);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ah(" + ')');
		}
	}

	public long method3601(byte i) {
		try {
			long runtimeexception = (long) this.readUnsignedByte() & 4294967295L;
			long l_12_ = (long) this.readInt((byte) 19) & 4294967295L;
			return (runtimeexception << 32) + l_12_;
		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.ai(" + ')');
		}
	}

	public String readString(int i) {
		try {
			int runtimeexception = this.offset;

			while (this.buffer[this.offset++] != 0) {
				;
			}

			int i_14_ = this.offset - runtimeexception - 1;
			return i_14_ == 0 ? "" : Class52.method556(this.buffer, runtimeexception, i_14_, 964250329);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.af(" + ')');
		}
	}

	public void method3603(long l, int i, int i_15_) {
		try {
			--i;
			if (i >= 0 && i <= 7) {
				for (int runtimeexception = i * 8; runtimeexception >= 0; runtimeexception -= 8) {
					this.buffer[this.offset++] = (byte) ((int) (l >> runtimeexception));
				}

			}
			else {
				throw new IllegalArgumentException();
			}
		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.n(" + ')');
		}
	}

	public void readBytes(byte[] is, int i, int i_17_, int i_18_) {
		try {
			for (int runtimeexception = i; runtimeexception < i + i_17_; ++runtimeexception) {
				is[runtimeexception] = this.buffer[this.offset++];
			}

		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.ab(" + ')');
		}
	}

	public int readUnsignedSmart(int i) {
		try {
			int runtimeexception = this.buffer[this.offset] & 255;
			return runtimeexception < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '\u8000';
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ay(" + ')');
		}
	}

	public int readUnsignedSmart() {
		int first = this.buffer[this.offset] & 255;
		return first < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '\uc000';
	}

	public int ReadSpecialSmart() {
		int i_25_ = buffer[offset] & 0xff;
		if (i_25_ < 128)
			return readUnsignedByte() - 1;
		return readUnsignedShort() - 32769;
	}

	public int readSmart(short i) {
		try {
			int runtimeexception = 0;

			int i_22_;
			for (i_22_ = this.readUnsignedSmart(1723054621); 32767 == i_22_; i_22_ = this.readUnsignedSmart(1723054621)) {
				runtimeexception += 32767;
			}

			runtimeexception += i_22_;
			return runtimeexception;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.aq(" + ')');
		}
	}

	public int method3607(int i) {
		try {
			return this.buffer[this.offset] < 0 ? this.readInt((byte) 47) & Integer.MAX_VALUE : this.readUnsignedShort();
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ag(" + ')');
		}
	}

	public void writeLong(long l) {
		try {
			this.buffer[this.offset++] = (byte) ((int) (l >> 56));
			this.buffer[this.offset++] = (byte) ((int) (l >> 48));
			this.buffer[this.offset++] = (byte) ((int) (l >> 40));
			this.buffer[this.offset++] = (byte) ((int) (l >> 32));
			this.buffer[this.offset++] = (byte) ((int) (l >> 24));
			this.buffer[this.offset++] = (byte) ((int) (l >> 16));
			this.buffer[this.offset++] = (byte) ((int) (l >> 8));
			this.buffer[this.offset++] = (byte) ((int) l);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.q(" + ')');
		}
	}

	public int method3609(int i) {
		try {
			byte runtimeexception = this.buffer[this.offset++];

			int i_24_;
			for (i_24_ = 0; runtimeexception < 0; runtimeexception = this.buffer[this.offset++]) {
				i_24_ = (i_24_ | runtimeexception & 127) << 7;
			}

			return i_24_ | runtimeexception;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.au(" + ')');
		}
	}

	public void method3610(int[] is, int i) {
		try {
			int runtimeexception = this.offset / 8;
			this.offset = 0;

			for (int i_26_ = 0; i_26_ < runtimeexception; ++i_26_) {
				int i_27_ = this.readInt((byte) -31);
				int i_28_ = this.readInt((byte) -90);
				int i_29_ = -957401312;
				int i_30_ = -1640531527;

				for (int i_31_ = 32; i_31_-- > 0; i_27_ -= i_28_ + (i_28_ << 4 ^ i_28_ >>> 5) ^ i_29_ + is[i_29_ & 3]) {
					i_28_ -= i_27_ + (i_27_ << 4 ^ i_27_ >>> 5) ^ is[i_29_ >>> 11 & 3] + i_29_;
					i_29_ -= i_30_;
				}

				this.offset -= 931306488;
				this.writeInt(i_27_, -429646008);
				this.writeInt(i_28_, 96557392);
			}

		}
		catch (RuntimeException var10) {
			throw Class346.method4175(var10, "acx.ar(" + ')');
		}
	}

	public void method3611(int[] is, int i, int i_32_, int i_33_) {
		try {
			int runtimeexception = this.offset;
			this.offset = i * 116413311;
			int i_35_ = (i_32_ - i) / 8;

			for (int i_36_ = 0; i_36_ < i_35_; ++i_36_) {
				int i_37_ = this.readInt((byte) -6);
				int i_38_ = this.readInt((byte) -16);
				int i_39_ = 0;
				int i_40_ = -1640531527;

				for (int i_41_ = 32; i_41_-- > 0; i_38_ += (i_37_ << 4 ^ i_37_ >>> 5) + i_37_ ^ i_39_ + is[i_39_ >>> 11 & 3]) {
					i_37_ += (i_38_ << 4 ^ i_38_ >>> 5) + i_38_ ^ is[i_39_ & 3] + i_39_;
					i_39_ += i_40_;
				}

				this.offset -= 931306488;
				this.writeInt(i_37_, -1455722924);
				this.writeInt(i_38_, -1798688670);
			}

			this.offset = 116413311 * runtimeexception;
		}
		catch (RuntimeException var13) {
			throw Class346.method4175(var13, "acx.ac(" + ')');
		}
	}

	public void method3612(int[] is, int i, int i_42_, int i_43_) {
		try {
			int runtimeexception = this.offset;
			this.offset = i * 116413311;
			int i_45_ = (i_42_ - i) / 8;

			for (int i_46_ = 0; i_46_ < i_45_; ++i_46_) {
				int i_47_ = this.readInt((byte) -22);
				int i_48_ = this.readInt((byte) -60);
				int i_49_ = -957401312;
				int i_50_ = -1640531527;

				for (int i_51_ = 32; i_51_-- > 0; i_47_ -= i_48_ + (i_48_ << 4 ^ i_48_ >>> 5) ^ is[i_49_ & 3] + i_49_) {
					i_48_ -= i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ i_49_ + is[i_49_ >>> 11 & 3];
					i_49_ -= i_50_;
				}

				this.offset -= 931306488;
				this.writeInt(i_47_, -1451619282);
				this.writeInt(i_48_, -1662476613);
			}

			this.offset = runtimeexception * 116413311;
		}
		catch (RuntimeException var13) {
			throw Class346.method4175(var13, "acx.am(" + ')');
		}
	}

	public int read24BitUnsignedInteger(byte i) {
		try {
			this.offset += 3;
			return (this.buffer[this.offset - 1] & 255) + ((this.buffer[this.offset - 3] & 255) << 16) + ((this.buffer[this.offset - 2] & 255) << 8);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ad(" + ')');
		}
	}

	public int method3614(int i, int i_52_) {
		try {
			int runtimeexception = Class11.method328(this.buffer, i, this.offset, -1501053505);
			this.writeInt(runtimeexception, 533083974);
			return runtimeexception;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.bf(" + ')');
		}
	}

	public boolean method3615(byte i) {
		try {
			this.offset -= 465653244;
			int runtimeexception = Class11.method328(this.buffer, 0, this.offset, -395934040);
			int i_55_ = this.readInt((byte) -63);
			return i_55_ == runtimeexception;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.be(" + ')');
		}
	}

	public void writeByte128(int i, int i_56_) {
		try {
			this.buffer[this.offset++] = (byte) (128 + i);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.by(" + ')');
		}
	}

	public void method3617(int i, int i_57_) {
		try {
			this.buffer[this.offset++] = (byte) (0 - i);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.bm(" + ')');
		}
	}

	public int readUnsignedByte128(int i) {
		try {
			return this.buffer[this.offset++] - 128 & 255;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bx(" + ')');
		}
	}

	public int readUnsignedByteC(short i) {
		try {
			return 0 - this.buffer[this.offset++] & 255;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bo(" + ')');
		}
	}

	public int readUnsigned128Byte(byte i) {
		try {
			return 128 - this.buffer[this.offset++] & 255;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bb(" + ')');
		}
	}

	public byte readByteC(int i) {
		try {
			return (byte) (0 - this.buffer[this.offset++]);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bu(" + ')');
		}
	}

	public byte read128Byte(int i) {
		try {
			return (byte) (128 - this.buffer[this.offset++]);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bw(" + ')');
		}
	}

	public void writeShortLE128(int i) {
		try {
			this.buffer[this.offset++] = (byte) (i + 128);
			this.buffer[this.offset++] = (byte) (i >> 8);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bg(" + ')');
		}
	}

	public int readUnsignedShortLE(byte i) {
		try {
			this.offset += 2;
			return (this.buffer[this.offset - 2] & 255) + ((this.buffer[this.offset - 1] & 255) << 8);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bs(" + ')');
		}
	}

	public int readUnsignedShort128(int i) {
		try {
			this.offset += 2;
			return ((this.buffer[this.offset - 2] & 255) << 8) + (this.buffer[this.offset - 1] - 128 & 255);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bp(" + ')');
		}
	}

	public int readUnsignedShortLE128(int i) {
		try {
			this.offset += 2;
			return ((this.buffer[this.offset - 1] & 255) << 8) + (this.buffer[this.offset - 2] - 128 & 255);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bv(" + ')');
		}
	}

	public int read24BitInteger(int i) {
		try {
			this.offset += 3;
			int runtimeexception = ((this.buffer[this.offset - 3] & 255) << 16) + ((this.buffer[this.offset - 2] & 255) << 8) + (this.buffer[this.offset - 1] & 255);
			if (runtimeexception > 8388607) {
				runtimeexception -= 16777216;
			}

			return runtimeexception;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.av(" + ')');
		}
	}

	public int read24BitUnsignedIntegerV2(byte i) {
		try {
			this.offset += 3;
			return (this.buffer[this.offset - 2] & 255) + ((this.buffer[this.offset - 3] & 255) << 16) + ((this.buffer[this.offset - 1] & 255) << 8);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bn(" + ')');
		}
	}

	public void writeIntLE(int i, byte i_60_) {
		try {
			this.buffer[this.offset++] = (byte) i;
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) (i >> 16);
			this.buffer[this.offset++] = (byte) (i >> 24);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.bi(" + ')');
		}
	}

	public byte readByte128(byte i) {
		try {
			return (byte) (this.buffer[this.offset++] - 128);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bl(" + ')');
		}
	}

	public void writeIntV2(int i) {
		try {
			this.buffer[this.offset++] = (byte) (i >> 16);
			this.buffer[this.offset++] = (byte) (i >> 24);
			this.buffer[this.offset++] = (byte) i;
			this.buffer[this.offset++] = (byte) (i >> 8);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bt(" + ')');
		}
	}

	public int readIntLE(int i) {
		try {
			this.offset += 4;
			return ((this.buffer[this.offset - 3] & 255) << 8) + ((this.buffer[this.offset - 1] & 255) << 24) + ((this.buffer[this.offset - 2] & 255) << 16) + (this.buffer[this.offset - 4] & 255);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bj(" + ')');
		}
	}

	public int readIntV2(byte i) {
		try {
			this.offset += 4;
			return (this.buffer[this.offset - 2] & 255) + ((this.buffer[this.offset - 1] & 255) << 8) + ((this.buffer[this.offset - 4] & 255) << 16) + ((this.buffer[this.offset - 3] & 255) << 24);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bz(" + ')');
		}
	}

	public void putTriByte(int i, byte i_65_) {
		try {
			this.buffer[this.offset++] = (byte) (i >> 16);
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) i;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.d(" + ')');
		}
	}

	public void applyRsa(BigInteger biginteger, BigInteger biginteger_66_, int i) {
		try {
			int runtimeexception = this.offset;
			this.offset = 0;
			byte[] is = new byte[runtimeexception];
			this.readBytes(is, 0, runtimeexception, -953523806);
			BigInteger biginteger_68_ = new BigInteger(is);
			BigInteger biginteger_69_ = biginteger_68_.modPow(biginteger, biginteger_66_);
			byte[] is_70_ = biginteger_69_.toByteArray();
			this.offset = 0;
			this.writeShort(is_70_.length, 16711935);
			this.writeBytes(is_70_, 0, is_70_.length, (short) -25461);
		}
		catch (RuntimeException var9) {
			throw Class346.method4175(var9, "acx.bd(" + ')');
		}
	}

	public RsByteBuffer2(int i) {
		this.buffer = Class416.method5589(i, (short) -31789);
		this.offset = 0;
	}

	public String readJagString(int i) {
		try {
			byte runtimeexception = this.buffer[this.offset++];
			if (runtimeexception != 0) {
				throw new IllegalStateException("");
			}
			else {
				int i_72_ = this.offset;

				while (this.buffer[this.offset++] != 0) {
					if (i != 681479919) {
						throw new IllegalStateException();
					}
				}

				int i_73_ = this.offset - i_72_ - 1;
				return i_73_ == 0 ? "" : Class52.method556(this.buffer, i_72_, i_73_, -1673599026);
			}
		}
		catch (RuntimeException var5) {
			throw Class346.method4175(var5, "acx.aw(" + ')');
		}
	}

	public int readIntV1(int i) {
		try {
			this.offset += 4;
			return ((this.buffer[this.offset - 1] & 255) << 16) + ((this.buffer[this.offset - 2] & 255) << 24) + ((this.buffer[this.offset - 4] & 255) << 8) + (this.buffer[this.offset - 3] & 255);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.br(" + ')');
		}
	}

	public void write128Byte(int i, byte i_74_) {
		try {
			this.buffer[this.offset++] = (byte) (128 - i);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.bc(" + ')');
		}
	}

	public void method3639(int i, int i_75_) {
		try {
			if ((i & -128) != 0) {
				if ((i & -16384) != 0) {
					if ((i & -2097152) != 0) {
						if ((i & -268435456) != 0) {
							this.writeByte(i >>> 28 | 128);
						}

						this.writeByte(i >>> 21 | 128);
					}

					this.writeByte(i >>> 14 | 128);
				}

				this.writeByte(i >>> 7 | 128);
			}

			this.writeByte(i & 127);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.ax(" + ')');
		}
	}

	public long method3640(int i) {
		try {
			long runtimeexception = (long) this.method3600(143621107) & 4294967295L;
			long l_76_ = (long) this.method3600(742659427) & 4294967295L;
			return (l_76_ << 32) + runtimeexception;
		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.az(" + ')');
		}
	}

	public void putJagString(String string, short i) {
		try {
			int runtimeexception = string.indexOf(0);
			if (runtimeexception >= 0) {
				throw new IllegalArgumentException("");
			}
			else {
				this.buffer[this.offset++] = 0;
				this.offset += Class361.method4304(string, 0, string.length(), this.buffer, this.offset, (byte) 102) * 116413311;
				this.buffer[this.offset++] = 0;
			}
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.c(" + ')');
		}
	}

	public void writeShort128(int i) {
		try {
			this.buffer[this.offset++] = (byte) (i >> 8);
			this.buffer[this.offset++] = (byte) (i + 128);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bq(" + ')');
		}
	}

	public int readInt(byte i) {
		try {
			this.offset += 4;
			return ((this.buffer[this.offset - 3] & 255) << 16) + ((this.buffer[this.offset - 4] & 255) << 24) + ((this.buffer[this.offset - 2] & 255) << 8) + (this.buffer[this.offset - 1] & 255);
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.at(" + ')');
		}
	}

	public void writeShortLE(int i, int i_79_) {
		try {
			this.buffer[this.offset++] = (byte) i;
			this.buffer[this.offset++] = (byte) (i >> 8);
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.bk(" + ')');
		}
	}

	public RsByteBuffer2(byte[] is) {
		this.buffer = is;
		this.offset = 0;
	}

	public int method3645(byte i) {
		int i_24_ = buffer[offset] & 0xff;
		if (i_24_ < 128)
			return readUnsignedByte() - 64;
		return readUnsignedShort() - 49152;
	}

	public int readBigSmart(int i) {
		try {
			if (this.buffer[this.offset] < 0) {
				return this.readInt((byte) 33) & Integer.MAX_VALUE;
			}
			else {
				int runtimeexception = this.readUnsignedShort();
				return 32767 == runtimeexception ? -1 : runtimeexception;
			}
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.an(" + ')');
		}
	}

	public long method3647(int i, byte i_82_) {
		try {
			--i;
			if (i >= 0 && i <= 7) {
				int runtimeexception = 8 * i;

				long l;
				for (l = 0L; runtimeexception >= 0; runtimeexception -= 8) {
					l |= ((long) this.buffer[this.offset++] & 255L) << runtimeexception;
				}

				return l;
			}
			else {
				throw new IllegalArgumentException();
			}
		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.as(" + ')');
		}
	}

	public void writeBytes(byte[] is, int i, int i_84_, short i_85_) {
		try {
			for (int runtimeexception = i; runtimeexception < i_84_ + i; ++runtimeexception) {
				this.buffer[this.offset++] = is[runtimeexception];
			}

		}
		catch (RuntimeException var6) {
			throw Class346.method4175(var6, "acx.m(" + ')');
		}
	}

	public void method3649(int i, byte i_87_) {
		try {
			this.buffer[this.offset - i - 1] = (byte) i;
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.o(" + ')');
		}
	}

	public void method3650(int i) {
		try {
			if (this.buffer != null) {
				Class201.method1900(this.buffer, -860028882);
			}

			this.buffer = null;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.b(" + ')');
		}
	}

	public int method3651(int i) {
		try {
			this.offset += 2;
			int runtimeexception = (this.buffer[this.offset - 2] & 255) + ((this.buffer[this.offset - 1] & 255) << 8);
			if (runtimeexception > 32767) {
				runtimeexception -= 65536;
			}

			return runtimeexception;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.bh(" + ')');
		}
	}

	public String method3652(int i) {
		try {
			if (this.buffer[this.offset] == 0) {
				this.offset += 116413311;
				return null;
			}
			else {
				return this.readString(541883117);
			}
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.ap(" + ')');
		}
	}

	static final void method3653(Class403 class403, int i) {
		try {
			String runtimeexception = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			class403.anObjectArray5240[(class403.anInt5241 += 969361751) * -203050393 - 1] = runtimeexception.toLowerCase();
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.zd(" + ')');
		}
	}

	static final void method3654(Class403 class403, int i) {
		try {
			int runtimeexception = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(runtimeexception, (byte) 28);
			Class119 class119 = Class389.aClass119Array4165[runtimeexception >> 16];
			AnimationDefinition.method4887(class105, class119, class403, (byte) -121);
		}
		catch (RuntimeException var5) {
			throw Class346.method4175(var5, "acx.dp(" + ')');
		}
	}

	static final void method3655(Class403 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5674(-484902399) && Class373.activeToolkit.method5032() ? 1 : 0;
		}
		catch (RuntimeException var3) {
			throw Class346.method4175(var3, "acx.anb(" + ')');
		}
	}

	static final void method3657(Class403 class403, byte i) {
		try {
			String runtimeexception = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			int i_93_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			if (-1 == i_93_) {
				throw new RuntimeException("");
			}
			else {
				class403.anObjectArray5240[(class403.anInt5241 += 969361751) * -203050393 - 1] = runtimeexception + (char) i_93_;
			}
		}
		catch (RuntimeException var4) {
			throw Class346.method4175(var4, "acx.za(" + ')');
		}
	}
}
