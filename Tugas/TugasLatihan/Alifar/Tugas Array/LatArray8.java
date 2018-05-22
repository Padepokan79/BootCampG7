/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	06.47
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray8{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, arr2=new int[10];

		System.out.println("\nIn arr1");
		for(int arr : arr1)
			System.out.print(arr+" ");

		for (int index=0; index<arr1.length; index++)
				arr2[index]=arr1[index];

		System.out.println("\nIn arr2");
		for(int arr : arr2)
			System.out.print(arr+" ");
		System.out.println();
	}
}