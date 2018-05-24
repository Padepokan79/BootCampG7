/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 13:48
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class ArrayLinearSearch{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int[] orderNumbers = {12345, 54321, 101010, 8075309, 31415, 271828};
		int toFind;

		System.out.print("There are "+orderNumbers.length);
		System.out.println( " orders in the databases");

		System.out.print("Orders : ");
		for (int num : orderNumbers) {
			System.out.print(num + " ");
		}

		System.out.println();

		System.out.print("Which order to fing? ");
		toFind = key.nextInt();

		for (int num : orderNumbers) {
			if (num == toFind) {
				System.out.println(num + " found.");
			}
		}

	}
}