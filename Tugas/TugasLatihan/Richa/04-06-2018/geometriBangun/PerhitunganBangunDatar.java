package geometriBangun;

import java.util.Scanner;

public class PerhitunganBangunDatar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu, sisi, panjang, lebar, jari2, tinggi;
		double sisiDoub, panjangDoub, lebarDoub, jari2Doub, tinggiDoub;
		boolean cekValid=true;
		int menuInt;
		
		Scanner keyboard = new Scanner(System.in);
		SegiEmpat s4 = new SegiEmpat();
		SegiEmpat sp = new SegiEmpat();
		Lingkaran li = new Lingkaran();
		Segitiga s3 = new Segitiga();
		
		System.out.println("Perhitungan Bangun Datar\n==============================\nMenu:");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Lingkaran");
		System.out.println("4. Segitiga");
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
			System.out.print("keliling persegi dengan sisi " + sisiDoub + " cm adalah ");
			System.out.print(s4.keliling);
			System.out.print (" cm");
			System.out.println("Luas persegi dengan sisi " + sisiDoub + " cm adalah ");
			System.out.print(s4.luas);
			System.out.print (" cm^2");
		}
		else if (menuInt == 2) {
			do {
				System.out.print("Masukkan besar panjang dalam cm: ");
				panjang = keyboard.next ();
				cekValid = Validasi (panjang, cekValid);
			} while (cekValid == false);
			panjangDoub = Double.parseDouble(panjang);
			do {
				System.out.print("Masukkan besar lebar dalam cm: ");
				lebar = keyboard.next();
				cekValid = Validasi (lebar, cekValid);
			} while (cekValid == false);
			lebarDoub = Double.parseDouble(lebar);
			sp.mencariLuasKelilingVolumSegiPanjang(panjangDoub, lebarDoub, tinggiDoub=0);
			System.out.print("keliling persegi dengan panjang " + panjangDoub + " cm dan lebar " + lebarDoub + " cm adalah " + sp.keliling);
			System.out.print(" cm\n");
			System.out.println("Luas persegi dengan panjang " + panjangDoub + " cm dan lebar " + lebarDoub + " cm adalah " + sp.luas);
			System.out.print (" cm^2");
		}
		else if (menuInt == 3) {
			do {
				System.out.print("Masukkan besar jari-jari dalam cm: ");
				jari2 = keyboard.next();
				cekValid = Validasi (jari2, cekValid);
			} while (cekValid == false);
			jari2Doub = Double.parseDouble(jari2);
			
			li.mencariLuasKelilingVolumLingkaran(jari2Doub);
			System.out.print("keliling lingkaran dengan jari-jari " + jari2Doub + " cm adalah " + li.keliling);
			System.out.print(" cm\n");
			System.out.print("Luas lingkaran dengan jari-jari " + jari2Doub + " cm adalah " + li.luas);
			System.out.print (" cm^2");
		}
		else if (menuInt == 4) {
			do {
				System.out.print("Masukkan besar sisi dalam cm: ");
				sisi = keyboard.next();
				cekValid = Validasi (sisi, cekValid);
			} while (cekValid == false);
			sisiDoub = Double.parseDouble(sisi);
			
			do {
				System.out.print("Masukkan besar tinggi dalam cm: ");
				tinggi = keyboard.next();
				cekValid = Validasi (tinggi, cekValid);
			} while (cekValid == false);
			tinggiDoub = Double.parseDouble(tinggi);
			s3.mencariLuasKelilingSegitiga(sisiDoub, tinggiDoub);
			System.out.print("keliling segitiga dengan sisi " + sisiDoub + " cm dan tinggi " + tinggiDoub+ " cm adalah " + s3.keliling);
			System.out.print(" cm\n");
			System.out.print("Luas segitiga dengan sisi " + sisiDoub + " cm dan tinggi " + tinggiDoub+ " cm adalah " + s3.luas);
			System.out.print (" cm^2");
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
