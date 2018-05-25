/*
Creted by	: Yana
Time		: 22 Mei 2018 8.44
*/

import java.util.Scanner;

public class TugasArray11{
	public static void main(String[] args){
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] data = new int [arr1.length];
		int jumlah, a=1;

		// for (int index=0; index < arr1.length; ) {
		// 	for (int index2=0; index2 < arr1.length; ) {
		// 		if (arr1[index] > arr1[index2]) {
		// 			tmp = arr1[index2];
		// 			arr1[index2] = arr1[index];
		// 			arr1[index] = tmp;
		// 		}
		// 	}
		// 	System.out.print(arr1[index]+" ");
		// }

		// for (int index=0; index < arr1.length; index++) {

		// 	if (arr1[index] == arr1[a]) {
		// 			System.out.print(arr1[index]+" ");
		// 	}
		// 	a++;
		// }

		for (int index=0; index < arr1.length; index++) {
			
			for (int tampil=a; tampil < arr1.length ; tampil++) {
				if (arr1[index] == arr1[tampil]) {
					System.out.print("Angka ganda "+arr1[index]+" ");
				}
			}
			a++;
		}
	}
}