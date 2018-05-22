/*
	 Program     : Tugas Array - 4
     Creator     : Khairil
     Created At  : 21 Mei 2018 15:36 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArrayFindIndex1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int findMe;
		boolean cek = false;

		System.out.println("Masukkan angka yang ada");
		findMe = keyboard.nextInt();
		for(int index = 0; index < arr1.length; index++) {
			if(findMe == arr1[index]) {
				System.out.println(findMe + " ada di index " + index);
				System.out.println(findMe + " ada di posisi ke " + (index+1));
				cek = true;
			}
		}
		if(cek == false) {
			System.out.println(findMe + " tidak ada di index / posisi manapun");		
		}
	}
} 

//Suatu bilangan ada di-posisi/index ke berapa di arr1?
