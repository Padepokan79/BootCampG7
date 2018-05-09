/*
soal : 
Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran. 
Setiap masing-masing lingkaran memiliki perhitungan yang berbeda. apabila jari-jari memiliki ukuran kelipatan 7 
maka pergunakan konstanta phi = 22/7 

create by : Malik Chaudhary
time : 08-05-2018 9:59PM

*/

class KhairilSoal2 {
	public static void main(String[] args) {
		int kel;
		double phi, luas;
		phi = 22/7;
		kel = 7;
		luas = phi*kel;
		
		System.out.println("Phi       : "+phi);
		System.out.println("Jari-jari : "+kel);
		System.out.println("Luas      : "+luas);
		System.out.println();

		phi = 3.14;
		kel = 10;
		luas = phi*kel;

		System.out.println("Phi       : "+phi);
		System.out.println("Jari-jari : "+kel);
		System.out.printf("Luas       : "+luas);
	}
}