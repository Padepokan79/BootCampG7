package amy1;

class Carnivora {
	private Animal animal = new Animal();
	private String namaHewan, caraMemangsa;

	public Carnivora(Animal animal, String namaHewan, String caraMemangsa) {
		this.animal = animal;
		this.namaHewan = namaHewan;
		this.caraMemangsa = caraMemangsa;
	}
	
	public void setNamaHewan(String namaHewan) {
		this.namaHewan = namaHewan;
	}
	
	String getNamaHewan() {
		return namaHewan;
	}
	
	public void setCaraMemangsa(String caraMemangsa) {
		this.caraMemangsa = caraMemangsa;
	}
	
	String getCaraMemangsa() {
		return caraMemangsa;
	}

	Animal getCarnivora() {
		return animal;
	}
	
	String printCarnivora() {
		return animal.printAnimal() + "\n" + "Hewan " + namaHewan + " ini memangsa dengan cara " + caraMemangsa;
	}
}