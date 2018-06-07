package Bangun;

public class Segitiga {
	
	double luas;
	
	public Segitiga() {
		
	}
	void luasSegitiga(double alas,double tinggi) {
		luas = 1.0/2.0*alas*tinggi;
	}
	void tampil() {
		System.out.println("Luas Segitiga : "+luas);
	}

}
