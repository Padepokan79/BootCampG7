import java.util.Scanner;

public class ArrayLinearSearch{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind, status=0;
		System.out.print("There are "+orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.print("Orders: ");
		for(int num : orderNumbers){
			System.out.print(num+" ");
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind=keyboard.nextInt();

		for(int num : orderNumbers){
			if(num==toFind){
				System.out.println(num+" found.");
				status = 1;
			}
		 }
		if ( status != 1 ) {
			System.out.println(toFind+" not found");		 	
		 }
	 }
 }