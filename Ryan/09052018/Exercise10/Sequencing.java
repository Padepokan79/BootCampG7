/*
     * Sequencing
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 09:16
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Sequencing{
	public static void main(String[] args) {
		//This Code is broken until you fix it

		Scanner keyboard = new Scanner(System.in);

		double price=0, salesTax, total;

		salesTax = price * 0.0825;
		total = price+salesTax;

		System.out.print("How much is the purchase rice? ");
		price = keyboard.nextDouble();

		System.out.println("Item Price:\t"+price);
		System.out.println("Item Sales Tax:\t"+salesTax);
		System.out.println("Total Cost:\t"+total);
	}
}