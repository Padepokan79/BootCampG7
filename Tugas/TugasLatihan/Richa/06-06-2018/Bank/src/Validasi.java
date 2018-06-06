/* 
Created by  		: Richa Fitria
Date/hour			: 04 Juni 2018/ 11.05 AM
Updated by			: Richa Fitria
Updated Date/hour	: 05 Juni 2018 / 09.45 AM
*/

import java.util.Scanner;

public class Validasi {
	String nama, angka;
	boolean validHuruf = true, validAngka = true;
	Scanner keyboard = new Scanner(System.in);
	
	//validasi nama
	boolean validNama (String n, boolean v) {
		nama = n;
		validHuruf = v;
		do {
			System.out.println("Silahkan Masukan Nama anda: ");
			nama = keyboard.nextLine();
			if (nama.matches ("[a-zA-Z ]+")) {
				 validHuruf = true;
			}
			else if (nama.matches ("[0-9]+")) {
				 validHuruf =false;
				System.out.println("Nama tidak boleh angka. Silahkan masukkan lagi!");
			}
			else {
				 validHuruf = false;
				System.out.println("Nama tidak boleh terdapat karakter. Silahkan masukkan lagi!");
			}
		} while ( validHuruf==false);
		return  validHuruf;
	}
	
	//validasi angka secara umum
	boolean validAngka (String number) {
		angka = number;
		if (angka.matches ("[0-9]+")) {
			validAngka = true;
		}
		else {
			validAngka = false;
			System.out.println("Input harus angka. Silahkan masukkan lagi!");
		}
		return validAngka;
	}
	
}
