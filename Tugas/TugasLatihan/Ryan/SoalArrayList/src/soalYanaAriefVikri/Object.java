package soalYanaAriefVikri;

import java.util.ArrayList;

/**
 *SoalArrayList
 * Object.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 14.46.13 22 Jun 2018
 */

public class Object {
	ArrayList<String> hari = new ArrayList<String>();
	private String namaBarang;
	private int harga;
	public Object(String namaBarang, int harga, String...hari) {
		this.namaBarang = namaBarang;
		this.harga = harga;
		for (String namaHari : hari) {
			this.hari.add(namaHari);
		}
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public int getHarga() {
		return harga;
	}

}
