/*
	 Program     : Tugas For - Printed Even Number
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:49 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class PrintedEvenNumber {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int enterStart, endStart, valueNum; 

		System.out.println("Enter Start : ");
		enterStart = keyboard.nextInt();
		System.out.println("EndStart    : ");
		endStart = keyboard.nextInt();

		System.out.println("Result");
		for(valueNum = enterStart; valueNum <= endStart; valueNum++) {
			if(valueNum % 2 == 0) {
				System.out.println(valueNum);
			}
		}
	}
}