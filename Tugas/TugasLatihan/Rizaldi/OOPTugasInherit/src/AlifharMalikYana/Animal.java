package AlifharMalikYana;

public class Animal {
	private String namaHewan;
	
	public Animal() {
		
	}
	public Animal(String namaHewan) {
		this.namaHewan = namaHewan;
	}
	
	// getter
	String getName() {
		return namaHewan;
	}
	// setter
	void setName(String  namaHewan) {
		this.namaHewan = namaHewan;
	}
	
	void gerak() {
		System.out.println("berenang");
	}
}
