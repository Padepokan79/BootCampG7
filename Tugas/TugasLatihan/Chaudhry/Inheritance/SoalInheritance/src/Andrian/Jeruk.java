package Andrian;

public class Jeruk extends Buah {
	private String nama, rasa, warnaKulit, teksturKulit, kandungan;
	private int harga;
	Buah buah;
	
	public Jeruk() {
		
	}
	public Jeruk(Buah buah, String nama, int harga, String rasa, String warnaKulit, String teksturKulit, String kandungan) {
		this.buah 	= buah;
		this.nama 	= nama;
		this.harga 	= harga;
		this.rasa 	= rasa;
		this.warnaKulit 	= warnaKulit;
		this.teksturKulit 	= teksturKulit;
		this.kandungan 		= kandungan;
	}
	
	Buah getBuah() {
		return buah;
	}
	String getNama() {
		return nama;
	}
	int getHarga() {
		return harga;
	}
	String getRasa() {
		return rasa;
	}
	String getWarnaKulit() {
		return warnaKulit;
	}
	String getTeksturKulit() {
		return teksturKulit;
	}
	String getKandungan() {
		return kandungan;
	}
	
	public String toString() {
		return getBuah() + "\nNama : "+getNama()+"\n"+
							"Harga : "+getHarga()+"\n"+"Rasa : "+getRasa()+"\n"+
							"Warna Kulit : "+getWarnaKulit()+"\n"+
							"Tekstur Kulit : "+getTeksturKulit()+"\n"+
							"Kandungan : "+getKandungan()+"\n\n"+
							"Keterangan : "+"\n";
	}
}
