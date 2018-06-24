package RizaldiRicha.Penyakit;

public class Penyakit {
	
	private String namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan;
	private double biayaPengobatan, easy=50000, medium=550000, hard=1500000;
	private char asuransi;
	
	public Penyakit(String namaPenyakit, String gejala, String bagian, String tingkatParah, char asuransi) {
		this.namaPenyakit = namaPenyakit;
		this.gejala = gejala;
		bagianYangDiserang = bagian;
		tingkatKeparahan = tingkatParah;
		this.asuransi = asuransi;
	}
	
	void biayaPengobatan() {
		if(tingkatKeparahan.equals("sedang")) {
			biayaPengobatan = medium;
			if(asuransi == 'y') {
				biayaPengobatan = biayaPengobatan -  biayaPengobatan/100*20;
			}
		}
		else if(tingkatKeparahan.equals("kronis")){
			biayaPengobatan = hard;
			if(asuransi == 'y') {
				biayaPengobatan = biayaPengobatan -  biayaPengobatan/100*20;
			}
		}
		else {
			biayaPengobatan = easy;
			if(asuransi == 'y') {
				biayaPengobatan = biayaPengobatan - biayaPengobatan/100*10;
			}
		}
	}

}
