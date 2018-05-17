/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class PrintedEvenNumber {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int inputAwal, inputAkhir, angka;

		System.out.print("Angka awal  :   ");
		inputAwal 	= keyboard.nextInt();

		System.out.print("Angka Akhir :   ");
		inputAkhir 	= keyboard.nextInt();


		for (angka = inputAwal; angka <= inputAkhir; angka++ ) {
			if (angka%2 == 0) {
				System.out.println("- "+angka);
			}
		}


	}
}