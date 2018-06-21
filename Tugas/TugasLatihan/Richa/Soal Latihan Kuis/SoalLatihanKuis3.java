/* 
Created by  		: Richa Fitria
Date/hour			: 26 Mei 2018/ 2.56 PM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class SoalLatihanKuis3 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int count;
		
		int [] bilFibonacci = new int [16];
		int [] bilPrima = new int [6];
		int [] bilHabisBagi = new int [bilFibonacci.length - bilPrima.length];

		System.out.println(bilHabisBagi.length);

		bilFibonacci [0] = bilFibonacci [1] = 1;
		for (int index = 2; index < bilFibonacci.length; index++) {
			bilFibonacci [index] = bilFibonacci[index-1] + bilFibonacci[index-2];
		}

		System.out.println("Bilangan fibonacci:");
		for (int index = 0; index < bilFibonacci.length; index++) {
			System.out.print(bilFibonacci[index] + " ");
		}

		System.out.println();
		System.out.println();

		System.out.println("Bilangan prima:");
		int indexPrim=0;
		for (int index = 2; index < bilFibonacci.length; index++) {
			count = 0;
			for (int index1 = 1; index1 <=bilFibonacci[index]; index1++) {
				if (bilFibonacci[index]%index1==0) {
					count++;
				}
			}
			if (count == 2) {
				indexPrim = indexPrim + 0;
				bilPrima [indexPrim] = bilFibonacci [index];
				indexPrim ++;
			}
		}			

		for (int index = 0; index < bilPrima.length; index++) {
			System.out.print(bilPrima[index] + " ");
		}

		System.out.println();
		System.out.println();
		int indexHabisBagi =0;
		System.out.println("Selain Bilangan prima:");
		for (int index = 0; index < bilFibonacci.length; index++) {
			int found =0;
			for (int index1 = 0; index1 < bilPrima.length; index1++) {
				if (bilFibonacci[index] != bilPrima [index1]) {
					found++;
				}
			}
			if (found == bilPrima.length) {
				indexHabisBagi = indexHabisBagi + 0;
				bilHabisBagi [indexHabisBagi] = bilFibonacci[index];
				indexHabisBagi++;
			}
		}

		for (int index = 0; index < bilHabisBagi.length; index++) {
			System.out.print (bilHabisBagi[index] + " ");
		}
	}
}

/*

3. Buatlah array bilFibonacci yang berisikan barisan bilangan fibonacci dari 1 -  1000.
   Dari array tersebut:
 	- copy bilangan prima ke sebuah array baru, bilPrima.
   	- copy bilangan yang habis bagi ke array baru lainnya, bilHabisBagi.
   	- Kemudian tampilkan ketiga array tersebut.

Output:

   Bilangan fibonacci:
   1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987

   Bilangan Prima:
   2 3 5 13 89 233

   Selain Bilangan Prima:
   1 1 8 21 34 55 144 377 610 987
*/
