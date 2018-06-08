package ViewBangun;

import ControllerBangun.Lingkaran;
import ControllerBangun.SegiEmpat;
import ControllerBangun.Segitiga;
import ControllerBangun.Validasi;
public class ViewBangunDatar {
	public static void main(String[] args) {
		SegiEmpat segi4 = new SegiEmpat();
		Lingkaran lingkaran = new Lingkaran();
		Segitiga segi3 = new Segitiga();
		
		// Pembuatan variable untuk proses
		String inputStr = null;
		int pilihanInt = 0;
		boolean cek = false;
		double input = 0, sisi = 0, panjang = 0, lebar = 0, jari = 0, sisi1 = 0, sisi2 = 0, sisi3 = 0;
		
		System.out.println("=============================");
		System.out.println("   Perhitungan Bangun Datar  ");
		System.out.println("=============================");
		System.out.println();
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Lingkaran");
		System.out.println("4. Segitiga");
		pilihanInt = Validasi.inputValidasiMenu(cek);
		switch (pilihanInt) {
		case 1:
			cek = false;
			sisi = Validasi.inputValidasi("Masukan sisi persegi : ", inputStr, cek, input);
			System.out.println();
			segi4.luasPersegi(sisi);
			segi4.tampilLuasPersegi();
			break;
		case 2:
			cek = false;
			panjang = Validasi.inputValidasi("Masukan panjang persegi panjang : ", inputStr, cek, input);
			lebar   = Validasi.inputValidasi("Masukan lebar persegi panjang   : ", inputStr, cek, input);
			System.out.println();
			segi4.luasPersegiPanjang(panjang,lebar);
			segi4.tampilLuasPersegiPanjang();
			break;
		case 3:
			cek = false;
			jari 	= Validasi.inputValidasi("Masukan jari-jari lingkaran : ", inputStr, cek, input);
			System.out.println();
			lingkaran.luasLingkaran(jari);
			lingkaran.tampilLuasLingkaran();
			break;	
		case 4:
			cek = false;
			sisi1 	= Validasi.inputValidasi("Masukan sisi pertama segitiga :", inputStr, cek, input);
			sisi2 	= Validasi.inputValidasi("Masukan sisi kedua segitiga   :", inputStr, cek, input);
			sisi3 	= Validasi.inputValidasi("Masukan sisi ketiga segitiga  :", inputStr, cek, input);
			System.out.println();
			segi3.luasSegitiga(sisi1,sisi2,sisi3);
			segi3.tampilLuasSegitiga();
			break;	
		default:
			break;
		}	
	}
}