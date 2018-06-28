package TimArief;

public class BuahNaga extends Buah{
	private String nama, rasa, warnaKulit, teksturKulit, kandungan;
	int harga;
	private Buah buah;
	
	BuahNaga(){
		
	}
	
	BuahNaga(Buah buah, String nama, int harga, String rasa, String warnaK, String TeksturK, String kandungan){
		this.buah 		= buah;
		this.nama 		= nama;
		this.harga 		= harga;
		this.rasa 		= rasa;
		warnaKulit 		= warnaK;
		teksturKulit	= TeksturK;
		this.kandungan 	= kandungan;
	}
	
	String mengenyangkan() {
		if (rasa.equals("manis") || rasa.equals("Manis")) {
			return "Mengenyangkan";
		}else {
			return "tidak mengenyangkan";
		}
	}
	
	String kandugan() {
		if (kandungan.equals("Vitamin A") || kandungan.equals("Vitamin C") || kandungan.equals("Fosfor")) {
			return "Mempercepat penyembuhan luka";
		}else {
			return "Tidak mempercepat penyembuhan luka";
		}
	}
	
	String tekananDarah() {
		if (kandungan.equals("Vitamin K")) {
			return "Menurunkan tekanan darah";
		}else {
			return "Tidak menurunkan tekanan darah";
		}
	}
	
	String tampilBuahNaga() {
		return "Nama\t: "+nama+"\nRasa\t: "+rasa+"\nWarna\t: "+warnaKulit+"\nTekstur\t: "+teksturKulit+"\nKandungan: "+kandungan+"\nHarga\t: "+harga+"\n"+buah.toBuah();
	}
}
