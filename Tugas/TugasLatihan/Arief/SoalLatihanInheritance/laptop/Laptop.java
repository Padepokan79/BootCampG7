package laptop;

public class Laptop {
	
	String nama;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String nama) {
		 this.nama = nama;
	}
	
	String printLaptop() {
		return "Laptop " + nama;
	}
	
	String typing() {
		return "untuk mengetik";
	}
	String gaming() {
		return "untuk main game";
	}
	
}