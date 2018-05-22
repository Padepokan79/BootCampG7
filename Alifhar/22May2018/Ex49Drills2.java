/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	13.54
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex49Drills2{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int[] orderNumbers={12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind, count=0;

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
				count++;
			}
		}

		if(count==0)
			System.out.println(toFind+" not found.");
	}
}