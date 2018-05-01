/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Khairil01{
	public static void main( String[] args){
		double jarak, kecepatan, waktu;

		jarak = 50;
		kecepatan = 200;
		waktu = jarak / kecepatan ;

		System.out.println("Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil. \n" +
							"Setiap kecepatan memiliki indikasi yang berbeda. Asumsi untuk satuan \n" +
							"jarak adalah km, kecepatan km/jam dan waktu jam, menit. inputan yang \n" +
							"kosong hanya ada satu inputan baik itu jaraknya saja, kecepatannya \n" +
							"saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan \n" +
							"adalah sebesar 200km/jam.");
		System.out.println("Dengan kecepatan " + kecepatan + " km/jam, dan jarak sejauh " + jarak + " Km, \n"+
							"maka waku yang dibutuhkan adalah " + waktu + " jam");
	}
}