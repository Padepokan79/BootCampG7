package Chaudhry;

public class Laptop {
	private String nama, merk, processor;
	private int harga, ukuranRam, ukuranHdd;
	private double ukuranLayar, clockSpeed;
	
	public Laptop() {
		
	}
	public Laptop(String nama, int harga, double ukuranLayar, int ukuranRam, int ukuranHdd, String merk, String processor, double clockSpeed) {
		this.nama 	= nama;
		this.harga 	= harga;
		this.ukuranLayar 	= ukuranLayar;
		this.ukuranRam 		= ukuranRam;
		this.ukuranHdd 		= ukuranHdd;
		this.merk 	= merk;
		this.processor 		= processor;
		this.clockSpeed 	= clockSpeed;
	}
	
	String getNama() {
		return nama;
	}
	int getHarga() {
		return harga;
	}
	double getLayar() {
		return ukuranLayar;
	}
	int getRam() {
		return ukuranRam;
	}
	int getHdd() {
		return ukuranHdd;
	}
	String getMerk() {
		return merk;
	}
	String getProcessor() {
		return processor;
	}
	double getClockSpeed() {
		return clockSpeed;
	}
	
	void forOffice() {
		System.out.println("Cocok untuk kebutuhan Office");
	}
	void forGaming() {
		System.out.println("Cocok untuk kebutuhan gaming");
	}
	
	public String toString() {
		return "Nama Laptop : "+getNama()+"\n"+
				"Harga : "+getHarga()+"\n"+
				"Ukuran Layar : "+getLayar()+"\n"+
				"Ukuran RAM : "+getRam()+"\n"+
				"Ukuran HDD : "+getHdd()+"\n"+
				"Merk : "+getMerk()+"\n"+
				"Processor : "+getProcessor()+"\n"+
				"ClockSpeed : "+getClockSpeed()+"\n";
	}
}
