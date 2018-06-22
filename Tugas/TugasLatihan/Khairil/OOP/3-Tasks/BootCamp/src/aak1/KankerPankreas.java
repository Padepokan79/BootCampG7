package aak1;

class KankerPankreas {

	private Kanker kanker = new Kanker();
	private String nama, penanggulangan, gejala, risiko;
	
	public KankerPankreas(Kanker kanker, String nama, String penanggulangan, String gejala, String risiko) {
		this.kanker = kanker;
		this.nama = nama;
		this.penanggulangan = penanggulangan;
		this.gejala = gejala;
		this.risiko = risiko;
	}
	
	public KankerPankreas() {
		
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	String getNama() {
		return nama;
	}
	
	public void setPenanggulangan(String penanggulangan) {
		this.penanggulangan = penanggulangan;
	}
	
	String getPenanggulangan() {
		return penanggulangan;
	}
	
	public void setGejala(String gejala) {
		this.gejala = gejala;
	}
	
	String getGejala() {
		return gejala;
	}
	
	public void setRisiko(String risiko) {
		this.risiko = risiko;
	}
	
	String getRisiko() {
		return risiko;
	}
	
	Kanker kanker() {
		return kanker;
	}
	
	String printKankerPank() {
		return kanker.printKanker() + "\nNama penyakit : " + nama + "\nPenanggulangan : " + penanggulangan +
				"\nGejala : \n" + gejala + "\nRisiko : " + risiko;
	}

}
