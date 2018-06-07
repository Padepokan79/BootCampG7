package bank;

import java.util.Scanner;

public class Account {
	Scanner inputKey = new Scanner(System.in); 
	String nama, restart, restMenu, angka, input;
	int menuInt, valid, inputInt;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	int validateNama (String nama, int valid) {
		valid = 0;
		if (nama.matches("[A-Za-z ,.]+")) {
			valid+=1;
		}else {
			System.out.println("Inputan Harus Berupa Huruf");
			valid = 0;
		}
		return valid;
	}
	
	int validateAngka (String angka, int valid) {
		valid = 0;
		if (angka.matches("-?[0-9]+")) {
			valid+=1;
		}else {
			System.out.println("Inputan Harus Berupa Angka");
			valid = 0;
		}
		return valid;
	}
	
	int restValidate (String angka, int valid) {
		valid = 0;
		if (restMenu.matches("-?[0-9]+")) {
			valid+=1;
		}else {
			System.out.println("Inputan Harus Berupa Angka");
			valid = 0;
		}
		return valid;
	}
	
	int validateMinus (int input, int valid) {
		if(input<0) {
			System.out.println("Input tidak boleh kurang dari nol");
			valid = 0;
		}else {
			valid+=1;
		}
		return valid;
	} 
	
//	String user(String teks, String inp) {
//		inp = inputKey.nextLine();
//		return inp ;
//	}
}
