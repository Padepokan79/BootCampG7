/* 
Created by  		: Richa Fitria
Date/hour			: 04 Juni 2018/ 11.05 AM
Updated by			: 
Updated Date/hour	:
*/


import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		
		String nama = " ", nomorID = " ", menu = " ", depositAwal = " ";
		int menuInt, nomorIDint, depositAwalInt, saldo;
		String tabung= " ", tarik = " ";
		boolean cekValid = true;
		
		Scanner keyboard = new Scanner(System.in);
		Account acc = new Account();
		Validasi val = new Validasi();

		System.out.println("========================\r\n" + 
			"\r\n" + 
			"Selamat Datang di Bank 79\r\n" + 
			"\r\n" + 
			"Untuk Pembuatan Akun Bank Baru.\r\n");

		val.validNama(nama, cekValid);
		
		do {
			System.out.println("\r\n" + "Masukan Nomor identitas : ");
			nomorID = keyboard.next();
			cekValid = val.validAngka (nomorID);
		} while (cekValid == false);
		nomorIDint = acc.converttoInt(nomorID);
		do {
		System.out.println("Silahkan Besar Deposit pertama anda: ");
		depositAwal = keyboard.next();
		cekValid = val.validAngka (depositAwal);
		} while (cekValid == false);
		
		depositAwalInt = acc.converttoInt(depositAwal);
		
		System.out.println("Selamat Datang " + nama);
		System.out.println("Akun anda adalah " + nomorID + " a/n " + val.nama + " Dengan Saldo Sebesar Rp. " + depositAwalInt + "\n");

		saldo = depositAwalInt;
		do {
			acc.printMenu();
			menu = keyboard.next();
			cekValid = val.validAngka (menu);
			if (cekValid == false) {
				menu = "0";
			}
			menuInt = acc.converttoInt(menu);
			if (menuInt == 1) {
				System.out.println("Sisa Saldo anda sebesar Rp. " + saldo);
			}
			else if (menuInt == 2) {
				do {
					System.out.println("Masukan Besar uang yang akan ditabungkan:");
					tabung = keyboard.next();
					cekValid = val.validAngka (tabung);
				} while (cekValid == false);
				
				System.out.println("Selamat Uang sebesar Rp. " + acc.converttoInt(tabung) + " telah ditambahkan.");
				saldo = saldo + acc.converttoInt(tabung);
			}
			else if (menuInt == 3) {
				do {
					System.out.println("Masukan Besar uang yang akan ditarik:");
					tarik = keyboard.next ();
					cekValid = val.validAngka (tarik);
				} while (cekValid == false);
				System.out.println("Selamat Uang sebesar Rp. " + acc.converttoInt (tarik) + " telah ditarik.");
				saldo = saldo - acc.converttoInt (tarik);
			}
			else if (cekValid != false && acc.converttoInt(menu) != 000){
				System.out.println("Input Menu tidak ada. Silahkan masukkan lagi!");
			}
		} while ( acc.converttoInt(menu) != 000);
	}
	
}
