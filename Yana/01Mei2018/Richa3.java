/*
created by 	: Yana
time		: 1 Mei 2018

Selisih uang Ani dan Budi adalah 7500.
Jika 10% uang Ani diberikan kepada Budi, 
maka uang Budi menjadi 80% uang Ani semula. Berapa jumlah uang keduanya?
*/

public class Richa3{
	public static void main(String[] args){

		double selisihiUang, perbandinganAni, perbandinganBudi, selisihBanding, uangBudi, uangAni, jumlahUang;
		double pemberianAni, persenUtuh;

		selisihiUang		= 7500;
		pemberianAni		= 10;
		perbandinganAni		= 80 - pemberianAni;
		perbandinganBudi	= 80;
		persenUtuh			= 100;
		// selisihBanding		= perbandinganAni - perbandinganBudi;
		// uangAni				= perbandinganAni * selisihiUang / selisihBanding;
		// uangBudi			= perbandinganBudi * selisihiUang / selisihBanding;
		uangAni				= selisihiUang * persenUtuh / (persenUtuh - perbandinganAni);
		uangBudi			= perbandinganAni * uangAni / persenUtuh;
		jumlahUang			= uangAni + uangBudi;

		System.out.printf("Uang Ani Rp. %.0f\n" ,uangAni);
		System.out.printf("Uang Budi Rp. %.0f\n" ,uangBudi);
		System.out.printf("Uang Ani dan Budi Rp. %.0f\n" ,jumlahUang);

	}
}