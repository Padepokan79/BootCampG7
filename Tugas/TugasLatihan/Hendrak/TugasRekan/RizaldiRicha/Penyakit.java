package RizaldiRicha;

public class Penyakit {
	private String namaPenyakit;
	private String gejala;
	private String bagianYangDiserang;
	private String tingkatKeparahan;
	private Double biayaPengobatan;
	private char asuransi;
	
	public Penyakit()
	{
		
	}
	
	public Penyakit(String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, Double biayaPengobatan, char asuransi) {
		this.namaPenyakit = namaPenyakit;
		this.gejala = gejala;
		this.bagianYangDiserang = bagianYangDiserang;
		this.tingkatKeparahan = tingkatKeparahan;
		this.biayaPengobatan = biayaPengobatan;
		this.asuransi = asuransi;
	}
	
	public String getNamaPenyakit() {
		return namaPenyakit;
	}
	
	public String getGejala() {
		return gejala;
	}
	
	public String getBagianYangDiserang() {
		return bagianYangDiserang;
	}
	public String getTingkatKeparahan() {
		return tingkatKeparahan;
	}
	
	public Double getBiayaPengobatan() {
		return biayaPengobatan;
	}
	
	public char getAsuransi() {
		return asuransi;
	}
	
	public void tingkatKeparahan() {
		if(tingkatKeparahan.equals("kronis")) {
			biayaPengobatan = 1500000.0;
		}
		else if(tingkatKeparahan.equals("sedang")) {
			biayaPengobatan = (double) 550000;
		}
		else if(tingkatKeparahan.equals("tidakbahaya")){
			biayaPengobatan = 50000.0;
		}
	}
	
	public void asuransi() {
		if(asuransi == 'y') {
			if(tingkatKeparahan.equals("kronis")) {
				biayaPengobatan = biayaPengobatan - (biayaPengobatan*0.3);
			}
			else if(tingkatKeparahan.equals("sedang")) {
				biayaPengobatan = biayaPengobatan - (biayaPengobatan*0.2);;
			}
			else if(tingkatKeparahan.equals("tidakbahaya")){
				biayaPengobatan = biayaPengobatan - (biayaPengobatan*0.1);;
			}
		}
	}
	
	public String toString() {
		tingkatKeparahan();
		asuransi();
		
		return "Nama Penyakit : " + namaPenyakit + "\n" +
			   "Gejala        : " + gejala + "\n" +
			   "Bagian yang Diserang : " + bagianYangDiserang + "\n"+
			   "Tingkat Kerparahan   : " + tingkatKeparahan + "\n"+
			   "Biaya Pengobatan     : " + biayaPengobatan + "\n" +
			   "Asuransi             : " + asuransi + "\n"
			   ;
	}
}
