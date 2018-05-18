/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	14.09
	* Updated by:
	*
*/
import java.util.Scanner;

public class ThirtyWord{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int beg=0,end;
		String word1, word2;

		System.out.println("Enter a word:");
		word1=scan.next();
		System.out.println("Enter a word:");
		word2=scan.next();

		end=30-word1.length()-word2.length();
		
		System.out.println("\nResult");
		System.out.print(word1);
		for(int i=beg; i<end; i++)
			System.out.print(".");
		System.out.print(word2);
	}
}