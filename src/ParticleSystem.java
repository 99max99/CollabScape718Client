
/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParticleSystem {
	int anInt3760;
	boolean aBoolean3761;
	Particle[] aClass302_Sub3_Sub1_Sub1Array3762;
	int anInt3763;
	long aLong3764;
	Class69 aClass69_3765;
	List aList3766;
	int anInt3767;
	List aList3768;
	int anInt3769;
	boolean aBoolean3770;
	boolean aBoolean3771;
	public boolean aBoolean3772 = false;
	long aLong3773;
	static boolean[] aBooleanArray3774 = new boolean[32];
	static boolean[] aBooleanArray3775 = new boolean[8];

	ParticleSystem(int i, boolean bool) {
		((ParticleSystem) this).aBoolean3761 = false;
		((ParticleSystem) this).anInt3763 = 0;
		((ParticleSystem) this).aList3766 = new LinkedList();
		((ParticleSystem) this).anInt3760 = 0;
		((ParticleSystem) this).aList3768 = new LinkedList();
		((ParticleSystem) this).anInt3769 = 0;
		((ParticleSystem) this).aBoolean3770 = false;
		((ParticleSystem) this).aBoolean3771 = false;
		((ParticleSystem) this).aClass69_3765 = new Class69();
		((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762 = new Particle[8192];
		method4219(i, bool);
	}

	void method4219(int i, boolean bool) {
		Class344.aList3683.add(this);
		((ParticleSystem) this).aLong3773 = (long) i;
		((ParticleSystem) this).aLong3764 = (long) i;
		((ParticleSystem) this).aBoolean3770 = true;
		((ParticleSystem) this).aBoolean3771 = bool;
	}

	public void method4220() {
		((ParticleSystem) this).aBoolean3770 = true;
	}

	public void method4221() {
		((ParticleSystem) this).aBoolean3761 = true;
	}

	boolean method4222(Toolkit class_ra, long l) {
		if (((ParticleSystem) this).aLong3773 != ((ParticleSystem) this).aLong3764)
			method4221();
		else
			method4230();
		if (l - ((ParticleSystem) this).aLong3773 > 750L) {
			method4223();
			return false;
		}
		int i = (int) (l - ((ParticleSystem) this).aLong3764);
		if (((ParticleSystem) this).aBoolean3770) {
			Iterator iterator = ((ParticleSystem) this).aList3766.iterator();
			while (iterator.hasNext()) {
				Class342 class342 = (Class342) iterator.next();
				for (int i_0_ = 0; i_0_ < (((Class342) class342).definition.anInt1852 * 1095253617); i_0_++)
					class342.method4147(class_ra, l, 1, !((ParticleSystem) this).aBoolean3761, (byte) 63);
			}
			((ParticleSystem) this).aBoolean3770 = false;
		}
		Iterator iterator = ((ParticleSystem) this).aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4147(class_ra, l, i, !((ParticleSystem) this).aBoolean3761, (byte) 45);
		}
		((ParticleSystem) this).aLong3764 = l;
		return true;
	}

	void method4223() {
		aBoolean3772 = true;
		Iterator iterator = ((ParticleSystem) this).aList3768.iterator();
		while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if ((((Class298_Sub45) class298_sub45).aClass190_7514.anInt1940 * -1955592777) == 1)
				class298_sub45.method2839(-1460969981);
		}
		for (int i = 0; i < ((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762[i] != null) {
				((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762[i].method3726();
				((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762[i] = null;
			}
		}
		((ParticleSystem) this).anInt3763 = 0;
		((ParticleSystem) this).aList3766 = new LinkedList();
		((ParticleSystem) this).anInt3760 = 0;
		((ParticleSystem) this).aList3768 = new LinkedList();
		((ParticleSystem) this).anInt3769 = 0;
	}

	void method4224(Toolkit class_ra, EmitterConfig[] class85s, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBooleanArray3774[i] = false;
		Iterator iterator = ((ParticleSystem) this).aList3766.iterator();
		while_84_: while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			if (class85s != null) {
				for (int i = 0; i < class85s.length; i++) {
					if (((Class342) class342).aClass85_3662 == class85s[i]
							|| (((Class342) class342).aClass85_3662 == class85s[i].aClass85_776)) {
						aBooleanArray3774[i] = true;
						class342.method4146((byte) -40);
						((Class342) class342).aBoolean3664 = false;
						continue while_84_;
					}
				}
			}
			if (!bool) {
				if (((Class342) class342).anInt3652 * -917784967 == 0) {
					iterator.remove();
					((ParticleSystem) this).anInt3760--;
				} else
					((Class342) class342).aBoolean3664 = true;
			}
		}
		if (class85s != null) {
			for (int i = 0; (i < class85s.length && i != 32 && ((ParticleSystem) this).anInt3760 != 32); i++) {
				if (!aBooleanArray3774[i]) {
					Class342 class342 = new Class342(class_ra, class85s[i], this, ((ParticleSystem) this).aLong3773);
					((ParticleSystem) this).aList3766.add(class342);
					((ParticleSystem) this).anInt3760++;
					aBooleanArray3774[i] = true;
				}
			}
		}
	}

	void method4225(MagnetConfig[] class68s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBooleanArray3775[i] = false;
		Iterator iterator = ((ParticleSystem) this).aList3768.iterator();
		while_85_: while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if (class68s != null) {
				for (int i = 0; i < class68s.length; i++) {
					if ((((Class298_Sub45) class298_sub45).aClass68_7518 == class68s[i])
							|| (((Class298_Sub45) class298_sub45).aClass68_7518 == class68s[i].aClass68_672)) {
						aBooleanArray3775[i] = true;
						class298_sub45.method3532(-219401060);
						continue while_85_;
					}
				}
			}
			if (!bool) {
				class298_sub45.method2839(-1460969981);
				((ParticleSystem) this).anInt3769--;
				if (class298_sub45.method2840(-629325116)) {
					class298_sub45.method2839(-1460969981);
					Class344.anInt3685 -= 817588661;
				}
			}
		}
		if (class68s != null) {
			for (int i = 0; (i < class68s.length && i != 8 && ((ParticleSystem) this).anInt3769 != 8); i++) {
				if (!aBooleanArray3775[i]) {
					Class298_Sub45 class298_sub45 = null;
					if ((class68s[i].method775((byte) 3).anInt1940 * -1955592777) == 1
							&& Class344.anInt3685 * -1237648227 < 32) {
						class298_sub45 = new Class298_Sub45(class68s[i], this);
						Class344.aClass437_3684.method5817(class298_sub45, (long) (class68s[i].skin * 617796067));
						Class344.anInt3685 += 817588661;
					}
					if (class298_sub45 == null)
						class298_sub45 = new Class298_Sub45(class68s[i], this);
					((ParticleSystem) this).aList3768.add(class298_sub45);
					((ParticleSystem) this).anInt3769++;
					aBooleanArray3775[i] = true;
				}
			}
		}
	}

	public Class69 method4226() {
		((ParticleSystem) this).aClass69_3765.aClass448_680.method5907(198538836);
		for (int i = 0; i < ((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762[i] != null
					&& (((Particle) ((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762[i]).emitter) != null)
				((ParticleSystem) this).aClass69_3765.aClass448_680
						.method5908(((ParticleSystem) this).aClass302_Sub3_Sub1_Sub1Array3762[i], (byte) -89);
		}
		return ((ParticleSystem) this).aClass69_3765;
	}

	public void method4227(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((ParticleSystem) this).anInt3767 = i;
	}

	void method4228(Class331 class331, Toolkit class_ra) {
		((ParticleSystem) this).aClass69_3765.aClass448_680.method5907(-1313547025);
		Iterator iterator = ((ParticleSystem) this).aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4148(class331, class_ra, ((ParticleSystem) this).aLong3764);
		}
	}

	public Class69 method4229() {
		return ((ParticleSystem) this).aClass69_3765;
	}

	void method4230() {
		((ParticleSystem) this).aBoolean3761 = false;
	}

	public void method4231(Toolkit class_ra, long l, EmitterConfig[] class85s, MagnetConfig[] class68s, boolean bool) {
		if (!aBoolean3772) {
			method4224(class_ra, class85s, bool);
			method4225(class68s, bool);
			((ParticleSystem) this).aLong3773 = l;
		}
	}

	public static ParticleSystem method4232(int i, boolean bool) {
		if (Class344.anInt3681 * -1264407527 != Class344.anInt3680 * 274948937) {
			ParticleSystem class351 = Class344.aClass351Array3679[Class344.anInt3680 * 274948937];
			Class344.anInt3680 = ((Class344.anInt3680 * 274948937 + 1
					& Class65.anIntArray658[Class344.anInt3675 * 1197525581]) * 172162809);
			class351.method4219(i, bool);
			return class351;
		}
		return new ParticleSystem(i, bool);
	}

	public void method4233(long l) {
		((ParticleSystem) this).aLong3773 = l;
	}
}
