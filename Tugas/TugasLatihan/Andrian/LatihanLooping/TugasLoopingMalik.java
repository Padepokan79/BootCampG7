/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	

Rangga menginputkan jumlah pensilnya sendiri 
rangga akan menebak jumlah pensilnya sendiri yang diacak oleh komputer

- pertama bermain player memiliki 5 kesempatan yang diberikan
- bila tebakan player benar, maka player mendapatkan satu kesempatan 
	dan menambahkan 10 poin untuk skor
- kesempatan berlaku bila ia salah menebak, maka kesempatan yang dimiliki berkurang
- bila player sudah tidak memiliki kesempatan, maka permainan berakhir atau GAME OVER
- terkecuali bila player memiliki poin min 10 dan kesempatan sudah habis
	 maka program akan bertanya, apakah ingin menukar 10 poin untuk 1 kesempatan.		
	*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingMalik {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();
			int pensilRangga, kompBast, chanceMax=5, pensilTebak, chanceMaxGame=0,
				kesempatanTambahan=0, chanceMaxDisp=5; 
			String chancePlus="";

			System.out.println("====================================================");
			System.out.println("                WELCOME TO THE GAME                 ");
			System.out.println("====================================================");
			
			System.out.println("Masukan jumlah pensil yang anda miliki : ");
			pensilRangga = key.nextInt();


			do {
				System.out.println("kesempatan anda "+kesempatanTambahan);
				kesempatanTambahan=chanceMax;
				int  chance=1, poin=0;
				while (chance<=chanceMax+chanceMaxGame) {
					System.out.println("====================================================");
					System.out.println("                     Chance "+chance);
					System.out.println("====================================================");

					kompBast = rand.nextInt(pensilRangga);
					System.out.println(kompBast); //cheat

					System.out.println("komputer telah mengacak jumlah pensil anda");
					System.out.println("Nah, sekarang coba tebak pensil anda : ");
					pensilTebak = key.nextInt();

					if (pensilTebak==kompBast) {
						System.out.println("You're right !");
						poin+=10;
						chanceMaxGame++;
						chanceMaxDisp++;
						System.out.println("Kesempatan anda bertambah "+chanceMaxGame+" menjadi "+chanceMaxDisp);
						System.out.println("Poin anda "+poin);
						System.out.println();
					}
					else {
						System.out.println("You're wrong !");
						//chanceMaxGame--;
						//chanceMaxDisp--;
						//System.out.println("Kesempatan anda berkurang "+chanceMaxGame+" menjadi "+chanceMaxDisp);
						System.out.println("Poin anda "+poin);
						System.out.println();
					}

				chance++;
				}
				System.out.println("Poin total anda "+poin);

				if (poin==0) {
					System.out.println("GAME OVER");
					chanceMax = 0;
				}
				else if (poin!=0) {
					System.out.print("Apakah anda ingin menukarkan 10 poin dengan 1 kesempatan (y/t): ");
					chancePlus = key.next();

					if (chancePlus.equals("y")||chancePlus.equals("Y")) {
						kesempatanTambahan = poin/10;
						chance+=kesempatanTambahan;
						chanceMax = kesempatanTambahan;
						chanceMaxDisp = kesempatanTambahan;
					}
					else {
						System.out.println("GAME OVER");
						chanceMax = 0;
					}
				}

				 

			} while (kesempatanTambahan<=chanceMax);
		}
	}