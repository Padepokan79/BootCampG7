/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	

1. Micheal sedang memainkan sebuah permainan classik tebak huruf. 
	Dimana Pemain dinyatakan menang jika salah satu pemain memiliki nyawa mencapai 16.
 - nyawa awal yang tersedia : - Player 1 nyawa
			      - Komputer 1 nyawa 
 - ada 2 kesempatan bermain dalam 1 ronde
 - max 20 ronde, dan pemain dinyatakan menang.
 - jika tebakan player sama dengan tebakan komputer, maka player mendapatkan 2 nyawa
 - jika tebakan player salah, maka nyawa player berkurang 1 dan komputer bertambah 2 nyawa
 
 - jika pemain palyer menang pada ronde <= 8 --> "CHEATER"
   jika pemain palyer menang pada ronde > 8 && <= 11  --> "NICE"
   jika pemain palyer menang pada ronde > 11 --> "NOOB"
 
 - jika selisih nyawa player dengan nyawa komputer = 6, 
 	maka permainan dimenangkan oleh pemain yang memiliki nyawa lebih unggul			
	*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingChaudary {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int nyawaPlayer=1, nyawaKomp=1, round=1, roundMax=20, chance=1, chanceMax=2, nyawaMax=16, enemyTurn;
			String guessKomp, guessPlayer, playerTurn,enemyPlay="";

			System.out.println("====================================================");
			System.out.println("                WELCOME TO THE GAME                 ");
			System.out.println("====================================================");


			while (round<=roundMax && (nyawaPlayer<=nyawaMax && nyawaKomp<=nyawaMax)) {
				System.out.println("====================================================");
				System.out.println("                      Round "+round);
				System.out.println("====================================================");

				chance=1;
				while (chance<=chanceMax) {
					enemyTurn = rand.nextInt(26)+1;
					System.out.println(enemyTurn); //cheat

				if (enemyTurn==1) {
					enemyPlay="a";
				}
				else if (enemyTurn==2) {
					enemyPlay="b";
				}
				else if (enemyTurn==3) {
					enemyPlay="c";
				}
				else if (enemyTurn==4) {
					enemyPlay="d";
				}
				else if (enemyTurn==5) {
					enemyPlay="e";
				}
				else if (enemyTurn==6) {
					enemyPlay="f";
				}
				else if (enemyTurn==7) {
					enemyPlay="g";
				}
				else if (enemyTurn==8) {
					enemyPlay="h";
				}
				else if (enemyTurn==9) {
					enemyPlay="i";
				}
				else if (enemyTurn==10) {
					enemyPlay="j";
				}
				else if (enemyTurn==11) {
					enemyPlay="k";
				}
				else if (enemyTurn==12) {
					enemyPlay="l";
				}
				else if (enemyTurn==13) {
					enemyPlay="m";
				}
				else if (enemyTurn==14) {
					enemyPlay="n";
				}
				else if (enemyTurn==15) {
					enemyPlay="o";
				}
				else if (enemyTurn==16) {
					enemyPlay="p";
				}
				else if (enemyTurn==17) {
					enemyPlay="q";
				}
				else if (enemyTurn==18) {
					enemyPlay="r";
				}
				else if (enemyTurn==19) {
					enemyPlay="s";
				}
				else if (enemyTurn==20) {
					enemyPlay="t";
				}
				else if (enemyTurn==21) {
					enemyPlay="u";
				}
				else if (enemyTurn==22) {
					enemyPlay="v";
				}
				else if (enemyTurn==23) {
					enemyPlay="w";
				}
				else if (enemyTurn==24) {
					enemyPlay="x";
				}
				else if (enemyTurn==25) {
					enemyPlay="y";
				}
				else if (enemyTurn==26) {
					enemyPlay="z";
				}

					System.out.println("====================================================");
					System.out.println("                      Chance "+chance);
					System.out.println("====================================================");
					System.out.println("So enemy has been pick the symbol");
					System.out.println("====================================================");
					System.out.print("and your guess : ");
					playerTurn = key.nextLine();

					if (playerTurn.equals(enemyPlay)) {
						System.out.println("You're right");
						nyawaPlayer+=2;
					}
					else {
						System.out.println("You're wrong");
						nyawaPlayer-=1;
						nyawaKomp+=2;
					}
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("Nyawa player "+nyawaPlayer);
					System.out.println("Nyawa Komp "+nyawaKomp);
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

					chance++;
				} 

	/* - jika pemain palyer menang pada ronde <= 8 --> "CHEATER"
   jika pemain palyer menang pada ronde > 8 && <= 11  --> "NICE"
   jika pemain palyer menang pada ronde > 11 --> "NOOB"
 */
				
				round++;
			}
			System.out.println();
			System.out.println("GAME FINISH");
			System.out.println("Nyawa player "+nyawaPlayer);
			System.out.println("Nyawa Komp "+nyawaKomp);
			round=round;
			if (round<=8 && (nyawaPlayer>=nyawaMax)) {
				System.out.println("CHEATER");
			}
			else if (round>8 && round<=11 && (nyawaPlayer>=nyawaMax)) {
				System.out.println("NICE");
			}
			else if (round>11 && (nyawaPlayer>=nyawaMax)) {
				System.out.println("NOOB");
			}
		}
	}