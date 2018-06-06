package Bangun;

public class Lingkaran {
	double jari2,tinggi,luas,keliling,volume,phi=3.14;
	
	public Lingkaran() {
		
	}
	
	public Lingkaran(double j) {
	jari2 = j;	
	}
	
	void cariLuasLingkaran(double j) {
		
		luas=phi*j*j;
		keliling=2*phi*j;
	}
	void tampilLuasLingkaran() {
		System.out.printf("Luas Lingkaran adalah %.2f \n",luas);
		System.out.printf("Keliling Lingkaran adalah %.2f \n", keliling);
	}
	
	
	void cariVolumeTabung(double j, double t) {
		volume = 2*phi*j*t;	
	}
	
	void tampilVolumeTabung() {
		System.out.printf("Volume Tabung adalah %.2f \n", volume);
	}
	
	void cariVolumeBola(double j) {
	
		volume = 4/3*phi*j*j*j;
		
	}
	
	void tampilVolumeBola() {
		System.out.printf("Volume Tabung adalah %.2f ", volume);
	}
}
