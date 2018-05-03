/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	10.10
	* Updated by:
	*
*/
import java.util.Scanner;

public class ForgetfulMachine{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();

		System.out.println("What is 6 Multiplied by 7?");
		keyboard.nextInt();

		System.out.println("Enter number between 0.0 and 1.0.");
		keyboard.nextDouble();

		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
	}
}