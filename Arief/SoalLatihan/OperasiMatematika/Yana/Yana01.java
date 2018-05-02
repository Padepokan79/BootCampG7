/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Yana01{
	public static void main ( String[]args ){
		double uang, belanja, kelereng, hargaKelereng, jualKelereng, laba, totalLaba, sisaUang, totalUang;

		uang = 20000;
		belanja = (1.0/2) * uang;
		kelereng = 10;
		jualKelereng = 4;
		hargaKelereng = belanja / kelereng;
		laba = (20.0/100) * hargaKelereng;
		totalLaba = laba * jualKelereng;
		sisaUang = uang - belanja;
		totalUang = sisaUang + totalLaba;

		System.out.println("Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah \n" +
							"uangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 \n" +
							"butir kelerengnya dengan laba 20% dari setiap butir kelereng yang \n" +
							"dijualnya. Berapakan jumlah uang Ijal saat ini?\n");
		
		System.out.printf("Jumlah uang ijal %.0f ", totalUang);
	}
}