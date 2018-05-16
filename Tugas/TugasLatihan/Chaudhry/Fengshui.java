/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class Fengshui {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String tampil, inputHp;
		int jmlKarakter, angka, nol = 0;

		System.out.print("Masukan No HP  :   ");
		inputHp 	= keyboard.nextLine();
		jmlKarakter = inputHp.length();

		System.out.println("Hasilnya: ");
		for (angka = nol; angka < jmlKarakter; angka++ ) {
			// System.out.print(inputHp.charAt(angka));
			System.out.print(inputHp.charAt(angka));
			if (inputHp.charAt(angka) == '0') {
				System.out.println(" Khusus, spesial, langka");
			}
			if (inputHp.charAt(angka) == '1') {
				System.out.println(" Satu, satu-satunya, diri sendiri");
			}
			if (inputHp.charAt(angka) == '2') {
				System.out.println(" Mudah, gampang, tidak sulit");
			}
			if (inputHp.charAt(angka) == '3') {
				System.out.println(" menemukan, mendapatkan, hidup");
			}
			if (inputHp.charAt(angka) == '4') {
				System.out.println(" Mati, miskin, susah");
			}
			if (inputHp.charAt(angka) == '5') {
				System.out.println(" Tidak akan, tidak pernah, tidak bisa");
			}
			if (inputHp.charAt(angka) == '6') {
				System.out.println(" Menuju, akan");
			}
			if (inputHp.charAt(angka) == '7') {
				System.out.println(" Tepat, hoki, atau bisa disebut juga ketuhanan");
			}
			if (inputHp.charAt(angka) == '8') {
				System.out.println(" Makmur");
			}
			if (inputHp.charAt(angka) == '9') {
				System.out.println(" Sukses");
			}
				
		}


	}
}