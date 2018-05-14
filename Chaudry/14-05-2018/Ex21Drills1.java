/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class Ex21Drills1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String title;

		System.out.print( "First name: " );
		String first = keyboard.next();
		System.out.print( "Last name: " );
		String last = keyboard.next();
		System.out.print( "Gender (M/F): " );
		String gender = keyboard.next();
		System.out.print( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 ) {
			title = first;
		}else {
			if ( gender.equals("F") ) {
				System.out.print( "Are you married, "+first+"? (Y/N): " );
				String married = keyboard.next();
				
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}else {
					title = "Ms.";
				}
			}
			else {
				title = "Mr.";
			}
			// if ( gender.equals("M") ) {
			// 	title = "Mr.";
			// }
			// akan terjadi error, dikarenakan variable title belum diinisialisasikan
		}

		System.out.println( "\n" + title + " " + last );
	}
}	