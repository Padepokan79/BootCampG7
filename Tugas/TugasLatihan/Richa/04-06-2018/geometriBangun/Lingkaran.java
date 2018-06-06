package geometriBangun;

public class Lingkaran {
	double jari2, tinggi, phi = 3.14, keliling, luas, volum;
	
	public Lingkaran() {
		// TODO Auto-generated constructor stub
	} 
		
	void mencariLuasKelilingVolumLingkaran (double r) {
		jari2= r;
		luas = phi*jari2*jari2;
		keliling = 4*phi*jari2;
		volum = (4/3)*phi*(jari2*jari2*jari2);
	}
	void mencariVolumTabung (double r, double t) {
		jari2= r;
		tinggi = t;
		volum = phi*jari2*jari2*tinggi;
	}
}
