/*
	DATE CREATED : 22 MEI 2018
	TIME  		 : 09.48 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class LatihanArray12 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int angkaDuplicat = 0, satu = 1;

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[10];
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];

		System.out.print("Nilai 1: ");
		for ( int number : arr1) {
			System.out.print(" "+number+" ");
		}
		System.out.println("");
		System.out.print("Nilai 3: ");
		for ( int numbers : arr3) {
			System.out.print(" "+numbers+" ");
		}
		System.out.println("");

			for (int a = 0; a < arr1.length; a++) {
				for (int b = 0; b < arr3.length; b++) {
					if (arr1[a] == arr3[b]) {
						System.out.println("Nilai SAMA : "+arr1[a]);
					}
				}
			}

	}
}