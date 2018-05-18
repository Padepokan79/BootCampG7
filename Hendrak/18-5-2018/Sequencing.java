//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:8:20 AM
//Modified by :
import java.util.Scanner;

public class Sequencing{
	public static void main(String[] args) {
		//THIS CODE IS BROKEN UNTIL U FIX IT
	
		Scanner keyboard = new Scanner(System.in);
		double price , salesTax, total;

		
		System.out.print("How much is purchase price? ");
		price = keyboard.nextDouble();

		salesTax = price * 0.0825;
		total = price + salesTax;

		System.out.println("Item price : \t" + price);
		System.out.println("Sales tax  : \t" + salesTax);
		System.out.println("total cost  :\t" + total);

	}
}
