/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class TwoWord {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String inputAwal, inputKedua;
		int jmlKarakterAwal, angka30,jmlKarakterKedua, jmlKarakter, angka, satu = 1;
		angka30 = 30;

		System.out.print("Masukan Input Awal  :   ");
		inputAwal 	= keyboard.next();
		System.out.print("Masukan Input Kedua  :   ");
		inputKedua 	= keyboard.next();


		jmlKarakterAwal  = inputAwal.length();
		jmlKarakterKedua = inputKedua.length();
		jmlKarakter 	 = jmlKarakterAwal + jmlKarakterKedua;
		jmlKarakter 	 = (angka30-1) - jmlKarakter;
		System.out.println("Hasilnya: ");

		System.out.print(inputAwal);
		for (angka = satu; angka <= jmlKarakter; angka++ ) {
			System.out.print(".");
		}
		System.out.print(inputKedua);
	}
}