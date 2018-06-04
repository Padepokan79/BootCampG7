//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 6:46 PM
//Modified by :
import java.util.Random;
import java.util.Scanner;

public class GuessingGame2{
	public static void main(String[] args) {
		int guess,number;
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in three tries.");
		number = rand.nextInt(10)+1;
		for(int i=0;i <3;i++)
		{	System.out.print("Enter guess :");
			guess = keyboard.nextInt();
			
			if(guess == number)
			{
				System.out.println("RIGHT!!!");
				System.out.println("You Have Won the Game!!!");
				i +=10;
			}
			else 
			{	if(guess > number)
				{
					if(guess - number == 1)
					{
						System.out.println(" Hot");
					}
					else if(guess - number ==2)
					{
						System.out.println(" Warm ");
					}
					else
					{
						System.out.println(" Cold ");
					}
					if(i==2)
					System.out.println("The correct number is :" + number);
				}
				else
				{
					if(number - guess == 1)
					{
						System.out.println(" Hot");
					}
					else if(number - guess ==2)
					{
						System.out.println(" Warm ");
					}
					else
					{
						System.out.println(" Cold ");
					}
					if(i==2)
					System.out.println("The correct number is :" + number);
				
				}	
			}

		}


	}

}