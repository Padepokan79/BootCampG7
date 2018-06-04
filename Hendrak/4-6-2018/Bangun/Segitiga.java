package Bangun;

public class Segitiga {
	double alas,tinggi,luas;
	
	public Segitiga() {
		
	}
	
	public Segitiga(double a, double t ) {
		alas = a;
		tinggi = t;
	}
	
	void cariLuasSegitiga(double a, double t) {
		luas = a * t/2;
	}
	
	void tampilLuasSegitiga() {
		System.out.printf("Luas Segi tiga adalah %.2f \n",luas);
			
	}
}
