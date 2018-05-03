/* 	Date 		: 1/5/2018    
	Time 		: 08:25:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Khairil3 {
		public static void main ( String [] args ) {
			int kameja, cpanjang, dasi, kkaki;
			double harga, diskon, hargaakhir;
			String bonus;

			kameja = 120000;
			cpanjang = 60000;
			dasi = 40000;
			kkaki = 35000;

			bonus = "1 kaos kaki";

			harga = (2*kameja) + cpanjang + dasi;
			diskon = (harga * 0.15) ;
			hargaakhir =  harga - diskon;

			System.out.println( "Sebuah toko pakaian memiliki aplikasi POS sederhana.\nItem yang dijual adalah pakaian pria.\nSetiap pakaian memiliki harga yang bervariasi.\nHarga untuk sebuah kemeja adalah 120000, celana panjang 60000, dasi 40000, dan kaos kaki per pasang 35000.\nUntuk pembelian minimal 100000 mendapatkan potongan harga sebesar 10% dan pembelian minimal 250000 mendapatkan potongan harga sebesar 15%.\nApabila pembelian mencapai 300000 berlaku kelipatan maka pembeli akan mendapatkan bonus 1 buah dasi." );
			System.out.println( "jika yang dibeli 2 buah kameja, 1 celana panjang, dan 1 dasi maka yang harus dibayarkan adalah " + hargaakhir + " dan mendapatkankan bonus " + bonus );
		}

	}

//Total harga 340000 artinya diskon 15% + bonus 1 buah dasi
//1 Buah dasi tulis manual saja