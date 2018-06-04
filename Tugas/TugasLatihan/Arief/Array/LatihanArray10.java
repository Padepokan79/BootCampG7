/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

public class LatihanArraySepuluh {
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

	    int maxNumber = arr1[0];
	    for (int i = 0; i < arr1.length; i++) {
	        if (arr1[i] > maxNumber) {
	            maxNumber = arr1[i];
	        }
	    }
		System.out.println("Max Number " + maxNumber);

	}
}

// Tampilkan nilai maksimum arr1