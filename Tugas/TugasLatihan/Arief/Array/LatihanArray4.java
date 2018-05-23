/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArrayEmpat {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int number, posisi = 0;
		boolean notFound = true;

		System.out.print("Cari Angka: ");
		number = keyboard.nextInt();

		for ( int num : arr1) {
			posisi++;
			if (number == num) {
				System.out.println("Angka Ketemu");
				System.out.println("Angka di posisi " + posisi);
				notFound = false;
			}
		}

		if (notFound == true) {
			System.out.println("Angka tidak ditemukan");
		}

	}
}

// Suatu bilangan ada di-posisi/index ke berapa di arr1?