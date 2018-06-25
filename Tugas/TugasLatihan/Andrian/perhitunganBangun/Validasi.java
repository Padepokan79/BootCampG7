package perhitunganBangun;

public class Validasi {
	String menu,panjang,lebar,tinggi;
	int menuInt, panjangInt, lebarInt, tinggiInt, valid;
	
	public Validasi() {
		// TODO Auto-generated constructor stub
	}
	
	int menuValidasi(String menu, int valid) {
		valid = 0;
		if (menu.matches("-?[0-9]+")) {
			valid++;					
		}
		else {
			System.out.println("Inputan harus angka!");
			valid=0;
		}
		return valid;
	}
}
