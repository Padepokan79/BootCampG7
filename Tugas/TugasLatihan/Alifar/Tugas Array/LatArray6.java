/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	06.29
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray6{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, newarr=new int[arr1.length-1];
		int del, rest=0;

		System.out.println("\nBefore changes");
		for(int arr : arr1)
			System.out.print(arr+" ");

		System.out.print("\n\nMasukkan posisi yang ingin dihapus: ");
		del=scan.nextInt()-1;

		for (int index=0; index<arr1.length; index++)
			if(index!=del){
				newarr[rest]=arr1[index];
				rest++;
			}

		System.out.println("\nAfter changes");
		for(int arr : newarr)
			System.out.print(arr+" ");
		System.out.println();
	}
}