package ControllerBangun;

public class Lingkaran {
	public double phiL=22.0/7, luasLingkaran, kelilingLingkaran,
		   volumeBola, volumeTabung;
	
	public Lingkaran() {}

	////////	Proses Hitung Luas lingkaran && Keliling && Volume Bola
	public void luasLingkaran(double jari) {
		luasLingkaran = phiL*jari*jari;
		kelilingLingkaran = 2*phiL*jari;
		volumeBola = 4.0/3*phiL*jari*jari*jari;
	}
	////////	Proses Hitung Volume Tabung
	public void volumeTabung(double jari, double tinggi) {
		volumeTabung = phiL*jari*jari*tinggi;
	}
	////////	Method untuk menampilkan hasil Luas Lingkaran && Keliling
	public void tampilLuasLingkaran() {
		System.out.println("Luas Lingkaran adalah     : "+luasLingkaran+" cm2");
		System.out.println("Keliling Lingkaran adalah : "+kelilingLingkaran+" cm");
	}
	////////	Method untuk menampilkan hasil Volume Bola
	public void tampilVolumeBola() {
		System.out.println("Volume Bola adalah : "+volumeBola+" cm3");
	}
	////////	Method untuk menampilkan hasil Volume Tabung
	public void tampilVolumeTabung() {
		System.out.println("Volume Tabung adalah : "+volumeTabung+" cm3");
	}
	
	
}
