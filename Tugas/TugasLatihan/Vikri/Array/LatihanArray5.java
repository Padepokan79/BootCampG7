/*
	Created By Vikri
	21/05/2018
	8:27
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray5{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Scanner scan = new Scanner(System.in);
		boolean cek = false;


		for (int i=0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("Masukan angka yang ingin : ");
		int angka=scan.nextInt();

		System.out.print("Masukan posisi yang ingin : ");
		int posisi=scan.nextInt();

		arr1[posisi-1] = angka;

		for (int num : arr1) {
			System.out.print(num+" ");
		}
	}
}