/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:00 AM     
     Updated By  : 
     Update Date : 
*/
class Yana2 {
	public static void main(String[] args) {
		int pensil, penghapus, penggaris, diskonmerk;
		double persentase, total;

		pensil     = 8000;
		penghapus  = 6000;
		penggaris  = 10000;
		total      = pensil + penghapus + penggaris;
		diskonmerk = pensil + penghapus - 10000;
		persentase = diskonmerk / total * 100;

		System.out.println("Harga sebuah pensil    : " + pensil);
		System.out.println("Harga sebuah penghapus : " + penghapus);
		System.out.println("Harga sebuah penggaris : " + penggaris);
		System.out.println("Total Pembelian        : " + total);
		System.out.println("Diskon Merk            : " + diskonmerk);
		System.out.printf("Persentase keuntungan  : %.2f",persentase);
		System.out.print("%");
	}
}

/*
Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus 
dan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga 
Rp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar 
membeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar 
keduanya seharga Rp. 10.000. Berapa % keuntungan yang didapat Alifhar dari 
transaksi belanja tersebut?
*/