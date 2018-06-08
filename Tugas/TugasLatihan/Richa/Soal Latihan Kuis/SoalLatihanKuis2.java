/* 
Created by  		: Richa Fitria
Date/hour			: 26 Mei 2018/ 2.56 PM
Updated by			: 
Updated Date/hour	: 
*/


import java.util.Scanner;
import java.util.Random;

public class SoalLatihanKuis2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int init, inputInt = 0, dua = 0, tiga = 0, empat = 0, lima = 0, enam = 0, sepuluh = 0;
		boolean lolos = true;
		String input = " ";

		do {
			System.out.print("inputan = ");
			input = keyboard.next();
			if (input.matches ("[0-5]+")){
				lolos = true;
			}
			else {
				lolos = false;
			}
		} while (lolos == false);

		inputInt = Integer.parseInt (input);


		System.out.println();

		init = 1;
		if (inputInt >=0 ) {
			System.out.println(init);
		}
		if (inputInt >= 1) {
			System.out.print(init + " ");
			System.out.print(init);
			System.out.println();
		}
		if (inputInt >= 2) {
			System.out.print(init + " ");
			System.out.print (dua = init + init);
			System.out.print(" ");
			System.out.print(init);
			System.out.println();
		}
		if (inputInt >= 3) {
			System.out.print(init + " ");
			System.out.print (tiga = dua + init);
			System.out.print(" ");
			System.out.print (tiga = dua + init);
			System.out.print(" ");
			System.out.print(init);
			System.out.println();
		}
		if (inputInt >= 4) {
			System.out.print(init + " ");
			System.out.print (empat = tiga + init);
			System.out.print(" ");
			System.out.print (enam = tiga + tiga);
			System.out.print(" ");
			System.out.print (empat = tiga + init);
			System.out.print(" ");
			System.out.print(init);
			System.out.println();
		}
		if (inputInt == 5) {
			System.out.print(init + " ");
			System.out.print (lima = empat + init);
			System.out.print(" ");
			System.out.print (sepuluh = empat + enam);
			System.out.print(" ");
			System.out.print (sepuluh = empat + enam);
			System.out.print(" ");
			System.out.print (lima = empat + init);
			System.out.print(" ");
			System.out.print(init);
			System.out.println();
		}
	}
}

/*
2. Buatlah segitiga pascal, dengan menerima sebuah inputan.
Ps: inputan yang dapat dimasukkan maksimal 5.

co/:
inputan =  3

1                
1 1              
1 2 1            
1 3 3 1          

inputan = 0
1

inputan = 4
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/
