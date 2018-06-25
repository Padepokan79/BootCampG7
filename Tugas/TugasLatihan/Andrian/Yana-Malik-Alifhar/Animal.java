package yma;

public class Animal {
	private String namaJenisHewan, caraGerak;
	
	public Animal () {}
	public Animal (String namaJenisHewan, String caraGerak) {
		this.namaJenisHewan = namaJenisHewan;
		this.caraGerak = caraGerak;
	}
	String getCaraGerak() {
		return caraGerak;
	}
	void setCaraGerak(String caraGerak) {
		this.caraGerak = caraGerak;
	}
	String getNamaJenisHewan() {
		return namaJenisHewan;
	}
	void setNamaJenisHewan(String namaJenisHewan) {
		this.namaJenisHewan = namaJenisHewan;
	}
	
	public String toString() {
		return "Jenis hewan : "+namaJenisHewan+"Cara Bergerak : "+caraGerak;
	}
	
}
