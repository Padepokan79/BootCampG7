/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Richa3 {
		public static void main(String [] args ){
			double selisih, ani, budi, total;

			selisih = 7500.0;
		
			/* ani - budi = 7500
			budi + 10% = 80 %

			budi = 70%
			ani - 0.7 = 7500
			1 - 0.7 = 7500
			ani = 7500/0.3

			*/

			ani =selisih/0.3;
			budi = 0.7*ani;
			total = ani + budi;

			System.out.println("Selisih uang Ani dan Budi adalah 7500. Jika 10% uang Ani diberikan kepada Budi, maka uang Budi menjadi 80% uang Ani semula. Berapa jumlah uang keduanya?");
			System.out.println("Total aang keseluruhan adalah " + total );
		}
	}