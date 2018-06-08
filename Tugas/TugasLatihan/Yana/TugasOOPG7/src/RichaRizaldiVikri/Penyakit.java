package RichaRizaldiVikri;

public class Penyakit {
	private String namaPenyakit, gejala, bagianSerang, tingkatBahaya;
	
	public Penyakit() {
	}
	
	public Penyakit(String namaPenyakit, String gejala, String bagianSerang, String tingkatBahaya) {
		this.namaPenyakit		= namaPenyakit;
		this.gejala				= gejala;
		this.bagianSerang		= bagianSerang;
		this.tingkatBahaya		= tingkatBahaya;
	}
	
//	public double keparahan() {
//		if (tingkatBahaya.equals("Bahaya")) {
//			return 1500000;
//		}
//		else if (tingkatBahaya.equals("Sedang")) {
//			return 500000;
//		}
//		else if (tingkatBahaya.equals("Tidak Bahaya")) {
//			return 50000;
//		}
//		else {
//			return 50000;
//		}
//	}
	
	String getKeparan() {
		return tingkatBahaya;
	}
	
	String tampilPenyakit() {
		return "Nama Penyakit : "+namaPenyakit+", Gejala : "+gejala+", Bagian yang Diserang : "+bagianSerang+", Tingkat Bahaya"+tingkatBahaya;
	}
}
