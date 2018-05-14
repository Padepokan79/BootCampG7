/*
	 Program     : Exercise 21 - Nested If Statements
     Creator     : Khairil
     Created At  : 14 Mei 2018 11:10 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class GenderTitles {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title;

		System.out.print( "First Name: " );
		String first = keyboard.next();
		System.out.print( "Last Name: " );
		String last = keyboard.next();
		System.out.print( "Gender (M/F): " );
		String gender = keyboard.next();
		System.out.print( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 ) {
			title = first;
		}
		else {
			if ( gender.equals("F") ) {
				System.out.print( "Are you married, "+first+"? (Y/N): " );
				String married = keyboard.next();
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			//if ( gender.equals("M") )
			else {
				title = "Mr.";
			}
		}

//		System.out.println( "\n" + title + " " + last );
		System.out.println( "\n" + title + " " + first );
	}
}

// 1. will occur error title has not been initialize