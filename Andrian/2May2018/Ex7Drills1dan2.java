/* 	Date 		: 2/5/2018    
	Time 		: 09:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex7Drills1dan2 {
		public static void main( String[] args ){
			Scanner keyboard = new Scanner(System.in);

			System.out.println("What city is the Capital of France?");
			keyboard.next();
			//error ketika measukan 2 kalimat "harga mati"
			
			System.out.println("Ehat is 6 multipled by 7?");
			keyboard.nextInt();
			//error ketika memasuki kata Mawar
			//error ketika memasukan 41.2

			System.out.println("Enter number between 0.0 and 1.0?");
			keyboard.nextDouble();
			//error ketika memasuki kata Mawar

			System.out.println("Is there anything else you would like to say?");
			keyboard.next();
		}
	}