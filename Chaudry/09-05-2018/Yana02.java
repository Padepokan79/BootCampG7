/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/

/*
	2. Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus 
dan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga 
Rp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar 
membeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar 
keduanya seharga Rp. 10.000. Berapa % keuntungan yang didapat Alifhar dari 
transaksi belanja tersebut?
*/	
public class Yana02{
	public static void main(String[] args){
		
		double totalHargaNormal, persent, keuntungan, totalHarga, jmlPensil, jmlPenghapus, jmlPenggaris, hargaPensil, hargaPenghapus, hargaPenggaris, pembelian;

		jmlPensil 	= 1;
		jmlPenghapus= 1;
		jmlPenggaris= 1;
		hargaPensil = 8000;
		hargaPenghapus = 6000;
		hargaPenggaris = 10000;
		pembelian 	= 10000;
		persent 	= 100;

		totalHargaNormal 	= (hargaPensil*jmlPensil) + (hargaPenghapus*jmlPenghapus) + (hargaPenggaris*jmlPenggaris);
		totalHarga 			= pembelian + hargaPenggaris;

		keuntungan 	= (totalHargaNormal - totalHarga)/totalHargaNormal*persent;


		System.out.print("Keuntungan yang didapat alifhar dari transaksi belanja adalah " + keuntungan + "%");
	}
}