package rhc1;

public class Laptop {

	private String nama;
	
	public Laptop() {
		
	}
	
	public Laptop(String nama) {
		this.nama = nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	String getNama() {
		return nama;
	}
	
	String printLaptop() {
		return "Merk laptop anda adalah " + nama;
	}
}