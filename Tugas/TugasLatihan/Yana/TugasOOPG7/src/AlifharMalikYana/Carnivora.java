package AlifharMalikYana;

public class Carnivora extends Animal {
	private String namaHewan, caraMemamngsa;
	private Animal animal = new Animal();
	
	public Carnivora() {
	}
	
	public Carnivora(String namaHewan, String caraMemangsa, Animal animal) {
		this.namaHewan 	= namaHewan;
		this.caraMemamngsa	= caraMemangsa;
		this.animal		= animal;
	}
	
	String memangsa() {
		if (caraMemamngsa.equals("Menerkam")) {
			return "Menerkam";
		}
		else if (caraMemamngsa.equals("Melilit")) {
			return "Melilit";
		}
		else if (caraMemamngsa.equals("Menggigit")) {
			return "Menggigit";
		}
		else
			return " ";
	}
	
	String tampilCarnovora() {
		return "Nama Hewan :"+namaHewan+", Cara Memangsa : "+caraMemamngsa+", "+animal.tampilAnimal();
	}
}
