/*
	Created By Vikri
	16/05/2018
	13:36
*/
import java.util.Random;
import java.util.Scanner;

public class SoaLatihan4{
	public static void main(String[] args) {
		int tebakan, number, i, win = 0, ronde = 1, kesempatan = 1;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();
		while(ronde<=10){
			tebakan=rand.nextInt(11);
			i = 0;
			while(i<4){
				System.out.print(tebakan+" ");

				System.out.print("enter a guess: ");
				number=string.nextInt();
				i++;
				if (number==tebakan) {
					System.out.println("\nu won the game");
					i += 3;
					win += 1;
				} else {
					if ((number-1)==tebakan||(number+1)==tebakan) {
						System.out.println("Hot");
					} else if((number-2)==tebakan||(number+2)==tebakan) {
						System.out.println("Warm");
					} else{
						System.out.println("Cold");
					}
				}
			}
			ronde++;
		}

		if (win==10) {
			System.out.println("Your rating: Hackers");
		} else if (win==9) {
			System.out.println("Your rating: Pro");
		} else if (win==8) {
			System.out.println("Your rating: Advanced");
		} else if (win<=7) {
			System.out.println("Your rating "+win+" = Amateur");
		}
		
	}
}