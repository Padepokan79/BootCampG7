/* 
Created by  		: Richa Fitria
Date/hour			: 29 Mei 2018/ 3.20 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class LatihanMethod1 {
	public static void main( String[] args ) {

		int [] arr1 = {1,6,33,4,6,66,5,11,23};
		int [] arr2 = {5,3,53,80,6,6,12,23};
		int [] arr3 = {33,16,33,40,6,36,44,13,23};
		int [] arr4 = {5,63,0,4,6,26,5,31,23};
		int [] arr5 = {4,6,3,4,23};
		int [] arr6 = {5,6,3,14,6,66,5,11,23};
		int [] arr7 = {2,6,33,4,5,11,13};
		int [] arr8 = {5,6,9,42,6,6,5,11,3};
		int [] arr9 = {4,61,19,42,5,11,9,3};
		int [] arr10 = {1,8,4,42};

		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		printArr(arr5);
		printArr(arr6);
		printArr(arr7);
		printArr(arr8);
		printArr(arr9);
		printArr(arr10);
		System.out.println(	);	

		printArray(arr1, 6);
		printArray(arr2, 4);
		printArray(arr3, 4);
		printArray(arr4);
		printArray(arr5);
		printArray(arr6);
		printArray(arr7);
		printArray(arr8);
		printArray(arr9);
		printArray(arr10);
	}

	public static void printArr(int [] array  ) {
		for (int arr : array) {
			System.out.print(arr+ " ");
		}
		System.out.println(	);
	}

	public static void printArray (int [] array, int index )  {
		for (; index < array.length; index++) {
			System.out.print(array[index]);
		}
		System.out.println(	);
	}
}