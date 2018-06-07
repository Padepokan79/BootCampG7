package latihan;

public class Motor {
	String merk, tipe, nama, warna;
	int kapasitas, harga;
	
	public Motor() {
		
	}
	
	public Motor(String m, String n, String t, String w, int k, int h) {
		merk = m;
		tipe= t;
		nama =n;
		warna= w;
		kapasitas = k;
		harga = h;
	}
	
	void tampil() {
		System.out.println("Dijual motor" + nama + " pabrikan "+ merk + " dengan tipe " + tipe);
		System.out.println("Warna motor "+ warna + " dengan kapasitas cc " + kapasitas);
		System.out.println("Harganya Rp." + harga + " Minat PM!!!");
	}
	
	void tambahData(String m, String n, String t, String w, int k, int h) {
		merk = m;
		tipe= t;
		nama =n;
		warna= w;
		kapasitas = k;
		harga = h;
	}
	
	
}
