/*
	Created By Vikri
	16/05/2018
	14:54
*/
import java.util.Random;
import java.util.Scanner;

public class SoaLatihan3{
	public static void main(String[] args) {
		int tebakan, number, i = 0;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();
		tebakan=rand.nextInt(11);
		System.out.print(tebakan);

		System.out.print("enter a guess: ");
		number=string.nextInt();

		while(i<3){
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

					System.out.print("enter a guess again (2): ");
					number=string.nextInt();
					if (number==tebakan) {
						System.out.print("Right!"+
											 "\nU won the game!");
					} else if((tebakan+1)==number){
						System.out.println("U lost the game");
					}
				}
			}
		i++;
		}
		
	}
}