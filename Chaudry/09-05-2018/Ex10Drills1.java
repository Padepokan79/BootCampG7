/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class Ex10Drills1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;

		salesTax 	= price*0.0825;
		total 		= price + salesTax;

		System.out.print("How much is the purchase price?: ");
		price = keyboard.nextDouble();

		System.out.println("Item price:\t" + price);
		System.out.println("Sales Tax:\t" + salesTax);
		System.out.println("Total cost:\t" + total);
	}
}

// '= 0' dihapus akan terjadi kesalahan program, yang menyatakan bahwa variabel 'price' tidak mempunyai inisialisasi nilai