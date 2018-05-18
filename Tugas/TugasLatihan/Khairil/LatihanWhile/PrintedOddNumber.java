/*
	 Program     : Tugas While - Printed Odd Number
     Creator     : Khairil
     Created At  : 17 Mei 2018 12:54 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class PrintedOddNumber {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int enterStart, endStart, valueNum; 

		System.out.println("Enter Start : ");
		enterStart = keyboard.nextInt();
		System.out.println("End Start   : ");
		endStart = keyboard.nextInt();

		valueNum = enterStart;

		System.out.println("Result");
		while(valueNum <= endStart) {
			if(valueNum % 2 == 1) {
				System.out.println(valueNum);
			}
			valueNum = valueNum + 1;
		}
	}
}