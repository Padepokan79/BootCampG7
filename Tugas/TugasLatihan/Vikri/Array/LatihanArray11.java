/*
	Created By Vikri
	21/05/2018
	9:19
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray11{
	public static void main(String[] args) {
		int[] arr1 = {25, 25, 26, 26, 26, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Scanner scan = new Scanner(System.in);
		boolean cek = false;

		int angka, total = 0, c = 0;
		System.out.print("Masukan Angka: ");
		angka=scan.nextInt();

		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i];
			if (angka==num){
				c +=1 ;
			}
		}
		System.out.print(c);
	}
}