/*
	 Program     : Tugas Array - 13
     Creator     : Khairil
     Created At  : 22 Mei 2018 09:02 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArraySumBetweenArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[arr1.length];
		int	countArray = 0;

		for(int index = 0; index < arr1.length; index++) {
			countArray = arr1[index] + arr3[index];
			arr4[index] = countArray;
			System.out.print("Arr4 = {" + arr4[index] + " " + "}");
		}
		System.out.println();
	}
}

// Tampilkan bilangan2 yang sama2 ada di arr1 dan arr3