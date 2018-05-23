/*
Creted by	: Yana
Time		: 22 Mei 2018 10.15
*/

import java.util.Scanner;

public class TugasArray14{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[arr1.length];
		int jumlah, jumlahTotal=0, tampungan=0;
		int posisi1, posisi2;

		for (int tampil : arr1 ) {
			System.out.print(tampil+" ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Index 1 : ");
		posisi1 = keyboard.nextInt();
		System.out.print("Index 2 : ");
		posisi2 = keyboard.nextInt();

		for (int index=0; index < arr1.length; index++) {
			if (posisi1 == index) {
				tampungan = arr1[index];
			}
			else if (posisi2 == index) {
				arr1[posisi1] = arr1[index];
				arr1[posisi2] = tampungan;
			}
		}

		for (int tamp : arr1) {
			System.out.print(tamp+" ");
		}
	}
}