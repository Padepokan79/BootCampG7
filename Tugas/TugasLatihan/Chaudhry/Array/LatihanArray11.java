/*
	DATE CREATED : 22 MEI 2018
	TIME  		 : 08.44 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray11 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int angkaDuplicat = 0, satu = 1;

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[10];
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];

		System.out.print("Nilai : ");
		for ( int number : arr1) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");

			for (int a = 0; a < arr1.length; a++) {
				
				for (int b = satu; b < arr1.length; b++) {
					if (arr1[a] == arr1[b]) {
						System.out.println("Nilai DUPLICAT : "+arr1[a]);
					}
				}
				satu++;
			}

		// System.out.println(""+angkaSama);

	}
}