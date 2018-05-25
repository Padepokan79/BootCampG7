/*
	 Program     : Tugas Array - 11
     Creator     : Khairil
     Created At  : 22 Mei 2018 08:40 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArrayTwinFind {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int	twinNumber = 0;

		for(int index = 0; index < arr1.length; index++) {
			for(int index1 = index+1; index1 < arr1.length; index1++) {
				if(arr1[index] == arr1[index1]) {
					twinNumber = arr1[index1];
					System.out.println("bilangan yang sama adalah " + twinNumber);
					// System.out.println("Di index " + index + " dan " + index1);
				}
			}
		}

	}
}

// Tampilkan bilangan2 yang duplikasi pada arr1