package AlifharMalikYana;

public class Carnivora extends Animal{
	private String namaHewan, caraMemangsa;
	private Animal animal;
	
	public Carnivora() {
		
	}
	
	public Carnivora(String namaHewan, Animal animal, String caraMemangsa) {
		this.animal = animal;
		this.namaHewan = namaHewan;
		this.caraMemangsa = caraMemangsa;
	}
	
	public void memangsa() {
		System.out.println(namaHewan + " membunuh mangsanya dengan " + caraMemangsa);
	}
	
	public String toString()
	{
		return namaHewan + " merupakan " + animal; 
	}
	
}
