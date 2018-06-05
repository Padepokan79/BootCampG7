package latihan;

public class FlashDisk {
	String merk, warna;
	int kapasitas, harga;
	double tipe;
	
	public FlashDisk() {
		
	}
	
	public FlashDisk(String m, String w, double t, int k, int h) {
		merk = m;
		warna = w;
		kapasitas = k;
		tipe = t;
		harga = h;
	}
	
	void tampil() {
		System.out.println("Dijual FD dengan merk "+ merk +" warna "+ warna + " dengan tipe "+ tipe);
		System.out.println("Kapasitas " + kapasitas + "Gb seharga Rp." + harga);
	
	}
	
	void tambahData(String m, String w, double t, int k, int h) {
		merk = m;
		warna = w;
		kapasitas = k;
		tipe = t;
		harga = h;
	}
	
	
}
