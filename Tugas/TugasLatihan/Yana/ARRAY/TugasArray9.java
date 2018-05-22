/*
Creted by	: Yana
Time		: 21 Mei 2018 20.45
*/

import java.util.Scanner;

public class TugasArray9{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] arr1 	= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int min=1000;
		boolean status = false;
		

		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] < min) {
				min = arr1[index];
			}
		}
		System.out.println("Nilai terkecil adalah "+min);
	}
}