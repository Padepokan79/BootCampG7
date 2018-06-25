package Malik;

public class Animal {
	String namaJenisHewan, caraGerak;
	
	public Animal() {
		
	}
	public Animal(String nama, String gerak) {
		namaJenisHewan  = nama;
		caraGerak 		= gerak;
	}
	
	String getNamaJenis() {
		return namaJenisHewan;
	}
	String getGerak() {
		return caraGerak;
	}
	
	public String toString() {
		return "Nama Jenis : "+namaJenisHewan+"\n"+
				"Cara gerak: "+caraGerak;
	}
}
