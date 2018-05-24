/*
	Created By Vikri
	21/05/2018
	10:57
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray14{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int arr2[] = new int[arr1.length+1];

		Scanner scan = new Scanner(System.in);
		boolean cek = false;

		for (int n : arr1) {
			System.out.print(n+" ");
		}

		System.out.print("Masukan posisi ke 1: ");
		int angka=scan.nextInt()-1;

		System.out.print("Masukan posisi ke 2: ");
		int angka2=scan.nextInt()-1;

		int k = arr1[angka];
		int b;
		b = arr1[angka2];
		arr1[angka2] = arr1[angka];
		arr1[angka] = b;

		for (int n = 0; n < arr1.length; n++) {
			System.out.print(arr1[n]+" ");
		}
	}
}