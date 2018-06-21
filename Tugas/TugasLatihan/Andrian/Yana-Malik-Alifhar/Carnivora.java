package yma;

public class Carnivora extends Animal{
	private String namaHewan, caraMemangsa;
	Animal hewan ;
	
	public Carnivora() {}
	public Carnivora (Animal hewan, String namaHewan, String caraMemangsa) {
		this.hewan = hewan;
		this.namaHewan = namaHewan ;
		this.caraMemangsa = caraMemangsa ;
	}
	
	String getNamaHewan () {
		return namaHewan;
	}
	
	void setNamaHewan (String namaHewan) {
		this.namaHewan = namaHewan;
	}
	
	String getCaraMemangsa () {
		return caraMemangsa;
	}
	
	void setCaraMemangsa (String caraMemangsa) {
		this.caraMemangsa = caraMemangsa;
	}
	
	public String toString() {
		return hewan.toString()+" ,Nama hewan : "+namaHewan+" ,Cara memangsa : "+caraMemangsa;
	}
}
