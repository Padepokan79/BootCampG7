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
		uangAni = (100/100);
		banding = uangAni - (70.0/100);
		ani = selisih / banding;
		budi = 0.7 * ani;
		jlhUang = ani + budi;

		System.out.println("Selisih uang Ani dan Budi adalah 7500. Jika 10% uang Ani \n" +
							"diberikan kepada Budi, maka uang Budi menjadi 80% uang Ani \n" +
							"semula. Berapa jumlah uang keduanya?\n");

		System.out.printf("Uang Ani =  %.0f \n", ani);
		System.out.printf("Uang Budi =  %.0f \n", budi);
		System.out.printf("Jumlah uang keduaanya =  %.0f \n", jlhUang);

	}
}