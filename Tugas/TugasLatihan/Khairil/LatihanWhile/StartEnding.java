/*
	 Program     : Tugas While - Starting Ending
     Creator     : Khairil
     Created At  : 17 Mei 2018 13:05 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class StartEnding {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int startVal, endVal, valueNum; 

		System.out.println("Enter Start : ");
		startVal = keyboard.nextInt();
		System.out.println("EndStart    : ");
		endVal = keyboard.nextInt();

		valueNum = startVal; 

		System.out.print("Result");
		while(valueNum <= endVal) {
			System.out.print(valueNum + " ");
			valueNum = valueNum + 1;
		}
		System.out.println();
	}
}