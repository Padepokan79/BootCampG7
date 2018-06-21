package rrv;

public class Flue extends Penyakit {
	
	String gejala, tingkatKeparahan, bagianYangDiserang;
	private double biayaPengobatan;
	char asuransi;
	Penyakit penyakit = new Penyakit();
	
	public Flue () {
	}
	
	public Flue (Penyakit penyakit, String gejala, String bagianYangDiserang, char asuransi) {
		this.penyakit = penyakit;
		this.gejala = gejala;
		this.bagianYangDiserang = bagianYangDiserang;
		this.asuransi = asuransi;
	}
	
	Penyakit penyakit() {
		return penyakit;
	}
	
	Double kategoriTingkatKeparahan(String tingkatKeparahan) {
		if (tingkatKeparahan.equals("tidakBahaya")) {
			biayaPengobatan = 50000;
		}
		else if (tingkatKeparahan.equals("sedang")) {
			biayaPengobatan = 550000;
		}
		else if (tingkatKeparahan.equals("kronis")) {
			biayaPengobatan = 1500000;
		}
		return biayaPengobatan;
	}
	
	double kategoriAsuransi(char asuransi,String tingkatKeparahan) {
		if (asuransi == 'Y') {
			if (tingkatKeparahan.equals("tidakBahaya")) {
				biayaPengobatan = 50000 - (50000*(10.0/100.0));
			}
			else if (tingkatKeparahan.equals("sedang")) {
				biayaPengobatan = 550000 - (550000*(20.0/100.0));
			}
			else if (tingkatKeparahan.equals("kronis")) {
				biayaPengobatan = 1500000 - (1500000*(30.0/100.0));
			}
		}
		return biayaPengobatan;
	}
	
	String printFlue() {
		return penyakit.printParent()+"\nGejala Anda : "+gejala+"\nBagian yang terasa nyeri : "+ bagianYangDiserang +"\nMengunakan BPJS : "+asuransi; 
	}
}
