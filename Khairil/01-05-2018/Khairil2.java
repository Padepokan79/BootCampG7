/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:15 AM     
     Updated By  : 
     Update Date : 
*/
class Khairil2 {
	public static void main(String[] args) {
		int rad;
		String Soal;
		double phi, luas;
		String soal;
		soal = "Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran. Setiap masing-masing lingkaran memiliki perhitungan yang berbeda. apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7 dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.";
		phi = 22/7;
		rad = 7;
		luas = phi * rad;
		System.out.println(soal);
		System.out.println();	
		
		System.out.println("Phi       : " + phi);
		System.out.println("Jari-jari : " + rad);
		System.out.println("Luas      : " + luas);
		System.out.println();

		phi = 3.14;
		rad = 10;
		luas = phi * rad;

		System.out.println("Phi       : " + phi);
		System.out.println("Jari-jari : " + rad);
		System.out.printf("Luas       : %.2f", luas);
	}
}