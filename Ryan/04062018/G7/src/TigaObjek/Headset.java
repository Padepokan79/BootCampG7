package TigaObjek;

public class Headset {
	
	int harga;
	double panjang,besarColokan;
	String warna, merk;
	
	public Headset() {
		
	}
	
	public Headset(double p, int h, double c, String w, String m) {
		panjang = p;harga=h;
		besarColokan = c;
		warna = w;merk = m;
	}
	
	void Headset(double p, int h, double c, String w, String m) {
		panjang = p;harga=h;
		besarColokan = c;
		warna = w;merk = m;
	}
	
	void tampil(){
		System.out.println("Headset ini memiliki panjang "+panjang+" meter dan berharga Rp."+harga);
		System.out.println("Besar colokannya, "+besarColokan+" inch Memiliki warna yang dominan "+warna+" dan ber merk "+merk);
		System.out.println();
	}
}
