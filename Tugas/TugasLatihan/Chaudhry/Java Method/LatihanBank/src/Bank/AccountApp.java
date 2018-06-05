package Bank;

import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		String input, namaNasabah, noIdentitas, saldo, menabung, mengambil;
		int pilihan;
		boolean cek = false;
		
		input = "";
		
		
			System.out.println("SELAMAT DATANG DI BANK 69");
			System.out.println("");
			System.out.println("Untuk pembuatan akun baru");
			
			Validasi valid = new Validasi();
			
			namaNasabah = valid.inputValidasi("Silahkan Masukan Nama Anda : ", cek, input, key);
			noIdentitas = Integer.toString(valid.inputValidasiAngka("Masukan Nomor Identitas                : ", cek, input, key));
			saldo 		= Integer.toString(valid.inputValidasiAngka("Silahkan Besar Deposit pertama anda    : ", cek, input, key));
			
			System.out.println("");
			System.out.println("Selamat Datang, "+namaNasabah);
			System.out.println("Akun anda adalah "+noIdentitas+" a/n "+namaNasabah+" Dengan saldo sebesar "+saldo);
			System.out.println("");
			System.out.println("---------------------------");
		
		do {	
			System.out.println("Menu:");
			System.out.println("[1] --> Untuk mengecek saldo");
			System.out.println("[2] --> Deposit/Menabung");
			System.out.println("[3] --> Withdraw/Mengambil");
			System.out.println("[000] --> Exit");
			
			do {
				pilihan = valid.inputValidasiAngka("Inputkan Pilihan : ", cek, input, key);
				if(pilihan < 1) {
					System.out.println("Input perintah tidak boleh kurang dari 1");
					
				}else if(pilihan > 3) {
					System.out.println("Input perintah tidak boleh lebih dari 3");
					
				}else {
					cek = true;
				}
			}while(cek == false);
			
			Account acc = new Account(Integer.parseInt(saldo));
			if(pilihan == 1) {
				System.out.println("Sisa Saldo anda saat ini Sebesar Rp "+acc.cekSaldo());
				System.out.println("");
				
			}else if(pilihan == 2) {
				menabung = Integer.toString(valid.inputValidasiAngka("Masukan Besar uang yang akan ditabungkan : ", cek, input, key));
				System.out.println("Selamat Uang sebesar Rp "+menabung+" telah ditambahkan");
				System.out.println("");
				acc.addDeposit();
				
			}else if(pilihan == 3) {
				mengambil = Integer.toString(valid.inputValidasiAngka("Masukan Besar uang yang akan diambil : ", cek, input, key));
				System.out.println("");
				acc.mengambil();
			}
		}while(pilihan != 000);
		
		System.out.println("Selesai ...");
	}
}
