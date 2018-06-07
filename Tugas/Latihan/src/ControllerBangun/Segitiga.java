package ControllerBangun;

public class Segitiga {
	public double luasSegitiga, sisiSegitiga, kelilingSegitiga;
	
	public Segitiga() {}
	////////	Proses untuk mencari Luas Segitiga && Keliling
	public void luasSegitiga(double sisi1, double sisi2, double sisi3) {
		sisiSegitiga 		= (sisi1+sisi2+sisi3)/2;
		luasSegitiga 		= Math.sqrt(sisiSegitiga*(sisiSegitiga-sisi1)*(sisiSegitiga-sisi2)*(sisiSegitiga-sisi3));
		kelilingSegitiga 	= sisi1+sisi2+sisi3;
	}
	
	////////	Method untuk menampilkan hasil Luas Segitiga && Keliling
	public void tampilLuasSegitiga() {
		System.out.println("Luas Segitiga adalah     : "+luasSegitiga+" cm2");
		System.out.println("Keliling Segitiga adalah : "+kelilingSegitiga+" cm");
	}
}
