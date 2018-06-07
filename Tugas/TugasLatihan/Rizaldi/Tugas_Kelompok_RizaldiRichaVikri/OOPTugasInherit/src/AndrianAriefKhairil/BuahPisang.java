package AndrianAriefKhairil;

public class BuahPisang extends Buah{
	String nama, rasa, warnaKulit, teksturKulit, kandungan;
	Double harga;
	Buah buah = new Buah();
	public BuahPisang() {
		
	}
	public BuahPisang(String tipe, String biji, String nama, Double harga, String rasa, String warnaKulit,  String teksturKulit, String kandungan) {
		super(tipe, biji);
		this.nama = nama;
		this.harga = harga;
		this.rasa = rasa;
		this.warnaKulit = warnaKulit;
		this.teksturKulit = teksturKulit;
		this.kandungan = kandungan;
	}
	// GETTER
	String getNama() {
		return nama;
	}
	Double getHarga() {
		return harga;
	}
	String getRasa() {
		return rasa;
	}
	String getWarnaKulit() {
		return warnaKulit;
	}
	String getTekstur() {
		return teksturKulit;
	}
	String getKandungan() {
		return kandungan;
	}
	// SETTER
	void setNama(String nama) {
		this.nama = nama;
	}
	void setRasa(String rasa) {
		this.rasa = rasa;
	}
	void setWarnaKulit(String warnaKulit) {
		this.warnaKulit = warnaKulit;
	}
	void setTekstur(String teksturKulit) {
		this.teksturKulit = teksturKulit;
	}
	void kandungan(String kandungan) {
		this.kandungan = kandungan;
	}
	// method
	void manfaatKenyang() {
		System.out.println("- mengenyangkan");
	}
	void manfaatLuka() {
		System.out.println("- mempercepat penyembuhan luka");
	}
	void manfaatTekanan() {
		System.out.println("- menurunkan tekanan darah");
	}
	
	public String toString() {
		return "\nJenis Buah\t: "+super.getTipe()+" dan "+super.getbiji()+
				"\nNama buah\t: "+getNama()+"\nHarga\t\t: "+getHarga()+"\nRasa\t\t: "+getRasa()+
				"\nWarna kulit\t: "+getWarnaKulit()+"\nTekstur kulit\t: "+getTekstur()+"\nKandungan\t: "+getKandungan();
	}
}
