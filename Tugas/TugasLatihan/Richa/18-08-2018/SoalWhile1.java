/* 
Created by  		: Richa Fitria
Date/hour			: 17 Mei 2018/ 1.00 PM
Updated by			: 
Updated Date/hour	: 

*/

import java.util.Scanner;

public class SoalWhile1 {
	public static void main( String[] args ) {

	int angka = 1;

	System.out.println ("Angka ganjil dan angka kelipatan dari 1 sampai 1000");
	System.out.println();
	while (angka <= 1000) {

		if (angka%2 == 1 || angka%4 == 0){
		System.out.print(angka + " " );
		}
		angka= angka +1;
	}

}
}


/*Tampilkan angka ganjil dan angka kelipatan dari 1 sampai 1000. */
