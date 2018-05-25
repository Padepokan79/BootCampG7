/*
	 Program     : Tugas Array - 15
     Creator     : Khairil
     Created At  : 22 Mei 2018 09:02 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.*;
import java.util.Scanner;

class ArraySorting {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int temp, minimum;
		boolean done = true;

		for(int index = 0; index < arr1.length; index++) {
			for(int index1 = index+1; index1 < arr1.length; index1++) {
				if(arr1[index] < arr1[index1]) {
					temp = arr1[index1];
					arr1[index1] = arr1[index];
					arr1[index] = temp;
				}
			}
			System.out.print(arr1[index] + " ");
		}
		
		System.out.println();
	}
}

// Mengurutkan nilai pada arr1