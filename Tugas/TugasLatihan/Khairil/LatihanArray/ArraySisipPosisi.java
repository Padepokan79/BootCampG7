/*
	 Program     : Tugas Array - 7
     Creator     : Khairil
     Created At  : 21 Mei 2018 15:38 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArraySisipPosisi {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] newArr1 = new int[arr1.length + 1];
		int slackMe, indexNew, temp;

		System.out.println("Masukkan angka yang akan disisipi : ");
		slackMe = keyboard.nextInt();
		System.out.println("Masukkan ke dalam index mana  : ");
		indexNew = keyboard.nextInt();

		arr1[indexNew] = slackMe;

		for(int index = 0; index < arr1.length; index++) {
			for( int index1 = 0; index1 < newArr1.length; index1++) {
				newArr1[index] = arr1[index];
				if(index == indexNew) {
					temp = arr1[indexNew];
					arr1[indexNew] = arr1[index];
					arr1[index] = temp;
					temp++;
				}
			}
			System.out.print(newArr1[index] + "  ");
		}
		System.out.println();
	}
}

// 