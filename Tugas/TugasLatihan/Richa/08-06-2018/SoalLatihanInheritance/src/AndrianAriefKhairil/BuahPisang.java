/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 3.03 PM
Updated by			:
Updated Date/hour	:
*/

package AndrianAriefKhairil;

public class BuahPisang extends Buah {
	
	private String nama, rasa, warnaKulit, teksturKulit, kandungan;
	private int harga;

	public BuahPisang () {
		
	}
	
	public BuahPisang (String tipe, String biji, String nama, String rasa, String warnaKulit, String teksturKulit, String kandungan, int harga) {
		super(tipe, biji);
		this.nama = nama;
		this.rasa = rasa;
		this.warnaKulit = warnaKulit; //set
		this.teksturKulit = teksturKulit; //set
		this.kandungan = kandungan;
		this.harga = harga; //set
	}
	
	String getNama () {
		return nama;
	}
	String getRasa () {
		return rasa;
	}
	String getWarnaKulit () {
		return warnaKulit;
	}
	void setWarnaKulit (String warna) {
		warnaKulit = warna;
	}
	String getTeksturKulit () {
		return teksturKulit;
	}
	void setTeksturKulit (String tekstur) {
		teksturKulit = tekstur;
	}
	String getKandungan () {
		return kandungan;
	}
	int  getHarga () {
		return harga;
	}
	void setHarga (int price) {
		harga = price;
	}
	String kenyang () {
		return "Mengenyangkan";
	}
	
	String printBuah () {
		return super.printBuah() + " yaitu " + nama + " memiliki rasa " + rasa + " memiliki warna kulit " + warnaKulit + " dan tekstur kulit " + teksturKulit + ", memiliki kandungan " + kandungan + " seharga " + harga;
	}

	
}