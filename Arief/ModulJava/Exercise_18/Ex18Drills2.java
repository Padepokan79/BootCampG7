/*
Date Created	: 14 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex18Drills2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);


		int age, daughterAge, x;
		double income, cute;
		boolean grandMaAllowed, grandPaAllowed, dadAllowed, momAllowed;

		System.out.println( "Ayah & Ibu \t: Anak kami berusia 25 Tahun. " );
		System.out.println( "Kakek & Nenek \t: Cucu kami berusia 25 Tahun. " );
		daughterAge = 25;
		// daughterAge = keyboard.nextInt();

		System.out.print( "Berapa usia mu wahai anak muda? " );
		age = keyboard.nextInt();
		
		System.out.print( "Dalam skala 0.0 to 10.0, berapa kamu menilai ketampanan mu? " );
		cute = keyboard.nextDouble();

		System.out.print( "Berapa gaji yang kamu dapatkan? " );
		income = keyboard.nextDouble();


		if ( grandMaAllowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) ) ) {
			System.out.println( "Nenek Setuju" );
		}
		else {
			System.out.println( "Nenek Tidak Menyetujui" );	
		}
		if (grandPaAllowed = ( age >= 30 && income >= 5000000 )) {
			System.out.println( "Kakek Setuju" );
		}
		else {
			System.out.println( "Kakek Tidak Menyetujui" );	
		}
		if (dadAllowed = ( (age >= 17 && age < 30) && ( income >= 5000000 && cute >= 8 ) ) ) {
			System.out.println( "Ayah Setuju" );
		}
		else {
			System.out.println( "Ayah Tidak Menyetujui" );	
		}
		if (momAllowed = ( ( (age <= (daughterAge + 5)) && (age >= (daughterAge - 5)) ) && ( income >= 5000000 && cute >= 8 ) )) {
			System.out.println( "Ibu Setuju" );
		}
		else {
			System.out.println( "Ibu Tidak Menyetujui" );
		}
		if ( !grandMaAllowed && !grandPaAllowed && !dadAllowed && !momAllowed) {
			System.out.println( "Tidak ada yang setuju" );
		}
	}
}