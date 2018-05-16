/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 1:59PM
soal :

Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) 
between those two values.

Enter Start:
5
Enter End:
9

5
6
7
8
9

=====================================================


*/

import java.util.Scanner;

import java.util.Scanner;
public class StartEndingValue{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		int awal, akhir, angka;

		System.out.print("Enter Start : ");
		awal = num.nextInt();
		System.out.print("End Start : ");
		akhir = num.nextInt();

		for (angka = awal; angka <= akhir; angka++) {
				System.out.println(angka);
		}

	}
}