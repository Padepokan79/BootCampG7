public class Yana2 {
	public static void main (String[] args) {

		double pensil, penghapus, penggaris, total, untung, bayar;

		pensil = 8000;
		penghapus = 6000;
		penggaris = 10000;
		total = pensil + penggaris + penghapus;
		bayar = 10000 + penggaris;
		untung = (1-(bayar/total)) * 100; //keuntungan dalam persen

		System.out.println ("Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus\ndan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga\nRp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar \nmembeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar \nkeduanya seharga Rp. 10.000. Berapa % keuntungan yang didapat Alifhar dari \ntransaksi belanja tersebut?");
		System.out.println ("Jadi, keuntungan yang diperoleh Alifhar sebesar " + untung + "%");

	}
}
