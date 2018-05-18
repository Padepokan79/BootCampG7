/*
	 Program     : Tugas For - Starting and Ending Value
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class StartingValueEndingValue {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int startVal, endVal, valueNum; 

		System.out.println("Enter Start : ");
		startVal = keyboard.nextInt();
		System.out.println("EndStart    : ");
		endVal = keyboard.nextInt();

		System.out.println("Result");
		for(valueNum = startVal; valueNum <= endVal; valueNum++) {
			System.out.println(valueNum);
		}
	}
}