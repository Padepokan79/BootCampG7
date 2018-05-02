/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Yana02{
	public static void main ( String[]args ){
		int hargaPensil, hargaPenghapus, hargaPenggaris, hargaBayar, totAwal, totAkhir;
		double untung;

		hargaPensil = 8000;
		hargaPenghapus = 6000;
		hargaPenggaris = 10000;
		hargaBayar = 10000;
		totAwal = hargaPensil + hargaPenghapus + hargaPenggaris;
		totAkhir = totAwal - (hargaBayar + hargaPenggaris);
		untung = totAkhir * 100.0 / totAwal;

		System.out.println("Alifar pergi ke toko buku untuk membeli 1 buah pensil, \n" +
							"1 buah penghapus dan 1 buah penggaris. Harga barang yang \n" +
							"dibeli Alifhar adalah pensil seharga Rp. 8.000, penghapus \n" +
							"seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar membeli \n" +
							"pensil dan penghapus dengan merek yang sama, Alifhar berhak \n" +
							"membayar keduanya seharga Rp. 10.000. Berapa % keuntungan yang \n" +
							"didapat Alifhar dari transaksi belanja tersebut?\n");
		
		System.out.printf("Keuntungan yang didapat alifhar %.2f persen", untung);
	}
}