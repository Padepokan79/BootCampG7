package AlifharMalikYana;

public class Animal {
	public String jenisHewan, caraGerak;
	
	public Animal() {
	}
	
	public Animal(String jenisHewan, String caraGerak) {
		this.jenisHewan	= jenisHewan;
		this.caraGerak	= caraGerak;
	}
	
	public String makan() {
		if (caraGerak.equals("Merangkak")) {
			return "Sambil merangkak";
		}
		else if(caraGerak.equals("Berjalan")) {
			return "Sambil diam atau berjalan";
		}
		else {
			return "";
		}
	}
	
	String tampilAnimal() {
		return "Jenis Hewan : "+jenisHewan+", caraBergerak : "+caraGerak;
	}
}
