/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	15.35
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray5{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int num, index;

		System.out.print("Masukkan angka: ");
		num=scan.nextInt();
		System.out.print("Masukkan index: ");
		index=scan.nextInt();

		System.out.println("\nBefore changes");
		for(int arr : arr1)
			System.out.print(arr+" ");

		arr1[index]=num;

		System.out.println("\n\nAfter changes");
		for(int arr : arr1)
			System.out.print(arr+" ");
		System.out.println();
	}
}
//rata-rata
//apakah ada suatu bilangan
//suatu bilangan ada di posisi/index ke berapa
//terima nilai dan ubah nilai u/ suatu posisi pada arr1