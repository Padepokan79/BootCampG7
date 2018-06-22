/**
 * 
 */
package soalYanaArifVikry;

import java.util.ArrayList;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 2:48:54 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class Object {
	private String namaBarang;
	private int hargaBarang;
	ArrayList<String> hari = new ArrayList<String>();
	
	public Object(String namaBarang, int hargaBarang, String...hari) {
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
		for (String namaHari: hari) {
			this.hari.add(namaHari);
		}
	}
	
	String getNamaBarang() {
		return namaBarang;
	}
	
	int getHargaBarang() {
		return hargaBarang;
	}

}
