/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 14:35
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class TwoWordsAndDots{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String word1, word2;

		System.out.print("Enter first Word\t: ");
		word1 = key.next();
		System.out.print("Enter first Word\t: ");
		word2 = key.next();

		int panjang1 = word1.length();
		int panjang2 = word2.length();
		int titik = 30 - (panjang1+panjang2);

		System.out.print(word1);
		for (int i=1 ; i <= titik ; i++ ) {
			System.out.print(".");
		}
		System.out.print(word2);
	}
}