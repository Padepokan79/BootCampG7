/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class InclusiveIntegers {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int angka, nol, start, end;

		nol = 0;

		System.out.println("Enter Start : ");
		start = inputKey.nextInt();

		System.out.println("Enter End : ");
		end = inputKey.nextInt();
		System.out.println();

		for ( angka = start ; angka <= end; angka ++ ) {
				System.out.println(angka);
			
		}

	}
}