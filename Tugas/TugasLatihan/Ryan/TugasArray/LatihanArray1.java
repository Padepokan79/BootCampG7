/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 14:26
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanArray1{
	public static void main(String[] args) {

		int[] angka = {1, 4, 2, 5, 7, 10};

		int[] number = new int[angka.length];

		for (int i=0;i < angka.length ;i++ ) {
			number[i] = angka[i];
			//System.out.print(number[i]+" ");
		}

		for (int i : number) {
			System.out.print(i+" ");
		}

		System.out.println();

		int i=0;
		System.out.print("While : ");
		while ( i < angka.length) {
			number[i] = angka[i];
			System.out.print( number[i]+ " ");
			i++;
		}

	}
}