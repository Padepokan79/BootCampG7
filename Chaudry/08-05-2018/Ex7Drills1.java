/*
	DATA CREATED 		: 08 MEI 2018
	AUTHOR 				: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ex7Drills1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What city is the capital of France?" );
		keyboard.next();

		System.out.println( "What did you type?" );
		// pertanyaan kedua meledak ketika aku mengetikan [BLANK]
		keyboard.nextInt();

		System.out.println( "Enter a number between 0.0 and 1.0" );
		keyboard.nextDouble();

		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
	}
}