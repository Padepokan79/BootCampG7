/*
Created  by 	: Yana
Time			: 17 Mei 2018 00.38
*/

import java.util.Scanner;

public class BilanganPrima{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int batas, angkaAwal, angkaAwal2;
		boolean prima;

		System.out.print("Batas: ");
		batas = keyboard.nextInt();

		for (angkaAwal=2; angkaAwal <= batas; angkaAwal++) {
				prima = true;
			for (angkaAwal2 = 2; angkaAwal2 < angkaAwal; angkaAwal2++) {
				if (angkaAwal%angkaAwal2 == 0) {
					prima = false;
				}
			}
			if (prima == true) {
				System.out.print(angkaAwal+" ");
			}

		}

	}
}