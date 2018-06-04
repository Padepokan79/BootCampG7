/*
	Created By Vikri
	21/05/2018
	14:24
*/
import java.util.Scanner;
public class Ex51D1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int arr[] = new int[5];

		for ( int i=0 ; i < arr.length ; i++ ) {
			arr[i] = 1 + (int)(Math.random()*100);
		}
		System.out.print("Values: ");
		for ( int i=0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println("\nValues: " + arr[0] + " " + arr[1] + " " + arr[2]);
	
		arr[0] = 1 + (int)(Math.random()*100);
		arr[1] = 1 + (int)(Math.random()*100);
		arr[2] = 1 + (int)(Math.random()*100);

		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);
		
		int m = 0;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 1;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 2;
		arr[m] = 1 + (int)(Math.random()*100);
	
		System.out.print("Values: ");
		m = 0;
		System.out.print(arr[m]+" ");
		m = 1;
		System.out.print(arr[m]+" ");
		m = 2;
		System.out.print(arr[m]+" ");
	
		System.out.println("");

		int n = 0;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;

		System.out.print("Values: ");
		n = 0;
		System.out.print(arr[n]+" ");
		n++;
		n = 0;
		System.out.print(arr[n]+" ");
		n++;
		n = 0;
		System.out.print(arr[n]+" ");
		n++;
		System.out.println("");

		for (int q=0; q < arr.length; q++) {
			arr[q] = 1 + (int)(Math.random()*100);
		}
	}
}