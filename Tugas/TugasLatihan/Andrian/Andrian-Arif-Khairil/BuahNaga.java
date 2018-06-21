package aak;

public class BuahNaga extends Buah{
	private String nama, harga, rasa, warnaKulit, teksturKulit, kandungan;
	private Buah buah;
	
	public BuahNaga () {}
	public BuahNaga (Buah buah, String nama, String harga, String rasa, String warnaKulit, String teksturKulit) {
		this.buah = buah;
		this.nama = nama;
		this.harga = harga;
		this.rasa = rasa;
		this.warnaKulit = warnaKulit;
		this.teksturKulit = teksturKulit;
	}
	
	String kandunganBuah (String warnaKulit) {
		if (warnaKulit.equals("putih")) {
			kandungan = "C";
		}
		else if (warnaKulit.equals("merah")) {
			kandungan = "B";
		}
		return kandungan;
	}
	
	void keuntungan (String kandungan) {
		if (kandungan.equals("C")) {
			System.out.println("Menurunkan tekanan darah");
		}
		else if (kandungan.equals("B")) {
			System.out.println("mempercepat penyembuhan luka");
		}
	}
	
	public String toString() {
		return buah.toString()+"\nNama buah : "+nama+"\nHarga buah : "+harga+
				"\nRasa buah : "+rasa+"\nWarna Kulit buah : "+warnaKulit+
				"\nTekstur kulit Buah : "+teksturKulit+"\nKandungan buah : "+kandungan;
	}
}
