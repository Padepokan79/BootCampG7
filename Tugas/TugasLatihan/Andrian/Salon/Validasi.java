package Salon;

public class Validasi {
	int valid;
	
	public Validasi () {
	}
	
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
}
