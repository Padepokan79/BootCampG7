/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 20.25 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray7 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int inputAngka, inputIndex, num = 0;
		boolean cek = false;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};
		int[] angka2 = new int[angka.length+1];

		System.out.print("Nilai : ");
		for ( int number : angka) {
			System.out.print(" "+number+" ");
		}

		System.out.println("");
			System.out.print("Input Angka Sisipan? ");
			inputAngka = keyboard.nextInt();

			System.out.print("Input Index Sisipan? ");
			inputIndex = keyboard.nextInt();

		for (int a = 0; a < angka2.length; a++) {
			if (a == inputIndex) {
				angka2[a] = inputAngka;
				cek = true;
			}else{
				angka2[a] = angka[num];
				num++;
			}
		}
			if (cek == false) {
				System.out.println("");
				System.out.println("Nilai Index "+inputIndex+" tidak ditemukan");
			}
		System.out.println("");
		System.out.print("Nilai : ");
		for ( int number : angka2) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");
		System.out.println("Index Jml : "+angka2.length);
		System.out.println("");

	}
}