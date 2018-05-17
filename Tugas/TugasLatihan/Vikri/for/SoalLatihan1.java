/*
	Created By Vikri
	16/05/2018
	11:57
*/
import java.util.Random;
import java.util.Scanner;

public class SoalLatihan1{
	public static void main(String[] args) {
		int start, end, start2;

		Random rand = new Random();
		Scanner string = new Scanner(System.in);

		System.out.print("Enter Start: ");
		start2 = string.nextInt();

		System.out.print("End Start: ");
		end = string.nextInt();

		for (start = start2; start<end;start++) {
			if (start%2==0) {
				System.out.println(start);
			}
		}
	}
}