package AlifharMalikYana;

public class Carnivore extends Animal{
	String caraMemangsa;
	
	Animal A1 = new Animal();
	public Carnivore(String namaHewan, String caraMemangsa) {
		super(namaHewan);
		this.caraMemangsa = caraMemangsa;
	}
	
	public Carnivore() {
		
	}
	// getter
	String getCaraMemangsa() {
		return caraMemangsa;
	}
	// setter
	void setCaraMemangsa(String caraMemangsa) {
		this.caraMemangsa = caraMemangsa;
	}
	
	void makan() {
		System.out.println("mengunyah");
	}
	
	void gerak() {
		System.out.println("berjalan");
	}
	
}
