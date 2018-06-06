package Bangun;

import java.util.Scanner;

public class BangunDatar {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Persegi kotak = new Persegi();
		Segitiga segitiga = new Segitiga();
		Lingkaran lingkaran = new Lingkaran();
		Validasi valid = new Validasi();
		
		int pilih=0;
		double alas, tinggi, r, sisi=0, panjang=0, lebar=0;
		String ulang="", validasi="", angka="", ceker="m";
		boolean cek=false;
		
		do {
			System.out.println("\tBangun datar\t");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Segitiga");
			System.out.println("4. Lingkaran");
			System.out.println("======================");
			System.out.print("Pilih : ");
			validasi = valid.valid(cek, angka, ceker);
			pilih = Integer.parseInt(validasi);
			
			ceker = "p";
			if(pilih == 1) {
				System.out.print("Masukan Sisi : ");
				validasi = valid.valid(cek, angka, ceker);
				sisi = Double.parseDouble(validasi);
				kotak.persegi(sisi);
				kotak.tampilLuasKeliling();	
			}
			else if(pilih == 2) {
				System.out.print("Masukan Panjang : ");
				validasi = valid.valid(cek, angka, ceker);
				panjang = Double.parseDouble(validasi);
				System.out.print("Masukan Lebar : ");
				validasi = valid.valid(cek, angka, ceker);
				lebar = Double.parseDouble(validasi);
				kotak.persegiPanjang(panjang, lebar);
				kotak.tampilLuasKeliling();
			}
			else if(pilih == 3) {
				System.out.print("Masukan Alas : ");
				validasi = valid.valid(cek, angka, ceker);
				alas = Double.parseDouble(validasi);
				System.out.print("Masukan Tinggi : ");
				validasi = valid.valid(cek, angka, ceker);
				tinggi = Double.parseDouble(validasi);
				segitiga.luasSegitiga(alas, tinggi);
				segitiga.tampil();
			}
			else if(pilih == 4) {
				System.out.print("Masukan Jari Jari : ");
				validasi = valid.valid(cek, angka, ceker);
				r = Double.parseDouble(validasi);
				lingkaran.luasKeliling(r);
				lingkaran.tampilLuasKeliling();
			}
			System.out.println("Ingin melanjutkan menghitung (y/n) : ");
			ulang = key.next();
		}while(ulang.equals("y"));
					
	}
}
