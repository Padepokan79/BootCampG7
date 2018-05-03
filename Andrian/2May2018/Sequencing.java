/* 	Date 		: 2/5/2018    
	Time 		: 10:56:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Sequencing {
		public static void main( String[] args){

			Scanner keyboard = new Scanner(System.in);
			double price=0, salesTax, total;

			salesTax = price*0.0825;
			total = price + salesTax;

			System.out.print("How much is teh purchase price? ");
			price = keyboard.nextDouble();

			System.out.println("Item price:\t" + price);
			System.out.println("Item tax:\t" + salesTax);
			System.out.println("Item total:\t" + total);
		}
	}