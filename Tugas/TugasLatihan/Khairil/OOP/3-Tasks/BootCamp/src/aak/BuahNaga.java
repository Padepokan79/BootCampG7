package aak;

class BuahNaga {
	private Buah buah = new Buah();
	private String nama, rasa, warnaKulit, teksturKulit, kandungan, manfaat;
	private int harga;
	
	public BuahNaga() {
		
	}

	public BuahNaga(Buah buah, String nama, int harga, String rasa, String warnaKulit, String teksturKulit, String kandungan, String manfaat) {
		this.buah = buah;
		this.nama = nama;
		this.harga = harga;
		this.rasa = rasa;
		this.warnaKulit = warnaKulit;
		this.teksturKulit = teksturKulit;
		this.kandungan = kandungan;
		this.manfaat = manfaat;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	String getNama() {
		return nama;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	int getHarga() {
		return harga;
	}
	
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	
	String getRasa() {
		return rasa;
	}

	public void setWarnaKulit(String warnaKulit) {
		this.warnaKulit = warnaKulit;
	}
	
	String getWarnaKulit() {
		return warnaKulit;
	}
	
	public void setTeksturKulit(String teksturKulit) {
		this.teksturKulit = teksturKulit;
	}
	
	String getTeksturKulit() {
		return teksturKulit;
	}
	
	public void setKandungan(String kandungan) {
		this.kandungan = kandungan;
	}
	
	String getKandungan() {
		return kandungan;
	}
	
	public void setManfaat(String manfaat) {
		this.manfaat = manfaat;
	}
	
	String getManfaat() {
		return manfaat;
	}
	
	Buah getBuah() {
		return buah;
	}
	
	String printBuahNaga() {
		return buah.printBiji() + "\nBuah " + nama + " memiliki rasa yang " + rasa + 
			   " dengan harga " + harga + " merupakan buah yang memiliki warna kulit " + warnaKulit + 
			   " serta tesktur kulit yang " + teksturKulit + ". Di dalamnya terdapat kandungan " + kandungan +
			   ". Manfaat yang diberikan adalah " + manfaat;
	}

}