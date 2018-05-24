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

public class LatihanArray3{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int sum=0, cari;

		System.out.println("\n===================================");
		System.out.println("\t\tFind me\t\t");
		System.out.println("===================================");
		System.out.println();
		System.out.println("Ada? atau Tidak?");
		System.out.print("Coba ketik angkanya : ");
		cari = key.nextInt();
		System.out.println();
		
		boolean cek = false;

		for (int i : arr1) {
			if (i == cari) {
				System.out.println(i + " Found");
				cek = true;
			}
		}
		if (cek == false) {
			System.out.println(cari+" not found");
		}

	}
}