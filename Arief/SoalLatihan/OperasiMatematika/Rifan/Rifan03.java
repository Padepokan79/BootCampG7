/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Rifan03{
	public static void main ( String[]args ){
		int premis1, premis2, premisX, premisY, apelX, jerukX, apelY, jerukY, x, y, z, hargaApel, hargaJeruk;

		premis1 = 3400; // 2 apel 1 jeruk
		premis2 = 4100; // 1 apel 2 jeruk
		apelX = 2;
		apelY = 1;
		jerukX = 1;
		jerukY = 2;

		// Menghitung 1 buah jeruk 
		premisY = jerukY *2;
		y = premis2 * 2;
		z = premisY - jerukX;
		hargaJeruk = (y - premis1) / z;

		// Menghitung 1 buah apel
		hargaApel = (premis1 - (jerukX * hargaJeruk)) / apelX;

		System.out.println("Harga dua buah apel dan satu buah jeruk adalah Rp. 3.400, Harga \n" +
							"satu apel dan dua jeruk adalah Rp. 4.100, Berapa harga satu buah \n" +
							"apel dan satu buah jeruk ?\n");
		
		System.out.println("Harga 1 buah apel " + hargaApel);
		System.out.println("Harga 1 buah jeruk " + hargaJeruk);
	}
}