/*
created by 	: Yana
time		: 1 Mei 2018

2. Seorang anak bernama Oni setiap pagi selalu berolahraga memutari sebuah lapangan dengan keliling 0,5 km. 
Apabila dengan kecepatan lari 5 km/jam Oni mampu memutari lapangan sebanyak 5 kali, 
berapa lamakah Oni lari setiap paginya?
*/

public class Richa2{
	public static void main(String[] args){

		double kelilingLapangan, kecepatanLari, banyakPutaran, lamaLari, waktuLari, panjangLari;

		kelilingLapangan	= 0.5;
		kecepatanLari		= 5;
		waktuLari			= 1;
		banyakPutaran		= 5;
		lamaLari			= 0;
		panjangLari			= kelilingLapangan * banyakPutaran;
		lamaLari			= waktuLari * panjangLari / kecepatanLari;

		System.out.println("Lama waktu lari Oni setiap pagi adalah "+lamaLari+ " jam");

		
	}
}