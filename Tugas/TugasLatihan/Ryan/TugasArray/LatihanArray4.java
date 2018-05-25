/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 15:30
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanArray4{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int sum=0, cari;

		System.out.println("\n===================================");
		System.out.println("\t\tAku dimana\t\t");
		System.out.println("===================================");
		System.out.println();
		System.out.print("Masukan angka : ");
		cari = key.nextInt();

		for (int i =0; i < arr1.length; i++) {
			if (cari == arr1[i]) {
				System.out.println("Angka nya ada di index ke "+sum);
			}
			sum++;
		}

	}
}