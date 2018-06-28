package Chaudhry;

public class Unggas {
	private String nama, warnaBulu, alatPernapasan, suara;
	private int lamaHidup, lamaBertelur;
	private double ukuran;
	
	public Unggas() {
		
	}
	public Unggas(String nama, String warnaBulu, String alatNapas, int lamaHidup, double ukuran, int lamaBertelur, String suara) {
		this.nama 	= nama;
		this.warnaBulu 	= warnaBulu;
		alatPernapasan 	= alatNapas;
		this.lamaHidup 	= lamaHidup;
		this.ukuran 	= ukuran;
		this.lamaBertelur 	= lamaBertelur;
		this.suara 		= suara;
	}
	
	void setLamaHidup(int lama) {
		lamaHidup 	= lama;
	}
	
	String getNama() {
		return nama;
	}
	String getWarnaBulu() {
		return warnaBulu;
	}
	String getAlatNapas() {
		return alatPernapasan;
	}
	int getLamaHidup() {
		return lamaHidup;
	}
	double getUkuran() {
		return ukuran;
	}
	int getLamaBertelur() {
		return lamaBertelur;
	}
	String getSuara() {
		return suara;
	}
	
	void bisaTerbang() {
		System.out.println("Dapat terbang");
	}
	void tidakTerbang() {
		System.out.println("Tidak dapat terbang");
	}
	
	public String toString() {
		return "Unggas dengan nama "+getNama()+" bersuara "+getSuara();
	}
	
}
