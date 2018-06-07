package geometriBangun;

public class SegiEmpat {
	
	double luas, keliling, volum, sisi, panjang, lebar, tinggi;
	
	public SegiEmpat () {
		
	}
	void mencariLuasKelilingVolumSegiEmpat (double s) {
		sisi = s;
		luas = sisi*sisi;
		keliling = sisi*4;
		volum = sisi*sisi*sisi;
	}
	void mencariLuasKelilingVolumSegiPanjang (double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
		luas = panjang*lebar;
		keliling = (panjang+lebar)*2;
		volum = panjang*lebar*tinggi;
	}
	
}
