package Bangun;

public class Persegi {
	double luas, keliling, volume;
	
	public Persegi() {
		
	}
	
	void persegi(double s) {
		luas = s*s;
		keliling = s*4.0;
	}
	void persegiPanjang(double p, double l) {
		luas = p*l;
		keliling = 2.0*p + 2.0*l;
	}
	void tampilLuasKeliling() {
		System.out.println("Luas  : "+luas);
		System.out.println("Keliling : "+keliling);
	}
	
	void Kubus(double s) {
		volume = s*s*s;
	}
	void Balok(double p, double l, double t) {
		volume = p*l*t;
	}
	void volumeBalokKubus() {
		System.out.println("Volume : "+volume);
	}
}

