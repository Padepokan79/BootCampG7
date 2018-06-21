package Rizaldi;

public class Flue extends Penyakit {
	String jenisFlue;
	public Flue() {
		
	}
	public Flue(String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, char asuransi, String jenis) {
		super(namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan, asuransi);
		jenisFlue 	= jenis;
	}
	
	String getJenisFlue() {
		return jenisFlue;
	}
	
	public String toString() {
		return super.toString() + "\nJenis Flue : "+getJenisFlue();
	}
}
