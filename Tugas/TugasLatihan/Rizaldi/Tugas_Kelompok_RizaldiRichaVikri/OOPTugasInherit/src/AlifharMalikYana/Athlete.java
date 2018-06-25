package AlifharMalikYana;

public class Athlete {
	private int tinggi, berat, usia;
	private String nama, jnsKelamin, id;
	
	public Athlete() {
		
	}
	public Athlete(int tinggi, int berat, int usia, String nama, String jnsKelamin, String id) {
		this.tinggi = tinggi;
		this.berat = berat;
		this.usia = usia;
		this.nama = nama;
		this.jnsKelamin = jnsKelamin;
		this.id = id;
	}
	// getter
	int getTinggi() {
		return tinggi;
	}
	int getberat() {
		return berat;
	}
	int getUsia() {
		return usia;
	}
	String getNama() {
		return nama;
	}
	String getKelamin() {
		return jnsKelamin;
	}
	String getId() {
		return id;
	}
	// setter
	void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	void setBerat(int berat) {
		this.berat = berat;
	}
	void setUsia(int usia) {
		this.usia = usia;
	}
	void setNama(String nama) {
		this.nama = nama;
	}
	void SetKelamin(String jnsKelamin) {
		this.jnsKelamin = jnsKelamin;
	}
	void setId(String id) {
		this.id = id;
	}
	// method
}
