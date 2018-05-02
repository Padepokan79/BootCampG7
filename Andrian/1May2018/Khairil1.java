/* 	Date 		: 1/5/2018    
	Time 		: 08:25:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Khairil1 {
		public static void main( String []args ) {
		int jarak, kecepatan, waktu;

		kecepatan = 100;
		waktu = 14;
		jarak = kecepatan * waktu;

		System.out.println( "Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil.\nSetiap kecepatan memiliki indikasi yang berbeda.\nAsumsi untuk satuan jarak adalah km, kecepatan km/jam dan waktu jam, menit.\ninputan yang kosong hanya ada satu inputan baik itu jaraknya saja, kecepatannya saja ataupun waktunya saja.\nKecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam" );
		System.out.println( "\nJawaban\nJika diketahui kecepatan 100 km/jam dalam 14 menit, Maka jarak yang ditempuh " + jarak + " km"  );
		}
	}