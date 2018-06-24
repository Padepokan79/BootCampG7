package Chaudhry;

public class Apple extends Laptop {
	public Apple() {
		
	}
	public Apple(String nama, int harga, double ukuranLayar, int ukuranRam, int ukuranHdd, String merk, String processor, double clockSpeed) {
		super(nama, harga, ukuranLayar, ukuranRam, ukuranHdd, merk, processor, clockSpeed);
	}
	
	public String toString() {
		return super.toString();
	}
}
