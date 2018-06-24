package KhairilAriefAdrian;

public class Buah {
	private String  nama,tipe, biji, rasa, warnaKulit, teksturKulit, kandungan;
	private Double harga;
	
	public Buah() {
		
	}
	
	public Buah(String nama, String tipe, String biji, String rasa, String warnaKulit, String teksturKulit, String kandungan , double harga) {
		this.nama = nama;
		this.tipe = tipe;
		this.biji = biji;
		this.rasa = rasa;
		this.warnaKulit = warnaKulit;
		this.teksturKulit = teksturKulit;
		this.kandungan = kandungan;
		this.harga = harga;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getTipe() {
		return tipe;
	}
	
	public String getBiji() {
		return biji;
	}
	
	public String getRasa() {
		return rasa;
	}
	
	public String getWarnaKulit() {
		return warnaKulit;
	}
	
	public String getTeksturKulit() {
		return teksturKulit;
	}
	
	public String getKandungan() {
		return kandungan;
	}
	
	public void Kenyang() {
		System.out.println("Makan buah membuat kita kenyang!!");
	}
	
	public void regenerasi() {
		System.out.println("Makan buah mempercepat penyembuhan luka!!");
	}
	
	public void menurunkanTekananDarah() {
		System.out.println("Makan buah menurunkan tekanan darah!!");
	}
	
	public String toString() {
	
		return "Nama : " + nama +
			   "\nTipe : " + tipe +
			   "\nBiji : " + biji +
			   "\nRasa : " + rasa +
			   "\nWarna Kulit   : " + warnaKulit +
			   "\nTekstur Kulit : " + teksturKulit +
			   "\nKandungan     : " + kandungan +
			   "\nHarga         : " + harga + "\n";
		
	
		
	}
}
