package Bangun;

import java.util.Scanner;

public class PerhitunganBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//hemat coding
		//disimpan didalam if kalo agar yang dipakai cuma yang dibutuhkan
		SegiEmpat se1 = new SegiEmpat();
		Lingkaran l1 = new Lingkaran();
		Validasi val = new Validasi();
		
		String ulang,pilih="",nilaiPLT="",menu="";
		boolean cek=false;
		
		do {
			menu="m";
			System.out.println("Perhitungan Bangun Datar");
			System.out.println("========================");
			System.out.println("1.Kubus");
			System.out.println("2.Balok");
			System.out.println("3.Bola");
			System.out.println("4.Tabung");
			System.out.println("========================");
			System.out.print("Pilih Perhitungan : ");
			pilih = val.validasiInput(nilaiPLT, cek, menu);
			
			menu="p";
			if(pilih.equals("1")) {
				System.out.print("Masukan Sisi kubus :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				se1.sisi = Double.parseDouble(nilaiPLT);
				se1.cariLKVPersegi(se1.sisi);
				se1.tampilPersegiV();
			}
			else if(pilih.equals("2")) {
				System.out.print("Masukan Panjang Balok:");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				se1.panjang = Double.parseDouble(nilaiPLT);
				System.out.print("Masukan Lebar Balok :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				se1.lebar = Double.parseDouble(nilaiPLT);
				System.out.print("Masukan Tinggi Balok :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				se1.tinggi = Double.parseDouble(nilaiPLT);
				se1.cariVPersegiPanjang(se1.panjang,se1.lebar,se1.tinggi);
				se1.tampilPersegiPanjangV();
			}
			else if(pilih.equals("3")) {
				System.out.print("Masukan jari-jari :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				l1.jari2 = Double.parseDouble(nilaiPLT);
				l1.cariVolumeBola(l1.jari2);
				l1.tampilVolumeBola();
			}
			else if(pilih.equals("4")) {
				System.out.print("Masukan Jari-jari   :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				l1.jari2 = Double.parseDouble(nilaiPLT);
				System.out.print("Masukan Tinggi :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				l1.tinggi = Double.parseDouble(nilaiPLT);
				l1.cariVolumeTabung(l1.jari2, l1.tinggi);
				l1.tampilVolumeTabung();
			}
			else {
				System.out.println("Salah Inputan");
			}
			System.out.print("Coba lagi (y/n)??");
			ulang =keyboard.next();
		}while(ulang.equals("y"));

	}

}
