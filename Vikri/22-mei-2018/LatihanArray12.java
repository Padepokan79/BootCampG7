/*
	Created By Vikri
	21/05/2018
	9:45
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray12{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};

		Scanner scan = new Scanner(System.in);
		boolean cek = false;

		int total = 0, c = 0;
		int j = 0;

		System.out.println("");
		for (int u = 0; u < arr1.length; u++) {
			int num = arr1[u];
			for (int i = 0; i<arr3.length; i++) {
				int num2 = arr3[i];
				if (num==num2) {
					if (num != arr3[i-1]) {
						System.out.print(num+" ");
					}
				}
			}
		}
	}
}