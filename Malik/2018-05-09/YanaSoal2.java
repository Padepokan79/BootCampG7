/*
soal : 
Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus 
dan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga 
Rp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar 
membeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar 
keduanya seharga Rp. 10.000. Berapa % keuntungan yang didapat Alifhar dari 
transaksi belanja tersebut?

create by : Malik Chaudhary
time : 08-05-2018 9:19PMPM

*/

public class YanaSoal2{
	public static void main(String[] args){
		double hargaPensil, hargaPenghapus, hargaPenggaris, bayar, persen,pers, harga, hargaSemua;

		hargaPensil = 8000;
		hargaPenghapus = 6000;
		hargaPenggaris = 10000;
		bayar = 10000;
		pers = 100;

		harga = bayar+hargaPenggaris;
		hargaSemua = hargaPenghapus+hargaPensil+hargaPenggaris;

		persen = hargaSemua-harga;

		persen = (persen/hargaSemua)*pers;

		System.out.print("Persen : "+persen+"%");

	}
}