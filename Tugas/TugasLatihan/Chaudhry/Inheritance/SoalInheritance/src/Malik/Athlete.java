package Malik;

public class Athlete {
	private int tinggi, berat, usia;
	private String nama, jenisKelamin, id;
	
	public Athlete() {
		
	}
	public Athlete(int tinggi, int berat, int usia, String nama, String jenisKelamin, String id) {
		this.tinggi 	= tinggi;
		this.berat 		= berat;
		this.usia 		= usia;
		this.nama 		= nama;
		this.jenisKelamin 	= jenisKelamin;
		this.id 		= id;
	}
	
	int getTinggi() {
		return tinggi;
	}
	int getBerat() {
		return berat;
	}
	int getUsia() {
		return usia;
	}
	String getNama() {
		return nama;
	}
	String getJenisKelamin() {
		return jenisKelamin;
	}
	String getId() {
		return id;
	}
	
	public String toString() {
		return "Tinggi : "+tinggi+"\n"+
				"Berat : "+berat+"\n"+
				"Usia  : "+usia+"\n"+
				"Nama  : "+nama+"\n"+
				"JK    : "+jenisKelamin+"\n"+
				"ID    : "+id+"\n";
	}

}
