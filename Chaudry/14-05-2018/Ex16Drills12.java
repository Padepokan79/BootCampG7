/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class Ex16Drills12 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	double first, second;

	System.out.print( "Give me two numbers. First: " );
	first = keyboard.nextDouble();
	
	System.out.print( "Second: " );
	second = keyboard.nextDouble();

	if ( first < second ) {
		System.out.println( first + " is LESS THAN " + second );
	}
	if ( first <= second ) {
		System.out.println( first + " is LESS THAN/EQUAL TO " + second );
	}
	if ( first == second ) {
		System.out.println( first + " is EQUAL TO " + second );
	}
	if ( first >= second ) {
		System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
	}
	if ( first > second ) {
		System.out.println( first + " is GREATER THAN " + second );
	}
	if ( first != second ){
		System.out.println( first + " is NOT EQUAL TO " + second );
		System.out.println( "Hey." );
	}
		
	}
}

/*
 1. jika tidak menggunakan kurung kurawal, baris 34 akan di print jika kondisi TRUE dan tidak akan di print jika kondisi FALSE
 	namun untuk line 35 akan selalu di print walaupun kondisi 33 bernilai FALSE. Dikarenakan perintah 35 tidak masuk kedalam body perintah line 33.
 2.	ketika menggunakan kurung kurawal, barisan 34 dan 35 akan di print bila perintah TRUE dan tidak akan di print bila kondisi FALSE
*/ 