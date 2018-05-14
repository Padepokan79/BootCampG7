import java.util.Scanner;
	
public class Ex21Drill1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String title="error";
	
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
			if ( gender.equals("M") ) {
				title = "Mr.";
			}
		}
			System.out.println( "\n" + title + " " + last );
	}
}
/*
baris 31 dirubah menjadi if , maka program tidak bisa d compile, dan muncul pesan error pada baris 35. mengapa ? 
karena pada baris 6 String title tidak ada value alias null, sehingga code pada baris 35 tidak akan bisa diinisialisasikan, 
sebab tidak memiliki value. untuk mengatasinya isikan value pada String title
*/