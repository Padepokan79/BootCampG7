/*
Create By 	: Malik Chaudhary
Time Create : 2018-05-29 9:44AM
Soal 		:

 Shift kiri sebanyak n kali

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
==================================================

*/
import java.util.Scanner;
public class QuizEmpatMalik{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		String shiftBanyak;
		int shift, length;

		length = deretAngka.length;

		System.out.println();
		System.out.println("Deret Angka : ");
		for (int deret : deretAngka) {
			System.out.print(deret+" ");
		}
		System.out.println();
		System.out.println("Shift ke kiri sebanyak : ");
		shiftBanyak = scan.next();
		shift = Integer.parseInt(shiftBanyak);
		int shiftBanyakInt = Integer.parseInt(shiftBanyak);
		for (int array=0; array<deretAngka.length; array++) {
			for (int index=0; index<shift; index++) {
				
			}
		}
		

		for (int angka : deretAngka) {
			System.out.print(angka+" ");
		}

	}
}