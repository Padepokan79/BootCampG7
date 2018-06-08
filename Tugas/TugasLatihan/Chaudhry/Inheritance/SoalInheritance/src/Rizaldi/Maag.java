package Rizaldi;

public class Maag extends Penyakit {
	public Maag() {
		
	}
	public Maag(String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, char asuransi) {
		super(namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan, asuransi);
	}
	
	public String toString() {
		return super.toString();
	}
}
