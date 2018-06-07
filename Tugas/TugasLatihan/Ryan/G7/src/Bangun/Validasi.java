package Bangun;

import java.util.Scanner;

public class Validasi {

	public Validasi() {
		
	}
	
	public static String valid (boolean cek, String validasi, String ceker) {
		Scanner key = new Scanner(System.in);
		do {
			validasi = key.next();
			if (validasi.matches("[0-9]+") && ceker.equals("m")) {
				if(Integer.parseInt(validasi) > 0 && Integer.parseInt(validasi) < 5) {
					cek = true;
				}
				else if(Integer.parseInt(validasi) >= 5) {
					cek = false;
					System.out.println("Angka tidak boleh lebih dari 5");
				}
				else {
					System.out.println("Angka tidak boleh kurang dari 0");
					cek = false;
				}
			}
			else if(validasi.matches("[0-9-.]+") && ceker.equals("p")) {
				if(Double.parseDouble(validasi) > 0) {
					cek = true;
				}
				else {
					System.out.println("Angka tidak boleh kurang dari 0");
					cek = false;
				}
			}
			else {
				System.out.println("Hanya dapat menerima angka");
				cek = false;
			}
		}while(cek == false);
		
		return validasi;
	}
}