//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 3:14 PM
//Modified by :
import java.util.Scanner;

public class TwoWord{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word1, word2;

		System.out.print(" Enter first word  : ");
		word1 = keyboard.next();
		System.out.print(" Enter second word : ");
		word2 = keyboard.next();

		int i = word1.length();
		int j = word2.length();
		
		System.out.print(word1);
		for(int n = i+j;n < 30; n++)
		{
		System.out.print(".");
		}
		System.out.print(word2);	
	}
}