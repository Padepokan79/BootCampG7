/*
	DATE CREATED : 21 MEI 2018
	TIME  		 : 15.00 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int jml = 0, rata;

		int[] angka = {25,14,56,15,36,56,77,18,29,49};

		for (int a = 0; a < angka.length; a++) {
			jml += angka[a];
		}
			System.out.println("");
			System.out.println("Jumlah : "+jml);

			rata = jml/angka.length;
			System.out.println("Rata   : "+rata);

	}
}