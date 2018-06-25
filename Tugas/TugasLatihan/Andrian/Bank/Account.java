package Bank;

import java.util.Scanner;

public class Account {
	Scanner key = new Scanner (System.in);
	String huruf, angka, deposit, withdraw, inputNama, inputId;
	int valid, noId, saldo;
	
	public Account () {
	}
	
	public Account (String nama, String noId, int saldo) {
		inputNama = nama;
		inputId = noId ;
		this.saldo = saldo;
	}
	
	
	
	void tabung (int depositUang) {
		saldo = saldo + depositUang;
		System.out.println("Selamat uang sebesar Rp "+depositUang+" telah ditambahkan");
	}
	
	void tarik (int withdrawUang) {
		if (withdrawUang > saldo ) {
			System.out.println("Maaf saldo anda tidak mencukupi");
			valid=0;
		}
		else {
			saldo = saldo - withdrawUang;
			System.out.println("Selamat Uang sebesar Rp "+withdrawUang+" berhasil diambil");
			valid+=1;					
		}	
	}
	
	void printSaldo () {
		System.out.println("Saldo anda sebesar : "+saldo);
	}
	
	void printTabung() {
		System.out.println("Akun anda adalah "+inputId+" a/n "+inputNama+
				" Dengan Saldo Sebesar Rp. "+saldo);
	}
	
	void printTarik () {
		System.out.println("Akun anda adalah "+inputId+" a/n "+inputNama+
				" Dengan Saldo Sebesar Rp. "+saldo);
	}
	
	void printSelamatDatang() {
		System.out.println("Selamat Datang "+inputNama);
		System.out.println("Akun anda adalah "+inputId+" a/n "+inputNama+
				" Dengan Saldo Sebesar Rp. "+saldo);
	}
		
	//Validasi
	
	int menuValidasiHuruf(String huruf, int valid) {
		valid = 0;
		if (huruf.matches("[A-Za-z ]+")) {
			valid++;					
		}
		else {
			System.out.println("Inputan harus Huruf!");
			valid=0;
		}
		return valid;
	}
		
	int menuValidasiAngka(String angka, int valid) {
		valid = 0;
		if (angka.matches("[0-9]+")) {
				valid++;									
		}
		else {
			System.out.println("Inputan harus Angka!");
			valid=0;
		}
		return valid;
	}
	
	int menuValidasiMinus(int input, int valid) {
		if (input<0) {
			System.out.println("Inputan tidak boleh minus!");
			valid=0;
		}
		else {
			valid++;									
		}
		return valid;
	}
	
	int menuValidasidanInputAngka(String namaPertanyaan, String inputAngka, Scanner key, int valid) {
		int validasi = 1;
		do {
			System.out.println(namaPertanyaan);
			inputAngka = key.next();
			valid = menuValidasiAngka(inputAngka, valid);			
		} while (valid<validasi);
		return Integer.parseInt(inputAngka);
	}
	
	String menuValidasidanInputHuruf(String namaPertanyaan, String inputHuruf, Scanner key, int valid) {
		int validasi = 1;
		do {
			System.out.println(namaPertanyaan);
			inputHuruf = key.next();
			valid = menuValidasiAngka(inputHuruf, valid);
		} while (valid<validasi);
		return inputHuruf;
	}
	
	int menuValidasiDanSubInput(String namaPertanyaan, String inputAngka, Scanner key, int valid) {
		String inputDeposit;
		int validasi=1, inputAngkaInt, depositInt, validMinus;
		do {
			System.out.println(namaPertanyaan);
			inputAngka = key.next();
			valid = menuValidasiAngka(inputAngka, valid);
			inputAngkaInt = Integer.parseInt(inputAngka);
			validMinus = menuValidasiMinus(inputAngkaInt, valid);	
		} while (valid<validasi);
		return inputAngkaInt;
	}

}
