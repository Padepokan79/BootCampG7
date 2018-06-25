package ChaudryHendraRyan;

public class Asus extends Laptop {
	private String nama, sistemOperasi;
	Laptop 	laptop = new Laptop();
	
	public Asus() {
	}
	
	public Asus(String sistemOperasi, String nama, Laptop laptop) {
		this.laptop 		= laptop;
		this.sistemOperasi	= sistemOperasi;
		this.nama 			= nama;
	}
	
	String tampilAsus() {
		return "Asus[Nama : "+nama+", Sistem Operasi : "+sistemOperasi+", "+laptop.tampilLapto()+"]";
	}
}
