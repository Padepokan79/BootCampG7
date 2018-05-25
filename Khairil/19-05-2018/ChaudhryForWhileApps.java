/*
	 Program     : Tugas For While - Chaudhry
     Creator     : Khairil
     Created At  : 19 Mei 2018 17:46 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class ChaudhryForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random num = new Random();
		int indexString, maxIndexString, randomString, round, maxRound, chance, maxChances, yourLife, computerLife, choose;
		String alphabetis, hiddenChar, guessChar;

		choose = 1;
		yourLife = 1;
		computerLife = 1;
		round = 1;
		maxRound = 20;
		maxChances = 2;
		guessChar = "";
		hiddenChar = "";
		randomString = 0;
		indexString = 0;
		maxIndexString = 25;
		alphabetis = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		while(round <= maxRound && (yourLife >= computerLife && round <= 8) || (yourLife >= computerLife && round > 8 && round < 12) ) {

			System.out.println("Round " + round + " of " + maxRound);
			chance = 1;

			while(chance <= maxChances) {

				System.out.println("Chance " + chance);

				for(indexString = 0; indexString <= maxIndexString; indexString++) {
					randomString = num.nextInt(indexString + 1);
				}

				hiddenChar = alphabetis.substring(randomString,randomString+1);

				System.out.println(hiddenChar + "<<<<");
				System.out.print("Guess your Character : ");
				guessChar = keyboard.next();

				System.out.println("You guess the character is  " + guessChar);

				if( guessChar.equals(hiddenChar) && (chance == 1 || chance == 2) ) {
					System.out.println("Correct. You got 2 points");
					yourLife+=2;
					System.out.println("Your life " + yourLife);
					System.out.println("computerLife " + computerLife);
					break;
				}	
				else {
					if( !guessChar.equals(hiddenChar) && chance == 1 ) {
						System.out.println("--------------------Try Again...--------------------");
					}
					else if( !guessChar.equals(hiddenChar) && chance == 2 ) {
						System.out.println("The hidden character is     " + hiddenChar);		
						System.out.println("Incorrect. You lost 2 points");
						yourLife--;
						computerLife+=2;						
						System.out.println("Your life " + yourLife);
						System.out.println("computerLife " + computerLife);
						System.out.println();
						chance = 0;
					}
				}


				chance++;
			}
			
			round++;
		}

		if(yourLife >= computerLife && round <= 8) {
			System.out.println(" CHEATER!! ");
		}
		else if(yourLife >= computerLife && round > 8 && round <= 11) {
			System.out.println( " NICE " );
		}
		else if(yourLife >= computerLife && round > 11) {
			System.out.println(" NOOB ");
		}
		else if(yourLife >= computerLife - 6) {
			System.out.println(" YOU WON! ");
		}
		else {
			System.out.println(" SORRY YOU LOOSER! ");
		}
	}
}