/*
Creted by	: Yana
Time		: 21 Mei 2018 15.42
*/

import java.util.Scanner;

public class TugasArray4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] angka 	= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int	jumlah=0, rataan, search;
		boolean status = false;
		
		for (int tampil : angka) {
			System.out.print(tampil+" ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Masukkan nilai: ");
		search = keyboard.nextInt();
		System.out.println();

		// for (int tampil : angka ) {
		// 	if (search == tampil) {
		// 		System.out.print(search+" found");
		// 		status = true;

		// 		for (int tampil2=0; tampil2 < angka.length; tampil2++) {
		// 			if (angka[tampil2] == search) {
		// 				System.out.println("Posisi nilai adalah: " +(tampil2+1));
		// 			}
		// 		}
		// 	}
		// }
		// if (status == false) {
		// 	System.out.println(search+" not found");
		// }

		//===
		for (int tampil=0; tampil < angka.length; tampil++) {
			if (search == angka[tampil]) {
				System.out.print(search+" ditemukan\n");
				status = true;
			}
			if (angka[tampil] == search) {
				System.out.println("Posisi nilai adalah: " +(tampil+1));
			}
		}
		if (status == false) {
			System.out.println(search+" tidak ditemukan");
		}
	}
}