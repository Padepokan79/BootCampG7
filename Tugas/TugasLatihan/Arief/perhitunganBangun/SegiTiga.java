package perhitunganBangun;

public class SegiTiga {
	double alas, tinggi, keliling, luas;
	
	public SegiTiga () {
		
	}
	
//	public SegiTiga (double a, double t) {
//		alas= a;
//		tinggi = t;
//	}
	
	void luasSegitiga(double a, double t){
		this.luas = 1.0/2.0 * a * t; 
		System.out.println("Luas Segi Tiga = " + luas + " persegi");
	}
	
	void kelillingSegitiga(double a){
		this.keliling = a * 3; 
		System.out.println("Keliling Segi Tiga = " + keliling);
	}
}
