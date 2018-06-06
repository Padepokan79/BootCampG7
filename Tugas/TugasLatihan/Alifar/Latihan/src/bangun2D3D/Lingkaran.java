package bangun2D3D;

public class Lingkaran {
	double r, tinggi, luasLingkaran, kelilingLingkaran, volumeBola, volumeTabung;
	
	public Lingkaran(double jari2) {
		r=jari2;
	}
	
	public Lingkaran(double jari2, double t) {
		r=jari2;
		tinggi=t;
	}
	
	void lingkar() {
		kelilingLingkaran=2*Math.PI*r;
		luasLingkaran=Math.PI*r*r;
	}
	
	void bola(){
		lingkar();
		volumeBola=Math.PI*r*r*r*4.0/3.0;
	}
	
	void tabung() {
		lingkar();
		volumeTabung=Math.PI*r*r*tinggi;
	}
}
