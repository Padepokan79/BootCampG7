package rrv;

public class Pakaian {
	
	private String ukuran, jenisBahan;
	
	public Pakaian() {
		
	}
	
	public Pakaian(String ukuran, String jenisBahan) {
		this.ukuran = ukuran;
		this.jenisBahan = jenisBahan;
	}
	
	String getUkuran () {
		return ukuran;
	}
	
	void setUkuran (String ukuran) {
		this.ukuran = ukuran;
	}
	
	void setJenisBahan (String jenisBahan) {
		this.jenisBahan = jenisBahan;
	}
	
	String printPakaian() {
		return "Pakaian dengan ukuran "+ukuran+" ,dibuat dari bahan "+jenisBahan;
	}

}
