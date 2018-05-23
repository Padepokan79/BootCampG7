/*
Creted by	: Yana
Time		: 21 Mei 2018 15.27
*/

import java.util.Scanner;

public class TugasArray3{
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
		System.out.print("Masukkan pencarian: ");
		search = keyboard.nextInt();
		System.out.println();

		for (int tampil : angka ) {
			if (search == tampil) {
				System.out.print(search+" found");
				status = true;
			}
		}
		if (status == false) {
			System.out.println(search+" not found");
		}
	}
}