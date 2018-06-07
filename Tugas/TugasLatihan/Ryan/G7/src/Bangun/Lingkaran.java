package Bangun;

public class Lingkaran {
	
	double luas, keliling, v1=22.0/7.0, v = 3.14, volume;
	public Lingkaran() {
		
	}
	void luasKeliling(double jari) {
		if(jari%7 == 0) {
			v = v1;
		}
		luas = v*jari*jari;
		keliling = 2.0*v*jari;
	}
	void tampilLuasKeliling() {
		System.out.printf("Luas %.2f: ",luas);
		System.out.println();
		System.out.printf("Keliling : %.2f",keliling);
		System.out.println();
	}
	void volumeBola(double jari) {
		if(jari%7 == 0) {
			v = v1;
		}
		volume = 4.0/3.0*v*(jari*jari*jari);
	}
	void volumeTabung(double jari, double t) {
		if(jari%7 == 0) {
			v = v1;
		}
		volume = 2.0*v*jari*t;
	}
	void tampilTabungBola() {
		System.out.printf("Volume : %.2f",volume);
		System.out.println();
	}
}
