package TimRizaldi;

public class Penyakit {
	private String namaPenyakit, tingkatKeparahan, asuransi;
	private double biayaPengobatan, discount=0;
	
	Penyakit(){}
	
	Penyakit(String nama, String tgkt, String asuransi){
		namaPenyakit 		= nama;
		tingkatKeparahan 	= tgkt;
		this.asuransi 		= asuransi;
	}
	
	void tingkatKeparahan() {
		if (tingkatKeparahan.equals("kronis")) {
			biayaPengobatan = 1500000;
		}else if (tingkatKeparahan.equals("sedang")) {
			biayaPengobatan = 550000;
		}else if (tingkatKeparahan.equals("tidakbahaya")) {
			biayaPengobatan = 50000;
		}
	}
	
	double biaya() {
		return biayaPengobatan;
	}
	
	double asuransi() {
		if (asuransi.equals("bpjs")) {
			if (tingkatKeparahan.equals("kronis")) {
				return discount = 0.3;
			}else if (tingkatKeparahan.equals("sedang")) {
				return discount = 0.2;
			}else if (tingkatKeparahan.equals("tidakbahaya")) {
				return discount = 0.1;
			}
		}else {
			return discount;
		}
		return discount;
		
	}
	
	String toPenyakit() {
		return "Nama Penyakit\t: "+namaPenyakit+"\nTingkat\t\t: "+tingkatKeparahan+"\nAsuransi\t: "+asuransi+"\nBiaya\t\t: Rp. "+(biayaPengobatan = biayaPengobatan-(biayaPengobatan*discount));
	}
	
	
}
