/*
	Created By Vikri
	21/05/2018
	4:16
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray7{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];	
			System.out.print(arr2[i]+" ");
		}
	}
}