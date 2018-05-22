/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	06.40
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray7{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, newarr=new int[arr1.length+1];
		int num, add, rest=0;

		System.out.println("\nBefore changes");
		for(int arr : arr1)
			System.out.print(arr+" ");

		System.out.print("\n\nMasukkan angka: ");
		num=scan.nextInt();

		System.out.print("\nMasukkan posisi yang ingin disisipkan: ");
		add=scan.nextInt()-1;

		for (int index=0; index<newarr.length; index++)
			if(add==index)
				newarr[index]=num;
			else{
				newarr[index]=arr1[rest];
				rest++;
			}

		System.out.println("\nAfter changes");
		for(int arr : newarr)
			System.out.print(arr+" ");
		System.out.println();
	}
}