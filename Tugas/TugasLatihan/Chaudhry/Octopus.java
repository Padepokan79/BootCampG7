/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class Octopus {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String inputKata, tampil;
		int jmlKarakter, angka, nol = 0;

		System.out.print("Masukan kata  :   ");
		inputKata 	= keyboard.nextLine();

		jmlKarakter = inputKata.length();

		System.out.println("Hasilnya: ");
		for (angka = nol; angka < jmlKarakter; angka++ ) {
			System.out.println(inputKata.charAt(angka));
		}


	}
}