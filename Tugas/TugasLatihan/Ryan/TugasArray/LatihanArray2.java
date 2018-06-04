/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 14:26
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanArray2{
	public static void main(String[] args) {

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int sum=0;

		System.out.println("\n===================================");
		System.out.println("		Jumlah dan Rata rata	");
		System.out.println("===================================");
		System.out.println();
		System.out.print("Jumlah dari Array arr1 : "+arr1.length);
		for (int i : arr1) {
			sum = sum+i;
		}
		System.out.println();
		System.out.println("Rata rata dari array arr1 : "+sum/arr1.length);

	}
}