/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int yourGuess, random, angkaAwal, kesempatan = 3, cold = 3, warm = 2, hot= 1,
			ronde, maxRonde= 10, menang=0;
		int selisihKurang, selisihLebih;

		ronde 		= 1;

		while(ronde <= maxRonde){

			angkaAwal 	= 1;			
			random = rand.nextInt(10)+1;
			System.out.println(random);

			
			System.out.println();
			System.out.println("=====================");			
			System.out.println("Ronde ke " +ronde);
			System.out.println("=====================\n");

			while(angkaAwal <= kesempatan){

				System.out.print("Your guess: ");
				yourGuess = keyboard.nextInt();

				selisihKurang = yourGuess - random;
				selisihLebih  = random - yourGuess;

				if ( yourGuess == random ) {
					System.out.println("RIGHT!");
					angkaAwal = kesempatan;
					System.out.println("You have won the game");
					menang++;
					System.out.println("Menang "+menang+" dari "+ronde+"\n");
				}
				else{
					if ( angkaAwal == kesempatan) {
						System.out.println("The correct number is "+random);	
						System.out.println("You have lost the game\n");					
					}
					else{
						if ( selisihKurang == warm || selisihLebih == warm ) {
							System.out.println("warm");				
						}
						else if ( selisihKurang == hot || selisihLebih == hot ) {
							System.out.println("hot");				
						} 
						else if ( selisihKurang >= cold || selisihLebih >= cold ) {
							System.out.println("cold");				
						}
					}
				}

				
				angkaAwal++;
			}

			ronde++;
		}

		
		System.out.println();
		System.out.println("Menang "+menang+" dari "+(ronde-1)+"\n");
		if (menang <= 7) {
			System.out.println("++++++++++++++++");
			System.out.println("Kamu Amatir");
			System.out.println("++++++++++++++++");
		}
		else if (menang <= 8) {
			System.out.println("++++++++++++++++");
			System.out.println("Kamu Advanced");
			System.out.println("++++++++++++++++");
		}
		else if (menang <= 9) {
			System.out.println("++++++++++++++++");
			System.out.println("Kamu Profesional");
			System.out.println("++++++++++++++++");
		}
		else if (menang <= 10) {
			System.out.println("++++++++++++++++");
			System.out.println("Kamu Hacker");
			System.out.println("++++++++++++++++");
		}

	}
}