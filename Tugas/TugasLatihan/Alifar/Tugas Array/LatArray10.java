/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	06.54
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray10{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int max=arr1[0];

		System.out.println("\nArr 1 ");
		for(int arr : arr1)
			System.out.print(arr+" ");

		for (int index=1; index<arr1.length; index++)
			if(arr1[index]>max)
				max=arr1[index];

		System.out.print("\n\nMaximum value in arr1 is : "+max);
		System.out.println();
	}
}