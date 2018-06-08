package RichaRizaldiVikri;

public class Flue extends Penyakit{
	private Penyakit 	penyakit = new Penyakit();
	private String 		asuransi;
	private double 		biayaPengobatan;
	
	public Flue() {
	}
	
	public Flue(Penyakit penyakit, String asuransi, double biayaPengobatan) {
		this.penyakit	= penyakit;
		this.asuransi	= asuransi;
		this.biayaPengobatan = biayaPengobatan;
	}
	
	public String keparahan() {
		if (biayaPengobatan > 1500000) {
			return "Bahaya";
		}
		else if (biayaPengobatan > 550000) {
			return "Sedang";
		}
		else if (biayaPengobatan > 50000) {
			return "Tidak Bahaya";
		}
		else {
			return "Tidak Bahaya";
		}
	}
	
	public double bpjs() {
		if (asuransi.equals("BPJS")  && keparahan().equals("Tidak Bahaya")) {
			return biayaPengobatan = biayaPengobatan * 0.10;
		}
		else if (asuransi.equals("BPJS") && keparahan().equals("Sedang")) {
			return biayaPengobatan = biayaPengobatan * 0.20;
		}
		else if (asuransi.equals("BPJS") && keparahan().equals("Bahaya")) {
			return biayaPengobatan = biayaPengobatan * 0.30;
		}
		else {
			return 0;
		}
	}
	
//	public double bpjs() {
//		if (asuransi.equals("BPJS")  && getKeparan().equals("Tidak Bahaya")) {
//			return biayaPengobatan = penyakit.keparahan() * 0.10;
//		}
//		else if (asuransi.equals("BPJS") && getKeparan().equals("Sedang")) {
//			return biayaPengobatan = penyakit.keparahan() * 0.20;
//		}
//		else if (asuransi.equals("BPJS") && getKeparan().equals("Bahaya")) {
//			return biayaPengobatan = penyakit.keparahan() * 0.30;
//		}
//		else {
//			return 0;
//		}
//	}
	
	public double getDiskon() {
		return bpjs();
	}
	
	String tampilFlue() {
		return ""+penyakit.tampilPenyakit()+", Asuransi : "+asuransi+", Biaya Pengobatan : "+biayaPengobatan;
	}
}
