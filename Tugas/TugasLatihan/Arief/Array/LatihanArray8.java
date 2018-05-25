/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

public class LatihanArrayDelapan {
	public static void main(String[] args) {
		int[] 	arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49},
				arr2 = new int[10];

		System.out.print("Arr1 : ");
		for ( int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.print("\nArr2 : ");
		for (int index = 0; index < arr1.length; index++) {
			arr2[index] = arr1[index];
			// System.out.print(arr2[index] + " ");
		}

		for ( int x : arr2) {
			System.out.print(x + " ");
		}
	}
}

// Copy isi arr1 ke arr2