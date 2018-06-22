/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class Buah {
	private int hargaBuah;
	int jmlTerjual1, jmlTerjual2, jmlTerjual3, jmlTerjual4, jmlTerjual5, jmlTerjual6, jmlTerjual7;     
	String namaBuah;
	
	public Buah() {
		
	}
	public Buah(String namaBuah, int hargaBuah) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
	}
	public Buah(String namaBuah, int hargaBuah, int jmlTerjual1, int jmlTerjual2, int jmlTerjual3, int jmlTerjual4, int jmlTerjual5, int jmlTerjual6, int jmlTerjual7) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
		this.jmlTerjual1 = jmlTerjual1;
		this.jmlTerjual2 = jmlTerjual2;
		this.jmlTerjual3 = jmlTerjual3;
		this.jmlTerjual4 = jmlTerjual4;
		this.jmlTerjual5 = jmlTerjual5;
		this.jmlTerjual6 = jmlTerjual6;
		this.jmlTerjual7 = jmlTerjual7;
	}
	public Buah(int jmlTerjual1, int jmlTerjual2, int jmlTerjual3, int jmlTerjual4, int jmlTerjual5, int jmlTerjual6, int jmlTerjual7) {
		this.jmlTerjual1 = jmlTerjual1;
		this.jmlTerjual2 = jmlTerjual2;
		this.jmlTerjual3 = jmlTerjual3;
		this.jmlTerjual4 = jmlTerjual4;
		this.jmlTerjual5 = jmlTerjual5;
		this.jmlTerjual6 = jmlTerjual6;
		this.jmlTerjual7 = jmlTerjual7;
	}
	
	int getHargaBuah() {
		return hargaBuah;
	}
}
