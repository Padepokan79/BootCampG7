package teamrOOP;

public class Penyakit {
	private String namaPenyakit, tingkatKeparahan, asuransi;
	private double biayaPengobatan;
	
	public Penyakit() {}
	public Penyakit(String namaPenyakit, String tingkatKeparahan, String asuransi) {
		this.namaPenyakit = namaPenyakit;
		this.tingkatKeparahan = tingkatKeparahan;
		this.asuransi = asuransi;
	}
	
	void harga() {
		if(tingkatKeparahan.equals("Tidak Bahaya"))
			biayaPengobatan=50000;
		else if(tingkatKeparahan.equals("Sedang"))
			biayaPengobatan=550000;
		else if(tingkatKeparahan.equals("Kronis"))
			biayaPengobatan=1500000;
	}
	
	boolean getAsuransi() {
		if(asuransi.equals("bpjs"))
			return true;
		else
			return false;
	}

	void bpjs() {
		if(getAsuransi())
			if(tingkatKeparahan.equals("Tidak Bahaya"))
				biayaPengobatan-=0.1*biayaPengobatan;
			else if(tingkatKeparahan.equals("Sedang"))
				biayaPengobatan-=0.2*biayaPengobatan;
			else if(tingkatKeparahan.equals("Kronis"))
				biayaPengobatan-=0.3*biayaPengobatan;
	}

	@Override
	public String toString() {
		return "Penyakit [namaPenyakit=" + namaPenyakit + ", tingkatKeparahan=" + tingkatKeparahan + ", asuransi="
				+ asuransi + ", biayaPengobatan=" + biayaPengobatan + "]";
	}
	
}
