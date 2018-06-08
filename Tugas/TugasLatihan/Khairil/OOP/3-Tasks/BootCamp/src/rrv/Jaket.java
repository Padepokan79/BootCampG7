package rrv;

public class Jaket extends Pakaian {
	private String warna, merk, madeIn;
	private double harga, diskont;
	
	Pakaian pakai = new Pakaian();
	private String jk, range;
	
	public Jaket(Pakaian pakai, String warna, String merk, String madeIn, double harga) {
		this.pakai = pakai;
		this.warna = warna;
		this.merk = merk;
		this.madeIn = madeIn;
		this.harga = harga;
	}
	
	public void setWarna(String warna) {
		this.warna = warna;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
	public void setHarga(double harga) {
		this.harga = harga;
	}
	
	String getWarna() {
		return warna;
	}
	
	String getMerk() {
		return merk;
	}
	
	String getMadeIn() {
		return madeIn;
	}
	
	Double getHarga() {
		return harga;
	}
	
	Pakaian getPake() {
		return pakai;
	}
	
	String printJaket() {
		return pakai.printPakaian() + "\n Warna " + warna + ", merk " + merk + ", buatan " + madeIn + ", harga " + harga;
	}

	String jenisKel(String warna) {
		this.warna = warna;
		if(warna.equals("pink") || warna.equals("kuning") ) {
			jk = "Cewek";
		}
		else {
			jk = "Cowok";
		}
		return jk;
	}

	String cekHarga(double harga) {
		this.harga = harga;
		if(harga > 100000) {
			range = "Mahal";
		}
		else if(harga <= 100000) {
			range = "Murah";
		}
		return range;
	}	
	
	Double cekUkuran(String ukuran) {
		if(ukuran.equals("S") || ukuran.equals("M")) {
			diskont = this.harga - 15000;
		}
		else if(ukuran.equals("L") || ukuran.equals("XL")) {
			diskont = this.harga + 10000;
		}
		return diskont;
	}
	
	String cekMerk(String merk, double harga) {
		this.merk = merk;
		if(merk.equals("nike") || merk.equals("adidas")) {
			this.harga = 250000;
		}
		else {
			this.harga = harga;
		}
		return merk;
	}
	
}