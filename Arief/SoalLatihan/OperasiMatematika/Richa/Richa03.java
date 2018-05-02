/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Richa03{
	public static void main( String[] args ){
		double uangAni, uangBudi, jlhUang, selisih, ani, budi, banding;

		selisih = 7500;
		ani = 9;
		budi = 8;
		banding = ani - budi;
		uangAni = ani * selisih / banding;
		uangBudi = budi * selisih / banding;
		jlhUang = uangAni + uangBudi;

		System.out.println("Selisih uang Ani dan Budi adalah 7500. Jika 10% uang Ani \n" +
							"diberikan kepada Budi, maka uang Budi menjadi 80% uang Ani \n" +
							"semula. Berapa jumlah uang keduanya?\n");

		System.out.printf("Uang Ani =  %.0f \n", uangAni);
		System.out.printf("Uang Ani =  %.0f \n", uangBudi);
		System.out.printf("Jumlah uang keduaanya =  %.0f \n", jlhUang);

	}
}