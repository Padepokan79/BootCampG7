package rrv1;

public class Flu extends Penyakit {
	private Penyakit penyakit;
	private String namaPenyakit, gejala, bagianYangDiserang, tingkatKeparahan;
	private Double biayaPengobatan;
	
	public Flu() {
		
	}
	
	public Flu(Penyakit penyakit, String namaPenyakit, String gejala, String bagianYangDiserang, String tingkatKeparahan, double biayaPengobatan) {
		this.penyakit = penyakit;
		this.namaPenyakit = namaPenyakit;
		this.gejala = gejala;
		this.bagianYangDiserang = bagianYangDiserang;
		this.tingkatKeparahan = tingkatKeparahan;
		this.biayaPengobatan = biayaPengobatan;
	}
	
	public void setNamaPenyakit(String namaPenyakit) {
		this.namaPenyakit = namaPenyakit;
	}
	
	String getNamaPenyakit() {
		return namaPenyakit;
	}
	
	public void setGejala(String gejala) {
		this.gejala = gejala;
	}
	
	String getGejala() {
		return gejala;
	}
	
	public void setBagianYangDiserang(String bagianYangDiserang) {
		this.bagianYangDiserang = bagianYangDiserang;
	}
	
	String getBagianYangDiserang() {
		return bagianYangDiserang;
	}
	
	public void setTingkatKeparahan(String tingkatKeparahan) {
		this.tingkatKeparahan = tingkatKeparahan;
	}
	
	String getTingkatKeparahan() {
		return tingkatKeparahan;
	}
	
	public void setBiayaPengobatan(double biayaPengobatan) {
		this.biayaPengobatan = biayaPengobatan;
	}
	
	double getBiayaPengobatan() {
		return biayaPengobatan;
	}
	
	Penyakit penyakit() {
		return penyakit;
	}
	
	public double tingkatParah(String tingkatKeparahan) {
		if(tingkatKeparahan.equals("tidak bahaya")) {
			biayaPengobatan = (double) 50000;
		}
		else if(tingkatKeparahan.equals("sedang")) {
			biayaPengobatan = (double) 550000;
		}
		else if(tingkatKeparahan.equals("kronis")) {
			biayaPengobatan = (double) 1500000;
		}
		return biayaPengobatan;
	}
	
	public double dapetDiskon(String tingkatKeparahan) {
		double diskon = 0;
		if(tingkatKeparahan.equals("tidak bahaya")) {
			diskon = 0.1;
		}
		else if(tingkatKeparahan.equals("sedang")) {
			diskon = 0.2;
		}
		else if(tingkatKeparahan.equals("kronis")) {
			diskon = 0.3;
		}
		
		return diskon;
	}
	
//	String printInfoPenyakit() {
//		return penyakit.printasuransi() + "\nNama penyakit anda " + namaPenyakit + "\nGejala " + gejala + "\nBagian yang diserang " + bagianYangDiserang + "\nTingkat keparahan " + tingkatKeparahan;
//	}
}
