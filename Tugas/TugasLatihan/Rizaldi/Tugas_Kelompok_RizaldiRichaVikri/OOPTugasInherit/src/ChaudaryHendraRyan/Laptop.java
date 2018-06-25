package ChaudaryHendraRyan;

public class Laptop {
	private String nama, merek, processor;
	private int harga, ukuranRAM, ukuranHardDisk;
	private double ukuranLayar, clockSpeed;
	
	public Laptop() {
		
	}
	public Laptop(String nama, String merek, String processor, int harga, int ukuranRAM, int ukuranHardDisk, Double ukuranLayar, Double clockSpeed) {
		this.nama = nama;
		this.merek = merek;
		this.processor = processor;
		this.harga = harga;
		this.ukuranRAM = ukuranRAM;// set
		this.ukuranHardDisk = ukuranHardDisk;// set
		this.ukuranLayar = ukuranLayar;
		this.clockSpeed = clockSpeed;// set
	}
	
	// getter
	String getName() {
		return nama;
	}
	String getMerek() {
		return merek;
	}
	String getProcessor() {
		return processor;
	}
	int getHarga() {
		return harga;
	}
	int getRam() {
		return ukuranRAM;
	}
	int getHD() {
		return ukuranHardDisk;
	}
	Double getLayar() {
		return ukuranLayar;
	}
	Double getClockSpeed() {
		return clockSpeed;
	}
	// setter
	void setNama(String nama) {
		this.nama = nama;
	}
	void setMerek(String merek) {
		this.merek = merek;
	}
	void setProcessor(String processor) {
		this.processor = processor;
	}
	void setHarga(int harga) {
		this.harga = harga;
	}
	void setRam(int ukuranRAM) {
		this.ukuranRAM = ukuranRAM;
	}
	void setHD(int ukuranHardDisk) {
		this.ukuranHardDisk = ukuranHardDisk;
	}
	void setLayar(Double ukuranLayar) {
		this.ukuranLayar = ukuranLayar;
	}
	void setClock(Double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	
	void toType() {
		System.out.println("untuk mengetik");
	}
	void toGame() {
		System.out.println("untuk bermain game");
	}
	
	public String toString() {
		return "Nama barang\t\t: "+nama+"\nmerek\t\t\t: "+merek+"\njenis processor\t\t: "+processor+"\nharga\t\t\t: "+harga+"\nukuran ram\t\t: "+ukuranRAM+
							   "\nukuran Hard Disk\t: "+ukuranHardDisk+"\nukuran Layar\t\t: "+ukuranLayar+"\nClock Speed\t\t: "+clockSpeed;
	}
}
