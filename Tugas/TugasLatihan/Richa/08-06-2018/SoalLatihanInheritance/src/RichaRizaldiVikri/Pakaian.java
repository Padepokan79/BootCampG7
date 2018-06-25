package RichaRizaldiVikri;

import java.util.Random;

public class Pakaian {
	private String ukuran, warna, merek, jenisBahan, madeIn;
	private double harga;
	
	
	public Pakaian () {
		
	}
	public Pakaian (String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga) {
	 this.ukuran = ukuran; //set
	 this.warna = warna; //set
	 this.merek = merek;
	 this.jenisBahan = jenisBahan;
	 this.madeIn = madeIn;
	 this.harga = harga; //set
	}
	
	String getUkuran () {
		return ukuran;
	}
	void setUkuran (String ukur) {
		ukuran = ukur;
	}
	String getWarna () {
		return warna;
	}
	void setWarna (String color) {
		warna = color;
	}
	String getMerek () {
		return merek;
	}
	String getJenisBahan () {
		return jenisBahan;
	}
	String getMadeIn () {
		return madeIn;
	}
	double getHarga () {
		return harga;
	}
	void setHarga (double price) {
		harga = price;
	}
	
	String printPakaian () {
		return " dengan ukuran " + ukuran + ", warna " + warna + ", merek " + merek + ", jenis bahan " + jenisBahan + ", Made in " + madeIn + ", harga " + harga;
	}
}
