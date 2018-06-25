/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-21
 * 
 * */

package ArrayListKereta;

public class Kereta {
	private int harga = 0;
	public int hariKe1, hariKe2, hariKe3, hariKe4, hariKe5, hariKe6, hariKe7;
	public String kelas;
	
	
	public Kereta() {}
	
	public Kereta(String kelas, int harga, int hariKe1, int hariKe2, int hariKe3, int hariKe4, int hariKe5, int hariKe6, int hariKe7 ) {
		this.kelas = kelas;
		this.harga = harga;
		this.hariKe1 = hariKe1;
		this.hariKe2 = hariKe2;
		this.hariKe3 = hariKe3;
		this.hariKe4 = hariKe4;
		this.hariKe5 = hariKe5;
		this.hariKe6 = hariKe6;
		this.hariKe7 = hariKe7;
		
	}
	
	int getHarga() {
		return harga;
	}
}
