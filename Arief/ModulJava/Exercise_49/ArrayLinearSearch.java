/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind;
		boolean notFound;

		notFound = false;

		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in database.");

		System.out.print("Orders: ");
		for ( int num : orderNumbers ) {
			System.out.print( num + " " );
		}
		System.out.println();

		System.out.print("Which Orders to find? ");
		toFind = inputKey.nextInt();

		for ( int num : orderNumbers ) {
			if (num == toFind) {
				System.out.println(num + " found.");
				notFound = true;
			}
		}

		if (notFound == false) {
			System.out.println("The number " + toFind + " you are looking for, was not found");
		}

	}
}