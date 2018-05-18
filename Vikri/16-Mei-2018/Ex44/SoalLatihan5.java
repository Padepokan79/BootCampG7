/*
	Created By Vikri
	16/05/2018
	
*/
import java.util.Random;
import java.util.Scanner;

public class SoalLatihan5{
	public static void main(String[] args) {
		int start, end, world2;
		String world, start2;

		Random rand = new Random();
		Scanner string = new Scanner(System.in);

		System.out.print("Masukan kata: ");
		start2 = string.next();

		world2=start2.length();

		for (start = 0; start<world2; start++) {
			System.out.println(start2.charAt(start));
		}
	}
}