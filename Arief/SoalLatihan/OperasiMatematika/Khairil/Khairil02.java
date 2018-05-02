/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Khairil02{
	public static void main( String[] args){
		double r7, rNon7, kelipatan, nonKelipatan, phi7, phiNon7;

		r7 = 7;
		rNon7 = 3;
		phi7 = 22/7;
		phiNon7 = 3.14;

		kelipatan = phi7 * (r7 * r7);
		nonKelipatan = phiNon7 * (rNon7 * rNon7);

		System.out.println("Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas \n" +
							"lingkaran. Setiap masing-masing lingkaran memiliki perhitungan yang \n" +
							"berbeda. apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan \n" +
							"konstanta phi = 22/7 dan apabila bukan kelipatan 7 maka pergunakan \n" +
							"konstanta phi = 3,14. \n");

		System.out.println("r1 = " + r7);
		System.out.println("r2 = " + rNon7);
		System.out.println("phi1 = " + phi7);
		System.out.println("phi2 = " + phiNon7);
		System.out.println("phi1 * r1^2 = " + kelipatan);
		System.out.println("phi2 * r2^2 = " + nonKelipatan);

	}
}

//phi nya cukup satu aja tapi nanti berbeda value