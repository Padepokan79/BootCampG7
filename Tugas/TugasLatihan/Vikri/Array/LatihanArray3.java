/*
	Created By Vikri
	21/05/2018
	15:34
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray3{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int angka;

		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Angka: ");
		angka=scan.nextInt();
		boolean cek  = false;

		for (int i = 0; i < arr1.length; i++){
			int num = arr1[i];
			if ( angka == num) {
				cek = true;
				System.out.println(angka+" Find and index "+i);
			}
		}
		if (cek == false) {
			System.out.println(angka+" not found");
		}
	}
}