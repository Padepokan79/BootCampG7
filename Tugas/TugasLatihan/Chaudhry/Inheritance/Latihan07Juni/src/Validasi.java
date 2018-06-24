import java.util.Scanner;

public class Validasi {
	Scanner key = new Scanner(System.in);
	
	public static boolean cekValidasiHuruf(boolean cek, String validasi) {
		if (validasi.matches("[A-Za-z ]*")) {
			cek = true;	
		
		}else if(!validasi.matches("[A-Za-z ]*")){
			System.out.println("-- Inputan hanya berupa huruf");
			System.out.println("");
		}
		return cek;
	}
	public static boolean cekValidasiAngka(boolean cek, String validasi) {
		if (validasi.matches("[0-9]*")) {
			cek = true;	
		
		}else if(!validasi.matches("[0-9]*")){
			System.out.println("-- Inputan hanya berupa angka");
			System.out.println("");
		}
		return cek;
	}
	
	
	public String inputValidasiHuruf(String namaPertanyaan, String input, Scanner kb, boolean cek) {
		do {
			System.out.print(namaPertanyaan);
			input = kb.nextLine();
			cek = cekValidasiHuruf(cek, input);	
		} while (cek == false);
		return input;
	}
	public int inputValidasiAngka(String namaPertanyaan, String input, Scanner kb, boolean cek) {
		do {
			System.out.print(namaPertanyaan);
			input = kb.nextLine();
			cek = cekValidasiAngka(cek, input);	
		} while (cek == false);
		return Integer.parseInt(input);
	}
}
