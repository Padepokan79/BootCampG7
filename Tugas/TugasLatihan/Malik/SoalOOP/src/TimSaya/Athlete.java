package TimSaya;

public class Athlete {
	private int tinggi, berat, usia;
	private String nama, jenisKelamin, idAthlete;
	
	Athlete(){
		
	}
	
	Athlete(int tinggi, int berat, int usia, String nama, String jk, String id){
		this.tinggi 	= tinggi;
		this.berat 		= berat;
		this.usia 		= usia;
		this.nama 		= nama;
		jenisKelamin 	= jk;
		idAthlete 		= id;
	}
	
	String tampilAthlete() {
		return "Nama\t: "+nama+"\nId\t: "+idAthlete+"\nKelamin\t: "+jenisKelamin+"\nUsia\t: "+usia+"\nTinggi\t: "+tinggi+"\nBerat\t: "+berat;
	}
	
}
