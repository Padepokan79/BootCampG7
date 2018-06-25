package rrv;

public class Pakaian {
	private String ukuran, jenisBahan;
	
	public Pakaian(String ukuran, String jenisBahan) {
		this.ukuran = ukuran;
		this.jenisBahan = jenisBahan;
	}
	
	public Pakaian() {
		
	}
	
	void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}
	
	void setJenisBahan(String jenisBahan) {
		this.jenisBahan = jenisBahan;
	}
	
	public String getUkuran() {
		return ukuran;
	}
	
	public String getJenisBahan() {
		return jenisBahan;
	}
	
	public String printPakaian() {
		return "Ukuran : " + ukuran + "\n Jenis Bahan : " + jenisBahan;
	}
}
