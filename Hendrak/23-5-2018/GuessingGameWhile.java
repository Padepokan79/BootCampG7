//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 10:28 AM
//Modified :
import java.util.Random;
import java.util.Scanner;

public class GuessingGameWhile{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int i=1,j=1,guess,number,won=0,lost;
		String status="";
		while(i <= 10)
		{
			System.out.println("Round "+i );
			System.out.println("I am thinking of a number from 1 to 10.");
			System.out.println("You must guess what it is in three tries.");
			number = rand.nextInt(10)+1;
			System.out.println("Enter guess :");
				
			j=1;
			while(j <= 3)
			{
				guess = keyboard.nextInt();

				if(guess == number)
				{	
				System.out.println("RIGHT!!!");
				System.out.println("You Have Won the Game!!!");
				j +=3;
				won += 1;
				}
				else if(guess > number)
				{
					if(guess - number == 1)
					{
						System.out.println("Hot");
					}
					else if(guess - number == 2)
					{
						System.out.println("Warm");
					}
					else
					{
						System.out.println("Cold");
					}
				}	
				else
				{
					if(number - guess == 1)
					{
						System.out.println("Hot");
					}
					else if(number - guess == 2)
					{
						System.out.println("Warm");
					}
					else
					{
						System.out.println("Cold");
					}
					if(j == 3)
					{
						System.out.println("The correct number is " + number);
					}
				}
			j++;
			}

		i++;
		}
		if(won < 7)
		{
			status ="amateurs.";
		}
		else if(won == 8)
		{
		status ="advanced.";
		}
		else if(won == 9)
		{
		status ="profesional.";
		}
		else if(won ==10)
		{
			status ="hackers.";
		}
	System.out.println(" You Have won " + won + " out of 10 rounds");
	System.out.println(" You Rating "+ status);
	}
}
