/*
	 Program     : Tugas Array - 9
     Creator     : Khairil
     Created At  : 22 Mei 2018 01:55 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.*;

class ArrayMinimum {
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int minimum;

		minimum = arr1[0];

		for(int index = 0; index < arr1.length; index++) {
			if(arr1[index] < minimum) {
				minimum = arr1[index];
			}
		}

		System.out.println("Nilai minimum dari arr1 adalah : " + minimum);
	}
} 

//Tampilkan nilai minimum arr1