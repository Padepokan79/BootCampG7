/*
	 Program     : Tugas Array - 10
     Creator     : Khairil
     Created At  : 22 Mei 2018 02:05 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.*;

class ArrayMaximum {
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int maximum;

		maximum = arr1[0];

		for(int index = 0; index < arr1.length; index++) {
			if(arr1[index] > maximum) {
				maximum = arr1[index];
			}
		}

		System.out.println("Nilai maximum dari arr1 adalah : " + maximum);
	}
} 


//Tampilkan nilai maksimum arr1