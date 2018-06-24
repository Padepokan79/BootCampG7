package rhc;

public class Laptop {

	String nama;
	
	public Laptop () {}
	public Laptop (String nama) {
		this.nama = nama;
	}
	
	String getNama() {
		return nama;
	}
	
	public String toString(){
		return "Laptop "+nama;
	}
}
