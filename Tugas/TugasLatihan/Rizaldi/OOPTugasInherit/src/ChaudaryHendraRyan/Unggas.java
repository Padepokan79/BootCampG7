package ChaudaryHendraRyan;

public class Unggas {
	private String nama, warnaBulu, alatPernapasan, suara;
	private int lamaHidup, ukuran, lamaBertelur;
	
	public Unggas() {
		
	}
	public Unggas(String nama, String warnaBulu, String alatPernafasan, String suara, int lamaHidup, int ukuran, int lamaBertelur) {
		this.nama			= nama;
		this.warnaBulu		= warnaBulu;// set
		this.alatPernapasan	= alatPernafasan;
		this.suara			= suara;
		this.lamaHidup		= lamaHidup;// set
		this.ukuran			= ukuran;
		this.lamaBertelur	= lamaBertelur;// set
	}
	
	
	// GETTER
	String getName() {
		return nama;
	}
	
	String getWarnaBulu() {
		return warnaBulu;
	}
	
	String getAlatPernafasan() {
		return alatPernapasan;
	}
	
	String getSuara() {
		return suara;
	}
	
	int getLamaHidup() {
		return lamaHidup;
	}
	
	int getUkuran() {
		return ukuran;
	}
	
	int getLamaBertelur() {
		return lamaBertelur;
	}
	
	//  SETTER
	void setName(String nama){
		this.nama = nama;
	}
	void setWarnaBulu(String warnaBulu) {
		this.warnaBulu = warnaBulu;
	}
	void setAlatPernafasan(String alatPernafasan) {
		this.alatPernapasan = alatPernafasan;
	}
	void setSuara(String suara) {
		this.suara = suara;
	}
	void setLamaHidup(int lamaHidup) {
		this.lamaHidup = lamaHidup;
	}
	void setUkuran(int ukuran) {
		this.ukuran = ukuran;
	}
	void setLamaBertelur(int lamaBertelur) {
		this.lamaBertelur = lamaBertelur;
	}
	
}
