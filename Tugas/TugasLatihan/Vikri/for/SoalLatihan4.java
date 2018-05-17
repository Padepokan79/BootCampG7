/*
	Created By Vikri
	16/05/2018
	14:03
*/
import java.util.Random;
import java.util.Scanner;

public class SoalLatihan4{
	public static void main(String[] args) {
		int start, end, world;
		String start2;

		Random rand = new Random();
		Scanner string = new Scanner(System.in);

		System.out.print("Enter a world: ");
		start2 = string.next();

		world=start2.length();

		for (start = 1; start<=world;start++) {
			System.out.println(start2);
		}
	}
}