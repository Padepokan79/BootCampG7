package ViewBangun;

import ControllerBangun.Lingkaran;
import ControllerBangun.SegiEmpat;
import ControllerBangun.Validasi;

public class ViewBangunRuang {

	public static void main(String[] args) {
		SegiEmpat segi4 = new SegiEmpat();
		Lingkaran lingkaran = new Lingkaran();
		
		// Pembuatan variable untuk proses
		String inputStr = null;
		int pilihanInt = 0;
		boolean cek = false;
		double input = 0, sisi, panjang, lebar, tinggi, jari;
		
		System.out.println("=============================");
		System.out.println("   Perhitungan Bangun Ruang  ");
		System.out.println("=============================");
		System.out.println();
		System.out.println("1. Kubus");
		System.out.println("2. Balok");
		System.out.println("3. Bola");
		System.out.println("4. Tabung");
		
		pilihanInt = Validasi.inputValidasiMenu(cek);
		switch (pilihanInt) {
		case 1:
			cek = false;
			sisi = Validasi.inputValidasi("Masukan sisi kubus : ", inputStr, cek, input);
			System.out.println();
			segi4.luasPersegi(sisi);
			segi4.tampilVolumeKubus();
			break;
		case 2:
			cek = false;
			panjang = Validasi.inputValidasi("Masukan panjang balok : ", inputStr, cek, input);
			lebar 	= Validasi.inputValidasi("Masukan lebar balok   : ", inputStr, cek, input);
			tinggi 	= Validasi.inputValidasi("Masukan tinggi balok  : ", inputStr, cek, input);
			System.out.println();
			segi4.volumeBalok(panjang,lebar,tinggi);
			segi4.tampilVolumeBalok();
			break;
		case 3:
			cek = false;
			jari = Validasi.inputValidasi("Masukan jari-jari bola : ", inputStr, cek, input);
			System.out.println();
			lingkaran.luasLingkaran(jari);
			lingkaran.tampilVolumeBola();
			break;	
		case 4:
			cek = false;
			jari 	= Validasi.inputValidasi("Masukan jari-jari tabung : ", inputStr, cek, input);
			tinggi 	= Validasi.inputValidasi("Masukan tinggi tabung    : ", inputStr, cek, input);
			System.out.println();
			lingkaran.volumeTabung(jari,tinggi);
			lingkaran.tampilVolumeTabung();
			break;	
		default:
			break;
		}
	}
}