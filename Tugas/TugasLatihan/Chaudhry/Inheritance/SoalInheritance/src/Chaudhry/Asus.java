package Chaudhry;

public class Asus extends Laptop {
	public Asus() {
		
	}
	public Asus(String nama, int harga, double ukuranLayar, int ukuranRam, int ukuranHdd, String merk, String processor, double clockSpeed) {
		super(nama, harga, ukuranLayar, ukuranRam, ukuranHdd, merk, processor, clockSpeed);
	}
	
	public String toString() {
		return super.toString();
	}
}
