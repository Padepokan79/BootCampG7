/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	09.01
	* Updated by:
	*
*/

public class Khairil2{
	public static void main(String[] args){
		System.out.println("Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran.");
		System.out.println("Setiap masing-masing lingkaran memiliki perhitungan yang berbeda.");
		System.out.println("apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7");
		System.out.println("dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.");

		double r, phi, luas;
		r=23;
		System.out.println("\njari jari lingkaran adalah "+r);
		phi=3.14;
		luas=phi*r*r;
		System.out.println("luasnya adalah "+luas);

		r=21;
		System.out.println("\njari jari lingkaran adalah "+r);
		phi=22.0/7.0;
		luas=phi*r*r;
		System.out.println("luasnya adalah "+luas);
	}
}