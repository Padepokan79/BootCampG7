/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArray14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int posisi1, posisi2, temp;
		boolean notFound=true;

		for ( int x : arr1) {
			System.out.print(x + " ");
		}
		
		System.out.println();

		System.out.print("Input posisi Pertama: ");
		posisi1 = keyboard.nextInt()-1;

		System.out.print("Input posisi Kedua: ");
		posisi2 = keyboard.nextInt()-1;

		temp = arr1[(posisi2)];
		arr1[(posisi2)] = arr1[(posisi1)];
		arr1[(posisi1)] = temp;
		

		System.out.println();
		for ( int x : arr1) {
			System.out.print(x + " ");
		}
	}
}

// Tukar nilai antara dua posisi pada arr1