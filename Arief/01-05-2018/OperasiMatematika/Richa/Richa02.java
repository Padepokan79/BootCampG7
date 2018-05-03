/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Richa02{
	public static void main( String[] args ){
		double jarak, waktu, kecepatan, putaran;

		jarak = 0.5;
		putaran = jarak * 5;
		kecepatan = 5;
		waktu = 1 * putaran / kecepatan;

		System.out.println("Seorang anak bernama Oni setiap pagi selalu berolahraga \n" +
							"memutari sebuah lapangan dengan keliling 0,5 km. Apabila \n" +
							"dengan kecepatan lari 5 km/jam Oni mampu memutari lapangan \n" +
							"sebanyak 5 kali, berapa lamakah Oni lari setiap paginya? \n");

		System.out.printf("waktu yang digunakan %.1f jam", waktu);

	}
}