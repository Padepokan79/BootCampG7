/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalYanaAriefVikri;

public class Penjualan {
	String namaHari;
	String namaBarang;
	private int hargaBarang;
	
	public Penjualan() {
		
	}
	public Penjualan(String namaBarang, int hargaBarang) {
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
	}
	
	int getHargaBarang() {
		return hargaBarang;
	}
}
