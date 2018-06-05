package Validasi;

import java.util.Scanner;

public class ValidasiInputUang {
	
	public ValidasiInputUang() {}
	
	// method validasi untuk inputan uang
	public static int validasiInputUang(String pertanyaan, Scanner scan, boolean cek) {
		String inputStr;
		int input;
		
		do {
			System.out.print(pertanyaan);
			inputStr = scan.next();
			cek = ValidasiHuruf.validasiHuruf(inputStr);
			cek = ValidasiMinUang.validasiMinUang(inputStr, cek);
		}while(cek == true);
		input = Integer.parseInt(inputStr);
		return input;
	}
	
	// method validasi untuk pinjam uang
	public static int validasiPinjamUang(String pertanyaan, Scanner scan, boolean cek) {
		String inputStr;
		int input;
		
		do {
			System.out.print(pertanyaan);
			inputStr = scan.next();
			cek = ValidasiHuruf.validasiHuruf(inputStr);
			cek = ValidasiMinUang.validasiMinUang(inputStr, cek);
			cek = ValidasiMinUang.validasiMaxPinjam(inputStr, cek);
		}while(cek == true);
		input = Integer.parseInt(inputStr);
		return input;
	}
	
}
