/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 20.25 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray5 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int inputAngka, inputIndex;
		boolean cek = false;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};

		System.out.print("Nilai : ");
		for ( int number : angka) {
			System.out.print(" "+number+" ");
		}

		System.out.println("");
			System.out.print("Input Angka? ");
			inputAngka = keyboard.nextInt();

			System.out.print("Input Index? ");
			inputIndex = keyboard.nextInt();

		for (int a = 0; a < angka.length; a++) {
			if (a == inputIndex) {
				angka[a] = inputAngka;

				cek = true;
			}
		}
			if (cek == false) {
				System.out.println("");
				System.out.println("Nilai Index "+inputIndex+" tidak ditemukan");
			}
		System.out.println("");
		System.out.print("Nilai : ");
		for ( int number : angka) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");

	}
}