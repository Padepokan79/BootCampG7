/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 15.00 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray3 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int angkaCari;
		boolean cek = false;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};

		System.out.print("Nilai : ");
		for ( int number : angka) {
			System.out.print(" "+number+" ");
		}

		System.out.println("");
		System.out.print("Input angka? ");
		angkaCari = keyboard.nextInt();
		for ( int num : angka ) {
			if ( num == angkaCari ) {
				System.out.println("");
				System.out.println( num + " Ditemukan.");
				cek = true;
			}
		}
			if (cek == false) {
				System.out.println("");
				System.out.println(angkaCari+" Data tidak ditemukan");
			}

	}
}