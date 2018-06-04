/*
Creted by	: Yana
Time		: 22 Mei 2018 10.15
*/

import java.util.Scanner;

public class TugasArray15{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[arr1.length];
		int min=1000, temp, a=1;

		for (int ind = 0; ind < arr1.length; ind++) {

			for (int index = ind+1; index < arr1.length; index++) {
				if (arr1[ind] > arr1[index]) {
					temp = arr1[ind];
					arr1[ind] = arr1[index];
					arr1[index] = temp;
				}
			}	
		}

		// for (int index=0; index < arr1.length; index++) {
			
		// 	for (int tampil=a; tampil < arr1.length ; tampil++) {
		// 		if (arr1[index] < arr1[tampil]) {
		// 			min = arr1[tampil];
		// 		}
		// 	}
		// 	a++;
		// }

		for (int tampil : arr1 ) {
		System.out.print(tampil+" ");	
		}
	}
}