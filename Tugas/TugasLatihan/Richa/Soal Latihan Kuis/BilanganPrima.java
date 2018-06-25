/* 
Created by  		: Richa Fitria
Date/hour			: 26 Mei 2018/ 2.56 PM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class BilanganPrima
 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int i;
		for (i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + "\t is a prime number");
			}
		}
	}
}