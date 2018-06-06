package backend;

public class Validasi {
	int inputanMen;

	public boolean mustNumber(String inputanMenu, boolean doo) {
		if(inputanMenu.matches("-?[0-9]+")) {
			inputanMen = Integer.parseInt(inputanMenu);
			doo = true;					
		}
		else {
			doo = false;
		}
		return doo;
	}	

	public boolean mustString(String inputanNama, boolean doo) {
		if(inputanNama.matches("[A-Za-z.,]+")) {
			doo = true;
		}
		else {
			doo = false;
		}
		return doo;
	}	
}
