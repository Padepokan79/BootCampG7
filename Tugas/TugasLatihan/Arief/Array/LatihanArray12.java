/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArray12 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[]	arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49},
				arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79},
				arrTemp = new int[arr1.length];
		int number, angka=1, total1=0, total2=0, indexTemp=0;
		boolean notFound =true;

		System.out.println("Array 1: ");
		for ( int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println("\nArray 3: ");
		for ( int num : arr3) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("\nArray Sama: ");
		for (int index1 = 0; index1 < arr1.length; index1++) {
			// int num1 = arr1[index1];
			for (int index3 = 0; index3 < arr3.length; index3++) {
				// int num3 = arr3[index3];
				notFound = true;
				if (arr1[index1] == arr3[index3]) {
					for (int x = 0; x < indexTemp; x++) {
						if (arr1[index1] == arrTemp[x]) {
							notFound = false;
						}
					}
					if (notFound) {
						arrTemp[indexTemp]=arr1[index1];
						indexTemp++;
					}
				}
			}
		}
		for ( int z = 0; z < indexTemp; z++ ) {
			System.out.print(arrTemp[z] + " ");
		}

	}
}

// Tampilkan bilangan2 yang sama2 ada di arr1 dan arr3