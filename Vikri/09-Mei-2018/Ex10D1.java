// created by vikri
// 09/05/2018
// 12:33
import java.util.Scanner;

public class Ex10D1{
 public static void main( String[] args ) {
 // THIS CODE IS BROKEN UNTIL YOU FIX IT

	Scanner keyboard = new Scanner(System.in);
	double price = 0, salesTax, total;
	//Jika line 8 atau 11 hapus maka akan error.

	salesTax = price * 0.0825;
	total = price + salesTax;
	
	System.out.print( "How much is the purchase price? " );
	price = keyboard.nextDouble();


	System.out.println( "Item price:\t" + price );
	System.out.println( "Sales tax:\t" + salesTax );
	System.out.println( "Total cost:\t" + total );
	
	}
}