package benda;

public class Handphone {
	String merk, warna, os;
	double ukuranLayar;
	int batere;
	
	public Handphone() {}
	public Handphone(String brand, String color, String system, double screenSize, int battery) {
		merk=brand;
		warna=color;
		os=system;
		ukuranLayar=screenSize;
		batere=battery;
	}

	void init(String brand, String color, String system, double screenSize, int battery) {
		merk=brand;
		warna=color;
		os=system;
		ukuranLayar=screenSize;
		batere=battery;
	}
	
	void disp() {
		System.out.println("Handphone anda adalah "+merk);
		System.out.println("Warna          : "+warna);
		System.out.println("Sistem Operasi : "+os);
		System.out.println("Ukuran layar   : "+ukuranLayar+" Inchi");
		System.out.println("Ukuran baterai : "+batere+" mAh");
	}
}
