package AlifharMalikYana;

public class Athlete {
	private int 	tinggi, berat, usia;
	private String	nama, jenisKelamin, id;
	
	public Athlete() {
	}
	
	public Athlete(String nama, String id, String jenisKelamin, int tinggi, int berat, int usia) {
		this.nama 			= nama;
		this.jenisKelamin	= jenisKelamin;
		this.id				= id;
		this.tinggi 		= tinggi;
		this.berat 			= berat;
		this.usia			= usia;
	}
	
	String tampilAthlete() {
		return "Nama : "+nama+", Jenis Kelamin : "+jenisKelamin+", ID : "+id+", Tinggi : "+tinggi+", Berat : "+berat+", Usia : "+usia+"";
	}
}
