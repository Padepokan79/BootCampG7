package benda;

public class Laptop {
	String merk, warna, processor;
	int berat, ram;
	
	public Laptop() {}
	public Laptop(String m, String w, String p, int b, int r) {
		merk=m;
		warna=w;
		processor=p;
		berat=b;
		ram=r;
	}
	
	void init(String m, String w, String p, int b, int r) {
		merk=m;
		warna=w;
		processor=p;
		berat=b;
		ram=r;		
	}
	
	void disp() {
		System.out.println("Laptop anda adalah "+merk);
		System.out.println("Berat : "+berat+" Kg");
		System.out.println("Warna : "+warna);
		System.out.println("dengan Processor "+processor+" dan RAM "+ram+" Gb");
	}
}
