package perhitunganBangun;

public class Lingkaran {
	double luas, keliling, phi, jariJari, volume, tinggi;
	
	public Lingkaran () {
		
	}
	
	public Lingkaran (double lu, double k, double p, double r, double v, double t) {
		luas = lu;
		keliling = k;
		phi = p;
		jariJari = r;
		volume = v;
		tinggi = t;
	}
	
	void printLuasLingkaran (double p, double r) {
		double lu = p*r*r;
		System.out.println("Luas lingkaran tersebut adalah "+ lu);
	}
	
	void printKelilingLingkaran (double p, double r) {
		double k = 2*p*r;
		System.out.println("Keliling Lingkaran tersebut adalah " + k);		
	}
	
	void printBola (double p, double r) {
		double v = (4.0/3.0)*p*r*r*r;
		System.out.println("Volume lingkaran tersebut adalah "+ v);
	}
	
	void printTabung (double t, double p, double r) {
		double v = p*r*r*t;
		System.out.println("Volume lingkaran tersebut adalah "+ v);

	}
}
