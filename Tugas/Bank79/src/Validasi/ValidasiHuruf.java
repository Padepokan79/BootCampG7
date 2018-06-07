package Validasi;

public class ValidasiHuruf {
	
	public ValidasiHuruf() {
		
	}
	
	public static boolean validasiHuruf(String uangTabungStr) {
		boolean cek;
		if(!uangTabungStr.matches("([0-9])*")) {
			System.out.println("Inputan menu harus angka");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}
}
