package backend;

import java.util.Scanner;

public class Validasi {
	int inputanMen;
	String inputString;
	
	public int convertInt(String inputString) {
		this.inputString = inputString;
		return Integer.parseInt(inputString);
	}	

	public boolean mustNumber(String inputanMenu, boolean doo) {
		if(inputanMenu.matches("-?[0-9]+")) {
			inputanMen = convertInt(inputanMenu);
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
	
	public Boolean mustFilled(String inputNama, Boolean daa) {
		if(inputNama.length() == 0) {
			System.out.println("Inputan Kosong.");
			System.out.println("Coba lagi");
			daa = false;					
		}
		else {
			daa = true;
		}
		return daa;
	}
	
	public String typeInputLog(String stats, Scanner input) {
		String inputans;
		System.out.println(stats);
		inputans = input.nextLine();
		return inputans;
	}	
}
