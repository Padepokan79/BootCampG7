/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArray13 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[]	arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49},
				arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79},
				arr4 = new int[10];

		int number, angka=1, total1=0, total2=0;
		boolean notFound =true;

		for (int index = 0; index < arr4.length; index++) {
			arr4[index] = arr1[index] + arr3[index];
			System.out.println(arr4[index]);
		}

	}
}

// Jumlahkan elemen arr1 dan arr3 simpan pada arr4