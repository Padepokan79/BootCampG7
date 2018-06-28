package athlete;

public class Atlit {
	private int tinggi, berat, usia;
	private String nama, jenisKelamin, id;

	public Atlit() {
		// TODO Auto-generated constructor stub
	}
	
	public Atlit(int tinggi, int berat, int usia, String nama, String jenisKelamin, String id) {
		this.tinggi = tinggi;
		this.berat = berat;
		this.usia = usia;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.id = id;
	}
	
	String printAtlit() {
		return "Tinggi " + tinggi + ", berat " + berat + ", usia " + usia + ", nama " + nama + ", JK " + jenisKelamin + ", id " + id;
	}

}
