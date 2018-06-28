package AndrianAriefKhairil;

public class BuahNaga extends Buah {
	private String 	nama, rasa, warnaKulit, teksturKulit, kandungan;
	private int 	harga;
	private Buah 	buah = new Buah();
	
	public BuahNaga() {
	}
	
	public BuahNaga(Buah buah, String nama, String rasa, String warnaKulit, String teksturKulit, String kandungan, int harga) {
		this.buah 			= buah;
		this.nama 			= nama;
		this.rasa 			= rasa;
		this.warnaKulit		= warnaKulit;
		this.teksturKulit 	= teksturKulit;
		this.kandungan 		= kandungan;
		this.harga 			= harga;
	}
	
	String mengenyangkan() {
		if (rasa.equals("manis") || rasa.equals("Manis")) {
			return "Mengenyangkan";
		}
		else {
			return "Tidak Mengenyangkan";
		}
	}
	
	String menyembuhkan() {
		if (kandungan.equals("Vitamin A") || kandungan.equals("Vitamin C") || kandungan.equals("Posfor")) {
			return "Mempercepat Penyembuhan Luka";
		}
		else {
			return "Tidak Mempercepat Penyembuhan Luka";
		}
	}
	
	String tenananDarah() {
		if(kandungan.equals("Vitamin K")) {
			return "Menurunkan Tekanan Darah";
		}
		else {
			return "Tidak Menurunkan Tekanan Daraha";
		}
	}
	
	String tampilBuahNaga() {
		return "Buah Naga[Nama : " +nama+ ", Rasa : " +rasa+ ", Warna Kulit : " +warnaKulit+ ", Tekstur Kulit : " +teksturKulit+", Kandungan : "+kandungan+ ", Harga : " +harga+", "+buah.tampilBuah()+"]";
	}
}
