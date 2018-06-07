/* 
Created by  		: Richa Fitria
Date/hour			: 29 Mei 2018/ 8.22 AM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class Kuis1Richa{
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		boolean cek = false;
		int jumlahUrutanInt;
		String jumlahUrutan;

		do {
			System.out.print("Jumlah index angka Fibonacci yang akan ditampilkan : ");
			jumlahUrutan = keyboard.next ();
			if (jumlahUrutan.matches ("^([56789]|[1-9][0-9]|100)$")) {
				cek = false;
			}
			else if (jumlahUrutan.matches ("[1234]")) {
				System.out.println("Maaf, jumlah index angka tidak boleh kurang dari 5.\nSilahkan input kembali.");
				cek = true;
			}
			else if (jumlahUrutan.matches ("^[1-9][0-9][1-9]$")) {
				System.out.println("Maaf, jumlah index angka tidak boleh lebih dari 100.\nSilahkan input kembali.");
				cek = true;
			}
			else if (jumlahUrutan.matches ("[^0-9]+")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.");
				cek = true;
			}
		} while (cek == true);

		jumlahUrutanInt = Integer.parseInt (jumlahUrutan);

		

		//fibonacci
		
		int init;
		int [] fibonacci = new int [jumlahUrutanInt];

		init = 1;

		for (int index = 0; index < jumlahUrutanInt; index++) {
			if (index == 0) {
				fibonacci [index] = init;
			}
			else if (index == 1) {
				fibonacci [index] = init;
			}
			else if (index > 1) {
				fibonacci [index] = fibonacci [index-1] + fibonacci [index-2];
			}
			
			System.out.print(fibonacci[index] + " ");
		}
	}
}


/*
1. Buatlah sebuah fungsi yang mengeluarkan tampilan index angka Fibonacci (Fibonacci Numbers) dengan 
jumlah index angka berdasarkan input dari user.

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
Jumlah index angka Fibonacci yang akan ditampilkan : 5
1, 1, 2, 3, 5

Jumlah index angka Fibonacci yang akan ditampilkan : 10
1, 1, 2, 3, 5, 8, 13, 21, 34, 55

Jumlah index angka Fibonacci yang akan ditampilkan : 2
Maaf, jumlah index angka tidak boleh kurang dari 5.
Silahkan input kembali.

Jumlah index angka Fibonacci yang akan ditampilkan : 123
Maaf, jumlah index angka tidak boleh lebih dari 100.
Silahkan input kembali.

Jumlah index angka Fibonacci yang akan ditampilkan : test
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.

*/