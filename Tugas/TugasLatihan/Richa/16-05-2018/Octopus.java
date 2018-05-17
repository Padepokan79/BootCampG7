/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 02.16 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class Octopus {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	String word;
	int wordLen, urutan;

	System.out.print("Masukan kata : ");
	word = keyboard.next ();

	wordLen = word.length ();

	for (urutan= 0; urutan <= wordLen-1; urutan+=1) {
		System.out.println(word.charAt(urutan));
	}
}
}

/*
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
*/
