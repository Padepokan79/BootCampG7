/*
Create By 	: Malik Chaudhary
Time Create : 2018-05-29 8:29AM
Soal 		:

Buatlah sebuah fungsi yang mengeluarkan tampilan urutan angka Fibonacci (Fibonacci Numbers) dengan jumlah
urutan angka berdasarkan input dari user.

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
=======================================================

*/
import java.util.Scanner;
public class QuizSatuMalik{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String angkaString;
		int angka,angkaAwal,angkaAkhir,hasil,minFibonacci,minInput, maxInput;
		boolean kondisi;

		angkaAwal	= 0; 	minInput 	= 5; 	angka = 0;
		angkaAkhir	= 1; 	maxInput 	= 100;
		hasil 		= 0;	minFibonacci= 0;

		System.out.print("Masukan angka : ");
		angkaString = scan.next();

		do{
			if ( !angkaString.matches("([0-9])*") ) {
				System.out.println();
				System.out.println("Maaf, inputan yang diterima hanya berupa angka ");
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Masukan angka : ");
				angkaString = scan.next();
			}
			if ( angkaString.matches("([0-9])*") ) {
				angka = Integer.parseInt(angkaString); 
				if ( angka < minInput ) {
					System.out.println();
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari "+angkaString);
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Masukan angka : ");
					angkaString = scan.next();
				}else if ( angka > maxInput ) {
					System.out.println();
					System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari "+angkaString);
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Masukan angka : ");
					angkaString = scan.next();
				}
			}
				 

		}while(angka < minInput || angka > maxInput || !angkaString.matches("([0-9])*"));
			
		
		System.out.println();
		System.out.println("Jumlah urutan angka Fibonacci yang akan ditampilkan : "+angkaString);
		for (int indexFibonanci=minFibonacci; indexFibonanci<angka; indexFibonanci++) {
			angkaAwal 	= angkaAkhir;
			angkaAkhir	= hasil;
			hasil 		= angkaAwal+angkaAkhir;
			System.out.print(hasil+", ");
		}
		System.out.println();
		


		
		

	}
}