//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 3:14 PM
//Modified by :
import java.util.Scanner;

public class Octopus{
	public static void main(String[] args) {
		String word;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Masukan kata (octopus) :");
		word = keyboard.next();
		for(int n=0 ; n < word.length(); n++)
		{
			char s = word.charAt(n);
			System.out.println(s);
		}
	}
}