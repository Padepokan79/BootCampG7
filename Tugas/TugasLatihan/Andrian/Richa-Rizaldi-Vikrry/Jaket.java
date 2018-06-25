package rrv;

public class Jaket extends Pakaian{
	private String merek, madeIn, warna;
	private double harga;
	private Pakaian pakaian = new Pakaian();
	
	public Jaket(Pakaian pakaian, String merek, String madeIn, String warna, double harga){
		this.pakaian=pakaian;
		this.merek=merek;
		this.madeIn=madeIn;
		this.warna=warna;
		this.harga=harga;
	}
	
	double kategoriHarga (double harga) {
		if (harga<10000) {
			System.out.println("Murah");
		}
		else {
			System.out.println("Mahal");
		}
		return harga;
	}
	
	String kategoriWarna (String warna) {
		if (warna.equals("pink") || warna.equals("kuning")) {
			System.out.println("Wanita");
		}
		else {
			System.out.println("Pria");
		}
		return warna;
	}
	
	void kategoriUkuran (String ukuran) {
		if (ukuran.equals("S")||ukuran.equals("M")) {
			harga = harga-15000;
		}
		else if (ukuran.equals("L")||ukuran.equals("XL")) {
			harga = harga+10000;
		}
	}
	
	double getHarga () {
		return harga;
	}
	
	String getWarna () {
		return warna;
	}
	
	void setHarga(double harga) {
		this.harga = harga;
	}
	
	void setWarna(String warna) {
		this.warna = warna;
	}
	
	void setMerk(String merek) {
		this.merek = merek;
	}
	
	Pakaian getPakaian () {
		return pakaian;
	}
	
	String printJaket () {
		return pakaian.printPakaian() + " ,Merek "+merek+" ,Warna "+warna+" ,Buatan "+madeIn+" ,Seharga : "+harga;
		
	}
	
	
}
