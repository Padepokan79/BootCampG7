package Validasi;

public class ValidasiHuruf {
	
	public ValidasiHuruf() {}
	
	// Validasi untuk inputan tidak boleh huruf
	public static boolean validasiHuruf(String uangTabungStr) {
		boolean cek;
		if(!uangTabungStr.matches("([0-9])*")) {
			System.out.println("Your input must be number\nInput again");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}
}
