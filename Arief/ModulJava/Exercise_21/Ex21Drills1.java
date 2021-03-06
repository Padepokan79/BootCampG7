import java.util.Scanner;

public class Ex21Drills1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title = "error";

		System.out.println( "First Name: " );
		String first = keyboard.next();
		System.out.println( "Last Name: " );
		String last = keyboard.next();
		System.out.println( "Gender (M/F): " );
		String gender = keyboard.next();
		System.out.println( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 ) {
			title = first;
		}
		else {
			if ( gender.equals("F") ) {
				System.out.println( "Are you married, " + first + "? (Y/N): " );
				String married = keyboard.next();
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			if (gender.equals("M")) {
				title = first;
			}
		}

		System.out.println( "\n" + title + " " + last );
	}
}