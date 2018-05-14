/*
	 Program     : Exercise 18 - Drills3
     Creator     : Khairil
     Created At  : 14 Mei 2018 09:50 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class Drills3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int usiaAnakP = 25, inputUsia; 
		Double inputIncome, inputPenampilan; 
		Boolean ayahS, ibuS, kakekS, nenekS, nVSk, nVSi, nVSa, nvKi, nvKa, nvIa, selisihUsia;

		System.out.print( "Usia anda berapa      ?  : " );
		inputUsia = keyboard.nextInt();

		System.out.print( "Income anda berapa    ?  : " );
		inputIncome = keyboard.nextDouble();

		System.out.print( "Seberapa Ganteng Anda ? Skala 0.0 - 10.0  : " );
		inputPenampilan = keyboard.nextDouble();

		selisihUsia = inputUsia <= usiaAnakP + 5 && inputUsia >= usiaAnakP - 5;

		nenekS = inputUsia > 23 && inputUsia < 40 && ( inputIncome >= 10000000 || inputPenampilan >= 9.0 );
		kakekS = inputUsia >= 30 && inputIncome >= 10000000 && inputPenampilan >= 0.0;
		ibuS   = inputUsia >= 17 && inputUsia < 30 && inputIncome >= 10000000 && inputPenampilan >= 9.0;
		ayahS  = selisihUsia && (inputIncome>= 10000000 || inputPenampilan >= 8);		

		if( nenekS == true ) {
			System.out.println( "Nenek, menyetujui" );
		}
		else {
			System.out.println( "Nenek, tidak menyetujui" );	
		}

		if( kakekS == true ) ) {
			System.out.println( "Kakek, menyetujui" );
		}
		else {
			System.out.println( "Kakek, tidak menyetujui" );	
		}

		if( ibuS == true ) {
			System.out.println( "Ibu, menyetujui" );
		}
		else {
			System.out.println( "Ibu, tidak menyetujui" );	
		}

		if( ayahS == true ) {
			System.out.println( "Ayah, menyetujui" );
		}
		else {
			System.out.println( "Ayah, tidak menyetujui" );	
		}

		nVSk   = nenekS && kakekS; 
		nVSi   = nenekS && ibuS;
		nVSa   = nenekS && ayahS;

		nvKi   = kakekS && ibuS;
		nvKa   = kakekS && ayahS;

		nvIa   = ibuS && ayahS;

		if( nVSk == true || nVSi == true || nVSa == true || nvKi == true || nvKa == true || nvIa == true ) {
			System.out.println( "Boleh menikah" );
		}
		else {
			System.out.println( "Tidak boleh menikah" );	
		}
	}
}