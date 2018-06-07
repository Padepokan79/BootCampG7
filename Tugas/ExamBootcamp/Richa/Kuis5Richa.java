/* 
Created by  		: Richa Fitria
Date/hour			: 29 Mei 2018/ 10.15 AM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class Kuis5Richa{
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int [] Number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] Number1New = new int [Number1.length+1];

		int posisiSisip, angkaSisip, temp;

		System.out.println("Deretan number :");
		for (int index = 0; index < Number1.length; index++) {
			
			System.out.print (Number1[index] + " ");
		}

		System.out.println();

		System.out.print ("Masukan Angka yang mau disisipkan: ");
		angkaSisip = keyboard.nextInt ();

		System.out.print("Sisipkan pada posisi ke: ");
		posisiSisip = keyboard.nextInt ();

		for (int index = 0; index < Number1New.length+1; index++) {
			if (index < posisiSisip-1) {
				Number1New [index] = Number1 [index];
			}
			else if (index == posisiSisip-1) {
				Number1New [index] = angkaSisip;

			}
			else if (index > posisiSisip-1) {
				temp = Number1 [index]; 
				Number1New [index] = temp;
			}
			System.out.print(Number1New[index] + " ");
		}

	}
}

/*

5.Sisip suatu bilangan pada posisi tertentu pada array Number1
{2, 39, 47, 14, 36, 56, 57, 49, 43, 79};

Batasan:
-input posisi tidak boleh lebih dari 10.
-input posisi tidak boleh kurang dari 1.
-input hanya dapat menerima angka.

Petunjuk:
- if else
- looping for
- do while
- while
- array

Hasil yang diinginkan:
Deretan number : 
2 39 47 14 36 56 57 49 43 79

Masukan Angka yang mau disisipkan: 30
Sisipkan pada posisi ke :

2 39 47 14 36 30 56 57 49 43 79

Sisipkan pada posisi ke: -3
Maaf, input posisi tidak boleh kurang dari 1.
Silahkan input kembali.

Sisipkan pada posisi ke: 15
Maaf, input posisi tidak boleh lebih dari 10.

Masukan Angka yang mau disisipkan: asd
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.

Sisipkan pada posisi ke: asd
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.

*/