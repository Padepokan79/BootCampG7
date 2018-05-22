/*
	 Program     : Tugas Array - 12
     Creator     : Khairil
     Created At  : 22 Mei 2018 09:02 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArrayTwinFindArr {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int	twinArray = 0, twinArray1 = 0;

		for(int index = 0; index < arr1.length; index++) {
			for(int index1 = 0; index1 < arr3.length; index1++) {
				if(arr1[index] == arr3[index1]) {
					twinArray  = arr1[index];
					System.out.println("bilangan yang sama antar array adalah " + twinArray + " ");
					// System.out.println("Di index " + index + " pada arr1 dan " + index1 + " pada arr3");
				}
			}
		}
	}
}

// Tampilkan bilangan2 yang sama2 ada di arr1 dan arr3