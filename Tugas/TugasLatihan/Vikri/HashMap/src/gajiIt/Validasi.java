//Created by vikri
//08/06/2018

package gajiIt;

import java.util.*;
public class Validasi {
	String hasil;
	int hasilAngka;
	boolean hasilBool;
	Scanner scan = new Scanner(System.in);
	
	public Validasi() {
		
	}
	
	int valAngka(boolean cek, String question) {
		do {
			System.out.print(question);
			hasil = scan.next();
			
			if(hasil.matches("[0-9-.]+")) {
				if(Integer.parseInt(hasil)<0) {
					System.out.println("Tidak boleh kurang dari 0");
					cek = false;
				} else {
					cek = true;
				}
			} else {
				System.out.println("Inputan hanya angka");
				cek = false;
			}
		}while(cek == false);
		return hasilAngka = Integer.parseInt(hasil);
	}
	String valHuruf(boolean cek, String question) {
		do {
			System.out.print(question);
			hasil = scan.next();
			
			if(hasil.matches("[0-9-.]+")) {
				System.out.println("Inputan hanya Huruf");
				cek = false;
			} else {
				cek = true;
			}
		}while(cek == false);
		return hasil;
	}
	String valBoolean(boolean cek, String question) {
		do {
			System.out.print(question);
			hasil = scan.next();
			
			if(hasil.matches("[0-9-.]+")) {
				System.out.println("Inputan hanya Huruf (ya atau tidak)");
				cek = false;
			} else if (hasil.equals("ya")){
				hasilBool = true;
				cek = true;
			} else if (hasil.equals("tidak")) {
				hasilBool = false;
				cek = true;
			} else {
				System.out.println("Masukan ya atau tidak");
				cek = false;
			}
		}while(cek == false);
		return hasil;
	}

}
