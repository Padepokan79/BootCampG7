package teamAlifOOP;

public class Athlete {
	String id;
	private int tinggi, berat, usia;
	private String nama, jenisKelamin;
	
	public Athlete(String nama, String id, String jenisKelamin, int usia, int tinggi) {
		this.nama=nama;
		this.id=id;
		this.jenisKelamin=jenisKelamin;
		this.usia=usia;
		this.tinggi=tinggi;
	}

	@Override
	public String toString() {
		return "Athlete [id=" + id + ", tinggi=" + tinggi + ", berat=" + berat + ", usia=" + usia + ", nama=" + nama
				+ ", jenisKelamin=" + jenisKelamin + "]";
	}
	
}
