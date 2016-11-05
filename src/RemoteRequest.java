/* Class298_Sub37_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RemoteRequest extends Class298_Sub37_Sub16 {
	byte aByte10003;
	RsByteBuffer aClass298_Sub53_10004;
	int anInt10005;

	int method3472() {
		if (null == ((RemoteRequest) this).aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (((RemoteRequest) this).aClass298_Sub53_10004.index)
				/ ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length - ((RemoteRequest) this).aByte10003));
	}

	byte[] method3465(short i) {
		try {
			if (((RemoteRequest) this).aBoolean9670 || ((((RemoteRequest) this).aClass298_Sub53_10004.index)
					* 385051775 < ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length
							- ((RemoteRequest) this).aByte10003)))
				throw new RuntimeException();
			return (((RemoteRequest) this).aClass298_Sub53_10004.buffer);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akb.a(").append(')').toString());
		}
	}

	int method3468(int i) {
		try {
			if (null == ((RemoteRequest) this).aClass298_Sub53_10004)
				return 0;
			return (-149528164 * (((RemoteRequest) this).aClass298_Sub53_10004.index)
					/ ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length
							- ((RemoteRequest) this).aByte10003));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akb.f(").append(')').toString());
		}
	}

	byte[] method3467() {
		if (((RemoteRequest) this).aBoolean9670 || ((((RemoteRequest) this).aClass298_Sub53_10004.index)
				* 385051775 < ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length
						- ((RemoteRequest) this).aByte10003)))
			throw new RuntimeException();
		return (((RemoteRequest) this).aClass298_Sub53_10004.buffer);
	}

	byte[] method3466() {
		if (((RemoteRequest) this).aBoolean9670 || ((((RemoteRequest) this).aClass298_Sub53_10004.index)
				* 385051775 < ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length
						- ((RemoteRequest) this).aByte10003)))
			throw new RuntimeException();
		return (((RemoteRequest) this).aClass298_Sub53_10004.buffer);
	}

	byte[] method3469() {
		if (((RemoteRequest) this).aBoolean9670 || ((((RemoteRequest) this).aClass298_Sub53_10004.index)
				* 385051775 < ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length
						- ((RemoteRequest) this).aByte10003)))
			throw new RuntimeException();
		return (((RemoteRequest) this).aClass298_Sub53_10004.buffer);
	}

	int method3470() {
		if (null == ((RemoteRequest) this).aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (((RemoteRequest) this).aClass298_Sub53_10004.index)
				/ ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length - ((RemoteRequest) this).aByte10003));
	}

	int method3471() {
		if (null == ((RemoteRequest) this).aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (((RemoteRequest) this).aClass298_Sub53_10004.index)
				/ ((((RemoteRequest) this).aClass298_Sub53_10004.buffer).length - ((RemoteRequest) this).aByte10003));
	}

	RemoteRequest() {
		/* empty */
	}
}
