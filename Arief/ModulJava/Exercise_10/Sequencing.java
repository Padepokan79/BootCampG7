/*
Date Created	: 2 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Sequencing{
	public static void main ( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double price = 0, salesTax, total;

		salesTax = price * 0.0825;
		total = price + salesTax;

		System.out.println("How much is the purchase price? ");
		price = keyboard.nextDouble();

		System.out.println("Item price :\t " + price);
		System.out.println("Sales Tax :\t " + salesTax);
		System.out.println("Total Cost :\t " + total);
	}
}