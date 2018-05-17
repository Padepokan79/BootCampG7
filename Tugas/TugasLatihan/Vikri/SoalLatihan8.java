/*
	Created By Vikri
	16/05/2018
	14:54
*/
import java.util.Random;
import java.util.Scanner;

public class SoalLatihan8{
	public static void main(String[] args) {
		int tebakan, number, i;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("enter a guess: ");
		number=string.nextInt();

		tebakan=rand.nextInt(11);
		
		if (number==tebakan) {
			System.out.print("Right!"+
									 "\nU won the game!");
		} else if((tebakan+1)==number){
			System.out.println("Hot");

			System.out.print("enter a guess again (2): ");
			number=string.nextInt();

			if (number==tebakan) {
				System.out.print("Right!"+
									 "\nU won the game!");
			} else if((tebakan+1)==number){
				System.out.println("Hot");

				System.out.print("enter a guess again (3): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}

			} else if((tebakan+2)==number){
				System.out.println("Warm");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}

			} else {
				System.out.println("Cold");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}
				
			}

		} else if((tebakan+2)==number){
			System.out.println("Warm");

			System.out.print("enter a guess again (2): ");
			number=string.nextInt();

			if (number==tebakan) {
				System.out.print("Right!"+
									 "\nU won the game!");
			} else if((tebakan+1)==number){
				System.out.println("Hot");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}

			} else if((tebakan+2)==number){
				System.out.println("Warm");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}

			} else {
				System.out.println("Cold");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}
				
			}

		} else {
			System.out.println("Cold");

			System.out.print("enter a guess again (2): ");
			number=string.nextInt();

			if (number==tebakan) {
				System.out.print("Right!"+
									 "\nU won the game!");
			} else if((tebakan+1)==number){
				System.out.println("Hot");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}

			} else if((tebakan+2)==number){
				System.out.println("Warm");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}

			} else {
				System.out.println("Cold");

				System.out.print("enter a guess again (2): ");
				number=string.nextInt();

				if (number==tebakan) {
					System.out.print("Right!"+
									 "\nU won the game!");
				} else {
					System.out.println( "Wrong"+
										"\nThe correct number was "+tebakan);
				}
				
			}

		}
	}
}