/*
	Created By Vikri
	29/05/2018
	13:36
*/
import java.util.Random;
import java.util.Scanner;

public class PigGameDice{
	public static void main(String[] args) {
		int pointPlyr, pointPc, randomPc1, randomPc2, randomPc3;
		int play, randomPlyr1, randomPlyr2, randomPlyr3, hasilPc, hasilPlyr;
		String roll;

		randomPc1 = 0;
		randomPc2 = 0;
		randomPc3 = 0;
		pointPlyr = 0;
		pointPc = 0;

		hasilPlyr = 0;
		hasilPc = 0;


		Scanner string = new Scanner(System.in);
		Random rand = new Random();
		
		play = 1;

		System.out.println("==========================================");
		System.out.println("               PIG GAME DICE");
		System.out.println("==========================================");
		while(hasilPc<100&&hasilPlyr<100){
			int playing = 1;
			System.out.println("Computer Turn");
			while(playing< 4&&hasilPlyr<100&&hasilPc<100){
				randomPc1 = rand.nextInt(6)+1;
				dice(randomPc1);
				if (hasilPc+randomPc1>101) {
					playing+=4;
					System.out.println("Computer Win");
				} else {
					pointPc = pointPc+randomPc1;
					System.out.println("Computer point now is "+pointPc);
				}
				playing++;
			}
			System.out.println("==========================================");
			int playing2 = 1, x = 0;
			while(playing2 < 4&&hasilPlyr<100&&hasilPc<100){
				System.out.print("Roll the dice? ");
				roll=string.next();

				if (roll.equals("yes")) {
					randomPlyr1 = rand.nextInt(6)+1;
					if (randomPlyr1==1) {
						dice(randomPlyr1);
						System.out.println("player point 1");
						playing2+=3;
						x=x*0;
						System.out.println("Your point now is "+x);
						System.out.println("==========================================");
					} else {
						x=x+randomPlyr1;
						if (x+hasilPlyr>100) {
							System.out.println("Your point now is : "+(hasilPlyr+x));
							System.out.println("You Win :)");
						} else {
							dice(randomPlyr1);
							System.out.println("Your point now is "+x);	
						}
					}
				} else {
					System.out.println("tidak");
					pointPlyr += x;

					System.out.println("your point player now is: "+pointPlyr);
					playing2+=3;
				}
			}
			hasilPc = pointPc;
			hasilPlyr = pointPlyr;	
			if (hasilPlyr>=100) {
				System.out.println("You win");
			} else if (hasilPc>=100){
				System.out.println("Computer win");
			}
		}
	}
	public static void dice(int roll){
		if (roll == 1) {
			System.out.println();
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
			System.out.println();
		} else if (roll == 2) {
			System.out.println();
			System.out.println("|o  |");
			System.out.println("|   |");
			System.out.println("|  o|");
			System.out.println();
		} else if (roll == 3) {
			System.out.println();
			System.out.println("|o  |");
			System.out.println("| o |");
			System.out.println("|  o|");
			System.out.println();
		} else if (roll == 4) {
			System.out.println();
			System.out.println("|o o|");
			System.out.println("|   |");
			System.out.println("|o o|");
			System.out.println();
		} else if (roll == 5) {
			System.out.println();
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
			System.out.println();
		} else if (roll == 6) {
			System.out.println();
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println();
		}
	}
}