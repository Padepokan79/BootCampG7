/*
	 Program     : Tugas While - Printed Even Number
     Creator     : Khairil
     Created At  : 17 Mei 2018 13:00 PM     
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

		valueNum = enterStart;

		System.out.println("Result");
		while(valueNum <= endStart) {
			if(valueNum % 2 == 0) {
				System.out.print(valueNum + " ");
			}
			valueNum = valueNum + 1;
		}
		System.out.println();
	}
}