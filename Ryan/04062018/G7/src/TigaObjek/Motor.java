package TigaObjek;

public class Motor {
	int cc, harga;
	String merk, nama, warna, tipe;

	public Motor() {
		
	}
	public Motor(int c, int h, String m, String n, String w, String t) {
		cc = c;harga = h;
		merk = m;nama = n;
		warna = w;tipe = t;
	}
	void Motor(int c, int h, String m, String n, String w, String t) {
		cc = c;harga = h;
		merk = m;nama = n;
		warna = w;tipe = t;
	}
	void tampil() {
		System.out.println("Detail motor yang hilang : ");
		System.out.println("Merk\t: "+merk);
		System.out.println("Nama\t: "+nama);
		System.out.println("Warna\t: "+warna);
		System.out.println("Tipr/jenis : "+tipe);
		System.out.println("Kapasitas CC : "+cc);
		System.out.println("Dan perkiraan harga masih Rp."+harga);
		System.out.println();
	}
	

}
