/* 
Created by  		: Richa Fitria
Date/hour			: 18 Mei 2018/ 12.55 PM
Updated by			: 
Updated Date/hour	: 

*/

import java.util.Scanner;

public class SoalDoWhile1 {
	public static void main( String[] args ) {

	int angka = 1;

	System.out.println ("Angka ganjil dan angka kelipatan dari 1 sampai 1000");
	System.out.println();
	do  {
		if (angka%2 == 1 || angka%4 == 0){
		System.out.print(angka + " " );
		}
		angka= angka +1;
	}

	while (angka <= 1000);

}
}


/*Tampilkan angka ganjil dan angka kelipatan dari 1 sampai 1000. */
