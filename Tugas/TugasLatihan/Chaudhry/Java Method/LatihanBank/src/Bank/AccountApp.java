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
			Account acc = new Account(namaNasabah, Integer.parseInt(noIdentitas), Integer.parseInt(saldo));
			
			acc.printBiodata();
		
		do {	
			System.out.println("Menu:");
			System.out.println("[1] --> Untuk mengecek saldo");
			System.out.println("[2] --> Deposit/Menabung");
			System.out.println("[3] --> Withdraw/Mengambil");
			System.out.println("[000] --> Exit");
			
			do {
				pilihan = valid.inputValidasiAngka("Inputkan Pilihan : ", cek, input, key);
				if(pilihan < 1 && !Integer.toString(pilihan).equals("000")) {
					System.out.println("Input perintah tidak boleh kurang dari 1");
					
				}else if(pilihan > 3) {
					System.out.println("Input perintah tidak boleh lebih dari 3");
					
				}else {
					cek = true;
				}
			}while(cek == false);
			
			
			if(pilihan == 1) {
				acc.printSaldo();
				
			}else if(pilihan == 2) {
				menabung = Integer.toString(valid.inputValidasiAngka("Masukan Besar uang yang akan ditabungkan : ", cek, input, key));
				acc.addDeposit(Integer.parseInt(menabung));
				acc.printMenabung();
				
			}else if(pilihan == 3) {
				do {
					mengambil = Integer.toString(valid.inputValidasiAngka("Masukan Besar uang yang akan diambil : ", cek, input, key));
					if( acc.saldo < Integer.parseInt(mengambil) ) {
						System.out.println("Uang saldo yang anda punya tidak cukup");
					}
				}while(acc.saldo < Integer.parseInt(mengambil));
				
				acc.mengambil(Integer.parseInt(mengambil));
				acc.printMenarik();
			}
		}while(!Integer.toString(pilihan).equals("000"));
		
		System.out.println("Selesai ...");
	}
}
