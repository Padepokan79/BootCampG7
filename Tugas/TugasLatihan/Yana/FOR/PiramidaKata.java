/*
Created  by 	: Yana
Time			: 17 Mei 2018 05.52
*/

import java.util.Scanner;

public class PiramidaKata{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String	word = "Komandan Bersatu";
		int baris, lengthWord, angkaAwal, angkaAwal2, angkaAwal3, angkaAwal4, minLength=0;

		lengthWord = word.length();

		System.out.print("Jumlah Baris: ");
		baris = keyboard.nextInt();

		for (angkaAwal = 0; angkaAwal < baris; angkaAwal++) {
			for (angkaAwal2 = angkaAwal; angkaAwal2 < lengthWord; angkaAwal2++) {
				System.out.print("-");
			}
			for (angkaAwal3=0; angkaAwal3 <= angkaAwal; angkaAwal3++) {
				if (minLength < lengthWord) {
					System.out.print(word.charAt(minLength));
					System.out.print(" ");
					minLength++;
				}
			}
			System.out.println();
		}
	}
}