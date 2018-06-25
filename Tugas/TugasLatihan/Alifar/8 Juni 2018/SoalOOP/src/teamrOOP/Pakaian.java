package teamrOOP;

public class Pakaian {
	private String ukuran, warna, merek, jenisBahan, madeIn;
	private double harga;
	
	public Pakaian(String size, String color, double price, String merk, String substance, String made) {
		// TODO Auto-generated constructor stub
		ukuran=size;
		warna=color;
		harga=price;
		merek=merk;
		jenisBahan=substance;
		madeIn=made;
	}

	String nilai() {
		if(harga>100000)
			return "Mahal";
		else
			return "Murah";
	}
	
	String pemakai() {
		if(warna.equals("pink") || warna.equals("kuning"))
			return "Cewek";
		else
			return "Cowok";
	}
	
	boolean cekMerek() {
		if(merek.equals("nike") || merek.equals("adidas"))
			if(harga>200000)
				return true;
			else
				return false;
		else
			return true;
	}
	
	void cekUkuran() {
		if(ukuran.equals("S") || ukuran.equals("M")) {
			harga-=15000;
//			System.out.println("Ukuran "+ukuran+", harga dikurangin 15rb menjadi "+harga);
		}
		else if(ukuran.equals("L") || ukuran.equals("XL")) {
			harga+=10000;
//			System.out.println("Ukuran "+ukuran+", harga ditambah 10rb menjadi "+harga);
		}
	}
	
	void setHarga(double price) {
		harga=price;
	}
	
	String getMerek() {
		return merek;
	}
	
	String getJenis() {
		return "\nPakaian";
	}
	
	public String toString() {
		return getJenis()+"\n=========================\nUkuran = "+ukuran+"\nWarna = "+warna+"\nMerk = "+merek+"\nJenis Bahan = "+jenisBahan+"\nMade in "+madeIn+"\nHarga = "+harga;
	}
}
