/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArrayLima {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int number, posisi;
		boolean notFound=true;

		for ( int x : arr1) {
			System.out.print(x + " ");
		}
		
		System.out.println();

		System.out.print("Input Angka baru: ");
		number = keyboard.nextInt();

		System.out.print("Input posisi yang diganti: ");
		posisi = keyboard.nextInt();

		// int num = arr1[(posisi-1)];
		// System.out.println(num);
		// num = number;
		arr1[(posisi-1)] = number;
		// System.out.println("test " + arr1[(posisi-1)]);

		System.out.println();
		for ( int x : arr1) {
			System.out.print(x + " ");
		}
	}
}

// Terima nilai dan ubah nilai u/ suatu posisi pada arr1
