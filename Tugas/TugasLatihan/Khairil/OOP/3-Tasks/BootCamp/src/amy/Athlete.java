package amy;

public class Athlete {
	private String nama, jenisKelamin, id;
	private int tinggi, berat, usia;
	
	public Athlete(String nama, String jenisKelamin, String id, int tinggi, int berat, int usia) {
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.id = id;
		this.tinggi = tinggi;
		this.berat = berat;
		this.usia = usia;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	String getNama() {
		return nama;
	}
	
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	String getJenisKelamin() {
		return jenisKelamin;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	String getId() {
		return id;
	}
	
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	
	int getTinggi() {
		return tinggi;
	}
	
	public void setBerat(int berat) {
		this.berat = berat;
	}
	
	int getBerat() {
		return berat;
	}
	
	public void setUsia(int usia) {
		this.usia = usia;
	}
	
	int getUsia() {
		return usia;
	}
	
	String printAthlette() {
		return "Nama " + nama + "\nJenis Kelamin " + jenisKelamin + "\nID " + id + "\nTinggi " + tinggi + "\nBerat " + berat + "\nUsia " + usia;
	}
}
