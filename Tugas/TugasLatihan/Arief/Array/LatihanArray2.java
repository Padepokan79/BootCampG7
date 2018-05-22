/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

public class LatihanArrayDua {
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int total=0;

		for (int index = 0; index < arr1.length; index++) {
			int num = arr1[index];
			total+=num;
		}
		System.out.println("Jumlah Data:\t" + total);
		System.out.println("Rata-rata: \t" + (total/arr1.length));

	}
}

// Hitung jumlah dan rata-rata dari arr1 di atas