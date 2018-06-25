package Rizaldi;

public class Penyakit {
	private String namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan;
	private double biayaPengobatan;
	private char asuransi;
	
	public Penyakit() {
		
	}
	public Penyakit(String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, char asuransi) {
		this.namaPenyakit 			= namaPenyakit;
		this.gejala 				= gejala;
		this.bagianYangDiserang 	= bagianYangDiserang;
		this.tingkatKeparahan 		= tingkatKeparahan;
		this.asuransi 				= asuransi;
	}
	
	String getPenyakit() {
		return namaPenyakit;
	}
	String getGejala() {
		return gejala;
	}
	String getBagian() {
		return bagianYangDiserang;
	}
	String getKeparahan() {
		return tingkatKeparahan;
	}
	double getBiaya() {
		tingkatKeparahan();
		asuransi();
		return biayaPengobatan;
	}
	char getAsuransi() {
		return asuransi;
	}
	
	
	void tingkatKeparahan() {
		if(tingkatKeparahan.equals("tidak bahaya")) {
			biayaPengobatan = 50000;
			
		}else if(tingkatKeparahan.equals("sedang")) {
			biayaPengobatan = 550000;
		
		}else if(tingkatKeparahan.equals("kronis")) {
			biayaPengobatan = 1500000;
		}
	}
	
	void asuransi() {
		if(asuransi == 'y') {
			if(tingkatKeparahan.equals("tidak bahaya")) {
				biayaPengobatan = (50000*10)/100;
				biayaPengobatan = 50000 - biayaPengobatan; 
				
			}else if(tingkatKeparahan.equals("sedang")) {
				biayaPengobatan = (550000*20)/100;
				biayaPengobatan = 550000 - biayaPengobatan;
			
			}else if(tingkatKeparahan.equals("kronis")) {
				biayaPengobatan = (1500000*30)/100;
				biayaPengobatan = 1500000 - biayaPengobatan;
			}
		}
	}
	
	public String toString() {
		return "Nama Penyakit : "+ getPenyakit()+"\n"+"Gejala : "+ getGejala()+"\n"+"Bagian diserang : "+ getBagian()+"\n"+"Tingkat Keparahan : "+ getKeparahan()+"\n"+"Biaya Pengobatan : "+ getBiaya()+"\n"+"Asuransi : "+getAsuransi();
	}
	
}
