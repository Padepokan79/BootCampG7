/*
Date Created	: 14 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex18Drills3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);


		int age, daughterAge, x, totSetuju;
		double income, defIncome, cute;
		boolean grandMaAllowed, grandPaAllowed, dadAllowed, momAllowed;

		daughterAge = 25;
		totSetuju = 0;
		defIncome = 10000000;

		System.out.println( "Raja & Ratu & Putra Mahkota & Permaisuri: Putri Kerajaan berusia 25 Tahun. " );
		// daughterAge = keyboard.nextInt();

		System.out.print( "Berapa usia mu wahai anak muda? " );
		age = keyboard.nextInt();
		
		System.out.print( "Dalam skala 0.0 to 10.0, berapa kamu menilai ketampanan mu? " );
		cute = keyboard.nextDouble();

		System.out.print( "Berapa gaji yang kamu dapatkan? " );
		income = keyboard.nextDouble();


		if ( grandMaAllowed = ( age > 25 && age < 40 && ( income > defIncome || cute >= 8.5 ) ) ) {
			System.out.println( "Ratu Setuju" );
			totSetuju+=1;
		}
		else {
			System.out.println( "Ratu Tidak Menyetujui" );	
		}
		if (grandPaAllowed = ( age >= 30 && income >= defIncome )) {
			System.out.println( "Raja Setuju" );
			totSetuju+=1;
		}
		else {
			System.out.println( "Raja Tidak Menyetujui" );	
		}
		if (momAllowed = ( (age >= 17 && age < 30) && ( income >= defIncome && cute >= 8 ) ) ) {
			System.out.println( "Putra Mahkota Setuju" );
			totSetuju+=1;
		}
		else {
			System.out.println( "Putra Mahkota Tidak Menyetujui" );	
		}
		if (dadAllowed = ( ( (age <= (daughterAge + 5)) && (age >= (daughterAge - 5)) ) && ( income >= defIncome && cute >= 8 ) )) {
			System.out.println( "Permaisuri Setuju" );
			totSetuju+=1;
		}
		else {
			System.out.println( "Permaisuri Tidak Menyetujui" );
		}
		// if ( !grandMaAllowed && !grandPaAllowed && !dadAllowed && !momAllowed) {
		// 	System.out.println( "Tidak ada yang setuju" );
		// }
		if (totSetuju >= 2) {
			System.out.println( "Anda disetujui kerajaan dan dapat menikah." );
		}
		else {
			System.out.println( "Anda tidak disetujui pihak kerajaan, ENYAHLAH DARI HADAPAN KAMI!." );	
		}


		/*if ( grandMaAllowed ) {
			if ( grandPaAllowed ) {
				System.out.println( "Anda disetujui keluarga dan dapat menikah." );
			}
			if ( momAllowed ) {
				System.out.println( "Anda disetujui keluarga dan dapat menikah." );		
			}
			if ( dadAllowed ) {
				System.out.println( "Anda disetujui keluarga dan dapat menikah." );	
			}
		}
		if ( grandPaAllowed ) {
			if ( momAllowed ) {
				System.out.println( "Anda disetujui keluarga dan dapat menikah." );		
			}
			if ( dadAllowed ) {
				System.out.println( "Anda disetujui keluarga dan dapat menikah." );	
			}
		}*/

	}
}