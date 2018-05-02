/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Rifan02{
	public static void main ( String[]args ){
		double beras, berat, totBerat, terjual, sisaBeras;

		beras = 12;
		berat = 50;
		totBerat = beras * berat;
		terjual = 175 + 120;
		sisaBeras = totBerat - terjual;

		System.out.println("Di toko Bu Poniem tersedia 12 karung beras. Setiap karung \n" +
							"beratnya 50 kg. Jika hari ini dan kemarin masing-masing \n" +
							"terjual 175 kg dan 120 kg, berapa kg sisa beras di warung \n" +
							"Bu Poniem sekarang ?\n");
		
		System.out.printf("Sisa beras %.0f kg", sisaBeras);
	}
}