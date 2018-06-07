package Menghitung;

class BangunRuang {
	
	double sisi, panjang, lebar, alas, tinggi, jari, volume;
	double phi = 22.0/7.0, phiBola = 4.0/3.0;
	
	public BangunRuang() {
		
	}
	
	void kubus(double s) {
		sisi 	= s;
		volume 	= sisi*sisi*sisi;

		System.out.println("Volume    : "+ volume);
	}
	
	void balok(double p, double l, double t) {
		panjang 	= p;
		lebar 		= l;
		tinggi		= t;
		volume 	= panjang*lebar*tinggi;

		System.out.println("Volume    : "+ volume);
	}
	
	void tabung(double j, double t) {
		jari 	= j;
		tinggi	= t;
		volume 	= phi*jari*jari*tinggi;

		System.out.println("Volume    : "+ volume);
	}
	
	void bola(double j) {
		jari 	= j;
		volume 	= phiBola*phi*jari*jari*jari;

		System.out.println("Volume    : "+ volume);
	}
}
