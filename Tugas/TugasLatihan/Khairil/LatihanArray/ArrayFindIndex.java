/*
	 Program     : Tugas Array - 3
     Creator     : Khairil
     Created At  : 21 Mei 2018 15:27 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArrayFindIndex {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int findMe;
		boolean cek = false;

		System.out.println("Masukkan angka yang ada");
		findMe = keyboard.nextInt();
		for(int index = 0; index < arr1.length; index++) {
			if(findMe == arr1[index]) {
				System.out.println(findMe + " ada di Arr1 ");
				cek = true;
			}
		}
		if(cek == false) {
			System.out.println(findMe + " tidak ada di Arr1");		
		}
	}
} 

//Apakah suatu bilangan ada di arr1 atau tidak?