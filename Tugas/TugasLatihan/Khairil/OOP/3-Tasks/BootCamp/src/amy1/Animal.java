package amy1;

public class Animal {
	private String jenisHewan, caraGerak;
	
	public Animal(String jenisHewan, String caraGerak) {
		this.jenisHewan = jenisHewan;
		this.caraGerak = caraGerak;
	}
	
	public Animal() {
		
	}
	
	public void setJenisHewan(String jenisHewan) {
		this.jenisHewan = jenisHewan;
	}
	
	String getJenisHewan() {
		return jenisHewan;
	}
	
	public void setCaraGerak(String caraGerak) {
		this.caraGerak = caraGerak;
	}
	
	String getCaraGerak() {
		return caraGerak;
	}
	
	String printAnimal() {
		return "Jenis hewan = " + jenisHewan + ", Cara gerak = " + caraGerak;
	}
}