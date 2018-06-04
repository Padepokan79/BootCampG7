/*
	Created By Vikri
	21/05/2018
	15:34
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray4{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int angka;

		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Angka: ");
		angka=scan.nextInt();
		boolean cek  = false;

		for (int n=0; n < arr1.length; n++){
			int num = arr1[n];
			if (angka == num) {
				cek = true;
				System.out.println(angka+" ditemukan di index ke "+n+" posisi ke "+(n+1));
			}
		}
		if (cek==false) {
			System.out.println(angka+" tidak ditemukan");
		}
	}
}