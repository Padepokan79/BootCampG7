/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArraySebelas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int number, angka=1, total=0;
		boolean notFound =true;

		System.out.print("Cari Angka: ");
		number = keyboard.nextInt();

		for ( int num : arr1) {
			if (number == num) {
				notFound = false;
				total+=angka;
			}
		}
		if (notFound == false) {
			System.out.print("Angka Ketemu, ");
			System.out.println("Total angka sama: " + total);
		}else {
			System.out.println("Angka tidak ditemukan");
		}

	}
}


// Tampilkan bilangan2 yang duplikasi pada arr1