package Rizaldi;

import java.util.Random;

public class Pakaian {
	private String ukuran, warna, merek, jenisBahan, madeIn;
	private double harga;
	Random rand = new Random();
	
	public Pakaian() {
		
	}
	public Pakaian(String ukuran, String warna, double harga, String merek, String jenisBahan, String madeIn) {
		this.ukuran 	= ukuran;
		this.warna 		= warna;
		this.harga 		= harga;
		this.merek 		= merek;
		this.jenisBahan = jenisBahan;
		this.madeIn		= madeIn;
	}
	
	void setWarna(String warna) {
		this.warna = warna;
	}
	void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}
	
	String getUkuran() {
		return ukuran;
	}
	String getWarna() {
		return warna;
	}
	double getHarga() {
		cekUkuran();
		cekMerek();
		return harga;
	}
	String getMerek() {
		return merek;
	}
	String getJenisBahan() {
		return jenisBahan;
	}
	String getMadeIn() {
		return madeIn;
	}
	
	void cekMahalMurah() {
		if(harga > 100000) {
			System.out.println("Kategori : Mahal");
		
		}else if(harga <= 100000) {
			System.out.println("Kategori : Murah");
		}
	}
	
	void cekGender() {
		if(warna.equals("kuning") || warna.equals("pink")) {
			System.out.println("Cocok Untuk Cewek");
		
		}else {
			System.out.println("Cocok Untuk Cowok");
		}
	}
	
	void cekMerek() {
		if(merek.equals("nike") || merek.equals("adidas")) {
			harga = rand.nextInt(1000000 - 200000) + 200000;
		}
	}
	
	void cekUkuran() {
		if(ukuran.equals("s") || ukuran.equals("m")) {
			harga -= 15000;
		
		}else if(ukuran.equals("l") || ukuran.equals("xl")) {
			harga += 10000;
		}
	}
	
	public String toString() {
		return "Ukuran : "+ getUkuran() +", Warna : "+ getWarna() +", Harga : "+ getHarga() +", Merek : "+ getMerek() +", Jenis Bahan : "+ getJenisBahan() +", Made In : "+ getMadeIn();
	}
	
}
