/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Rizaldi2 {
		public static void main( String [] args ){
			int nbgphr, hrggtr, hrk80, sisa, brplm;

			nbgphr = 2000;
			hrggtr = 245000;
			hrk80 = (nbgphr*80) - 100000;
			sisa = hrggtr - hrk80;
			brplm = (sisa / 2000)+1;

			System.out.println("adi menabung perhari sebesar 2000 rupiah. dia hendak membeli gitar seharga 245.000 rupiah\ndari hasil tabungan nya itu. disaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah\nuntuk mengikuti praktikum.\nberapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?");
			System.out.println("Berapa hari Adi harus menabung adalah " + brplm);

		}
	}