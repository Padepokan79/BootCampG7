/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Khairil02{
	public static void main( String[] args){
		double luas1, luas2, phi7, phiNon7;
		int r7, rNon7;

		r7 = 7;
		rNon7 = 10;
		phi7 = 22.0/7;
		phiNon7 = 3.14;

		luas1 = phi7 * (r7 * r7);
		luas2 = phiNon7 * (rNon7 * rNon7);

		System.out.println("Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas \n" +
							"lingkaran. Setiap masing-masing lingkaran memiliki perhitungan yang \n" +
							"berbeda. apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan \n" +
							"konstanta phi = 22/7 dan apabila bukan kelipatan 7 maka pergunakan \n" +
							"konstanta phi = 3,14. \n");

		System.out.println("r1 = " + r7);
		System.out.println("r2 = " + rNon7);
		System.out.println("phi1 = " + phi7);
		System.out.println("phi2 = " + phiNon7);
		System.out.println("phi1 * r1^2 = " + luas1);
		System.out.println("phi2 * r2^2 = " + luas2);

	}
}