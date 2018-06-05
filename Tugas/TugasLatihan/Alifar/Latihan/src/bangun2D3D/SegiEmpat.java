package bangun2D3D;

public class SegiEmpat {
	double	sisi, panjang, lebar, tinggi, luasPersegi, 
			luasPersegiPanjang, kelilingPersegi, kelilingPersegiPanjang,
			volumeBalok, volumeKubus;
	
	public SegiEmpat(double s) {
		sisi=s;
	}
	
	public SegiEmpat(double p, double l) {
		panjang=p;
		lebar=l;
	}
	
	public SegiEmpat(double p, double l, double t) {
		panjang=p;
		lebar=l;
		tinggi=t;
	}
	
	void persegi(){
		luasPersegi=sisi*sisi;
		kelilingPersegi=4*sisi;
	}
	
	void persegiPanjang() {
		luasPersegiPanjang=panjang*lebar;
		kelilingPersegiPanjang=2*panjang+2*lebar;
	}
	
	void balok() {
		volumeBalok=panjang*lebar*tinggi;
	}
	
	void kubus() {
		volumeKubus=sisi*sisi*sisi;
	}
}
