/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 14:12
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Octopus{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String word;

		System.out.print("Masukan Kata\t: ");
		word = key.nextLine();

		int panjang = word.length();

		for (int i=0 ; i < panjang ; i++ ) {
			System.out.println(word.charAt(i));
		}
	}
}