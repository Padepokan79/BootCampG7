/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 1:54PM
*/

import java.util.Scanner;
	
public class Ex49Drill1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
		int toFind;
		int num;
	
		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");
	
		System.out.print("Orders: ");
		for ( num : orderNumbers ) {
			System.out.print( num + " " );
		}
			System.out.println();
	
		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();
	
		for ( num : orderNumbers ) {
			if ( num == toFind ) {
				System.out.println( num + " found.");
			}
		}
	}
}

/*
	kita membuat panggilan untuk variable 'num' pada line ke 14 dan 22 untuk dipindahkan
	ke atas di bawah variable 'toFind'. apa bisa di lakukan ?
	jawabannya tidak, mengapa ? karena bila variable berada di atas harus di inisialisasikan terlebih dahulu
	dan sangat tidak dianjurkan untuk looping FOR
	

*/