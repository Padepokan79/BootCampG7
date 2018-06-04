/*
Date Created	: 29 May 2018, 11:29:29 AM
Date Done		: 29 May 2018, 12:20:18 AM
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class Quizz4Shifting {
	public static void main(String[] args) {
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Scanner inputKey = new Scanner(System.in);
		String geser;
		int validate, validation, geserInt, maxRange, minRange, nol, angka, satu;

		geserInt = nol = validate = 0;
		satu = validation = 1;

		maxRange = 10;
		minRange = 1;

		System.out.println("Nilai awal Array deretAngka: ");
		for ( int print : deretAngka) {
			System.out.print(print + " ");
		}
		System.out.println();

		do{
        	System.out.print("Shift kiri sebanyak: ");
			geser = inputKey.nextLine();
	        if (geser.matches("[0-9-]+")) {
				geserInt = Integer.parseInt(geser);
	        	if (geserInt < minRange) {
	        		System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1.");
	        		System.out.println("Silahkan Input Kembali");
	        		System.out.println();
	        		validate = nol;
	        	}else if (geserInt > maxRange) {
	        		System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.");
	        		System.out.println("Silahkan Input Kembali");
	        		System.out.println();
	        		validate = nol;
	        	}else {
	        		validate++;
	        	}
	        }else {
	        	System.out.println("Maaf, input yang diterima hanya berupa angka.");
	        	System.out.println("Silahkan Input Kembali");
	        	System.out.println();
	        	validate = nol;
	        }
    	} while (validate < validation);
	
		for (int index = nol; index < geserInt; index++) {
			angka = deretAngka[nol];
			int indexing;
			for (indexing = nol; indexing < deretAngka.length - satu; indexing++){
				deretAngka[indexing] = deretAngka[indexing + satu];
			}
			deretAngka[indexing] = angka;
		}	
	
		for (int index = nol; index < deretAngka.length; index++) {
			System.out.print(deretAngka[index] + " ");
		}
		System.out.println();
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