/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	09.10
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray14{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int pos1, pos2, temp;

		System.out.println("\nBefore Changes ");
		for(int arr : arr1)
			System.out.print(arr+" ");

		System.out.println("\n\nSwap between values in array");
		System.out.print("position 1 : ");
		pos1=scan.nextInt()-1;
		System.out.print("position 2 : ");
		pos2=scan.nextInt()-1;

		temp=arr1[pos1];
		arr1[pos1]=arr1[pos2];
		arr1[pos2]=temp;

		System.out.println("\nAfter Changes ");
		for(int arr: arr1)
			System.out.print(arr+" ");
		System.out.println();
	}
}