package AlifharMalikYana;

public class Herbivora extends Animal{
	private String namaHewan, caraMemangsa;
	private Animal animal;
	
	public Herbivora() {
		
	}
	
	public Herbivora(String namaHewan, Animal animal, String caraMemangsa) {
		this.namaHewan = namaHewan;
		this.caraMemangsa = caraMemangsa;
		this.animal = animal;
		
	}
	
	public void makan() {
		System.out.println(namaHewan + " memakan dedaunan " + caraMemangsa);
	}
	
	public String toString()
	{
		return namaHewan + " merupakan " + animal; 
	}
}
