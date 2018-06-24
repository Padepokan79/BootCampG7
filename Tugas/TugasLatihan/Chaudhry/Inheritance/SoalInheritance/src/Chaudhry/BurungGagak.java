package Chaudhry;

public class BurungGagak extends Unggas {
	int lamaTerbang;
	
	public BurungGagak() {
		
	}
	public BurungGagak(String nama, String warnaBulu, String alatNapas, int lamaHidup, double ukuran, int lamaBertelur, String suara, int lama) {
		super(nama, warnaBulu, alatNapas, lamaHidup, ukuran, lamaBertelur, suara);
		lamaTerbang 	= lama;
	}
	
	int getLamaTerbang() {
		return lamaTerbang;
	}
	
	public String toString() {
		return "Unggas dengan nama "+getNama()+" bersuara "+getSuara()+"\nMampu Terbang selama "+getLamaTerbang()+" Jam";
	}
}
