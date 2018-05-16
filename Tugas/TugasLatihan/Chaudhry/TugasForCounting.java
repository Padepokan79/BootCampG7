/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class TugasForCounting {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int angkaAwal, kelipatan;
		kelipatan =  4;
		
		for (angkaAwal = 1; angkaAwal <= 1000; angkaAwal++) {
			if (angkaAwal%2 == 1 || angkaAwal%kelipatan == 0) {
				System.out.print(" "+angkaAwal);
			}
		}

	}
}