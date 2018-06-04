/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 19.40 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray8 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int jml;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};
		int[] number = new int[angka.length];

		for (int a = 0; a < angka.length; a++) {
			number[a] = angka[a];
		}
		System.out.println("");
		System.out.print("Array Number : \t");
		for (int tampil : number) {
			System.out.print(tampil+" ");
		}
		System.out.println("");

	}
}