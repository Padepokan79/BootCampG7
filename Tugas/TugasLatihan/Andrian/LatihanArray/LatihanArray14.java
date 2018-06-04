/* 	Date 		: 22/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray14 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr1 = {25,14,56,15,36,56,77,18,29,49};
			int [] arr3 = {2,39,47,14,36,56,57,49,43,79};
			int [] arr4 = new int[arr1.length];
			int first, second, temp;

			System.out.println("Nilai array adalah :");

			for (int i : arr1) {
				System.out.print(i+" ");				
			}
			System.out.println();
			System.out.print("Enter the first index where you want to switch: ");
			first = key.nextInt();
			System.out.print("Enter the second index where you want to switch: ");
			second = key.nextInt();

		/*	System.out.println("Nilai array 3 adalah :");

			for (int i : arr3) {
				System.out.print(i+" ");				
			}*/

			System.out.println();
			System.out.println("Da : ");

			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr1[first] ) {
					temp = arr1[first];
					arr1[first] = arr1[second];
					arr1[second] = temp;
					
				}

				System.out.print(arr1[index]+" ");	
				
			}

		}
	}