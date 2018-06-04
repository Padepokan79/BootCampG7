/*
	 Program     : Tugas Array - 13
     Creator     : Khairil
     Created At  : 22 Mei 2018 09:02 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArraySwitchPosition {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int	temp, input1, input2;

		System.out.println("Index dari :");
		input1 = keyboard.nextInt();
		System.out.println("Tukar dengan index : ");
		input2 = keyboard.nextInt();


		for(int index = 0; index < arr1.length; index++) {
			System.out.print(arr1[index] + " ");
		}		
		System.out.println();
		for(int index = 0; index < arr1.length; index++) {
			if(index == input1) {
				temp = arr1[input1];
				arr1[input1] = arr1[input2];
				arr1[input2] = temp;
			}
			System.out.print(arr1[index] + " ");
		}
		System.out.println();
	}
}

// Tukar nilai antara dua posisi pada arr1