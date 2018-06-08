package rhc;

public class Unggas {
	
	protected String alatPernapasan;
	protected String suara;
	private int lamaHidup, lamaBertelur;

	public Unggas() {
		
	}
	
	public Unggas(String alatPernapasan, String suara, int lamaHidup, int lamaBertelur) {
		this.alatPernapasan = alatPernapasan;
		this.suara = suara;
		this.lamaHidup = lamaHidup;
		this.lamaBertelur = lamaBertelur;
	}
	
	public void setAlatPernapasan(String alatPernapasan) {
		this.alatPernapasan = alatPernapasan;
	}
	
	String getAlatPernapasan() {
		return alatPernapasan;
	}
	
	public void setSuara(String suara) {
		this.suara = suara;
	}
	
	String getSuara() {
		return suara;
	}
	
	public void setLamaHidup(int lamaHidup) {
		this.lamaHidup = lamaHidup;
	}
	
	int getLamaHidup() {
		return lamaHidup;
	}
	
	public void setLamaBertelur(int lamaBertelur) {
		this.lamaBertelur = lamaBertelur;
	}
	
	int getLamaBertelur() {
		return lamaBertelur;
	}
	
	String printUnggas() {
		return "bernapas dengan " + alatPernapasan + ", dengan suara " + suara + ", lama hidup " + lamaHidup + " tahun, lama bertelur " + lamaBertelur + " bulan";
	}
}