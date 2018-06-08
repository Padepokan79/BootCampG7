package RizaldiRicha;

public class Flue extends Penyakit {

	private Penyakit penyakit;
	
	public Flue() {
		
	}
	
	public Flue(String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, Double biayaPengobatan, char asuransi) {
		super(namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan, biayaPengobatan, asuransi);
	}
	
	public Flue(Penyakit penyakit){
		this.penyakit = penyakit;
	}
	
	
	public String toString() {
		return " " +penyakit;
	}
	
	public String toStringg() {
		return super.toString();
	}
	
}
