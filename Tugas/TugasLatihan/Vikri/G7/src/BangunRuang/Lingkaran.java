package BangunRuang;

import java.util.Scanner;

public class Lingkaran {
	Double jari, phi, tinggi, vol;
	Double kel, luas;
	String bangunan;
	
	public Lingkaran() {
		
	}

// proses hitung keliling dan luas lingkaran
	void lingkaran(double jari2) {
		jari = jari2;
		phi = 3.14;
		kel = 2*phi*jari;
		luas= phi*(jari*jari);
	}
	
// proses pertanyaan apakah luas atau keliling yang ingin ditampilkan
	void tanyaLuas(String bgn) {
		Scanner scaning = new Scanner(System.in);
		String tanya;
		System.out.print("Pilih Luas / Keliling: ");
		tanya = scaning.next();
		
		bangunan = bgn;
		if(tanya.equals("Luas")) {
			System.out.println("Luas "+bangunan+" Adalah: "+luas);
		} else {
			System.out.println("Keliling "+bangunan+" Adalah: "+kel);
		}
		
	}

// tambahan ouputan
	void text(String s) {
		bangunan = s;
		System.out.println("Volume "+bangunan+" Adalah: "+vol);
	}

// proses hitung volume bola
	void bola(double jari2) {
		jari = jari2;
		phi = 3.14;
		vol = 4/3 * phi * (jari*jari*jari);
	}

// proses hitung volume tabung
	void tabung(double jari, double tinggi) {
		this.jari = jari;
		this.tinggi = tinggi;
		
		phi = 3.14;
		vol = phi * jari * jari * tinggi;
	}
}
