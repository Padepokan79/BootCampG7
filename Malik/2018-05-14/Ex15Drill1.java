/*
create by : Malik Chaudhary
time : 14-05-2018 8:34AM
*/

import java.util.Scanner;
public class Ex15Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "You are: " );
		if ( age < 13 ) {
			System.out.println( "\ttoo young to create a Facebook account" );
		}
		if ( age < 16 ) {
			System.out.println( "\ttoo young to get a driver's license" );
		}
		if ( age < 18 ) {
			System.out.println( "\ttoo young to get a tattoo" );
		}
		if ( age < 21 ) {
			System.out.println( "\ttoo young to drink alcohol" );
		}
		if ( age < 35 ) {
			System.out.println( "\ttoo young to run for President of the U.S." );
			System.out.println( "\t\t(How sad!)" );
		  
		}

		/*
			If you type in an age greater than 35 what gets printed? Why?

			tidak akan menampilkan apa apa. mengapa ? karena tidak ada kondisi yang menjalankan untuk usia 35 tahun keatas
		*/
	}
}