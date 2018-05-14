/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At :    
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BooleanAnrian2{
	public static void main( String[] args ){

		Scanner keyboard = new Scanner(System.in);
		
		String kelamin, ktp;
		int usia, penghasilan, tinggiBadan;
		boolean accept;

		System.out.print( "Jenis Kelamin (L/P) : " );
		kelamin = keyboard.next();

		System.out.print( "Usia : " );
		usia = keyboard.nextInt();

		System.out.print( "Penghasilan : " );
		penghasilan = keyboard.nextInt();

		System.out.print( "Memiliki KTP (Y/T) : " );
		ktp = keyboard.next();

		System.out.print( "Tinggi Badan: " );
		tinggiBadan = keyboard.nextInt();

		accept = (ktp.equals("Y") && usia >= 20 && penghasilan > 3000000 && ((kelamin.equals("L") && tinggiBadan >= 160) || (kelamin.equals("P") && tinggiBadan >= 153)) );

		System.out.println( "Bolehkah tamu Memasuki TRIANGLE? " + accept );

	}
}