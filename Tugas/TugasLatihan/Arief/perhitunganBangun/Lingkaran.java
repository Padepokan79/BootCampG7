package perhitunganBangun;

public class Lingkaran {
	double jariJari, phi, tinggi, keliling, luas, volume;
	
	public Lingkaran () {
		
	}
	
//	public Lingkaran (double r, double p, double t) {
//		jariJari= r;
//		phi = p;
//		tinggi = t;
//	}
	
	void kelilingLingkaran(double r, double p){
		this.keliling = 2 * p * r;
		System.out.println("Keliling Lingkaran = " + keliling);
	}
	
	void luasLingkaran(double r, double p) {
		this.luas = p * ((double) Math.pow(r, 2));
		System.out.println("Luas Lingkaran = " + luas + " cm persegi");
	}
	
	void bola(double r, double p) {
		this.volume = 4/3 * p * (double) Math.pow(r, 3);
		System.out.println("Volume Bola = " + volume + " cm kubik");
	}
	
	void tabung(double r, double p, double t) {
		this.volume = p * (double) Math.pow(r, 2) * t;
		System.out.println("Volume Lingkaran = " + volume + " cm kubik");
	}
}
