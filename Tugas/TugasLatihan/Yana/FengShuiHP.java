/*
Creted by	: Yana
Time		: 16 Mei 2018
*/

import java.util.Scanner;
import java.util.Random;

public class FengShuiHP{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String noHP, fengShuiAngka;
		int 	angkaAwal, lenghtWord;

		System.out.print("Masukkan No. Telp. : ");
		noHP = keyboard.next();

		lenghtWord = noHP.length();

		for (angkaAwal = 0; angkaAwal < lenghtWord; angkaAwal++ ) {
			if ( noHP.charAt(angkaAwal) == '0') {
				fengShuiAngka = "Khusu, spesial, langka";
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);	
			}
			else if (  noHP.charAt(angkaAwal) == '1' ) {
				fengShuiAngka = "Satu, satu-satunya, diri sendiri";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '2' ) {
				fengShuiAngka = "Mudah, gampang, tidak sulit";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '3' ) {
				fengShuiAngka = "Menemukan, mendapatkan, hidup";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '4' ) {
				fengShuiAngka = "Mati, miskin, susah";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '5' ) {
				fengShuiAngka = "Tidak akan, tidak pernah, tidak bisa";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '6' ) {
				fengShuiAngka = "Menuju, akan";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '7' ) {
				fengShuiAngka = "Tepat, hoki, ketuhanan";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '8' ) {
				fengShuiAngka = "Makmur";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
			else if (  noHP.charAt(angkaAwal) == '9' ) {
				fengShuiAngka = "Sukses";		
				System.out.println();
				System.out.print(noHP.charAt(angkaAwal));		
				System.out.print(" " +fengShuiAngka);			
			}
		}

	}
}