/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	09.15
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray15{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int temp;

		System.out.println("\nBefore Sorting ");
		for(int arr : arr1)
			System.out.print(arr+" ");

		for(int index=0; index<arr1.length-1; index++)
			for(int index2=index+1; index2<arr1.length; index2++)
				if(arr1[index]>arr1[index2]){
					temp=arr1[index];
					arr1[index]=arr1[index2];
					arr1[index2]=temp;
				}

		System.out.println("\n\nAfter Sorting ");
		for(int arr: arr1)
			System.out.print(arr+" ");
		System.out.println();
	}
}