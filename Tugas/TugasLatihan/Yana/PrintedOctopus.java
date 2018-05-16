/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;

public class PrintedOctopus{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String octopus;
		int 	angkaAwal, lenghtWord;

		System.out.print("Masukkan nama: ");
		octopus = keyboard.nextLine();

		lenghtWord = octopus.length();

		for (angkaAwal = 0; angkaAwal < lenghtWord; angkaAwal++ ) {
			System.out.println(octopus.charAt(angkaAwal));			
		}
	}
}