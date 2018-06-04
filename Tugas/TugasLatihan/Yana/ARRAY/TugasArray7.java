/*
Creted by	: Yana
Time		: 21 Mei 2018 06.19
*/

import java.util.Scanner;

public class TugasArray7{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] arr1 	= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 	= new int[arr1.length+1];
		int	jumlah=0, posisi, tambah, plus=0;
		boolean status = false;
		
		for (int tampil : arr1) {
			System.out.print(tampil+" ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Index: ");
		posisi = keyboard.nextInt();
		System.out.print("Nilai: ");
		tambah = keyboard.nextInt();
		System.out.println();

		// for (int index = arr1.length; index > arr1.length; index--) {
		// 	// arr2[index] = arr1[index];
		// 	if (posisi == index) {
		// 		arr2[index] = tambah;s
		// 	}else if(posisi < index){
		// 		arr2[index+1] = arr1[index];
		// 	}else if (posisi > index) {
		// 		arr2[index] = arr1[index];
		// 	}
		// 	System.out.print(arr2[index]+" ");
		// }

		for (int index=0; index < arr2.length; index++) {
			if (posisi == index) {
				arr2[index] = tambah;
			}else {
				arr2[index] = arr1[plus];
				plus++;
			}
			System.out.print(arr2[index]+" ");
		}

		//=====
		// for (int index=posisi+1; index < arr2.length; index++ ) {
		// 	arr2[index] = arr2[index-1];
		// }

		// for (int index=0; index < arr2.length-1; index++) {
		// 	System.out.print(arr2[index]+" ");
		// }
	}
}