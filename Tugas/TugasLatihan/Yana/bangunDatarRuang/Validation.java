package bangunDatarRuang;

public class Validation {
	boolean val;
	String  mas;

	public Validation() {
		// TODO Auto-generated constructor stub
	}
	
	//validasi angka > 0
	public static boolean validasiInput(boolean val, String mas) {
		if(mas.matches("[0-9]+") && !mas.matches("-?[0-9]")){
			if (Integer.parseInt(mas) > 0) {
				val = true;
			}
			else {
				System.out.println("Masukkan angka lebih dari 0");
			}
		}
		else {
			System.out.println("Tidak boleh memasukkan huruf / simbol");
		}
		return val;
	}
	
	//validasi angka 0-9
	void validasiInput2() {
	}
}
