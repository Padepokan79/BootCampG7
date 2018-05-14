/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class Ex10Drills3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;

		System.out.print("How much is the purchase price?: ");
		price = keyboard.nextDouble();

		salesTax 	= price*0.0825;
		total 		= price + salesTax;

		System.out.println("Item price:\t" + price);
		System.out.println("Sales Tax:\t" + salesTax);
		System.out.println("Total cost:\t" + total);
	}
}
