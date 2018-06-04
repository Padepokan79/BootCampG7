/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	13.52
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex49Drills1{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int[] orderNumbers={12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind, num;

		System.out.print("There are "+orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.print("Orders: ");
		for(num : orderNumbers){
			System.out.print(num+" ");
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind=keyboard.nextInt();

		for(num : orderNumbers){
			if(num==toFind){
				System.out.println(num+" found.");
			}
		}
	}
}