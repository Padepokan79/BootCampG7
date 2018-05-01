/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	13.10
	* Updated by:
	*
*/

public class Yana2{
	public static void main(String[] args){
		System.out.println("Alifar  membeli 1 buah pensil, 1 buah penghapus dan 1 buah penggaris.");
		System.out.println("Harga pensil Rp. 8.000, penghapus 6.000 dan penggaris Rp. 10.000.");
		System.out.println("Alifhar membayar keduanya seharga Rp. 10.000.");
		System.out.println("Berapa % keuntungan yang didapat dari transaksi belanja tersebut?");

		double pensil, penghapus, penggaris, hargaAsli, dibayar, untung;
		pensil=8000; penghapus=6000; penggaris=10000;
		hargaAsli=pensil+penghapus+penggaris;

		dibayar=10000+penggaris;
		untung=(hargaAsli-dibayar)/hargaAsli*100;
		System.out.println("\nUntung yang didapat adalah "+untung+" %");
	}
}