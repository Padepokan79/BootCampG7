/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;

public class TugasForSeparatingWord {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int number, startNUmber=0, end;
		String word;

		System.out.println("Enter word: ");
		word = key.next();
		end = word.length();

		for (number=startNUmber; number<end; number++)
			System.out.println(word.charAt(number));
	}
}