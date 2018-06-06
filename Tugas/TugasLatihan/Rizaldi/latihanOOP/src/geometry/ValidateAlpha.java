package geometry;

public class ValidateAlpha {
	private static Boolean validasiHuruf(String pick) {
		Boolean pickOption;
		if(pick.matches("([a-z A-Z])+")){
			pickOption=true;
		}
		else {
			pickOption=false;
			System.out.println("Input harus berupa huruf");
		}
		return pickOption;
	}
}
