/*
Date Created	: 29 May 2018, 12:23:23 AM
Date Done		: 29 May 2018, 12:52:21 AM
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class Quizz2Pascal {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int validate, validation, resultRow, resultSpace, resultRowSpace, result, nol, maxRange, minRange, rangeInt, satu;
		String range;

		minRange = 2;
		maxRange = 20;
		rangeInt = nol = validate = 0;
		satu = validation = 1;
		
		do{
			System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan: ");
			range = inputKey.nextLine();
			if (range.matches("[0-9-]+")) {
				rangeInt = Integer.parseInt(range);
				if (rangeInt < minRange) {
	        		System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.");
	        		System.out.println("Silahkan Input Kembali");
	        		System.out.println();
	        		validate = nol;
	        	}else if (rangeInt > maxRange) {
	        		System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");
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

        for (int Row = nol; Row < rangeInt; Row++) {
            for (int space = nol; space <= Row; space++) {
                resultRow = resultRowSpace = resultSpace = satu;
                for (int index = satu; index <= Row; index++) {
                    resultRow *= index;
                }
                for (int indexing = satu; indexing <= Row - space; indexing++) {
                    resultRowSpace *= indexing;
                }
                for (int indexed = satu; indexed <= space; indexed++) {
                    resultSpace *= indexed;
                }
                result = resultRow / (resultRowSpace * resultSpace);
                System.out.print(result + " ");
                // System.out.printf("%8d", result);
            }
            System.out.println();
        }
    }
}

/*
2. Buatlah sebuah fungsi yang mengeluarkan tampilan segitiga Paskal (Pascal Triangle) dengan jumlah baris berdasarkan input dari user.

Petunjuk:
- if else
- looping for
- do while
- while
- array*
- recursive function*
*Jika dibutuhkan

Batasan:
- User input tidak boleh kurang dari 2
- User input tidak boleh lebih dari 20
- User input hanya menerima angka

Hasil yang diinginkan: 
Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 9
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 1
Maaf, jumlah baris tidak boleh kurang dari 2.
Silahkan input kembali.

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 54
Maaf, jumlah baris tidak boleh lebih dari 20.
Silahkan input kembali.

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : test
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.
*/