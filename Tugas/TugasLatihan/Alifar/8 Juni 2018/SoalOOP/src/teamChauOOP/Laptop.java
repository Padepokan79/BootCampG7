package teamChauOOP;

public class Laptop {
	private String processor;
	private double clockspeed, ukuranLayar;
	private int harga, ukuranRAM, ukuranHardisk;
	
	public Laptop() {}
	public Laptop(String processor, double clock, double ukuran, int harga, int ram, int hardisk) {
		this.processor=processor;
		clockspeed=clock;
		ukuranLayar=ukuran;
		this.harga=harga;
		ukuranRAM=ram;
		ukuranHardisk=hardisk;
	}
	
	String mengetik() {
		return "Bisa untuk pekerjaan mengetik";
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getClockspeed() {
		return clockspeed;
	}
	public void setClockspeed(double clockspeed) {
		this.clockspeed = clockspeed;
	}
	public double getUkuranLayar() {
		return ukuranLayar;
	}
	public void setUkuranLayar(double ukuranLayar) {
		this.ukuranLayar = ukuranLayar;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public int getUkuranRAM() {
		return ukuranRAM;
	}
	public void setUkuranRAM(int ukuranRAM) {
		this.ukuranRAM = ukuranRAM;
	}
	public int getUkuranHardisk() {
		return ukuranHardisk;
	}
	public void setUkuranHardisk(int ukuranHardisk) {
		this.ukuranHardisk = ukuranHardisk;
	}
	
	@Override
	public String toString() {
		return "Laptop [processor=" + processor + ", clockspeed=" + clockspeed + ", ukuranLayar=" + ukuranLayar
				+ ", harga=" + harga + ", ukuranRAM=" + ukuranRAM + ", ukuranHardisk=" + ukuranHardisk + "]";
	}
		
}
