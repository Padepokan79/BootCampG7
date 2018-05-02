/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Rizaldi3{
		public static void main( String [] args){
			double ttlgaji, hrgmbl,byrkost,trnsprt,ungknmn,sisagjpr6bln,sisagjpr1bln,brplm,thn ;

			ttlgaji = 5000000;
			hrgmbl = 60000000;
			byrkost = 500000;
			trnsprt = 1000000;
			ungknmn = 100000;

			sisagjpr6bln = (ttlgaji*12) - (byrkost*12) - (trnsprt*12) - (ungknmn*2);
			brplm = hrgmbl/sisagjpr6bln;

			System.out.println("boni mendapat gajian perbulan sebesar 5000.000 rupiah, dia hendak membeli sebuah mobil antik seharga\n60.000.000 rupiah. setiap bulan boni bisa menyisihkan uang hasil gajian setelah dipakai 500.000 untuk bayar kost,\n1000.000 untuk keperluan makan dan transport, serta ada uang keamanan setiap 6 bulan sekali sebesar 100.000 rupah.\nberapa tahun boni bisa membeli mobil antik tersebut dengan uang hasil gajian tersebut ?");
			System.out.printf("Boni dapat membeli mobil tersebut dalam kurun waktu " + brplm + " tahun");
		}
	}