package teamAriefOOP;

public class BuahNaga extends Buah{
	private String nama, warnaKulit, rasa, teksturKulit, kandungan;
	private int harga;
	
	BuahNaga(Buah buah, String nama, int harga, String rasa, String warna, String teksturK, String kandungan){
		tipe=buah.tipe;
		biji=buah.biji;
		this.nama=nama;
		this.harga=harga;
		this.rasa=rasa;
		this.warnaKulit=warna;
		this.teksturKulit=teksturK;
		this.kandungan=kandungan;
	}
	
	String mengenyangkan() {
		if(rasa.equals("manis") || rasa.equals("Manis"))
			return "mengenyangkan";
		else
			return "tidak mengenyangkan";
	}
	
	String kandungan() {
		if(kandungan.equals("Vitamin A") || kandungan.equals("Vitamin C") || kandungan.equals("fosfor")) 
			return "mempercepat penyembuhan luka";
		else
			return "tidak mempercepat penyembuhan luka";
	}
	
	String tekananDarah() {
		if(kandungan.equals("Vitamin K"))
			return "menurunkan tekanan darah";
		else
			return "tidak menurunkan tekanan darah";
	}
	
	public String tampil() {
		return super.tampilan()+"\nNama : "+nama+"\nWarna : "+warnaKulit+"\nRasa : "+rasa+"\nTekstur : "+teksturKulit+"\nKandungan : "+kandungan+"\nHarga : "+harga;
	}
}
