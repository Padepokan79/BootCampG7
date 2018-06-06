package Bank;

import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		String input, inputNama, inputId, inputDeposit; 
		int valid=0, validasi=1, depositInt, saldo=0, inputInt, validMinus ;
		
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
			System.out.println("Masukan Nomor identitas :");
			inputId = key.next();
			valid = acc.menuValidasiAngka(inputId, valid);
			if (inputId.length()>12) {
				valid++;									
			}
			else {
				System.out.println("Nomor identitas yang anda masukan kurang dari 12");
				valid=0;
			}
		} while (valid<validasi);
		
		System.out.println();
		do {
			System.out.println("Silahkan Besar Deposit pertama anda :");
			inputDeposit = key.next();
			valid = acc.menuValidasiAngka(inputDeposit, valid);
		} while (valid<validasi);
		
		depositInt = Integer.parseInt(inputDeposit); 
		System.out.println();
		System.out.println("Selamat Datang "+inputNama);
		System.out.println("Akun anda adalah "+inputId+" a/n "+inputNama+
				" Dengan Saldo Sebesar Rp. "+(saldo+=depositInt));

		System.out.println();
		do {
			do {
				inputDeposit="";
				System.out.println();
				System.out.println("Menu:");
				System.out.println("1. Untuk Mengecek Saldo.");
				System.out.println("2. Deposit/Menabung");
				System.out.println("3. Withdraw/Mengambil");
				System.out.println("000. Exit");
				inputDeposit = key.next();
				valid = acc.menuValidasiAngka(inputDeposit, valid);
				if (valid==1) {
					if (Integer.parseInt(inputDeposit)>3) {
						System.out.println("nilai yang anda masukan melebihi indeks");
						valid =0;
					}
				}
				else if (inputDeposit.matches("[A-Za-z]")) {
					valid=0;
				}
				else {
					valid+=1;
				}			
			} while (valid<validasi);
			
			if (Integer.parseInt(inputDeposit)==1) {
				System.out.println("Saldo anda sebesar : "+saldo);
				valid=0;
			}
			else if (Integer.parseInt(inputDeposit)==2) {
				do {
					System.out.println("Masukan Besar uang yang akan ditabungkan");
					inputDeposit = key.next();
					valid = acc.menuValidasiAngka(inputDeposit, valid);
					depositInt = Integer.parseInt(inputDeposit);
					validMinus = acc.menuValidasiMinus(depositInt, valid);	
				} while (valid<validasi);
				System.out.println();
				System.out.println("Selamat Uang sebesar Rp "+depositInt+" telah ditambahkan");
				saldo+=depositInt;
				System.out.println("Akun anda adalah "+inputId+" a/n "+inputNama+
						" Dengan Saldo Sebesar Rp. "+saldo);
				valid=0;
			}
			else if (Integer.parseInt(inputDeposit)==3) {
				do {
					System.out.println("Masukan Besar uang yang akan diambil");
					inputDeposit = key.next();
					valid = acc.menuValidasiAngka(inputDeposit, valid);
					depositInt = Integer.parseInt(inputDeposit);
					validMinus = acc.menuValidasiMinus(depositInt, valid);
					System.out.println();
					if (depositInt > saldo ) {
						System.out.println("Maaf saldo anda tidak mencukupi");
						valid=0;
					}
					else {
						saldo-=depositInt;
						System.out.println("Selamat Uang sebesar Rp "+depositInt+" berhasil diambil");
						System.out.println("Akun anda adalah "+inputId+" a/n "+inputNama+
								" Dengan Saldo Sebesar Rp. "+saldo);
						valid+=1;					
					}	
				} while (valid<validasi);
				valid=0;
			}
			else if (Integer.parseInt(inputDeposit)==000) {
				System.out.println("Terimakasih telah menggunakan jasa Bank 79");
				valid+=1;
			}
		} while (valid<validasi);
	}

}
