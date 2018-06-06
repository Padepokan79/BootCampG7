package perhitunganBangun;

public class Validation {
	String menu, restMenu, restart;
	int menuInt, valid;
	
	public Validation() {
		
	}
	
	int validate (String menu, int valid) {
		valid = 0;
		if (menu.matches("-?[0-9]+")) {
			menuInt = Integer.parseInt(menu);
			if (menuInt==0) {
				System.out.println("Menu Tidak Ada !!");
				valid = 0;
			}else {
				valid+=1;
			}
		}else {
			System.out.println("Inputan Harus Berupa Angka");
			valid = 0;
		}
		return valid;
	}
	
	String restValidate (String restMenu) {
		if (restMenu.matches("[YT]+")) {
			if (restMenu.equals("T")) {
				restMenu = "T";
			}else if (restMenu.equals("Y")) {
				restMenu = "Y";
			}
		}else{
			System.out.println("Input Tidak Sesuai");
			restMenu = "X";
		}
		return restMenu;
	}
}
