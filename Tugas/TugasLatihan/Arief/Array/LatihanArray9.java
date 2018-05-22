/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

public class LatihanArraySembilan {
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int total=0, lowest=0;

		int minNumber = arr1[0];
	    for (int i = 0; i < arr1.length; i++) {
	        if (arr1[i] < minNumber) {
	            minNumber = arr1[i];
	        }
	    }
		System.out.println("Min Number " + minNumber);

	}
}

// Tampilkan nilai minimum arr1