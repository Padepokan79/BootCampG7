package AndrianAriefKhairil;

public class Kanker {
	private String klasifikasi, faktorRisiko;
	
	public Kanker(){
		
	}
	public Kanker(String klasifikasi, String faktorRisiko) {
		this.klasifikasi = klasifikasi;
		this.faktorRisiko = faktorRisiko;
	}
	
	// getter
	String getKlasifikasi() {
		return klasifikasi;
	}
	String getFaktor() {
		return faktorRisiko;
	}
	// setter
	void setKlasifikasi(String klasifikasi) {
		this.klasifikasi = klasifikasi;
	}
	void setFaktor(String faktorRisiko) {
		this.faktorRisiko = faktorRisiko;
	}
	// method/behaviour
	void risiko() {
		System.out.println("Meninggal");
	}
	void gejala() {
		System.out.println("Air seni berwana hitam dalam waktu yang lama");
	}
	
	public String toString() {
		return "klasifikasi kanker\t: "+getKlasifikasi()+"\nFaktor\t\t\t: "+getFaktor();
	}
}


