package Bank;

import java.util.Scanner;

public class Validasi {
	
	boolean cek = false;
	
	public static boolean cekValidasiHuruf(String validasi, boolean cek) {
		if(validasi.matches("[A-Z a-z]*")) {
			cek = true;
		}else {
			System.out.println("Inputan hanya berupa huruf!");
		}
		return cek;
	}
	public static boolean cekValidasiAngka(String validasi, boolean cek) {
		if(validasi.matches("[0-9]*")) {
			cek = true;
		}
		else if(validasi.indexOf("-") == 0) {
			System.out.println("Inputan hanya berupa bilangan positif!");
		}
		else {
			System.out.println("Inputan hanya berupa angka!");
		}
		return cek;
	}
	
	
	
	public String inputValidasi(String pertanyaan, boolean cek, String input, Scanner key) {
		do {
			System.out.println("");
			System.out.print(pertanyaan);
			input = key.nextLine();
			cek = cekValidasiHuruf(input, cek);
		}while(cek == false);
		return input;
	}
	public int inputValidasiAngka(String pertanyaan, boolean cek, String input, Scanner key) {
		do {
			System.out.println("");
			System.out.print(pertanyaan);
			input = key.nextLine();
			cek = cekValidasiAngka(input, cek);
		}while(cek == false);
		return Integer.parseInt(input);
	}
	
	
	
	
}
