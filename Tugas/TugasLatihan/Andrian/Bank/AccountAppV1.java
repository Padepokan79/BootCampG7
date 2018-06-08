package Bank;

import java.util.Scanner;

public class AccountAppV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		String inputNama, inputId, inputAngka="", inputHuruf=""; 
		int valid, validasi=1, depositInt, withdrawInt, saldoInt, inputInt, inputAngkaInt;
		
		valid = depositInt = saldoInt = inputAngkaInt =0;
		
		Account acc = new Account();
		
		System.out.println("==========================");
		System.out.println();
		System.out.println("Selamat Datang di Bank 79");
		System.out.println();
		System.out.println("Untuk Pembuatan Akun Bank Baru.");

		do {
			System.out.println("Silahkan Masukan Nama anda :");
			inputNama =key.nextLine();
			valid = acc.menuValidasiHuruf(inputNama, valid);
		} while (valid<validasi);
		System.out.println();
		do {
			inputId = acc.menuValidasidanInputHuruf("Masukan Nomor identitas :", inputHuruf, key, valid);
		} while (valid<validasi);
		System.out.println();
		saldoInt = acc.menuValidasidanInputAngka("Silahkan Besar Deposit pertama anda :", inputAngka, key, valid); 
		System.out.println();
		acc = new Account(inputNama, inputId, saldoInt);
		//acc.printSaldo();
		acc.printSelamatDatang();

		System.out.println();
		do {
			do {
				inputAngka="";
				System.out.println();
				System.out.println("Menu:");
				System.out.println("1. Untuk Mengecek Saldo.");
				System.out.println("2. Deposit/Menabung");
				System.out.println("3. Withdraw/Mengambil");
				System.out.println("000. Exit");
				inputAngka = key.next();
				if (acc.menuValidasiAngka(inputAngka, valid)==1) {
					if(Integer.parseInt(inputAngka)>=0&&Integer.parseInt(inputAngka)<=3) {
						valid += 1;
						inputAngkaInt = Integer.parseInt(inputAngka);
					}
					else {
						System.out.println("Inputan yang anda masukan salah!!");
						System.out.println("Masukan angka 1 s.d 3 ");
						valid=0;
					}
				}
				else {
					valid=0;
				}			
			} while (valid<validasi);
			
			if (inputAngkaInt==1) {
				acc.printSaldo();
				valid=0;
			}
			else if (inputAngkaInt==2) {
				depositInt = acc.menuValidasiDanSubInput("Masukan Besar uang yang akan ditabungkan : ", inputAngka, key, valid);
				System.out.println();
				acc.tabung(depositInt);
				acc.printTabung();
				valid=0;
			}
			else if (inputAngkaInt==3) {
				do {
					withdrawInt = acc.menuValidasiDanSubInput("Masukan Besar uang yang akan diambil : ", inputAngka, key, valid);
					System.out.println();
					acc.tarik(withdrawInt);
					acc.printTarik();	
				} while (valid<validasi);
				valid=0;
			}
			else if (inputAngkaInt==000) {
				System.out.println("Terimakasih telah menggunakan jasa Bank 79");
				valid+=1;
			}
		} while (valid<validasi);
	}
}