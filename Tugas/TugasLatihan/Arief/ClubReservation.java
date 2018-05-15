/*
Date Created	: 14 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
public class ClubReservation {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);


		int age, daughterAge, minAge, minAgeMelodies, minAgeBrondong, minAgeBrondong2, maxAge, maxAgeBrondong, maxAgeBrondong2;
		String gender, days;
		double income, cute, cuteness;
		boolean allowed, cw, cwo, melodies, ladies, jomblo, brondong;

		cuteness = 8;

		minAgeMelodies = 40;
		// maxAge = 30;

		minAge = 21;
		maxAge = 30;			

		minAgeBrondong = 30;
		maxAgeBrondong = 45;
		minAgeBrondong2 = 20;
		maxAgeBrondong2 = 25;

		System.out.print( "Hari yang diinginkan: " );
		days = inputKey.next();

		System.out.print( "Umur Anda : " );
		age = inputKey.nextInt();

		System.out.print( "Jenis Kelamin ( \"Cewek\" / \"Cowok\" ) : " );
		gender = inputKey.next();
		cw  = gender.equals("Cewek");
		cwo  = gender.equals("Cowok");

		System.out.print( "Penampilan, dalam skala 0 sampai 10? " );
		cute = inputKey.nextDouble();	

		System.out.println( "=========================================================" );
		System.out.println( "CLUB Reservation " );
		System.out.println( );
		System.out.println( "Hari yang diinginkan: " + days );
		System.out.println( "Umur anda: " + age );
		System.out.println( "Jenis Kelamin: " + gender );
		System.out.println( "Penampilan, rate dari 0 s.d 10: 8 " + cute );
		System.out.println( "=========================================================" );

		if( days.equals("Jumat") ) {
			if(melodies = ( (cw || cwo) && (age > minAgeMelodies) && (cute >= cuteness || cute <= cuteness) )) {
				System.out.println( "Reservasi Melodies Memory Sukses !!!" );
			}else{
				System.out.println( "Anda Tidak Diperkenankan Masuk !!!" );
			}
		}else if(days.equals("Kamis")) {
			if (ladies = ( cw && (age >= minAge && age <= maxAge) && cute >= cuteness )) {
				System.out.println( "Reservasi Ladies Night Sukses !!!" );
			}else{
				System.out.println( "Anda Tidak Diperkenankan Masuk !!!" );
			}
		}else if(days.equals("Sabtu")) {
			if (jomblo = ( (cw || cwo) && (age >= minAge && age <= maxAge) && (cute >= cuteness) )) {
				System.out.println( "Reservasi Jomblo Night Sukses !!!" );
			}else{
				System.out.println( "Anda Tidak Diperkenankan Masuk !!!" );
			}
		}else if(days.equals("Selasa")) {
			if (brondong = ((cw && (age >= minAgeBrondong && age <= maxAgeBrondong) && cute >= cuteness) || (cwo && (age >= minAgeBrondong2 && age <= maxAgeBrondong2) && cute < cuteness))) {
				System.out.println( "Reservasi Brondong Night Sukses !!!" );
			}else{
				System.out.println( "Anda Tidak Diperkenankan Masuk !!!" );
			}
		}else{
			System.out.println( days + " Dibuka Untuk Umum" );			
		}

		System.out.println( "=========================================================" );



	}
	
}