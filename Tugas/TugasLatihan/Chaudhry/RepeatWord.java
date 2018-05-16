/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class RepeatWord {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String inputKata;
		int jmlKarakter, angka, satu = 1;

		System.out.print("Masukan kata  :   ");
		inputKata 	= keyboard.next();

		jmlKarakter = inputKata.length();
		for (angka = satu; angka <= jmlKarakter; angka++ ) {
			System.out.println(inputKata);
		}


	}
}