package ChaudryHendraRyan;

public class Laptop {
	private String 	 processor;
	private int 	harga, ram, hardisk, clockSpeed;
	private double	layar;
	
	public Laptop() {
		
	}
	
	public Laptop(int harga, double layar, String processor, int ram, int hardsik, int clockSpeed) {
		this.harga		= harga;
		this.layar		= layar;
		this.processor 	= processor;
		this.ram 		= ram;
		this.hardisk 	= hardsik;
		this.clockSpeed	= clockSpeed;
	}
	
	String game() {
		if (ram > 4 && clockSpeed > 3) {
			return "Cocok untuk Game";
		}
		else {
			return "Tidak cocok untuk Game";
		}
	}
	
	String mengetik() {
		if (ram <= 4 && clockSpeed <= 3) {
			return "Cocok untuk Mengetik";
		}
		else {
			return "Cocok untuk Mengetik";
		}
	}
	
	String tampilLapto() {
		return "Laptop[Harga : "+harga+", Layar : "+layar+", Processor : "+processor+", RAM : "+ram+", Hardisk : "+hardisk+", Clock Speed : "+clockSpeed+"]";
	}
}
