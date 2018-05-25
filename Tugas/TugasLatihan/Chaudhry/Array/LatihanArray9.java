/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 19.40 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray9 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int jml, nilaiMin = 1000;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};


		System.out.println("");
		System.out.print("Array Number : \t");
		for (int tampil : angka) {
			System.out.print(tampil+" ");
		}
		System.out.println("");


		for (int a = 0; a < angka.length; a++) {
			if (angka[a] < nilaiMin) {
				nilaiMin = angka[a];
			}
		}	
		System.out.println("Nilai Min : "+nilaiMin);

	}
}