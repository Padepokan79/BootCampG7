/*
	Created By Vikri
	21/05/2018
	13:48
*/
import java.util.Scanner;
public class Ex49D1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
		int toFind;

		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.print("Orders: ");
		for (int num : orderNumbers) {
			System.out.print(num + " ");
		}
		System.out.println("");

		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();

		boolean cek = false;
		for (int i = 0 ; i < orderNumbers.length ; i++) {
			int num = orderNumbers[i];			
			if (toFind==num) {
				System.out.println(toFind+" Find");
				cek = true;
			}
		}
		if (cek == false){
			System.out.println(toFind+" Is not Found");
		}
		
	}
}