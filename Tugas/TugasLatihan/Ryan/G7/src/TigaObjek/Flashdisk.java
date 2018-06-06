package TigaObjek;

public class Flashdisk {
	
	int kapasitas, harga;
	double type;
	String merk, warna;

	public Flashdisk() {
		
	}
	
	public Flashdisk(int k, int h, double t, String m, String w) {
		kapasitas = k;harga = h;
		type = t;
		merk = m;warna = w;
	}
	
	void Flashdisk(int k, int h, double t, String m, String w) {
		kapasitas = k;harga = h;
		type = t;
		merk = m;warna = w;
	}
	
	void tampil() {
		System.out.println("Flashdisk saya berwarna "+warna+" dan ber merk "+merk+" flashdisk itu berkapasitas "+kapasitas+"Gb dan bertype USB "+type);
		System.out.println("Harganya murah saja, yaitu Rp."+harga);
	}

}
