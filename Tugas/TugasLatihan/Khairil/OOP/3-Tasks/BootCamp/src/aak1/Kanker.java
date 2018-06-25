package aak1;

class Kanker {
	String klasifikasi, faktorRisiko;
	
	public Kanker() {
		
	}
	
	public Kanker(String klasifikasi, String faktorRisiko) {
		this.klasifikasi = klasifikasi;
		this.faktorRisiko = faktorRisiko;
	}
	
	public void setKlasifikasi(String klasifikasi) {
		this.klasifikasi = klasifikasi;
	}
	
	String getKlasifikasi() {
		return klasifikasi;
	}
	
	public void setFaktorRisiko(String faktorRisiko) {
		this.faktorRisiko = faktorRisiko;
	}
	
	String getFaktorRisiko() {
		return faktorRisiko;
	}
	
	String printKanker() {
		return "Klasifikasi kanker : \n" + klasifikasi + "\nFaktor Risiko : " + faktorRisiko + "\n";
	}
}
