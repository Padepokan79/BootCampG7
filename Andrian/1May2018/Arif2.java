/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Arif2 {
		public static void main(String[] args ) {
			int helmA,helmB,helmC,totalPenjualan;

			helmA = 250000;
			helmB = 50000;
			helmC = 650000;

			totalPenjualan = (((helmA*3) + (helmB*3) + (helmC*3))*5)*7;

			System.out.println("Ucup memiliki 5 buah toko helm, dalam sehari setiap toko helmnya berhasil menjual\nsebanyak 3 buah helm dengan masing-masing harga helmnya,\nRp. 250.000 Helm A, Rp. 50.000 Helm B, Rp. 650.000 Helm C.\nBerapa hasil penjualan Helm dalam 1 minggu?");
			System.out.println("Hasil penjualan adlaah " + totalPenjualan);
		}
	}