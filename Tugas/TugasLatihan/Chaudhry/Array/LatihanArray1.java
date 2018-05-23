/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 15.00 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int jml;

		int[] angka = {1,4,2,5,7,10};
		int[] number = new int[angka.length];

		for (int a = 0; a < angka.length; a++) {
			number[a] = angka[a];
		}
		System.out.print("Array Number : \t");
		for (int tampil : number) {
			System.out.print(tampil+" ");
		}

	}
}