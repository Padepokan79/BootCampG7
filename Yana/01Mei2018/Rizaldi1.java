/*
created by 	: Yana
time 		: 1 Mei 2018

1. Adi membeli 20 bungkus roti dan 20 botol air mineral,
jika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral.
berapa sisa roti dan air mineral jika adi merasa lapar 15 kali. ?
*/

public class Rizaldi1{
	public static void main(String[] args){
		double jumlahRoti, jumlahBotol, kebutuhanRoti, kebutuhanAir, jumlahLapar;

		jumlahRoti		= 20;
		jumlahBotol		= 20;
		kebutuhanRoti	= 1;
		kebutuhanAir	= 1 / 2;
		jumlahLapar		= 15;

		jumlahRoti		= jumlahRoti - (jumlahLapar * kebutuhanRoti);
		jumlahBotol		= jumlahBotol - (jumlahLapar * kebutuhanAir);

		System.out.printf("Sisa roti adalah %.0f " ,jumlahRoti);
		System.out.printf(" dan sisa air %.1f" ,jumlahBotol);
	}
}