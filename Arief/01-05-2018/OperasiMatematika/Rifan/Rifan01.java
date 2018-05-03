/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Rifan01{
	public static void main ( String[]args ){
		double tono, tiang, ati, susi, posisi;

		tiang = 0;
		tono = 20;
		ati = -4;
		susi = 8;
		posisi = tiang + tono + ati + susi;

		System.out.println("Tono berada 20 meter disebelah kiri tiang bendera. Ati berada \n" +
							"4 meter disebelah kanan tono, sedangkan susi berada 8 meter \n" +
							"disebelah kiri ati. jika posisi tiang bendera dianggap posisi \n" +
							"awal atau titik nol, berapa meterkah susi dengan tiang bendera ?\n");
		
		System.out.printf("Jarak Susi dengan tiang %.0f meter", posisi);
	}
}