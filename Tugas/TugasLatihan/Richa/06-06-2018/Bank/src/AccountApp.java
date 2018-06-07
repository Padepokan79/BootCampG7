/* 
Created by  		: Richa Fitria
Date/hour			: 04 Juni 2018/ 11.05 AM
Updated by			: Richa Fitria
Updated Date/hour	: 05 Juni 2018 / 09.45 AM
*/


import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		
		String nama = " ", nomorID = " ", menu = " ", depositAwal = " ";
		int menuInt, nomorIDint, depositAwalInt, saldo;
		String tabung= " ", tarik = " ";
		boolean cekValid = true;
		
		Scanner keyboard = new Scanner(System.in);
		Validasi val = new Validasi();
		Account acc = new Account ();

		System.out.println("========================\r\n" + 
			"\r\n" + 
			"Selamat Datang di Bank 79\r\n" + 
			"\r\n" + 
			"Untuk Pembuatan Akun Bank Baru.\r\n");

		val.validNama(nama, cekValid);
		
		//validasi nomor identitas oleh user
		do {
			System.out.println("\r\n" + "Masukan Nomor identitas : ");
			nomorID = keyboard.next();
			cekValid = val.validAngka (nomorID);
		} while (cekValid == false);
		nomorIDint = acc.converttoInt(nomorID);
		
		//validasi deposit awal oleh user
		do {
		System.out.println("Silahkan Besar Deposit pertama anda: ");
		depositAwal = keyboard.next();
		cekValid = val.validAngka (depositAwal);
		} while (cekValid == false);
		depositAwalInt = acc.converttoInt(depositAwal);

		
		acc.printSaldoAwal(val.nama, nomorID, depositAwal);
		
		saldo = depositAwalInt;
		
		//pilih menu untuk user
		do {
			acc.printMenu();
			menu = keyboard.next();
			cekValid = val.validAngka (menu);
			if (cekValid == false) {
				menu = "0";
			}
			menuInt = acc.converttoInt(menu);
			if (menuInt == 1) {
				acc.printSisaSaldo(saldo);
			}
			else if (menuInt == 2) {
				do {
					System.out.println("Masukan Besar uang yang akan ditabungkan:");
					tabung = keyboard.next();
					cekValid = val.validAngka (tabung);
				} while (cekValid == false);
				saldo = acc.tabung (saldo, tabung);
			}
			else if (menuInt == 3) {
				do {
					System.out.println("Masukan Besar uang yang akan ditarik:");
					tarik = keyboard.next ();
					cekValid = val.validAngka (tarik);
				} while (cekValid == false);
				if (saldo>= acc.converttoInt(tarik)) {
				saldo = acc.tarik(saldo, tarik);
				}
				else {
					System.out.println("Maaf saldo Anda tidak mencukupi");
				}
			}
			else if (cekValid != false && !menu.equals ("000")){
				System.out.println("Input Menu tidak ada. Silahkan masukkan lagi!");
			}
		} while ( !menu.equals ("000"));
		
		if (acc.converttoInt(menu) == 000) {
			System.out.println("Terimakasih telah berkunjung di Bank 79 :)");
		}
	}
	
}
