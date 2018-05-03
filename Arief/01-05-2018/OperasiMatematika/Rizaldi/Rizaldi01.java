/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Rizaldi01{
	public static void main ( String[]args ){
		double roti, air, lapar, makan, minum, minumAkhir, makanAkhir, makanSisa, minumSisa;

		roti = 20;
		air = 20;
		lapar = 15;
		makan = 1;
		minum = 1.0/2.0;

		makanAkhir = lapar * makan;
		minumAkhir = lapar * minum;

		makanSisa = roti - makanAkhir;
		minumSisa = air - minumAkhir;

		System.out.println("Adi membeli 20 bungkus roti dan 20 botol air mineral, jika \n" +
							"lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral. \n" +
							"berapa sisa roti dan air mineral jika adi merasa lapar 15 kali?\n");
		
		System.out.printf("Sisa roti %.0f bungkus, dan sisa air %.1f botol", makanSisa, minumSisa);
	}
}