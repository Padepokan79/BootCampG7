package rrv1;

public class Penyakit {
	private char asuransi;
	
	public Penyakit() {
		
	}
	
	public Penyakit(char asuransi) {
		this.asuransi = asuransi;
	}
	
	public void setasuransi(char asuransi) {
		this.asuransi = asuransi;
	}
	
	char getasuransi() {
		return asuransi;
	}
	
	String convertAsuransi(char asuransi) {
		String asu;
		if(asuransi == 'b') {
			asu = "bpjs";
		}
		else {
			asu = "non-bpjs";
		}
		return asu;
	}
	
	String printasuransi() {
		return "Asuransi anda adalah " + convertAsuransi(asuransi);
	}
}