package test2;

import java.util.*;
public class Tester2 {
	static Boolean cek = false, cek2;
	static int angka, hasil;
	static Double hasil2;

// method untuk menyortir bangun ruang yang ada di menu
	static Boolean validHuruf(String a) {
		String arrBangunRuang[] = {"Kubus", "Balok", "Bola", "Tabung"};
		String c = a;
		for(int valH = 0 ; valH < arrBangunRuang.length; valH++) {
			if(c.equals(arrBangunRuang[valH])) {
				cek = true;
				System.out.println("====================================");
			}
		}
		if(cek == false) {
			System.out.println("Bangun ruang tidak terkenali");
		}
		return cek;
	}

// method untuk validasi input angka
	static boolean valAngka(String angka) {
		String ang = angka;
		if(ang.matches("[0-9-.]+")) {
			if(Integer.parseInt(ang)<0) {
				System.out.println("Angka Tidak boleh kurang dari 0");
			} else {
				if(cek == false) {
					cek = true;
				} else {
					cek = false;
				}
				hasil = Integer.parseInt(ang);
			}
		}else {
			System.out.println("Masukan Angka saja");
		}
		return cek;
	}
	
// method untuk validasi input angka double
	static boolean valAngkaDouble(String angka) {
		String ang = angka;
		
	// proses peyortiran angka yang kurang dari 0
		if(ang.matches("[0-9-.]+")) {
			if(Double.parseDouble(ang)<0) {
				System.out.println("Angka Tidak boleh kurang dari 0");
			} else {
				if(cek == false) {
					cek = true;
				} else {
					cek = false;
				}
				hasil2 = Double.parseDouble(ang);
			}
		}else {
			System.out.println("Masukan Angka saja");
		}
		return cek;
	}
	
	public static void main(String[] args) {
		String bangunRuang;
		
		Persegi kotak = new Persegi();
		Lingkaran bulet = new Lingkaran();
		
		Scanner scan = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
	// Validasi bangun ruang yang bisa dihitung ada atau tidak	
		do {
			System.out.print("Pilih Bangun Ruang: ");
			bangunRuang = scan.nextLine();
			validHuruf(bangunRuang);
		}while(cek == false);
	
	// Hitung volume Kubus	
		if(bangunRuang.equals("Kubus")) {
			String sisy ;
		// Validasi inputan Angka
			do {
				System.out.print("Masukan Besar sisi: ");
				sisy = input.next();
				valAngka(sisy);
			}while(cek == true);
			kotak.kubus(hasil);
			kotak.text(bangunRuang); // output 
	
	// Hitung Volume Balok		
		}else if(bangunRuang.equals("Balok")) {
			String panjang, lebar, tinggi;
			int p, l, t; // p, l, t sebagai singkatan dari pangjang, lebar dan tinggi
		
		// validasi inputan angka	
			do {
				System.out.print("Masukan Besar Panjang: ");
				panjang = input.next();
				valAngka(panjang);
			}while(cek == true);
			p = hasil;
			
			do {
				System.out.print("Masukan Besar Lebar: ");
				lebar = input.next();
				valAngka(lebar);
			}while(cek == false);
			l = hasil;
			
			do {
				System.out.print("Masukan Besar Tinggi: ");
				tinggi = input.next();
				valAngka(tinggi);
			}while(cek == true);
			t = hasil;
		
		// Proses hitung volume	
			kotak.balok(p, l, t);
		// Output	
			kotak.text(bangunRuang);
		
	// Hitung Volume Bola		
		} else if(bangunRuang.equals("Bola")) {
			String jari;
			Double j;
			
		// validasi inputan angka Double
			do {
				System.out.print("Masukan Besar Jari: ");
				jari = input.next();
				valAngkaDouble(jari);
			}while(cek == false);
			j = hasil2;
		
		// proses hitung volume
			bulet.bola(j);
		
		// Output
			bulet.text(bangunRuang);
			
	// Hitung Volume Tabung		
		} else if(bangunRuang.equals("Tabung")) {
			String jari, tinggi;
			Double j, t;
		// validasi inputan angka Double
			do {
				System.out.print("Masukan Besar Jari-jari: ");
				jari = input.next();
				valAngkaDouble(jari);
			}while(cek == true);	
			j = hasil2;
			
			do {
				System.out.print("Masukan Besar tinggi: ");
				tinggi = input.next();
				valAngkaDouble(jari);
			}while(cek == false);
			t = hasil2;
		
		// Proses hitung volume tabung
			bulet.tabung(j, t);
		// Output	
			bulet.text(bangunRuang);
		} else {
			System.out.println("Ulang");
		}
	}
}
