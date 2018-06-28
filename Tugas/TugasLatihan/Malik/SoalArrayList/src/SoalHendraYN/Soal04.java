/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalHendraYN;

public class Soal04 implements IuranTahunan{
	String namaKeluarga;
	int qtyGold, qtyTitanium, qtyPlatinum, qtyWorldmiles;
	
	
	Soal04(){
		
	}
	
	Soal04(String namaKeluarga, int qtyGold, int qtyTitanium, int qtyPlatinum, int qtyWorldmiles) {
		super();
		this.namaKeluarga = namaKeluarga;
		this.qtyGold = qtyGold;
		this.qtyTitanium = qtyTitanium;
		this.qtyPlatinum = qtyPlatinum;
		this.qtyWorldmiles = qtyWorldmiles;
	}

}
