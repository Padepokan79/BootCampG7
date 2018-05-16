/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;

public class TugasForRepeatingWord {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int number, startNUmber=1, stopNumber=10;
		String word;

		System.out.println("Enter word: ");
		word = key.next();
		for (number=startNUmber; number<=stopNumber; number++)
			System.out.println(word);
	}
}