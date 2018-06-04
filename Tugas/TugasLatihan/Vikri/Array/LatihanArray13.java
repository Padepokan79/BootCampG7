/*
	Created By Vikri
	21/05/2018
	10:45
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray13{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];

		Scanner scan = new Scanner(System.in);
		boolean cek = false;

		int total = 0, c = 0;
		int j = 0;

		System.out.println("");
		for (int u = 0; u < arr1.length; u++) {
			arr4[u] = arr1[u] + arr3[u];
			System.out.print(arr4[u]+" ");
		}
	}
}