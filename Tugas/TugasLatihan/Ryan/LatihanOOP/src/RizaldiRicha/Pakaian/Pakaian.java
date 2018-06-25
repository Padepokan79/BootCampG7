package RizaldiRicha.Pakaian;

import java.util.Random;
public class Pakaian {
	Random rand = new Random();
	
	private String ukuran, warna, merk, jenisBahan, madeIn, sifat, gender;
	private double harga; 
	
	public Pakaian(String ukuran, String warna, String merk, String jenisBahan, String madeIn) {
		this.ukuran = ukuran;
		this.warna = warna;
		this.jenisBahan = jenisBahan;
		this.madeIn = madeIn;
		this.merk = merk;
	}
	
	void harga() {
		if(merk.equals("nike") || merk.equals("adidas")) {
			harga = rand.nextInt(300000)+200000;
		}
		else {
			harga = rand.nextInt(199999)+1;
		}
		if(ukuran.equals("S") || ukuran.equals("M")) {
			harga = harga - 15000;
		}
		else if(ukuran.equals("L") || ukuran.equals("XL")) {
			harga = harga + 10000;
		}
	}
	
	void sifat() {
		if(harga <= 100000) {
			sifat = "Murah";
		}
		else {
			sifat = "Mahal";
		}
	}
	
	void gender() {
		if(warna.equals("Pink") || warna.equals("Kuning")) {
			gender = "Cewek";
		}
		else {
			gender = "Cowok";
		}
	}
	
	void setWarna(String setWarna) {
		warna = setWarna;
	}
	void setUkuran(String setUkuran) {
		ukuran = setUkuran;
	}
	
	public String toString() {
		harga();
		sifat();
		gender();
		return "Ukuran : "+ukuran+
				"\nWarna : "+warna+"("+gender+")"+
				"\nHarga : "+harga+"("+sifat+")"+
				"\nMerek : "+merk+
				"\nBahan : "+jenisBahan+
				"\nMade in : "+madeIn;
	}

}
