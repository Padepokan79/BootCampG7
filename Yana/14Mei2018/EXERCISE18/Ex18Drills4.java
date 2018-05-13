/*
Created by	: Yana
Time		: 14 Mei 2018 10.34
*/

import java.util.Scanner;

public class Ex18Drills4{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int bis6, bis12, bis18, bis32, bis45, bis60, jumlahPenumpang;

		bis6 	= 6;
		bis12	= 12;
		bis18	= 18;
		bis32	= 32;
		bis45	= 45;
		bis60	= 60;

		System.out.print("Masukkan jumlah penumpang: ");
		jumlahPenumpang = keyboard.nextInt();

		if (jumlahPenumpang >= 60) {
			System.out.println("Bis yang tersedia dengan kursi " +bis60);
		}
		if (jumlahPenumpang >= 45) {
			System.out.println("Bis yang tersedia dengan kursi " +bis45);			
		}
		if (jumlahPenumpang >= 32) {
			System.out.println("Bis yang tersedia dengan kursi " + bis32);			
		}
		if (jumlahPenumpang >= 18) {
			System.out.println("Bis yang tersedia dengan kursi " + bis18);			
		}
		if (jumlahPenumpang >= 12) {
			System.out.println("Bis yang tersedia dengan kursi " + bis12);			
		}
		if (jumlahPenumpang >= 6) {
			System.out.println("Bis yang tersedia dengan kursi " + bis6);			
		}
		if (jumlahPenumpang < 6) {
			System.out.println("Bis yang tersedia dengan kursi " + bis6);			
		}

	}
}