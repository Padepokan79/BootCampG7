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

public class RepeatWordByCharacters{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String word;

		System.out.println("Repeat word for as many times as it har characters");

		System.out.print("Enter a word\t: ");
		word = key.next();

		int panjang = word.length();

		for (panjang = panjang ; panjang > 0;panjang-- ) {
			System.out.println(word);
		}
	}
}