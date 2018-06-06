package geometry;

public class ValidateNumber {
	private static Boolean validasiAngka(String pick) {
		Boolean pickOption;
		if(pick.matches("([0-9])+")) {
			pickOption=true;
		}
		else {
			pickOption=false;
			System.out.println("Input harus berupa angka !");
		}
		return pickOption;
	}
}
