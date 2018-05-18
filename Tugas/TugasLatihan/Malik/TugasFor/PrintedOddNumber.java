/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 1:50PM
soal :

Make a program for user who want printed odd number.

Enter Start :
2

End Start :
10

Result 
3
5
7
9
=====================================================

*/

import java.util.Scanner;
public class PrintedOddNumber{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		int awal, akhir, angka;

		System.out.print("Enter Start : ");
		awal = num.nextInt();
		System.out.print("End Start : ");
		akhir = num.nextInt();

		for (angka = awal; angka < akhir; angka++) {
			if ( angka%2 == 1 ) {
				System.out.println(angka);
			}
		}

	}
}