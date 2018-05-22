/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 20.31 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray6 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int inputIndex, num = 0;
		boolean cek = false;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};
		int[] angka2= new int[angka.length];

		System.out.print("Nilai : ");
		for ( int number : angka) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");
		System.out.print("Index : "+angka.length);

		System.out.println("");
			System.out.print("Input Index dihapus? ");
			inputIndex = keyboard.nextInt();

		for (int a = 0; a < angka2.length; a++) {
			if (a == inputIndex) {
				angka2[a] = angka2[a];
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
		for ( int numbers : angka2) {
			System.out.print(" "+numbers+" ");
		}
		System.out.println("");
		System.out.println("Index Jml : "+angka2.length);
		System.out.println("");

	}
}