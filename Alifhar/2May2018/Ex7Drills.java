/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	10.15
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex7Drills{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();

		System.out.println("What is 6 Multiplied by 7?");
		keyboard.nextInt();
		// inputan berupa huruf dan simbol
		// inputan berupa bilangan desimal
		// inputan berupa angka yang terlalu besar atau terlalu kecil (input < -2,147,483,648 atau input > 2,147,483,647)

		System.out.println("Enter number between 0.0 and 1.0.");
		keyboard.nextDouble();
		// inputan berupa huruf dan simbol

		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
	}
}