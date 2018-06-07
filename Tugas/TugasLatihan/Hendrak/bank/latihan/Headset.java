package latihan;

public class Headset {
	String merk, warna;
	int harga;
	double besarColokan,panjang;
	
	public Headset() {
		
	}
	
	public Headset(String m, String w, double p, double c, int h) {
		merk = m;
		warna = w;
		panjang = p;
		besarColokan = c;
		harga = h;
		
	}
	
	
	void tampil() {
		System.out.println("Saya, mempunyai headset dengan merk "+ merk + " warnanya " + warna);
		System.out.println("dengan panjang kabel dan besar colokan yaitu " + panjang + "meter dan " + besarColokan );
		System.out.println("dengan harga Rp." + harga);
	}
	
	void tambahData(String m, String w, double p, double c, int h) {
		merk = m;
		warna = w;
		panjang = p;
		besarColokan = c;
		harga = h;
		
	}
	
}
