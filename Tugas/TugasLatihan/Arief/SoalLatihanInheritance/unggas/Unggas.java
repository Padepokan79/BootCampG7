package unggas;

public class Unggas {
	
	private String alatPernapasan, suara;
	private int lamaBertelur, lamaHidup;

	public Unggas() {
		// TODO Auto-generated constructor stub
	}
	
	public Unggas(String alatPernapasan, String suara, int lamaBertelur, int lamaHidup) {
		this.alatPernapasan = alatPernapasan; 
		this.suara = suara;
		this.lamaBertelur = lamaBertelur;
		this.lamaHidup = lamaHidup;
	}
	
	String getAlatPernapasan() {
		return alatPernapasan;
	}
	
	String getSuara() {
		return suara;
	}
	
	int getLamaBertelur() {
		return lamaBertelur;
	}
	
	int getLamaHidup() {
		return lamaHidup;
	}
	
	String printUnggas() {
		return "Bernafas menggunakan " + alatPernapasan + " Suara " + suara +
				".\nBertelur selama " + lamaBertelur + " bulan, hidup setidaknya "+ lamaHidup + " tahun";
	}

}
