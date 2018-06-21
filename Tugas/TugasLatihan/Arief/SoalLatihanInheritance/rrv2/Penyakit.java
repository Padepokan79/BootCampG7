package rrv2;

public class Penyakit {

	char asuransi;

	public Penyakit() {
		// TODO Auto-generated constructor stub
	}
	
	public Penyakit(char asuransi) {
		 this.asuransi = asuransi;
	}
	
	String printPnykt() {
		return " dipotong Asuransi " + asuransi; 
	}
	
	void bpjs () {
		if (asuransi == 'Y') {
			System.out.println("" );
		}
	}

}
