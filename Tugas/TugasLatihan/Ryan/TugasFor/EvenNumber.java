/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 14:07  
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class EvenNumber{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int start=0, end;

		System.out.println("Make a program for user who want printed even number");

		System.out.print("Enter a start\t: ");
		start = key.nextInt();
		System.out.print("End Start\t:");
		end = key.nextInt();

		System.out.println("\nResult");
		for (start = start ; start <= end ; start++) {
			
			if (start % 2 == 0) {
				System.out.println(start);
			}
		}
	}
}