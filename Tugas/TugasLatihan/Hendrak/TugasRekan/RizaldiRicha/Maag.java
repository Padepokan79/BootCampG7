package RizaldiRicha;

public class Maag extends Penyakit{
	
	private Penyakit penyakit;
	
	public Maag() {
		
	}
	
	public Maag(String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, Double biayaPengobatan, char asuransi) {
		super(namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan, biayaPengobatan, asuransi);
	}
	
	public Maag(Penyakit penyakit) {
		this.penyakit = penyakit;
	}
	
	public String toString() {
		return super.toString();
	}
}
