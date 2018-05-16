/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 1:58PM
soal :

Make a program for user who want printed even number.

Enter Start :
2

End Start :
10

Result 
2
4
6
8
10

=====================================================

*/

import java.util.Scanner;

import java.util.Scanner;
public class PrintedEvenNumber{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		int awal, akhir, angka;

		System.out.print("Enter Start : ");
		awal = num.nextInt();
		System.out.print("End Start : ");
		akhir = num.nextInt();

		for (angka = awal; angka <= akhir; angka++) {
			if ( angka%2 == 0 ) {
				System.out.println(angka);
			}
		}

	}
}