/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalKelAlifhar;

public class Cinema {
	String jenisTiket;
	int qtySenin, qtySelasa, qtyRabu, qtyKamis, qtyJumat, qtySabtu, qtyMinggu, hargaWeekDays, hargaWeekEnd;
	
	Cinema(String jenis, int harga1, int harga2, int qtySenin, int qtySelasa, int qtyRabu, int qtyKamis, int qtyJumat, int qtySabtu, int qtyMinggu ){
		jenisTiket = jenis;
		hargaWeekDays = harga1;
		hargaWeekEnd = harga2;
		this.qtySenin= qtySenin;
		this.qtySelasa = qtySelasa;
		this.qtyRabu = qtyRabu;
		this.qtyKamis = qtyJumat;
		this.qtyJumat = qtyJumat;
		this.qtySabtu = qtySabtu;
		this.qtyMinggu = qtyMinggu;
	}
}
