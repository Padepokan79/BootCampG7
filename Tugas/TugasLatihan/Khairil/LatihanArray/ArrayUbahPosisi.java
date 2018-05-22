/*
	 Program     : Tugas Array - 5
     Creator     : Khairil
     Created At  : 22 Mei 2018 01:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArrayUbahPosisi {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int addMe, replaceMe;
		boolean cek = false;

		System.out.print("Masukkan nilai : ");
		addMe = keyboard.nextInt();
		System.out.println();
		System.out.print("Timpa nilai di index ke : ");
		replaceMe = keyboard.nextInt();

		System.out.println("Hasilnya nilai " + addMe + " sudah muncul di index ke-" + replaceMe);
		for(int index = 0; index < arr1.length; index++) {
			if(replaceMe == index) {
				arr1[index] = addMe;
			}			
			System.out.print(arr1[index] + " ");
		}
	}
} 

//Terima nilai dan ubah nilai u/ suatu posisi pada arr1