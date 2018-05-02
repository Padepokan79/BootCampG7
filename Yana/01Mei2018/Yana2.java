/*
created by 	: Yana
time		: 1 Mei 2018

2. Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus 
dan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga 
Rp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar 
membeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar 
keduanya seharga Rp. 10.000. Berapa % keuntungan yang didapat Alifhar dari 
transaksi belanja tersebut?
*/

public class Yana2{
	public static void main(String[] args){

		int hargaPensil, hargaPenghapus, hargaPenggaris, hargaTebusan;
		double persenKeuntungan;

		hargaPensil			= 8000;
		hargaPenghapus		= 6000;
		hargaPenggaris		= 10000;
		hargaTebusan		= 10000;
		persenKeuntungan	= (hargaPensil + hargaPenghapus + hargaPenggaris) - (hargaTebusan + hargaPenggaris);
		persenKeuntungan	= persenKeuntungan * 100.00 / (hargaPensil + hargaPenghapus + hargaPenggaris);

		System.out.println("Keuntungan dari transaksi adalah " +persenKeuntungan+ " %");
	}
}