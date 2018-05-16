/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;

public class TugasForDotSeparatingWord {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int number, startNUmber=0, stopNumber=30;
		String word1, word2, dot=".";

		System.out.println("Enter first word1: ");
		word1 = key.next();
		System.out.println("Enter second word2: ");
		word2 = key.next();

		System.out.print(word1);

		for (number=startNUmber; number<=stopNumber; number++)
			System.out.print(dot);
		
		System.out.print(word1);
	}
}