/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class ArrayLinearSearch {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int[] ordeNumber = { 12345, 54321, 101010, 8675309, 31415, 271828};
			int toFind, gaAda=0;


			System.out.print("There are "+ordeNumber.length);
			System.out.print(" orders in the database.");

			System.out.print("Orders :");
			for (int num : ordeNumber ) {
				System.out.print(num + " ");
			}
			System.out.println();

			System.out.print("Which order to find? ");
			toFind = key.nextInt();

			for (int num : ordeNumber) {
				if (num == toFind) {
					System.out.println(num + " found.");
					gaAda = 1;
				}
			}

			if (gaAda == 0) {
				System.out.println(toFind + " not found.");
			}
		}
	}