/* 
Created by  		: Richa Fitria
Date/hour			: 29 Mei 2018/ 9.21 AM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class Kuis4Richa{
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		//int [] hasilShift = new int [deretAngka.length];
		int temp, jmlShiftInt;
		boolean cek = false;
		String jmlShift;

		do {
			System.out.print("Shift ke kiri Sebanyak : ");
			jmlShift = keyboard.next ();
			if (jmlShift.matches ("[1-9]|1[0]")) {
				cek = false;
			}
			else if (jmlShift.matches ("T-?([0-9]*)")) {
				cek = true;
				System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1.\nSilahkan input kembali.");
			}
			else if (jmlShift.matches ("1[1-9]+")) {
				cek = true;
				System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.\nSilahkan input kembali.");
			}
			else if (jmlShift.matches ("[^0-9]")) {
				cek = true;
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.");
			}
		} while (cek == true);

		jmlShiftInt = Integer.parseInt (jmlShift);

		for (int index1 = 0; index1 < deretAngka; index1++) {
			for (int index1 = 0; index1 < deretAngka; index1++) {
				temp = deretAngka [index];
				deretAngka [index1] = deretAngka [index1+1];
				deretAngka [deretAngka.length] = temp;
			}
		}

		for (int index =0; index< deretAngka.length; index++) {
			System.out.println(deretAngka [index]+ " ");
		}

	}
}

/*

4. Shift kiri sebanyak n kali

int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

Batasan:
-User input shift n kali, tidak boleh lebih dari 10.
-User input shift n kali, tidak boleh kurang dari 1.
-User input hanya menerima angka saja.

Petunjuk:
- if else
- looping for
- do while
- while
- array

Hasil yang diinginkan:
{25, 14, 56, 15, 36, 56, 77, 18, 29, 49}

Shift ke kiri Sebanyak : 3

{15, 36, 56, 77, 18, 29, 49, 25, 14, 56} 

Shift ke kiri Sebanyak : 5
{56, 77, 18, 29, 49, 25, 14, 56, 15, 36}

 Shift ke kiri Sebanyak : 15
Maaf, Pergeseran tidak boleh lebih dari 10.
Silahkan input kembali.

Shift ke kiri Sebanyak : -1
Maaf, Pergeseran tidak boleh kurang dari 1.
Silahkan input kembali.

Shift ke kiri Sebanyak : aaa
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.

*/