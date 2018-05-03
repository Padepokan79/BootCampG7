/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 13:05 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class Sequencing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price = 0, salesTax, total;

		System.out.println( "How much is the purchase price ?" );
		price = keyboard.nextDouble();

		salesTax = price * 0.0825;
		total = price + salesTax;

		System.out.println( "Item Price:\t" + price );
		System.out.println( "Sales Tax:\t" + salesTax );
		System.out.println( "Total Cost:\t" + total );

	}
}