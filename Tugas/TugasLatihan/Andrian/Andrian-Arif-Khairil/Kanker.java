package aak;

public class Kanker {
	private String klasifikasi, faktorResiko;
	
	public Kanker() {}
	public Kanker(String klasifikasi, String faktorResiko) {
		this.klasifikasi = klasifikasi;
		this.faktorResiko = faktorResiko;
	}
	
	public String toString() {
		return "Klasifikasi penyakit : "+klasifikasi+"\nFaktor resiko : "+faktorResiko;
	}

}
