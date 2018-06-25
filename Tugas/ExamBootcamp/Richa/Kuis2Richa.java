/* 
Created by  		: Richa Fitria
Date/hour			: 29 Mei 2018/ 8.22 AM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class Kuis2Richa{
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int baris, kolom, init, jmlBaris;

		System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
		jmlBaris = keyboard.nextInt ();

		for (int i = 0; i &lt; kolom; i++) {
            pascal[i][0] = 1;                       
            for (int j = 1; j &lt;= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
 
        // print it
        for (int i = 0; i &lt; kolom; i++) {
            for (int j = 0; j &lt;= i; j++) {
                System.out.print(pascal[i][j] + &quot; &quot;);
            }
            System.out.println();
        }

    }
}

/*
2. Buatlah sebuah fungsi yang mengeluarkan tampilan segitiga Paskal (Pascal Triangle) dengan jumlah baris berdasarkan input 
dari user.

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