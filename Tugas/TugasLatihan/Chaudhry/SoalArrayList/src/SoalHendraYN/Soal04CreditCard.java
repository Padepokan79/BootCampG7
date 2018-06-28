/*
 * DATE CREATED    : 22 JUNI 2018
 * DATE UPDATE     : 24 Juni 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalHendraYN;

public class Soal04CreditCard implements Soal04IuranTahunan {
	String namaAnggota;
	int qtyGold, qtyTitanium, qtyPlatinum, qtyWorldmiles;
	
	public Soal04CreditCard() {
		
	}
	public Soal04CreditCard(String namaAnggota, int qtyGold, int qtyTitanium, int qtyPlatinum, int qtyWorldmiles) {
		this.namaAnggota = namaAnggota;
		this.qtyGold = qtyGold;
		this.qtyTitanium = qtyTitanium;
		this.qtyPlatinum = qtyPlatinum;
		this.qtyWorldmiles = qtyWorldmiles;
	}
	
}
