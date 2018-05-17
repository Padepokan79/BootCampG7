/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 2:35PM
soal :

Write a program that implements a guessing game. This is a "classic" program, frequently assigned in beginning CS classes.

The program picks a random number from 1 to 10. Now the user gets three guesses. As soon as the user enters the 
correct number the program writes a winning message and exits. If the user fails to enter the correct number in 
three guesses, the program writes a failure message and exits.
Use methods of the Random class. Here are two example runs of the program:

C:\>java GuessingGame

I am thinking of a number from 1 to 10.
You must guess what it is in three tries.
Enter a guess:
4
wrong
8
RIGHT!
You have won the game.

*/

import java.util.Scanner;
import java.util.Random;
public class SoalTugas7{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		Random rand = new Random();

		int tebakan, random, chance;

		random = rand.nextInt(11);

		System.out.println("angka random PC : "+random);

		
		for ( chance = 1; chance <= 3 ; chance++ ) {
			System.out.println("Masukan tebakan : ");
			tebakan = num.nextInt();
			if ( tebakan == random ) {
				System.out.print("RIGHT!\nYou have won the game");
				chance = 3;
			}else{
				System.out.println("WRONG");
				if ( chance == 3 ) {
					System.out.print("GAME OVER");
				}
			}
		}	
	}
}
