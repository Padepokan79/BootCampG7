package MalikYanaAlifar.Athlete;

public class Athlete {
	
	private String nama, jk, id;
	private int tinggi, berat, usia;
	
	public Athlete() {
		
	}
	
	public Athlete(String nama, String jk, String id, int tinggi, int berat, int usia) {
		this.nama = nama;
		this.jk = jk;
		this.id = id;
		this.tinggi = tinggi;
		this.berat = berat;
		this.usia = usia;
	}
	
	public String toString() {
		return "Nama : "+nama+
				"\nJenis kelamin : "+jk+
				"\nId : "+id+
				"\nTinggi : "+tinggi+
				"cm\nBerat : "+berat+
				"kg\nUsia : "+usia+" tahun";
	}

}
