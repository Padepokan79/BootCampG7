/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	14.02
	* Updated by:
	*
*/
import java.util.Scanner;

public class Word{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int beg=0,end;
		String word;

		System.out.println("Enter a word:");
		word=scan.next();
		end=word.length();

		System.out.println("\nResult");
		for(int i=beg; i<end; i++)
			System.out.println(word);
	}
}