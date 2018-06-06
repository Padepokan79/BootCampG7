package geometriBangun;

import java.util.Scanner;

public class PerhitunganBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuInt; 
		String menu, sisi, panjang, lebar, tinggi, jari2;
		double sisiDoub, panjangDoub, lebarDoub, tinggiDoub=0, jari2Doub;
		boolean cekValid=true;
		
		
		Scanner keyboard = new Scanner(System.in);
		SegiEmpat s4 = new SegiEmpat();
		SegiEmpat sp = new SegiEmpat();
		Lingkaran li = new Lingkaran();
		
		System.out.println("Perhitungan Bangun Ruang\n==============================\nMenu:");
		System.out.println("1. Balok");
		System.out.println("2. Kubus");
		System.out.println("3. Bola");
		System.out.println("4. Tabung");
		System.out.println("==============================");
		
		do {
			System.out.print ("Pilih menu: ");
			menu = keyboard.next ();
			cekValid= Validasi (menu, cekValid);
			if (cekValid == true) {
				if (Integer.parseInt(menu) <= 4 && Integer.parseInt(menu) >= 1 ) {
					cekValid = true;
				}
				else if (Integer.parseInt(menu) > 4) {
					System.out.println("Maaf input tidak boleh lebih dari 4. Silahkan ulangi lagi.");
					cekValid = false ;
				}
			}
			else if (cekValid == false) {
				cekValid = false;
			}
		} while (cekValid==false);
		
		menuInt = Integer.parseInt(menu);
		
		if (menuInt == 1) {
			do {
				System.out.print("Masukkan besar sisi dalam cm: ");
				sisi = keyboard.next();
				cekValid = Validasi (sisi, cekValid);
			} while (cekValid == false);
			sisiDoub = Double.parseDouble(sisi);
			s4.mencariLuasKelilingVolumSegiEmpat(sisiDoub);
			
			System.out.print("Volume persegi dengan sisi " + sisi + " cm adalah ");
			System.out.print(s4.volum);
			System.out.print (" cm^3");
		}
		else if (menuInt == 2) {
			do {
				System.out.print("Masukkan besar panjang dalam cm: ");
				panjang = keyboard.next ();
				cekValid = Validasi (panjang, cekValid);
			} while (cekValid == false);
			panjangDoub = Double.parseDouble(panjang);
			
			do {
				System.out.println("Masukkan besar lebar dalam cm: ");
				lebar = keyboard.next();
				cekValid = Validasi (panjang, cekValid);
			} while (cekValid == false);
			lebarDoub = Double.parseDouble(lebar);
			
			do {
				System.out.print("Masukkan besar tinggi dalam cm: ");
				tinggi = keyboard.next();
				cekValid = Validasi (tinggi, cekValid);
			} while (cekValid == false);
			tinggiDoub = Double.parseDouble(tinggi);

			sp.mencariLuasKelilingVolumSegiPanjang(panjangDoub, lebarDoub, tinggiDoub);
			System.out.print("Volum balok dengan panjang " + panjangDoub + " cm, lebar " + lebarDoub + " cm, tinggi " + tinggiDoub + " cm adalah " +  sp.volum);
			System.out.print(" cm^3");

		}
		else if (menuInt == 3) {
			do {
				System.out.print("Masukkan besar jari-jari dalam cm: ");
				jari2 = keyboard.next();
				cekValid = Validasi (jari2, cekValid);
			} while (cekValid == false);
			jari2Doub = Double.parseDouble(jari2);
			
			li.mencariLuasKelilingVolumLingkaran(jari2Doub);
			System.out.print("Volum lingkaran dengan jari-jari " + jari2Doub + " cm adalah " + li.volum);
			System.out.print(" cm^3");
		}
		else if (menuInt == 4) {
			do {
				System.out.print("Masukkan besar jari-jari dalam cm: ");
				jari2 = keyboard.next();
				cekValid = Validasi (jari2, cekValid);
			} while (cekValid == false);
			jari2Doub = Double.parseDouble(jari2);
			
			System.out.println("Masukkan besar tinggi dalam cm: ");
			do {
				System.out.print("Masukkan besar tinggi dalam cm: ");
				tinggi = keyboard.next();
				cekValid = Validasi (tinggi, cekValid);
			} while (cekValid == false);
			tinggiDoub = Double.parseDouble(tinggi);
			System.out.print("Volum tabung dengan jari-jari " + jari2Doub + " cm dan tinggi " + tinggiDoub+ " cm adalah " + li.volum);
			System.out.print(" cm^3");
		}
	}
	//method validasi
	
	public static boolean Validasi (String valid, boolean cek) {
		if (valid.matches ("[.1-9]+")) {
			cek = true;
		}
		else if (valid.matches ("[-.0-9]+")) {
			System.out.println("Maaf input tidak boleh kurang dari 1. Silahkan ulangi lagi.");
			cek= false ;
		}
		else if (valid.matches ("[a-zA-Z .,]+")) {
			cek = false;	
			System.out.println("Maaf input harus berupa angka. Silahkan ulangi lagi");
		}
		return cek;
	} 
}
