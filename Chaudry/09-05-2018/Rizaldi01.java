/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/

/*
	1. Adi membeli 20 bungkus roti dan 20 botol air mineral,
jika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral.
berapa sisa roti dan air mineral jika adi merasa lapar 15 kali. ?
*/
public class Rizaldi01{
	public static void main(String[] args){
		double jmlRoti, jmlBotol, makanRoti, minumAir, jmlLapar, totalMinum, totalAir, totalMakan, totalRoti, operasi;

		jmlRoti 	= 20;
		jmlBotol	= 20;
		makanRoti 	= 1;
		minumAir 	= 0.5;
		jmlLapar 	= 15;

		totalMakan 	= makanRoti*jmlLapar;
		totalRoti 	= jmlRoti - totalMakan;

		totalMinum 	= minumAir*jmlLapar;
		totalAir 	= jmlBotol - totalMinum;

		System.out.print("Sisa Roti " + totalRoti + " bungkus, Sisa air mineral " + totalAir + " botol");
	}
}