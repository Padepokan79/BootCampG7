package rhc;

public class Merek extends Laptop {
	private String processor, merk;
	private int harga, ukuranRAM, ukuranHardisk;
	private double clockSpeed, ukuranLayar;
	private Laptop laptop = new Laptop();
	
	public Merek () {}
	
	public Merek (Laptop laptop, String proci, String merk, int harga, int ram, int hdd,
			double ghz, double layar) {
		this.laptop=laptop;
		processor = proci;
		this.merk = merk;
		this.harga = harga;
		ukuranRAM = ram;
		ukuranHardisk = hdd;
		clockSpeed = ghz;
		ukuranLayar = layar;
	}

	Laptop getLaptop() {
		return laptop;
	}
	
	String getProcessor() {
		return processor;
	}
	
	String getMerk() {
		return merk;
	}
	
	int getHarga() {
		return harga;
	}
	
	int getRam() {
		return ukuranRAM;
	}
	
	int getHDD() {
		return ukuranHardisk;
	}
	
	double getClockSpeed() {
		return clockSpeed;
	}
	
	void setClockSpeed(double ghz) {
		clockSpeed = ghz;
	}
	
	double getUkuranLayar() {
		return ukuranLayar;
	}
	
	double kegunaan() {
		if (clockSpeed<3) {
			System.out.println("Untuk mengetik");
		}
		else if (clockSpeed>3) {
			System.out.println("Untuk Gamming");
		}
		return clockSpeed;
	}
	
	public String toString() {
		return laptop.toString()+"\nMerek : "+merk+"\nProcessor : "+processor+"\nRam : "+ukuranRAM+
				"\nHarddisk : "+ukuranHardisk+"\nBesar Ghz : "+clockSpeed+"\nLayar : "+ukuranLayar+
				"\nHarga : "+harga+"\n\nDiperuntukan : "+kegunaan();
	}
	
	
}
