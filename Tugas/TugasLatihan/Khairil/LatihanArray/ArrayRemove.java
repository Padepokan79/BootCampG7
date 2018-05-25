/*
	 Program     : Tugas Array - 6
     Creator     : Khairil
     Created At  : 22 Mei 2018 02:12 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class ArrayRemove {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] newArr1 = new int[arr1.length - 1];
		int removeMe, newIndex, index;

		newIndex = 0;
		index = 0;

		System.out.println("Masukkan index yang ingin dihapus");
		removeMe = keyboard.nextInt();
		for(index = 0; index < arr1.length; index++) {
			if(arr1[index] == arr1[removeMe]) {
				newIndex = index; //simpan record index yang akan diremove
			}
		}

		for(int slim = 0; slim < newIndex; slim++) {
			newArr1[slim] = arr1[slim];
		}

		//kurangi jumlah array sebelumnya
		for(int nextSlim = newIndex + 1; nextSlim < arr1.length; nextSlim++) {
			newArr1[nextSlim-1] = arr1[nextSlim];
		}

		//copy data yang masih utuh
		for(int finalIndex = 0; finalIndex < newArr1.length; finalIndex++) {
			System.out.print(newArr1[finalIndex] + "  ");
		}

		System.out.println();		
		System.out.println("Angka " + removeMe + "sudah dihapus");
	}
}

//Hapus suatu posisi dari arr1