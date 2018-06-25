package bank;

import java.util.Scanner;

public class AccountApp {
	
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Account vld = new Account();
		
		int totDeposit, depositInt, valid, validation, totSaldo, saldo, inputMenuInt, withdrawInt, idInt;
		String id, nama, saldoInt, deposit, restMenu, restart, inputMenu, withdraw;
		
		withdrawInt = depositInt = totSaldo = inputMenuInt = saldo = valid = 0;
		validation = 1; 
		restart = "";
		
		System.out.println("========================");
		System.out.println("Selamat Datang di Bank 79");
		System.out.println();
		System.out.println("Untuk Pembuatan Akun Bank Baru.");
		
		do {
			System.out.println("Silahkan Masukan Nama anda: ");
			nama = inputKey.nextLine();
			valid = vld.validateNama(nama, valid);
		} while (valid < validation);
		
		do {
			System.out.println("Masukan Nomor identitas :");
			id = inputKey.nextLine();
			valid = vld.validateAngka(id, valid);
			if (valid==1) {
				idInt = Integer.parseInt(id);
				valid = vld.validateMinus(idInt, valid);
			}else {
				valid = 0;
			}
		} while (valid < validation);
		
		do {
			System.out.println("Silahkan Besar Deposit pertama anda:");
			deposit = inputKey.nextLine();
			valid = vld.validateAngka(deposit, valid);
			if (valid==1) {
				depositInt = Integer.parseInt(deposit);
				valid = vld.validateMinus(depositInt, valid);
			}else {
				valid = 0;
			}
		} while (valid < validation);

		System.out.println("Selamat Datang");
		System.out.println("Akun anda adalah "+ id + " a/n " + nama + " Dengan Saldo Sebesar Rp. " + (saldo+=depositInt));
		System.out.println();

		do {
			if (saldo<0) {
				System.out.println("Saldo anda kurang dari nol");
				System.out.println("EXIT");
				valid+=1;
			}else {
				System.out.println();
				System.out.println("Menu:");
				System.out.println("1. Cek Saldo.");
				System.out.println("2. Deposit/Menabung.");
				System.out.println("3. Withdraw/Mengambil.");
				System.out.println("000. exit");
				System.out.println("Input: ");
				inputMenu = inputKey.nextLine();
				valid = vld.validateAngka(inputMenu, valid);
				if (valid==1) {
					if(inputMenu.equals("1")) {
						System.out.println();
						System.out.println("Total Saldo Anda Rp. " + saldo);
						valid = 0;
					}else if(inputMenu.equals("2")) {
						System.out.println();
						System.out.println("Deposit/Menabung");
						System.out.println("Masukan Besar uang yang akan ditabungkan: ");
						deposit = inputKey.nextLine();
						valid = vld.validateAngka(deposit, valid);
						depositInt = Integer.parseInt(deposit);
						saldo += depositInt;
						System.out.println("Selamat Uang sebesar Rp " + depositInt + " telah ditambahkan.");
						valid = 0;
					}else if(inputMenu.equals("3")) {
						System.out.println();
						System.out.println("Withdraw/Mengambil");
						System.out.println("Masukan Besar uang yang akan diambil: ");
						withdraw = inputKey.nextLine();
						valid = vld.validateAngka(withdraw, valid);
						withdrawInt =  Integer.parseInt(withdraw);
						if (withdrawInt > saldo) {
							System.out.println("Saldo tidak mencukupi");
							valid = 0;
						}else {
							saldo -= withdrawInt;
							System.out.println("Uang sebesar Rp " + withdrawInt + " telah diambil.");
							valid = 0;
						}
					}else if(inputMenu.equals("000")) {
						System.out.println();
						System.out.println("EXIT !!");
						valid+=1;
					}else {
						System.out.println();
						System.out.println("Menu Tidak Ada !!");
						valid = 0;
					}
				}else {
					valid = 0;
				}
			}
		} while (valid < validation);
	}
}
