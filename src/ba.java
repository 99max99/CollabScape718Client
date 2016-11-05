/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ba extends Class_v implements Interface25 {
	long nativeid;

	ba(ja var_ja, int i) {
		sa(var_ja, i);
	}

	native void sa(ja var_ja, int i);

	protected void finalize() {
		try {
			if (((ba) this).nativeid != 0L)
				Class71.method809(this, (short) -1633);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception,
					new StringBuilder().append("ba.finalize(").append(')').toString());
		}
	}

	public native void ma(boolean bool);

	native void ha();

	native void u();

	public native void z(boolean bool);

	native void a(ja var_ja, int i);

	native void f();

	native void b();

	native void i();

	native void p();
}
