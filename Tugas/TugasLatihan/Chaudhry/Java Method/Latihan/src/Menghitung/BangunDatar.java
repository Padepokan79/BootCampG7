package Menghitung;

class BangunDatar {

	double sisi, panjang, lebar, sisiA, sisiB, sisiC, tinggi, jari;
	double rumusSegitiga = 1.0/2.0, phi = 22.0/7.0, luas, keliling;
	
	public BangunDatar() {
		
	}
	
	void persegi(double s) {
		sisi = s;
		luas     = sisi*sisi;
		keliling = 4*sisi;
		
		System.out.println("Luas        : "+ luas);
		System.out.println("Keliling    : "+ keliling);
	}
	
	void persegiPanjang(double p, double l) {
		panjang = p;
		lebar 	= l;
		luas = panjang*lebar;
		keliling = 2*(panjang + lebar);
		
		System.out.println("Luas        : "+ luas);
		System.out.println("Keliling    : "+ keliling);
	}
	
	void segitiga(double a, double b, double c, double t) {
		sisiA 	= a;
		sisiB	= b;
		sisiC 	= c;
		tinggi	= t;
		luas 	= (sisiA*tinggi)*rumusSegitiga;
		keliling = sisiA + sisiB + sisiC;
		
		System.out.println("Luas        : "+ luas);
		System.out.println("Keliling    : "+ keliling);
	}
	
	void lingkaran(double j) {
		jari 	= j;
		luas 	= phi*jari*jari;
		keliling = 2*phi*jari;
		
		System.out.println("Luas        : "+ luas);
		System.out.println("Keliling    : "+ keliling);
	}
}
