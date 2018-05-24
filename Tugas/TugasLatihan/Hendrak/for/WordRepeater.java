//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 3:07 PM
//Modified by :
import java.util.Scanner;

public class WordRepeater{
	public static void main(String[] args) {
		String word;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukan Kata :");
		word = keyboard.next();

		for(int i = 0; i < word.length();i++)
		{
			System.out.println(word);
		}
	}
}