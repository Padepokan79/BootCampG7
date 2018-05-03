/* 	Date 		: 2/5/2018    
	Time 		: 09:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class ForgetfulMachine {
		public static void main( String[] args ){
			Scanner keyboard = new Scanner(System.in);
			//"keyboard" bisa diubah dengan yang lain misal "ketik"

			System.out.println("What city is the Capital of France?");
			keyboard.next();

			System.out.println("Ehat is 6 multipled by 7?");
			keyboard.nextInt();

			System.out.println("Enter number between 0.0 and 1.0?");
			keyboard.nextDouble();

			System.out.println("Is there anything else you would like to say?");
			keyboard.next();
		}
	}