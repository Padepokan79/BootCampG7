/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Arief02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String hari;
		boolean allowed, yep, yep2, yep3, yep4, yep5, nope, nope2;

		System.out.println( "Toko Elekronik" );
		System.out.println();

		System.out.print( "Hari apa sekarang? (\'Senin\'/\'Selasa\'/\'Rabu\'/\'Kamis\'/\'Jumat\'/\'Sabtu\'/\'Minggu) " );
		hari = inputKey.next();
		yep = hari.equals("Senin");
		yep2 = hari.equals("Selasa");
		yep3 = hari.equals("Rabu");
		yep4 = hari.equals("Kamis");
		yep5 = hari.equals("Sabtu");
		nope = hari.equals("Jumat");
		nope2 = hari.equals("Minggu");

		allowed = (yep == true || yep2 == true || yep3 == true || yep4 == true || yep5 == true) || (nope == true || nope2 == false);

		System.out.println();
		System.out.println( "Hari ini Buka? " + allowed );

	}
}

	/*
	2. Toko Elekronik.
	Toko buka di hari senin s/d kamis, dan sabtu.
	Selain itu toko tutup.
	*/