package Bank;

public class Account {
	
	String nama, NoId, deposit;
	int valid, input;
	
	public Account () {
	}
	
	int menuValidasiNama(String nama, int valid) {
		valid = 0;
		if (nama.matches("[A-Za-z ]+")) {
			valid++;					
		}
		else {
			System.out.println("Inputan harus Huruf!");
			valid=0;
		}
		return valid;
	}
	
	int menuValidasiId(String NoId, int valid) {
		valid = 0;
		if (NoId.matches("[0-9]+")) {
			if (NoId.length()>12) {
				valid++;									
			}
			else {
				System.out.println("Nomor identitas yang anda masukan kurang dari 12");
				valid=0;
			}
		}
		else {
			System.out.println("Inputan harus Angka!");
			valid=0;
		}
		return valid;
	}
	
	int menuValidasiInput(String deposit, int valid) {
		valid = 0;
		if (deposit.matches("[0-9]+")) {
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
