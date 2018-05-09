/*
soal : 
Adi membeli 20 bungkus roti dan 20 botol air mineral,
jika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral.
berapa sisa roti dan air mineral jika adi merasa lapar 15 kali. ?

create by : Malik Chaudhary
time : 08-05-2018 8:52PM

*/

public class RizaldiSoal1{
	public static void main(String[] args){
		int banyakRoti, banyakAir, banyakLapar, sisa, makanRoti;
		double minumAir, roti, air;

		banyakRoti = 20;
		banyakAir = 20;
		banyakLapar = 15;

		makanRoti = 1;
		minumAir = 1.0/2;

		roti = banyakLapar*makanRoti;
		roti = banyakRoti-roti;

		air = banyakLapar*minumAir;
		air = banyakAir - air;



		System.out.print("Roti : "+roti+ " Air: "+air);

	}
}