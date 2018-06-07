package Bangun;

import java.util.Scanner;

public class BangunRuang {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Persegi kotak = new Persegi();
		Segitiga segitiga = new Segitiga();
		Lingkaran lingkaran = new Lingkaran();
		Validasi valid = new Validasi();
		
		int pilih;
		double a, r, s, p, l, t;
		String ulang="", angka="", ceker = "m", validasi;
		boolean cek = false;
		do {
			System.out.println("\tBangun Ruang\t");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Bola");
			System.out.println("4. Tabung");
			System.out.println("======================");
			System.out.print("Pilih : ");
			validasi = valid.valid(cek, angka, ceker);
			pilih = Integer.parseInt(validasi);
			
			ceker = "p";
			if(pilih == 1) {
				System.out.print("Masukan Sisi : ");
				validasi = valid.valid(cek, angka, ceker);
				s = Double.parseDouble(validasi);
				kotak.Kubus(s);
				kotak.volumeBalokKubus();
				
			}
			else if(pilih == 2) {
				System.out.print("Masukan Panjang : ");
				validasi = valid.valid(cek, angka, ceker);
				p = Double.parseDouble(validasi);
				System.out.print("Masukan Lebar : ");
				validasi = valid.valid(cek, angka, ceker);
				l = Double.parseDouble(validasi);
				System.out.print("Masukan Tinggi : ");
				validasi = valid.valid(cek, angka, ceker);
				t = Double.parseDouble(validasi);
				kotak.Balok(p,l,t);
				kotak.tampilLuasKeliling();
			}
			else if(pilih == 3) {
				System.out.print("Masukan Jari Jari : ");
				validasi = valid.valid(cek, angka, ceker);
				r = Double.parseDouble(validasi);
				lingkaran.volumeBola(r);
				lingkaran.tampilTabungBola();
			}
			else if(pilih == 4) {
				System.out.print("Masukan Jari Jari : ");
				validasi = valid.valid(cek, angka, ceker);
				r = Double.parseDouble(validasi);
				System.out.println("Masukan Tinggi : ");
				validasi = valid.valid(cek, angka, ceker);
				t = Double.parseDouble(validasi);
				lingkaran.volumeTabung(r, t);
				lingkaran.tampilTabungBola();
			}
			System.out.println("Ingin melanjutkan menghitung (y/n) : ");
			ulang = key.next();
		}while(ulang.equals("y"));

	}

}
