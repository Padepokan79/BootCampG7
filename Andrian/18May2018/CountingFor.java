/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;

public class CountingFor {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int n;
		String message;

		System.out.println("Enter the message and i'll display it five times ");
		System.out.print("Message : ");
		message = key.nextLine();

		for (n=1 ; n<=5 ; n++) {
			System.out.println(n + ". " + message);
		}

		System.out.println("\nNpw i'll show it ten times an count by 5s");
		for (n=1 ; n<=5 ; n++) {
			System.out.println(n + ". " + message);
		}

		System.out.println("Finally, three times counting backward.");
		for (n=3 ; n>0 ; n-=1 ) {
			System.out.println(n + ". " + message);
		}
	}
}