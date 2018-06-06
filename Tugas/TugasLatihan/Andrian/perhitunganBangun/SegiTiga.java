package perhitunganBangun;

public class SegiTiga {
	double luas, keliling, sisi, tinggi;
	
	public SegiTiga () {
		
	}
	
	public SegiTiga (double lu, double k, double s, double t ) {
		luas = lu;
		keliling = k;
		sisi = s;
		tinggi = t;
	}
	
	void printLuasSegitiga (double t, double s) {
		double lu = (1.0/2.0)*s*t;
		System.out.println("Luas segitiga tersebut adalah : "+lu);
		//System.out.println(s);
		//System.out.println(t);
	}
	void printKelilingSegitiga (double s) {
		double k = s * 3;
		System.out.println("Keliling segitiga tersebut adalah : "+k);		
	}
}
