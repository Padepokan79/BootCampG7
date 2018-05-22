/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	09.07
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray13{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, arr3={2, 39, 47, 14, 36, 56, 57, 49, 43, 79}, arrnew=new int[arr1.length];

		System.out.println("\nArr 1 ");
		for(int arr : arr1)
			System.out.print(arr+" ");

		System.out.println("\n\nArr 3 ");
		for(int arr : arr3)
			System.out.print(arr+" ");

		for (int index=0; index<arr1.length; index++)
			arrnew[index]=arr1[index]+arr3[index];

		System.out.println("\n\nHasil: ");
		for(int arr: arrnew)
			System.out.print(arr+" ");
		System.out.println();
	}
}