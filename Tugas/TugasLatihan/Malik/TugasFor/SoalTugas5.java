/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 2:08PM
soal :

Buatlah program yang dapat menampilkan

Masukan Kata : octopus
Hasilnya
o
c
t
o
p
u
s

=====================================================



*/

import java.util.Scanner;

import java.util.Scanner;
public class SoalTugas5{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		String word, kata;
		int jml, angka;


		System.out.print("Masukan kata : ");
		word = num.next();

		jml = word.length();

		for (angka = 0; angka < jml; angka++) {
				System.out.println(word.charAt(angka));
		}

	}
}