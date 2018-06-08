package AlifharMalikYana;

public class Animal {
	private String namaJenisHewan, caraGerak;
	
	public Animal() {
		
	}
	
	public Animal(String namaJenisHewan, String caraGerak) {
		this.namaJenisHewan = namaJenisHewan;
		this.caraGerak = caraGerak;
	}
	public String getNamaJenisHewan() {
		return namaJenisHewan;
	}
	
	
	public String getCaraGerak() {
		return caraGerak;
	}
	
	public String toString()
	{
		return "jenis hewan " + namaJenisHewan +" bergerak dengan " + caraGerak; 
	}
	
}
