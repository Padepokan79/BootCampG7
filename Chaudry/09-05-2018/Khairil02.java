/*
	DATA CREATED : 08 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
/*
	- Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran. Setiap masing-masing lingkaran memiliki perhitungan yang berbeda. apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7 dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.
*/
public class Khairil02{
	public static void main(String[] args){
		double jari, phi, luas;
		
		phi = 3.14;
		jari = 15;
		luas = phi * jari;
		System.out.println("Phi       : " + phi);
		System.out.println("Jari-jari : " + jari);
		System.out.println("Luas      : " + luas);

		System.out.println();

		phi = 22.0/7.0;
		jari = 7;
		luas = phi * jari;
		System.out.println("Phi       : " + phi);
		System.out.println("Jari-jari : " + jari);
		System.out.println("Luas      : " + luas);

	}
}