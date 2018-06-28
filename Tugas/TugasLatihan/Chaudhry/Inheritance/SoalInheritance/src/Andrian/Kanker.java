package Andrian;

public class Kanker {
	private String klasifikasi, faktorResiko;
	
	public Kanker() {
		
	}
	public Kanker(String klasif, String faktor) {
		klasifikasi 	= klasif;
		faktorResiko 	= faktor;
	}
	
	String getKlasifikasi() {
		return klasifikasi;
	}
	String getFaktor() {
		return faktorResiko;
	}
	
	void gejala() {
		System.out.println("Air seni berwarna hitam dalam waktu lama");
	}
	void resiko() {
		System.out.println("Meninggal");
	}
	
	public String toString() {
		return "Klasifikasi : "+klasifikasi+"\n"+
				"Faktor Resiko : "+faktorResiko;
	}
}
