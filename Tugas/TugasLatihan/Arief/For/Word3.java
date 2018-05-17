/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Word3 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int i, nol, startLength, endLength, maxNumber;
		String start, end;

		nol = 0;
		maxNumber = 30;

		System.out.println("Enter first Word : ");
		start = inputKey.next();
		startLength = start.length();

		System.out.println("Enter second Word : ");
		end = inputKey.next();
		endLength = end.length();

		System.out.println();

		System.out.print(start);
		for ( i = nol ; i < (maxNumber - (startLength + endLength)); i ++ ) {
				System.out.print(".");
		}
		System.out.print(end);

	}
}