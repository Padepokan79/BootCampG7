/*
	Created By Vikri
	21/05/2018
	8:27
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray66{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Scanner scan = new Scanner(System.in);
		boolean cek = false;

		System.out.print("Masukan angka yang ingin di hapus: ");
		int angka=scan.nextInt();

		for (int i=0; i < arr1.length; i++){
			if (angka == arr1[i]) {
				arr1[i]=0;
				cek = true;
			} else {
				System.out.print(arr1[i]+" ");
			}
		}
		if (cek==false) {
			System.out.print("\nangka "+angka+" tidak ditemukan");
		} else {
			System.out.print("\nangka "+angka+" Berhasil dihapus");
		}
	}
}

