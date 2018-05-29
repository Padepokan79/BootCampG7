/*
Date Created	: 29 May 2018, 08:35:28 AM
Date Done		: 29 May 2018, 09:03:19 AM
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class Quizz1Fibonacci {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		String range;
		int validation, validate, rangeInt, maxRange, minRange, nol, satu;

		nol = rangeInt = validate = 0;
		satu = validation = 1;
		maxRange = 100;
		minRange = 5;

		range = "";


        do{
        	System.out.print("Jumlah urutan angka Fibonacci yang akan ditampilkan: ");
	        range = inputKey.nextLine();
	        if (range.matches("[0-9]+")) {
				rangeInt = Integer.parseInt(range);
	        	if (rangeInt < minRange) {
	        		System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.");
	        		System.out.println();
	        		validate = nol;
	        	}else if (rangeInt > maxRange) {
	        		System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.");
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

    	int[] fib = new int[rangeInt];
	
		for (int index = nol; index < rangeInt ; index++) {
			fib[index] = satu;
		}
        for(int index = (satu+satu); index < fib.length; index++) {
            fib[index] = fib[index-satu] + fib[index-(satu+satu)];
        }
        for (int index = nol; index < fib.length; index++) {
                System.out.print(fib[index] + " ");
        }

	}
	
}


/*
1. Buatlah sebuah fungsi yang mengeluarkan tampilan urutan angka Fibonacci (Fibonacci Numbers) dengan jumlah urutan angka berdasarkan input dari user.

Petunjuk:
- if else*
- looping for
- do while
- while
*Jika dibutuhkan

Batasan:
- User input tidak boleh kurang dari 5 
- User input tidak boleh lebih dari 100
- User input hanya menerima angka 

Hasil yang diinginkan: 
Jumlah urutan angka Fibonacci yang akan ditampilkan : 5
1, 1, 2, 3, 5

Jumlah urutan angka Fibonacci yang akan ditampilkan : 10
1, 1, 2, 3, 5, 8, 13, 21, 34, 55

Jumlah urutan angka Fibonacci yang akan ditampilkan : 2
Maaf, jumlah urutan angka tidak boleh kurang dari 5.
Silahkan input kembali.

Jumlah urutan angka Fibonacci yang akan ditampilkan : 123
Maaf, jumlah urutan angka tidak boleh lebih dari 100.
Silahkan input kembali.

Jumlah urutan angka Fibonacci yang akan ditampilkan : test
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.
*/