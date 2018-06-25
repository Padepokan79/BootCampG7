package yma;

public class Athlete {
	private int tinggi, berat, usia;
	private String nama, jenisKelamin, id;

	public Athlete() {}
	public Athlete(String nama, String jenisKelamin, String id, int tinggi, int berat, int usia) {
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.id = id;
		this.tinggi = tinggi;
		this.berat = berat;
		this.usia = usia;
	}
	int getTinggi() {
		return tinggi;
	}
	void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	public int getUsia() {
		return usia;
	}
	public void setUsia(int usia) {
		this.usia = usia;
	}
	private int getBerat() {
		return berat;
	}
	private void setBerat(int berat) {
		this.berat = berat;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	private String getJenisKelamin() {
		return jenisKelamin;
	}
	private void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return "Nama : "+nama+"\nJenis Kelamin : "+jenisKelamin+"\nId : "+id+"\nTInggi : "+tinggi+
				"\nBerat : "+berat+"\nUsia : "+usia;
	}
	
	
}
