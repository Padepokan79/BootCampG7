/*
Creted by	: Yana
Time		: 22 Mei 2018 8.44
*/

import java.util.Scanner;

public class TugasArray12{
	public static void main(String[] args){
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};

		for (int index=0; index < arr1.length; index++) {
			
			for (int tampil=0; tampil < arr3.length ; tampil++) {
				if (arr1[index] == arr3[tampil]) {
					System.out.print(""+arr1[index]+" ");
				}
			}
		}
	}
}