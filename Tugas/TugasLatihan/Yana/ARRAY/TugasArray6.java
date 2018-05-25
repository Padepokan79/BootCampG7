/*
Creted by	: Yana
Time		: 21 Mei 2018 20.38
*/

import java.util.Scanner;

public class TugasArray6{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] arr1 	= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2	= new int[arr1.length-1];
		int	jumlah=0, search, a=0;
		boolean status = false;
		
		for (int tampil : arr1) {
			System.out.print(tampil+" ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Hapus posisi: ");
		search = keyboard.nextInt();
		System.out.println();

		// for (int index=search-1; index < arr1.length-1; index++ ) {
		// 	arr1[index] = arr1[index+1];
		// }

		// for (int index=0; index < arr1.length-1; index++) {
		// 	System.out.print(arr1[index]+" ");
		// }

		for (int index=0; index < arr1.length; index++) {
			if (search != index) {
				arr2[a] = arr1[index];
				// System.out.print(arr2[a]+" ");
				a++;
			}
		}
		for (int tampil : arr2 ) {
				System.out.print(tampil+" ");
		}

	}
}