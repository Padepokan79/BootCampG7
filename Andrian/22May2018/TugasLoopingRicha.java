/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	
25 tahun yang lalu gaji pak Jokowi hanya 1.500.000. Setelah berkarir cukup 
lama gaji pak jokowi meningkat 5% per tahunnya dan tiap 5 tahun beliau mungkin naik 
pangkat hingga gajinya menjadi 2 kali lipat dari yang sebelumnya. 
Berapa gaji pak jokowi sekarang?	*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingRicha {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int gajiPakJK=1500000, usia=31,usiaMax=56, kenaikanPerTahun=0, kenaikanPer5Tahun=0, gajiPakJKT=0, gaji=0; 
			String naikPangkat;

			System.out.println("============================");
			System.out.println("      GAJI PAK JOKOWI");
			System.out.println("============================");

			
			while (usia<=usiaMax) {

				while (usia%5==0) {
					System.out.println("Umur \t\t: "+usia);
					System.out.print("Naik pangkat (y/t) : ");
					naikPangkat = key.next();

					if (naikPangkat.equals("y")) {
						gajiPakJK = kenaikanPer5Tahun;
						System.out.println("Gaji \t\t: "+gajiPakJK);
						System.out.println();
					} else {
						gajiPakJK += kenaikanPerTahun;
						System.out.println("Gaji \t\t: "+gajiPakJK);
						System.out.println();
					}
				usia++;
				}
				System.out.println("Umur \t\t: "+usia);
				gajiPakJK = gajiPakJK + (kenaikanPerTahun);
				System.out.println("Gaji \t\t: "+(gajiPakJK) );
				kenaikanPerTahun = gajiPakJK*5/100;
				kenaikanPer5Tahun = gajiPakJK*2;
				usia++;
			} 
		}
	}




//				System.out.print("Naik pangkat (y/t) : ");
//				naikPangkat = key.next();

//				if (naikPangkat.equals("y")) {
//					System.out.println("Gaji \t\t: "+ gaji );
//					gajiPakJK= gajiPakJKawal*2 ;
//				}
//				else if (naikPangkat.equals("t")) {
//					System.out.println("Gaji \t\t: "+ gaji );
//					gajiPakJK= gajiPakJKawal*0.05;	
//				}