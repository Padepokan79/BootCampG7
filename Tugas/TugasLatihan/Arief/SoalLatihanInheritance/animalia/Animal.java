package animalia;

public class Animal {
	
	String jenisHewan;

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String jenisHewan) {
		 this.jenisHewan = jenisHewan;
	}
	
	String gerak() {
		return "Merangkak";
	}
	
	String printAnimal() {
		return "Dia " + jenisHewan;
	}

}
