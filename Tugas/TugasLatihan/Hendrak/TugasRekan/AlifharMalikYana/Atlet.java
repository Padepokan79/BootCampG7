package AlifharMalikYana;

public class Atlet {
	private int tinggi, berat, usia;
	private String nama,jenisKelamin, id;
	
	public Atlet() {
		
	}
	
	public Atlet(int tinggi, int berat,int usia, String nama,String jenisKelamin,String id) {
		this.tinggi = tinggi;
		this.berat = berat;
		this.usia = usia;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.id = id;
	}
	
	public int getTinggi() {
		return tinggi;
	}
	
	public int getUsia() {
		return usia;
	}
	
	public int getBerat() {
		return berat;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString() {
		return "id             : " + id + "\n"+
			   "Nama           : " + nama + "\n" +
			   "Jenis Kelamin  : " + jenisKelamin + "\n" +
			   "Usia           : " +  usia + " Thn \n" +
			   "Tinggi         : " +  tinggi + " cm\n"+
			   "Berat          : " +  berat + " Kg\n"
			   ;
	}
}
