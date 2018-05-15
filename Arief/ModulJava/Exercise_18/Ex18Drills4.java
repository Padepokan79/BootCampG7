/*
Date Created	: 14 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex18Drills4 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int passenger;

		System.out.println("IKAN Travel 6b");

		System.out.print("Masukan Jumlah Penumpang: ");
		passenger = keyboard.nextInt();

		System.out.println("Bis yang tersedia: ");
		if ( passenger >= 60 ) {
			System.out.println("\tBis Dengan Kursi 60");
		}
		if ( passenger >= 45 ) {
			System.out.println("\tBis Dengan Kursi 45");
		}
		if ( passenger >= 32 ) {
			System.out.println("\tBis Dengan Kursi 32");
		}
		if ( passenger >= 18 ) {
			System.out.println("\tBis Dengan Kursi 18");
		}
		if ( passenger >= 12 ) {
			System.out.println("\tBis Dengan Kursi 12");
		}
		if ( passenger > 0 ) {
			System.out.println("\tBis Dengan Kursi 6 Executive");
		}

		/*
	IKAN Travel 6b

Bis Dengan Kursi 60
Bis Dengan Kursi 45
Bis Dengan Kursi 32
Bis Dengan Kursi 18
Bis Dengan Kursi 12
Bis Dengan Kursi 6 Executive

Masukan Jumlah Penumpang: 31
Bis yang tersedia:

Bis Dengan Kursi 18
Bis Dengan Kursi 12
Bis Dengan Kursi 6 Executive

		*/

	}
}