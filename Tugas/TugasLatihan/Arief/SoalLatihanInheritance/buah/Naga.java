package buah;

public class Naga extends Buah{
	
	String tipe, biji, nama, rasa, warnaKulit, teksturKulit, kandungan;
	Double harga;
	Buah buah1 = new Buah();

	public Naga() {
		// TODO Auto-generated constructor stub
	}
	
	public Naga(Buah buah1, String nama, Double harga, String rasa, String warnaKulit,  String teksturKulit, String kandungan) {
		this.buah1 = buah1;
		this.nama = nama;
		this.harga = harga;
		this.rasa = rasa;
		this.warnaKulit = warnaKulit;
		this.teksturKulit = teksturKulit;
		this.kandungan = kandungan;
	}
	
	void kenyang() {
		System.out.println("Mengenyangkan");
	}
	void luka() {
		System.out.println("Mempercepat penyembuhan luka");
	}
	void darah() {
		System.out.println("Menurunkan tekanan darah");
	}
	
	String printBuah() {
		return buah1.printBuah() + ", nama " + nama + ", harga " + harga +
				", \nrasa " + rasa + ", warna " + warnaKulit + ", tekstur " + teksturKulit + ", kandungan buah " + kandungan; 
	}

}
