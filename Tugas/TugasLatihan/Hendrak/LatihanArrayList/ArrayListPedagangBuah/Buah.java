//Created by : Hendra Kurniawan
//Date 		 : 22 Juni 2018 Time : 1:15 AM
//Modified   :
package ArrayListPedagangBuah;

public class Buah {
	private int hargaBuah;
	String namaBuah;
	int terjual1, terjual2, terjual3, terjual4, terjual5, terjual6, terjual7;
	public Buah() {
		
	}
	
	public Buah(String namaBuah, int hargaBuah) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
	}
	
	public Buah(int terjual1, int terjual2, int terjual3, int terjual4, int terjual5, int terjual6, int terjual7) {
		this.terjual1 = terjual1;
		this.terjual2 = terjual2;
		this.terjual3 = terjual3;
		this.terjual4 = terjual4;
		this.terjual5 = terjual5;
		this.terjual6 = terjual6;
		this.terjual7 = terjual7;
	}
	
	public Buah(String namaBuah, int hargaBuah, int terjual1, int terjual2, int terjual3, int terjual4, int terjual5, int terjual6, int terjual7) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
		this.terjual1 = terjual1;
		this.terjual2 = terjual2;
		this.terjual3 = terjual3;
		this.terjual4 = terjual4;
		this.terjual5 = terjual5;
		this.terjual6 = terjual6;
		this.terjual7 = terjual7;
	}

	public int getHargaBuah() {
		return hargaBuah;
	}
	
	public String toString() {
		return " ";
	}
}
