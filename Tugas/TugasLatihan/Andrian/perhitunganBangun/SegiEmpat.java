package perhitunganBangun;

public class SegiEmpat {
	double sisi, panjang, lebar, tinggi, luas, keliling, volume;

	public SegiEmpat () {
		
	}
	
	public SegiEmpat (double s) {
		sisi = s;
	}
	public SegiEmpat (double p, double l) {
		panjang = p;
		lebar = l;
	}
	public SegiEmpat (double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
	}
	
	void luasPersegi(double s) {
		double lu = s*s;
		System.out.println("Luas persegi tersebut adalah : "+ lu);
	}
	void kelilingPersegi (double s) {
		double k = s*4;
		System.out.println("Keliling persegi tersebut adalah : "+ k);		
	}
	
	void luasPersegiPanjang(double l, double p) {
		double lu = p*l;
		System.out.println("Luas persegi panjang tersebut adalah : "+ lu);
	}
	
	void kelilingPersegiPanjang (double p, double l) {
		double k = 2*(p+l);
		System.out.println("Luas persegi panjang tersebut adalah : "+ k);		
	}
	
	void balok(double p, double l, double t) {
		double v = p*l*t;
		System.out.println("Volume balok tersebut adalah : "+ v);
	}
	
	void kubus(double s) {
		double v = s*s*s;
		System.out.println("Volume kubus tersebut adalah : "+ v);
	}
}
