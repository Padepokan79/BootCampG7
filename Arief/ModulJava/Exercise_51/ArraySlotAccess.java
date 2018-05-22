/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class ArraySlotAccess {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		int[] arr = new int[100];

		for ( int i = 0; i < arr.length; i++) {
			arr[i] = 1 + (int)(Math.random()*1000);
		}

		System.out.print("Values: ");
		for ( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();

		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;

		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		arr[0] = 1 + (int)(Math.random()*1000);
		arr[1] = 1 + (int)(Math.random()*1000);
		arr[2] = 1 + (int)(Math.random()*1000);

		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		int m = 0;
		arr[m] = 1 + (int)(Math.random()*1000);
		m = 1;
		arr[m] = 1 + (int)(Math.random()*1000);
		m = 2;
		arr[m] = 1 + (int)(Math.random()*1000);

		System.out.print("Values: ");
		m = 0;
		System.out.println(arr[m] + " ");
		m = 1;
		System.out.println(arr[m] + " ");
		m = 2;
		System.out.println(arr[m] + " ");
		System.out.println();
		
		int n = 0;
		arr[n] = 1 + (int)(Math.random()*1000);
		n++;
		arr[n] = 1 + (int)(Math.random()*1000);
		n++;
		arr[n] = 1 + (int)(Math.random()*1000);
		n++;

		System.out.print("Values: ");
		n = 0;
		System.out.println(arr[n] + " ");
		n++;
		System.out.println(arr[n] + " ");
		n++;
		System.out.println(arr[n] + " ");
		n++;
		System.out.println();

		for ( int q = 0; q < arr.length; q++) {
			arr[q] = 1 + (int)(Math.random()*1000);
		}
		System.out.print("Values: ");
		for ( int q = 0; q < arr.length; q++) {
			System.out.print(arr[q] + " ");
			
		}
		System.out.println();
	}
}