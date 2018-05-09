/*
	DATA CREATED 		: 08 MEI 2018
	AUTHOR 				: NURDHIAT CHAUDHARY MALIK
*/

// Drills 1: tidak, karena type data integer dan double sama sama bernilai angka
// Drills 2: tidak, karena type data string mendukung semua jenis type data
/* Drills 3:
	String, bila menginput lebih dari 2 kata maka akan error
	Integer, bila diinputkan value bernilai String dan simbol maka akan error
	double, bila diinputkan value bernilai String dan simbol maka akan error

*/ 

// Drills 4
import java.util.Scanner;
public class Ex8Drills1234{
	public static void main(String[] args){
		String name, status;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. what is your name?" );
		name 	= keyboard.next();

		System.out.print( "Hi, " + name + "! What's yu're status now?" );
		status 	= keyboard.next();

		System.out.print( "wow yu're, " + status + ", " + name + "! How old are you?" );
		age 	= keyboard.nextInt();

		System.out.print("So yu're " + age + ", eh? That's not very old.");
		System.out.print("How much do you weight, " + name + "? ");
		weight 	= keyboard.nextDouble();

		System.out.println(weight + "! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income 	= keyboard.nextDouble();

		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println("and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");
	}
}

