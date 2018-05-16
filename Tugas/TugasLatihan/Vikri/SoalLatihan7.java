/*
	Created By Vikri
	16/05/2018
	14:35
*/
import java.util.Random;
import java.util.Scanner;

public class SoalLatihan7{
	public static void main(String[] args) {
		int tebakan, number;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("enter a guess: ");
		number=string.nextInt();

		tebakan=rand.nextInt(11);
		if (tebakan==number) {
			System.out.print("Jawaban Benar");
		} else {
			System.out.println("Tebakan salah yang benar adalah: "+tebakan);	
			System.out.print("enter a guess: ");
			number=string.nextInt();
			
			if (tebakan==number) {
				System.out.println("Tebakan benar : "+tebakan);
			} else {
				System.out.println("Tebakan Salah yang adalah: "+tebakan);	
				System.out.print("enter a guess: ");
				number=string.nextInt();

				if (tebakan==number) {
					System.out.println("Tebakan benar : "+tebakan);
				} else {
					System.out.println("Kesempatan Habis");
					System.out.println("Tebakan salah yang benar adalah: "+tebakan);
				}
			}
		} 

	}
}