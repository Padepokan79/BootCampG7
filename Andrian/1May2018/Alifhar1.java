/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Alifhar1 {
		public static void main ( String [] args ) {
			double pipakecil,pipabesar,waktupipabesar,waktupipakecil,bak;

			pipakecil = 10.0;
			pipabesar = 15.0;
			waktupipabesar = 0.8;
			bak = pipabesar * waktupipabesar;
			waktupipakecil = bak / pipakecil;

			System.out.println("Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran.\nPipa kecil dapat mengalirkan air 10 liter/menit, sedangkan pipa besar 15 liter/menit.\nWaktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar adalah 0,8 menit.\nBerapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?");
			System.out.println("Maka lamanya waktu untuk mengisi menggunakan pipa kecil adalah " + waktupipakecil);

		}
	}