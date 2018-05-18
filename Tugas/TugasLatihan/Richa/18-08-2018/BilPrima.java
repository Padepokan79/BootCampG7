/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 5.52 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class BilPrima {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	int batas, bilangan;
	System.out.print("Batas: ");
	batas = keyboard.nextInt();


	if (batas >3){
		System.out.print(" 2 3 ");
		for (bilangan = 4; bilangan <= batas; bilangan++){
			
			if (bilangan%3 != 0) {
				if (bilangan%2 != 0) {
					System.out.print(bilangan + " ");
				}
			}
		}
	}
	else if (batas == 2) {
		System.out.println("2");

	}
	else if (batas == 3) {
		System.out.println("2 3");
	}
}
}




	/*Buatlah program untuk menampilkan bilangan prima hingga batas yg ditentukan. Contoh :
	Batas : 20
	2 3 5 7 11 13 17 19
	*/