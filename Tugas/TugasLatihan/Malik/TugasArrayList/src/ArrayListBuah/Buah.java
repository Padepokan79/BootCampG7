/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-21
 * 
 * */

package ArrayListBuah;

public class Buah {
	private int hargaBuah;
	String namaBuah;
	int qty1, qty2, qty3, qty4, qty5, qty6, qty7;
	
	Buah(String nama, int harga){
		namaBuah = nama;
		hargaBuah = harga;
	}
	
	Buah(String nama, int harga, int qty1, int qty2, int qty3, int qty4, int qty5, int qty6, int qty7) {
		namaBuah = nama;
		hargaBuah = harga;
		this.qty1 = qty1;
		this.qty2 = qty2;
		this.qty3 = qty3;
		this.qty4 = qty4;
		this.qty5 = qty5;
		this.qty6 = qty6;
		this.qty7 = qty7;
	}
	
	Buah(int qty1, int qty2, int qty3, int qty4, int qty5, int qty6, int qty7) {
		
		this.qty1 = qty1;
		this.qty2 = qty2;
		this.qty3 = qty3;
		this.qty4 = qty4;
		this.qty5 = qty5;
		this.qty6 = qty6;
		this.qty7 = qty7;
	}
	
	int getHarga() {
		return hargaBuah;
	}
	
}
