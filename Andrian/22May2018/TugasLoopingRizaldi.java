/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	
Soal 2 tugas Looping >>>>>>>>>>>>>>>>>>
>lotre
- anda membeli lotre dengan kriteria
- harga 100 kesempatan mendapat point 0s/d10
- harga 200=0s/d20, 300=0s/d50, 500=0s/d100
- yang pertama kali mencapai point 1000 menang.
- yang uang nya habis, kalah dan point lotre nya tidak dapet.
- yang menjadi pemain 2 orang manusia.
- diberi modal awal 100.000.

*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingRizaldi {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int uangAwalPlayer1=100000, uangAwalPlayer2=100000, lotre1=100, lotre2=200, lotre3=300, 
				lotre4=500, poin=0, poin1=0, pointemp=0, poin1temp=0, harga, round=1, poinPlayer1=0,
				poinPlayer2=0;

			System.out.println("====================================================");
			System.out.println("                WELCOME TO THE GAME                 ");
			System.out.println("====================================================");


			while (poinPlayer1<=1000 && poinPlayer2<=1000) {
				System.out.println("----------------------------------------------------");
				System.out.println("                      Ronde "+round);
				System.out.println("----------------------------------------------------");
				poinPlayer1 += pointemp;
				poinPlayer2 += poin1temp;
				System.out.println("Poin player1 "+poinPlayer1);
				System.out.println("Poin player2 "+poinPlayer2);
				System.out.println("----------------------------------------------------");
				System.out.println();
				pointemp = 0;
				poin1temp = 0;
				
				int player1=0, player2=0;
				if (poinPlayer1>=1000) {
					System.out.println("Player 1 menang dengan score "+poinPlayer1);
					System.out.println("Poin player1 "+poinPlayer1);
					poinPlayer2=0;
					System.out.println("Poin player2 "+poinPlayer2);
					player2=2;
					player1=2;
				}
				else if (poinPlayer2>1000) {
					System.out.println("Player 2 menang dengan score "+poinPlayer2);
					poinPlayer1=0;
					System.out.println("Poin player1 "+poinPlayer1);
					System.out.println("Poin player2 "+poinPlayer2);
					player2=2;
					player1=2;
				}


				while (player1<1) {
					System.out.println("Player 1 turn");
					System.out.println("Your credit "+uangAwalPlayer1);
					System.out.println("Masukan harga yang akan anda beli : ");
					harga = key.nextInt();

					if (harga==lotre1) {
						poin = rand.nextInt(10)+1;
						uangAwalPlayer1-=harga;
					}
					else if (harga==lotre2) {
						poin = rand.nextInt(20)+1;
						uangAwalPlayer1-=harga;
					}
					else if (harga==lotre3) {
						poin = rand.nextInt(50)+1;
						uangAwalPlayer1-=harga;
					}
					else if (harga==lotre4) {
						poin = rand.nextInt(100)+1;
						uangAwalPlayer1-=harga;
					}
					else {
						System.out.println("Input invalid");
					}
			
					pointemp += poin;
					System.out.println("Poin sementara player1 "+pointemp);
					player1++;
			
				}

				while (player2<1) {
					System.out.println();
					System.out.println("Player 2 turn");
					System.out.println("Your credit "+uangAwalPlayer2);
					System.out.println("Masukan harga yang akan anda beli : ");
					harga = key.nextInt();

					if (harga==lotre1) {
						poin1 = rand.nextInt(10)+1;
						uangAwalPlayer2-=harga;
					}
					else if (harga==lotre2) {
						poin1 = rand.nextInt(20)+1;
						uangAwalPlayer2-=harga;
					}
					else if (harga==lotre3) {
						poin1 = rand.nextInt(50)+1;
						uangAwalPlayer2-=harga;
					}
					else if (harga==lotre4) {
						poin1 = rand.nextInt(100)+1;
						uangAwalPlayer2-=harga;
					}
					else {
						System.out.println("Input invalid");
					}
				
					poin1temp += poin1;
					System.out.println("poin sementara player2 "+poin1temp);
					player2++;
				}
				
			round++;
			}
				
		}
	}