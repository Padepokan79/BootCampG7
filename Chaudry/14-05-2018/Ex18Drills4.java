/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class Ex18Drills4 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		String bis1, bis2, bis3, bis4, bis5, bis6;
		int inputKursi;
		boolean hasil;

		bis1 	= "Bis Dengan Kursi 60";
		bis2 	= "Bis Dengan Kursi 45";
		bis3 	= "Bis Dengan Kursi 32";
		bis4 	= "Bis Dengan Kursi 18";
		bis5 	= "Bis Dengan Kursi 12";
		bis6 	= "Bis Dengan Kursi 6 Executive";

		System.out.print("Masukan jumlah penumpang: ");
		inputKursi 	= keyboard.nextInt();

		System.out.print("Bis yang tersedia: ");
		System.out.println();

		if (inputKursi >= 60) {
			System.out.println(bis1);
		}
		if (inputKursi >= 45) {
			System.out.println(bis2);
		}
		if (inputKursi >= 32) {
			System.out.println(bis3);
		}
		if (inputKursi >= 18) {
			System.out.println(bis4);
		}
		if (inputKursi >= 12) {
			System.out.println(bis5);
		}
		if (inputKursi >= 6 || inputKursi >=1) {
			System.out.println(bis6);
		}
	}

}

// System.out.print("\t"+bis1+"\n\t"+bis2+"\n\t"+bis3+"\n\t"+bis4+"\n\t"+bis5+"\n\t"+bis6);