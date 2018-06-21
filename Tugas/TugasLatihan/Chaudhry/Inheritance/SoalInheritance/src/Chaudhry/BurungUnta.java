package Chaudhry;

public class BurungUnta extends Unggas {
	int kecepatanLari;
	
	public BurungUnta() {
		
	}
	public BurungUnta(String nama, String warnaBulu, String alatNapas, int lamaHidup, double ukuran, int lamaBertelur, String suara, int lari) {
		super(nama, warnaBulu, alatNapas, lamaHidup, ukuran, lamaBertelur, suara);
		kecepatanLari 	= lari;
	}
	
	int getLari() {
		return kecepatanLari;
	}
	
	public String toString() {
		return super.toString() +"\nMampu berlari dengan kecepatan "+getLari()+"Km/Jam" ;
		
	}
}
