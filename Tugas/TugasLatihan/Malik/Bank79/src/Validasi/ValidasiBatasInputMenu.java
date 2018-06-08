package Validasi;

import java.util.Scanner;

public class ValidasiBatasInputMenu {
	
	public ValidasiBatasInputMenu() {
		
	}
	
	public static boolean validasiBatasInputMenu(String pilihMenuStr, boolean cek) {
		if (pilihMenuStr.matches("([0-9])*")) {
			if (Integer.parseInt(pilihMenuStr) < 4 && Integer.parseInt(pilihMenuStr) > 0) {
				cek = false;
			}else {
				if (pilihMenuStr.equals("000")) {
					System.out.println("Exit");
					cek = false;
				}else if (Integer.parseInt(pilihMenuStr) > 3) {
					System.out.println("Inputan menu tidak boleh lebih dari 3");
					cek = true;
				}else if (Integer.parseInt(pilihMenuStr) < 1 ) {
					System.out.println("Inputan menu tidak boleh kurang dari 1");
					cek = true;
				}
			}
		}
		return cek;
	}
	
	public static int validasiBatasInputMenu(String pertanyaan, Scanner scan, boolean cek) {
		String pilihMenuStr;
		int pilihMenu;
		do {
			System.out.print(pertanyaan);
			pilihMenuStr = scan.next();
			cek = ValidasiHuruf.validasiHuruf(pilihMenuStr);
			cek = validasiBatasInputMenu(pilihMenuStr, cek);
			cek = ValidasiMinUang.validasiPinjamHabis(pilihMenuStr, cek);
			
		}while(cek == true);
		pilihMenu = Integer.parseInt(pilihMenuStr);
		return pilihMenu;
	}
}
