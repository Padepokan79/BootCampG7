package animalia;

public class Carnivora extends Animal{
	
	String namaHewan, caraMemangsa;
	Animal anm = new Animal();

	public Carnivora() {
		// TODO Auto-generated constructor stub
	}
	
	public Carnivora(Animal anm, String namaHewan, String caraMemangsa) {
		this.anm = anm;
		this.namaHewan = namaHewan;
		this.caraMemangsa = caraMemangsa;
	}
	
	String printAnimal() {
		return anm.printAnimal() + " bernama " + namaHewan + ", memangsa dengan cara " + caraMemangsa;
	}

}
