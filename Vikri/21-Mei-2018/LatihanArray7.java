/*
	Created By Vikri
	21/05/2018
	8:14
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray66{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int arr2[] = new int[arr1.length+1];

		Scanner scan = new Scanner(System.in);
		boolean cek = false;

		for (int n : arr1) {
			System.out.print(n+" ");
		}

		System.out.print("Masukan angka yang ingin di hapus: ");
		int angka=scan.nextInt();

		System.out.print("Masukan posisi yang ingin di hapus: ");
		int posisi=scan.nextInt();

		int j = 0;
		for (int i=0; i < arr2.length; i++){
			if (posisi == i) {
				arr2[i] = angka;
				cek = true;
			} else {
				arr2[i] = arr1[j]; 
				j++;
			}
		}
		
		for (int n : arr2) {
			System.out.print(n+" ");
		}
		if (cek==false) {
			System.out.print("\nPosisi "+posisi+" tidak ditemukan");
		} else {
			System.out.print("\nPosisi "+posisi+" Berhasil dihapus");
		}
	}
}