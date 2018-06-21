package cancer;

public class Kanker {
	
	private String klasifikasi, faktorRisiko;
	
	public Kanker() {
		//	TODO Auto-generated constructor stub		
	}
	
	public Kanker(String klasifikasi, String faktorRisiko) {
		this.klasifikasi = klasifikasi;
		this.faktorRisiko = faktorRisiko;
	}

	String printKanker() {
		return "Klasifikasi kanker " + klasifikasi + " Faktor " + faktorRisiko;
	}
	
	void risiko() {
		System.out.println("Meninggal");
	}
	void gejala() {
		System.out.println("Air seni berwana hitam dalam waktu yang lama");
	}

}
