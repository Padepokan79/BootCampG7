package rrv;

public class Jaket extends Pakaian{
	
	private String warna, merek, madeIn;
	private Double harga;
	Pakaian pake = new Pakaian();
	
	public Jaket(Pakaian pake, String warna, String merek, String madeIn, Double harga) {
		this.pake = pake;
		this.warna = warna;
		this.merek = merek;
		this.madeIn = madeIn;
		this.harga = harga;
	}
		
	Pakaian getPake() {
		return pake;
	}
	
	String getWarna() {
		return warna;
	}

	String getMerek() {
		return merek;
	}
	
	String getMadeIn() {
		return madeIn;
	}
	
	double getHarga() {
		return harga;
	}
	
	String printPakaian() {
		return pake.printPakaian() + ". Merek " + merek + " warna " + warna + ", Buatan " + madeIn + ", \ndibanderol dengan harga Rp. " + harga;
	}
	
	void setHarga(double harga) {
		this.harga = harga;
	}
	
	double range() {
		if (harga > 100000) {
			System.out.println("Harga diatas 100 Ribu, MAHAL !!");			
		} else if (harga <= 100000) {
			System.out.println("Harga dibawah 100 Ribu, Murah bro !");			
		}
		return harga;
	}
	
	void gen(){
		if (warna.equals("pink") || warna.equals("kuning")) {
			System.out.println("Buat Cewek");
		}else {
			System.out.println("Buat Cowok");
		}
	}
	
	void diskon(String ukuran) {
		if (ukuran.equals("S") || ukuran.equals("M")) {
			System.out.println("Diskon harga 15.000");
			harga-=15000;
		}else if (ukuran.equals("L") || ukuran.equals("XL")) {
			System.out.println("Tambahan harga 10.000");
			harga+=10000;
		}
	}

}
