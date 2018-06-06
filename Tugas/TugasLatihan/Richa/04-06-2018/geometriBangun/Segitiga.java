package geometriBangun;

public class Segitiga {
	double sisi, tinggi, keliling, luas;
	
	public Segitiga() {
		// TODO Auto-generated constructor stub
	}
		
	void mencariLuasKelilingSegitiga (double s, double t) {
		sisi = s;
		tinggi = t;
		luas = 0.5*sisi*tinggi;
		keliling = sisi*3;
	}

}
