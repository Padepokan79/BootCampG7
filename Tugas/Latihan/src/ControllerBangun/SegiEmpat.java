package ControllerBangun;

public class SegiEmpat {
	public double luasPersegi, kelilingPersegi, 
				  luasPersegiPanjang, kelilingPersegiPanjang,
				  volumeKubus, volumeBalok;
	
	public SegiEmpat() {}
	
	//////// 	Proses Hitung Luas Persegi && Keliling && Volume
	public void luasPersegi(double sisi) {
		luasPersegi     = sisi*sisi;
		kelilingPersegi = 4*sisi;
		volumeKubus     = sisi*sisi*sisi;
	}
	////////	Proses Hitung Luas Persegi Panjang && keliling
	public void luasPersegiPanjang( double panjang, double lebar ) {
		luasPersegiPanjang     = panjang*lebar;
		kelilingPersegiPanjang = 2*(panjang+lebar);
	}
	////////	Proses Hitung Luas Volume balok
	public void volumeBalok(double panjang, double lebar, double tinggi) {
		volumeBalok = panjang*lebar*tinggi;
	}
	////////  	Method untuk menampilkan hasil luas persegi
	public void tampilLuasPersegi() {
		System.out.println("Luas Persegi adalah     : "+luasPersegi+" cm2");
		System.out.println("Keliling Persegi adalah : "+kelilingPersegi+" cm");
	}
	////////  	Method untuk menampilkan hasil luas persegi panjang
	public void tampilLuasPersegiPanjang() {
		System.out.println("Luas Persegi Panjang adalah     : "+luasPersegiPanjang+" cm2");
		System.out.println("Keliling Persegi Panjang adalah : "+kelilingPersegiPanjang+" cm");
	}
	////////	Method untuk menampilkan hasil volume kubus
	public void tampilVolumeKubus() {
		System.out.println("Volume Kubus adalah : "+volumeKubus+" cm3");
	}
	////////	Method untuk menampilkan hasil volume balok
	public void tampilVolumeBalok() {
		System.out.println("Volume Balok adalah : "+volumeBalok+" cm3");
	}
	
	
}
