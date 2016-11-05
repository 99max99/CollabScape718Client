/* Class247_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class247_Sub1 extends Class247 {
    Class318 connection;

    public void method2355() {
	if (((Class247_Sub1) this).connection != null) {
	    try {
		((Class247_Sub1) this).conbuffer.index = 0;
		((Class247_Sub1) this).conbuffer.writeByte(7);
		((Class247_Sub1) this).conbuffer.writeMedInt(0L);
		((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 990569572);
	    }
	    catch (IOException ioexception) {
		try {
		    ((Class247_Sub1) this).connection.method3860(-2134679805);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
		anInt2735 += 686188557;
		anInt2745 = -1707252930;
	    }
	}
    }

    void method2359(int i) {
	try {
	    try {
		((Class247_Sub1) this).connection.method3860(-2144712239);
	    }
	    catch (Exception exception) {
		/* empty */
	    }
	    ((Class247_Sub1) this).connection = null;
	    anInt2735 += 686188557;
	    anInt2745 = 1293857183;
	    ((Class247_Sub1) this).aByte2743 = (byte) (int) (Math.random() * 255.0 + 1.0);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.k(").append(')').toString());
	}
    }

    public boolean method2351(int i) {
	try {
	    if (null != ((Class247_Sub1) this).connection) {
		long l = Class122.method1319((byte) 1);
		int i_0_ = (int) (l - (5958027995888260733L * ((Class247_Sub1) this).aLong2741));
		((Class247_Sub1) this).aLong2741 = l * 2125194141775565525L;
		if (i_0_ > 200)
		    i_0_ = 200;
		((Class247_Sub1) this).idle_timer += i_0_ * 506122611;
		if (987675579 * ((Class247_Sub1) this).idle_timer > 30000) {
		    try {
			((Class247_Sub1) this).connection.method3860(-2044434923);
		    }
		    catch (Exception exception) {
			/* empty */
		    }
		    ((Class247_Sub1) this).connection = null;
		}
	    }
	    if (((Class247_Sub1) this).connection == null) {
		if (method2348(1210007977) == 0 && method2341(899560496) == 0)
		    return true;
		return false;
	    }
	    boolean bool;
	    try {
		for (RemoteRequest req = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2736.first(1668468099)); null != req; req = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2736.next(-1920602300))) {
		    ((Class247_Sub1) this).conbuffer.index = 0;
		    ((Class247_Sub1) this).conbuffer.writeByte(1);
		    ((Class247_Sub1) this).conbuffer.writeMedInt(-5533549728640346679L * req.aLong7406);
		    ((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1349162562);
		    ((Class247_Sub1) this).priority_files.add(req, (byte) -109);
		}
		for (RemoteRequest req = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2738.first(-1137298228)); null != req; req = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2738.next(1503165244))) {
		    ((Class247_Sub1) this).conbuffer.index = 0;
		    ((Class247_Sub1) this).conbuffer.writeByte(0);
		    ((Class247_Sub1) this).conbuffer.writeMedInt(req.aLong7406 * -5533549728640346679L);
		    ((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 385615633);
		    ((Class247_Sub1) this).nonpriority_files.add(req, (byte) -76);
		}
		for (int i_1_ = 0; i_1_ < 100; i_1_++) {
		    int available = ((Class247_Sub1) this).connection.available(1329342411);
		    if (available < 0)
			throw new IOException();
		    if (available == 0) {
			break;
		    }
		    ((Class247_Sub1) this).idle_timer = 0;
		    int needed = 0;
		    if (null == (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747))
			needed = 10;
		    else if (0 == (1488798733 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005)))
			needed = 1;
		    if (needed > 0) {
			int len = needed - ((((Class247_Sub1) this).header_buffer.index) * 385051775);
			if (len > available)
			    len = available;
			((Class247_Sub1) this).connection.readBytes((((Class247_Sub1) this).header_buffer.buffer), 385051775 * (((Class247_Sub1) this).header_buffer.index), len, (byte) 56);
			if (((Class247_Sub1) this).aByte2743 != 0) {
			    for (int i_5_ = 0; i_5_ < len; i_5_++)
				((Class247_Sub1) this).header_buffer.buffer[((((Class247_Sub1) this).header_buffer.index) * 385051775) + i_5_] ^= ((Class247_Sub1) this).aByte2743;
			}
			((Class247_Sub1) this).header_buffer.index += 116413311 * len;
			if ((((Class247_Sub1) this).header_buffer.index) * 385051775 < needed) {
			    if (i != -358267640) {
				/* empty */
			    }
			} else if (null == (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)) {
			    ((Class247_Sub1) this).header_buffer.index = 0;
			    int i_6_ = ((Class247_Sub1) this).header_buffer.readUnsignedByte();
			    int i_7_ = ((Class247_Sub1) this).header_buffer.readInt((byte) -46);
			    int i_8_ = ((Class247_Sub1) this).header_buffer.readUnsignedByte();
			    int i_9_ = ((Class247_Sub1) this).header_buffer.readInt((byte) 41);
			    int i_10_ = i_8_ & 0x7f;
			    boolean bool_11_ = 0 != (i_8_ & 0x80);
			    long l = ((long) i_6_ << 32) + (long) i_7_;
			    Object object = null;
			    RemoteRequest class298_sub37_sub16_sub1;
			    if (bool_11_) {
				for (class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.first(737223474)); null != class298_sub37_sub16_sub1; class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.next(-1305306888))) {
				    if ((-5533549728640346679L * class298_sub37_sub16_sub1.aLong7406) == l) {
					if (i != -358267640)
					    throw new IllegalStateException();
					break;
				    }
				}
			    } else {
				for (class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.first(-1834989032)); null != class298_sub37_sub16_sub1; class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.next(247272517))) {
				    if (l == (class298_sub37_sub16_sub1.aLong7406 * -5533549728640346679L)) {
					if (i != -358267640)
					    throw new IllegalStateException();
					break;
				    }
				}
			    }
			    if (class298_sub37_sub16_sub1 == null)
			    	throw new IOException();
			    int i_12_ = 0 == i_10_ ? 5 : 9;
			    ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = class298_sub37_sub16_sub1;
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004 = (new RsByteBuffer((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aByte10003) + (i_12_ + i_9_)));
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.writeByte(i_10_);
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.writeInt(i_9_, 756032699);
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 = 154839986;
			    ((Class247_Sub1) this).header_buffer.index = 0;
			} else if (0 == (1488798733 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005))) {
			    if (-1 == (((Class247_Sub1) this).header_buffer.buffer[0])) {
				((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 = 1733470917;
				((Class247_Sub1) this).header_buffer.index = 0;
			    } else
				((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
			} else
			    throw new IOException();
		    } else {
			int i_13_ = ((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.buffer).length - (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aByte10003));
			int i_14_ = 512 - (1488798733 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005));
			if (i_14_ > i_13_ - ((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index) * 385051775))
			    i_14_ = (i_13_ - (385051775 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index)));
			if (i_14_ > available)
			    i_14_ = available;
			((Class247_Sub1) this).connection.readBytes((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.buffer), 385051775 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index), i_14_, (byte) -56);
			if (0 != ((Class247_Sub1) this).aByte2743) {
			    for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
				((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.buffer[((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index) * 385051775) + i_15_] ^= ((Class247_Sub1) this).aByte2743;
			}
			((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index += 116413311 * i_14_;
			((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 += i_14_ * 1733470917;
			if ((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index) * 385051775 == i_13_) {
			    ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747.method3402(-278229196);
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aBoolean9670 = false;
			    ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
			} else if (512 == (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005) * 1488798733)
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 = 0;
		    }
		}
		bool = true;
	    }
	    catch (IOException ioexception) {
		ioexception.printStackTrace();
		try {
		    ((Class247_Sub1) this).connection.method3860(-2108190565);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
		anInt2735 += 686188557;
		anInt2745 = -1707252930;
		if (method2348(1098571032) == 0 && method2341(-1686765895) == 0)
		    return true;
		return false;
	    }
	    return bool;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.d(").append(')').toString());
	}
    }

    void method2350() {
	try {
	    ((Class247_Sub1) this).connection.method3860(-2125954897);
	}
	catch (Exception exception) {
	    /* empty */
	}
	((Class247_Sub1) this).connection = null;
	anInt2735 += 686188557;
	anInt2745 = 1293857183;
	((Class247_Sub1) this).aByte2743 = (byte) (int) (Math.random() * 255.0 + 1.0);
    }

    public void method2343(boolean bool, int i) {
	try {
	    if (((Class247_Sub1) this).connection != null) {
		try {
		    ((Class247_Sub1) this).conbuffer.index = 0;
		    ((Class247_Sub1) this).conbuffer.writeByte(bool ? 2 : 3);
		    ((Class247_Sub1) this).conbuffer.writeMedInt(0L);
		    ((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1744086498);
		}
		catch (IOException ioexception) {
		    try {
			((Class247_Sub1) this).connection.method3860(-2080652682);
		    }
		    catch (Exception exception) {
			/* empty */
		    }
		    ((Class247_Sub1) this).connection = null;
		    anInt2735 += 686188557;
		    anInt2745 = -1707252930;
		}
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.x(").append(')').toString());
	}
    }

    public void method2345(byte i) {
	try {
	    if (((Class247_Sub1) this).connection != null) {
		try {
		    ((Class247_Sub1) this).conbuffer.index = 0;
		    ((Class247_Sub1) this).conbuffer.writeByte(7);
		    ((Class247_Sub1) this).conbuffer.writeMedInt(0L);
		    ((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1169980549);
		}
		catch (IOException ioexception) {
		    try {
			((Class247_Sub1) this).connection.method3860(-2123957197);
		    }
		    catch (Exception exception) {
			/* empty */
		    }
		    ((Class247_Sub1) this).connection = null;
		    anInt2735 += 686188557;
		    anInt2745 = -1707252930;
		}
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.r(").append(')').toString());
	}
    }

    public boolean method2349() {
	if (null != ((Class247_Sub1) this).connection) {
	    long l = Class122.method1319((byte) 1);
	    int i = (int) (l - (5958027995888260733L * ((Class247_Sub1) this).aLong2741));
	    ((Class247_Sub1) this).aLong2741 = l * 2125194141775565525L;
	    if (i > 200)
		i = 200;
	    ((Class247_Sub1) this).idle_timer += i * 506122611;
	    if (987675579 * ((Class247_Sub1) this).idle_timer > 30000) {
		try {
		    ((Class247_Sub1) this).connection.method3860(-2093256937);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
	    }
	}
	if (((Class247_Sub1) this).connection == null) {
	    if (method2348(1287680829) == 0 && method2341(-114453322) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (RemoteRequest class298_sub37_sub16_sub1 = (RemoteRequest) ((Class247_Sub1) this).aClass461_2736.first(1086397119); null != class298_sub37_sub16_sub1; class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2736.next(1266046110))) {
		((Class247_Sub1) this).conbuffer.index = 0;
		((Class247_Sub1) this).conbuffer.writeByte(1);
		((Class247_Sub1) this).conbuffer.writeMedInt(-5533549728640346679L * class298_sub37_sub16_sub1.aLong7406);
		((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1284911720);
		((Class247_Sub1) this).priority_files.add(class298_sub37_sub16_sub1, (byte) -76);
	    }
	    for (RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2738.first(-1912843547)); null != class298_sub37_sub16_sub1; class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).aClass461_2738.next(654070036))) {
		((Class247_Sub1) this).conbuffer.index = 0;
		((Class247_Sub1) this).conbuffer.writeByte(0);
		((Class247_Sub1) this).conbuffer.writeMedInt(class298_sub37_sub16_sub1.aLong7406 * -5533549728640346679L);
		((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1283304286);
		((Class247_Sub1) this).nonpriority_files.add(class298_sub37_sub16_sub1, (byte) -44);
	    }
	    for (int i = 0; i < 100; i++) {
		int i_16_ = ((Class247_Sub1) this).connection.available(2130771659);
		if (i_16_ < 0)
		    throw new IOException();
		if (i_16_ == 0)
		    break;
		((Class247_Sub1) this).idle_timer = 0;
		int i_17_ = 0;
		if (null == ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)
		    i_17_ = 10;
		else if (0 == 1488798733 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005))
		    i_17_ = 1;
		if (i_17_ > 0) {
		    int i_18_ = i_17_ - (((Class247_Sub1) this).header_buffer.index) * 385051775;
		    if (i_18_ > i_16_)
			i_18_ = i_16_;
		    ((Class247_Sub1) this).connection.readBytes((((Class247_Sub1) this).header_buffer.buffer), 385051775 * (((Class247_Sub1) this).header_buffer.index), i_18_, (byte) 56);
		    if (((Class247_Sub1) this).aByte2743 != 0) {
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
			    ((Class247_Sub1) this).header_buffer.buffer[(((Class247_Sub1) this).header_buffer.index) * 385051775 + i_19_] ^= ((Class247_Sub1) this).aByte2743;
		    }
		    ((Class247_Sub1) this).header_buffer.index += 116413311 * i_18_;
		    if ((((Class247_Sub1) this).header_buffer.index * 385051775) >= i_17_) {
			if (null == (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)) {
			    ((Class247_Sub1) this).header_buffer.index = 0;
			    int i_20_ = ((Class247_Sub1) this).header_buffer.readUnsignedByte();
			    int i_21_ = ((Class247_Sub1) this).header_buffer.readInt((byte) 7);
			    int i_22_ = ((Class247_Sub1) this).header_buffer.readUnsignedByte();
			    int i_23_ = ((Class247_Sub1) this).header_buffer.readInt((byte) 35);
			    int i_24_ = i_22_ & 0x7f;
			    boolean bool_25_ = 0 != (i_22_ & 0x80);
			    long l = ((long) i_20_ << 32) + (long) i_21_;
			    Object object = null;
			    RemoteRequest class298_sub37_sub16_sub1;
			    if (bool_25_) {
				for (class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.first(-456659045)); (null != class298_sub37_sub16_sub1 && (-5533549728640346679L * (class298_sub37_sub16_sub1.aLong7406)) != l); class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.next(-434579116))) {
				    /* empty */
				}
			    } else {
				for (class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.first(1426068327)); (null != class298_sub37_sub16_sub1 && l != ((class298_sub37_sub16_sub1.aLong7406) * -5533549728640346679L)); class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.next(932547542))) {
				    /* empty */
				}
			    }
			    if (class298_sub37_sub16_sub1 == null)
				throw new IOException();
			    int i_26_ = 0 == i_24_ ? 5 : 9;
			    ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = class298_sub37_sub16_sub1;
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004 = (new RsByteBuffer((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aByte10003) + (i_26_ + i_23_)));
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.writeByte(i_24_);
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.writeInt(i_23_, -19456274);
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 = 154839986;
			    ((Class247_Sub1) this).header_buffer.index = 0;
			} else if (0 == (1488798733 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005))) {
			    if (-1 == (((Class247_Sub1) this).header_buffer.buffer[0])) {
				((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 = 1733470917;
				((Class247_Sub1) this).header_buffer.index = 0;
			    } else
				((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
			} else
			    throw new IOException();
		    }
		} else {
		    int i_27_ = ((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.buffer).length - ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aByte10003);
		    int i_28_ = (512 - 1488798733 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005));
		    if (i_28_ > i_27_ - ((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index) * 385051775))
			i_28_ = i_27_ - (385051775 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index));
		    if (i_28_ > i_16_)
			i_28_ = i_16_;
		    ((Class247_Sub1) this).connection.readBytes((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.buffer), 385051775 * (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index), i_28_, (byte) -75);
		    if (0 != ((Class247_Sub1) this).aByte2743) {
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
			    ((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.buffer[((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index) * 385051775) + i_29_] ^= ((Class247_Sub1) this).aByte2743;
		    }
		    ((RemoteRequest) ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747).aClass298_Sub53_10004.index += 116413311 * i_28_;
		    ((RemoteRequest) ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747).anInt10005 += i_28_ * 1733470917;
		    if ((((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aClass298_Sub53_10004.index) * 385051775 == i_27_) {
			((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747.method3402(494534453);
			((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).aBoolean9670 = false;
			((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
		    } else if (512 == (((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005) * 1488798733)
			((RemoteRequest) (((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747)).anInt10005 = 0;
		}
	    }
	    bool = true;
	}
	catch (IOException ioexception) {
	    ioexception.printStackTrace();
	    try {
		((Class247_Sub1) this).connection.method3860(-2123570388);
	    }
	    catch (Exception exception) {
		/* empty */
	    }
	    ((Class247_Sub1) this).connection = null;
	    anInt2735 += 686188557;
	    anInt2745 = -1707252930;
	    if (method2348(1136063774) == 0 && method2341(-2006233546) == 0)
		return true;
	    return false;
	}
	return bool;
    }

    public void method2353(short i) {
	try {
	    if (((Class247_Sub1) this).connection != null)
		((Class247_Sub1) this).connection.method3867((byte) 53);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.n(").append(')').toString());
	}
    }

    void method2337() {
	try {
	    ((Class247_Sub1) this).connection.method3860(-2136011625);
	}
	catch (Exception exception) {
	    /* empty */
	}
	((Class247_Sub1) this).connection = null;
	anInt2735 += 686188557;
	anInt2745 = 1293857183;
	((Class247_Sub1) this).aByte2743 = (byte) (int) (Math.random() * 255.0 + 1.0);
    }

    public void method2358() {
	if (((Class247_Sub1) this).connection != null)
	    ((Class247_Sub1) this).connection.method3860(-2053952452);
    }

    public void method2352(Object object, boolean bool) {
	if (((Class247_Sub1) this).connection != null) {
	    try {
		((Class247_Sub1) this).connection.method3860(-2106353350);
	    }
	    catch (Exception exception) {
		/* empty */
	    }
	    ((Class247_Sub1) this).connection = null;
	}
	((Class247_Sub1) this).connection = (Class318) object;
	method2377((byte) -1);
	method2343(bool, -1530614013);
	((Class247_Sub1) this).header_buffer.index = 0;
	((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
	for (;;) {
	    RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.method5983(-2134403806));
	    if (class298_sub37_sub16_sub1 == null)
		break;
	    ((Class247_Sub1) this).aClass461_2736.add(class298_sub37_sub16_sub1, (byte) -83);
	}
	for (;;) {
	    RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.method5983(-2132241559));
	    if (class298_sub37_sub16_sub1 == null)
		break;
	    ((Class247_Sub1) this).aClass461_2738.add(class298_sub37_sub16_sub1, (byte) -88);
	}
	if (0 != ((Class247_Sub1) this).aByte2743) {
	    try {
		((Class247_Sub1) this).conbuffer.index = 0;
		((Class247_Sub1) this).conbuffer.writeByte(4);
		((Class247_Sub1) this).conbuffer.writeByte(((Class247_Sub1) this).aByte2743);
		((Class247_Sub1) this).conbuffer.writeInt(0, 989665208);
		((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 912447224);
	    }
	    catch (IOException ioexception) {
		try {
		    ((Class247_Sub1) this).connection.method3860(-2096143374);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
		anInt2735 += 686188557;
		anInt2745 = -1707252930;
	    }
	}
	((Class247_Sub1) this).idle_timer = 0;
	((Class247_Sub1) this).aLong2741 = Class122.method1319((byte) 1) * 2125194141775565525L;
    }

    public void method2342(Object object, boolean bool) {
	if (((Class247_Sub1) this).connection != null) {
	    try {
		((Class247_Sub1) this).connection.method3860(-2051664325);
	    }
	    catch (Exception exception) {
		/* empty */
	    }
	    ((Class247_Sub1) this).connection = null;
	}
	((Class247_Sub1) this).connection = (Class318) object;
	method2377((byte) -1);
	method2343(bool, -151384054);
	((Class247_Sub1) this).header_buffer.index = 0;
	((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
	for (;;) {
	    RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.method5983(-2120333543));
	    if (class298_sub37_sub16_sub1 == null)
		break;
	    ((Class247_Sub1) this).aClass461_2736.add(class298_sub37_sub16_sub1, (byte) -68);
	}
	for (;;) {
	    RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.method5983(-2119072430));
	    if (class298_sub37_sub16_sub1 == null)
		break;
	    ((Class247_Sub1) this).aClass461_2738.add(class298_sub37_sub16_sub1, (byte) 2);
	}
	if (0 != ((Class247_Sub1) this).aByte2743) {
	    try {
		((Class247_Sub1) this).conbuffer.index = 0;
		((Class247_Sub1) this).conbuffer.writeByte(4);
		((Class247_Sub1) this).conbuffer.writeByte(((Class247_Sub1) this).aByte2743);
		((Class247_Sub1) this).conbuffer.writeInt(0, -1509704923);
		((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1793980922);
	    }
	    catch (IOException ioexception) {
		try {
		    ((Class247_Sub1) this).connection.method3860(-2133771313);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
		anInt2735 += 686188557;
		anInt2745 = -1707252930;
	    }
	}
	((Class247_Sub1) this).idle_timer = 0;
	((Class247_Sub1) this).aLong2741 = Class122.method1319((byte) 1) * 2125194141775565525L;
    }

    public void method2354(boolean bool) {
	if (((Class247_Sub1) this).connection != null) {
	    try {
		((Class247_Sub1) this).conbuffer.index = 0;
		((Class247_Sub1) this).conbuffer.writeByte(bool ? 2 : 3);
		((Class247_Sub1) this).conbuffer.writeMedInt(0L);
		((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 677572641);
	    }
	    catch (IOException ioexception) {
		try {
		    ((Class247_Sub1) this).connection.method3860(-2112400508);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
		anInt2735 += 686188557;
		anInt2745 = -1707252930;
	    }
	}
    }

    public void method2346(byte i) {
	try {
	    if (((Class247_Sub1) this).connection != null)
		((Class247_Sub1) this).connection.method3860(-2087316954);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.q(").append(')').toString());
	}
    }

    public void method2356() {
	if (((Class247_Sub1) this).connection != null)
	    ((Class247_Sub1) this).connection.method3860(-2050259999);
    }

    public void method2357() {
	if (((Class247_Sub1) this).connection != null)
	    ((Class247_Sub1) this).connection.method3860(-2069186230);
    }

    public void method2361() {
	if (((Class247_Sub1) this).connection != null)
	    ((Class247_Sub1) this).connection.method3867((byte) 90);
    }

    public void method2339() {
	if (((Class247_Sub1) this).connection != null)
	    ((Class247_Sub1) this).connection.method3860(-2132893999);
    }

    public void method2360() {
	if (((Class247_Sub1) this).connection != null)
	    ((Class247_Sub1) this).connection.method3867((byte) 35);
    }

    void method2377(byte i) {
	try {
	    if (((Class247_Sub1) this).connection != null) {
		try {
		    ((Class247_Sub1) this).conbuffer.index = 0;
		    ((Class247_Sub1) this).conbuffer.writeByte(6);
		    ((Class247_Sub1) this).conbuffer.putTriByte(3, (byte) 103);
		    ((Class247_Sub1) this).conbuffer.writeShort(0, 16711935);
		    ((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 759871193);
		}
		catch (IOException ioexception) {
		    try {
			((Class247_Sub1) this).connection.method3860(-2111171220);
		    }
		    catch (Exception exception) {
			/* empty */
		    }
		    ((Class247_Sub1) this).connection = null;
		    anInt2735 += 686188557;
		    anInt2745 = -1707252930;
		}
	    }
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.ah(").append(')').toString());
	}
    }

    public void method2344(Object object, boolean bool, int i) {
	try {
	    if (((Class247_Sub1) this).connection != null) {
		try {
		    ((Class247_Sub1) this).connection.method3860(-2074632995);
		}
		catch (Exception exception) {
		    /* empty */
		}
		((Class247_Sub1) this).connection = null;
	    }
	    ((Class247_Sub1) this).connection = (Class318) object;
	    method2377((byte) -1);
	    method2343(bool, -1391987547);
	    ((Class247_Sub1) this).header_buffer.index = 0;
	    ((Class247_Sub1) this).aClass298_Sub37_Sub16_Sub1_2747 = null;
	    for (;;) {
		RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).priority_files.method5983(-2123417897));
		if (class298_sub37_sub16_sub1 == null) {
		    if (i <= 1988546158) {
			/* empty */
		    }
		    break;
		}
		((Class247_Sub1) this).aClass461_2736.add(class298_sub37_sub16_sub1, (byte) -106);
	    }
	    for (;;) {
		RemoteRequest class298_sub37_sub16_sub1 = ((RemoteRequest) ((Class247_Sub1) this).nonpriority_files.method5983(-2132898612));
		if (class298_sub37_sub16_sub1 == null) {
		    if (i <= 1988546158) {
			/* empty */
		    }
		    break;
		}
		((Class247_Sub1) this).aClass461_2738.add(class298_sub37_sub16_sub1, (byte) -21);
	    }
	    if (0 != ((Class247_Sub1) this).aByte2743) {
		try {
		    ((Class247_Sub1) this).conbuffer.index = 0;
		    ((Class247_Sub1) this).conbuffer.writeByte(4);
		    ((Class247_Sub1) this).conbuffer.writeByte(((Class247_Sub1) this).aByte2743);
		    ((Class247_Sub1) this).conbuffer.writeInt(0, -1954980636);
		    ((Class247_Sub1) this).connection.write((((Class247_Sub1) this).conbuffer.buffer), 0, (((Class247_Sub1) this).conbuffer.buffer).length, 1173685692);
		}
		catch (IOException ioexception) {
		    try {
			((Class247_Sub1) this).connection.method3860(-2053859803);
		    }
		    catch (Exception exception) {
			/* empty */
		    }
		    ((Class247_Sub1) this).connection = null;
		    anInt2735 += 686188557;
		    anInt2745 = -1707252930;
		}
	    }
	    ((Class247_Sub1) this).idle_timer = 0;
	    ((Class247_Sub1) this).aLong2741 = Class122.method1319((byte) 1) * 2125194141775565525L;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.u(").append(')').toString());
	}
    }

    static final void method2378(Class403 class403, int i) {
	try {
	    Class390 class390 = (((Class403) class403).aBoolean5261 ? ((Class403) class403).aClass390_5247 : ((Class403) class403).aClass390_5246);
	    IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
	    Class119 class119 = ((Class390) class390).aClass119_4167;
	    OutcommingPacket.method1890(class105, class119, class403, -724499626);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("aae.li(").append(')').toString());
	}
    }
}
