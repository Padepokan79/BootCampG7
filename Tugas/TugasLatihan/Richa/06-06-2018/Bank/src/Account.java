/* 
Created by  		: Richa Fitria
Date/hour			: 04 Juni 2018/ 11.05 AM
Updated by			: Richa Fitria
Updated Date/hour	: 05 Juni 2018 / 09.45 AM
*/

public class Account {
	
	String name, id, depositAwal, tabung, tarik;
	int saldo;
	
	
	public Account () {

	}
	
	int printSisaSaldo (int saldo) {
		System.out.println("Sisa Saldo anda sebesar Rp. " + saldo);
		return saldo;
	}
	
	int tabung (int saldo, String jmlTabung) {
		System.out.println("Selamat Uang sebesar Rp. " + converttoInt(jmlTabung) + " telah ditambahkan.");
		saldo = saldo + converttoInt(jmlTabung);
		return saldo;
	}
	
	int tarik (int saldo, String jmlTarik) {
		System.out.println("Selamat Uang sebesar Rp. " + converttoInt (jmlTarik) + " telah ditarik.");
		saldo = saldo - converttoInt (jmlTarik);
		return saldo;
	}
	
	void printSaldoAwal (String nama, String nomorID, String depositAwal) {
		System.out.println("Selamat Datang " + nama);
		System.out.println("Akun anda adalah " + nomorID + " a/n " + nama + " Dengan Saldo Sebesar Rp. " + converttoInt(depositAwal) + "\n");
	}
	
	
	public static void printMenu () {
		System.out.println("Menu:\r\n" + 
				"1. Untuk Mengecek Saldo.\r\n" + 
				"2. Deposit/Menabung.\r\n" + 
				"3. Withdraw/Mengambil.\r\n" + 
				"000. exit");
	}
	
	public static int converttoInt (String pilihMenu) {
		return Integer.parseInt(pilihMenu);
	}
}
