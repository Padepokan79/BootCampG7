/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Yana2 {
		public static void main( String [] args ) {
			double pensil,penggaris,penghapus,harga,dibayar,keuntungan;

			pensil = 8000.0;
			penggaris = 10000.0;
			penghapus = 6000.0;

			harga = pensil + penggaris + penghapus;
			dibayar = 10000.0 + penggaris;
			keuntungan = (harga - dibayar)/harga*100.0;

			System.out.println("Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus\ndan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga\nRp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar\nmembeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar\nkeduanya seharga Rp. 10.000. Berapa % keuntungan yang didapat Alifhar dari \ntransaksi belanja tersebut?");
			System.out.println("jadi persentase keuntungan Alifhar adalah " + keuntungan +" %");
		} 
	}