package ChaudryHendraRyan;

public class BurungUnta {
	private String nama, warnaBulu, lamaHidup, lamaBerterur;
	private Unggas unggas = new Unggas();
	
	public BurungUnta() {
	}
	
	public BurungUnta(String nama, String warnaBuru, String lamaHidup, String lamaBerterur, Unggas unggas) {
		this.nama 		= nama;
		this.warnaBulu	= warnaBuru;
		this.lamaHidup	= lamaHidup;
		this.lamaBerterur = lamaBerterur;
		this.unggas 	= unggas;
	}
	
	String terbang() {
		return "Terbang";
	}
	
	String tampilUnggas() {
		return "Nama : "+nama+", Warna Bulu :"+warnaBulu+", Lama Hidup : "+lamaHidup+", Lama Bertelur : "+lamaBerterur+", "+unggas.tampilUanggas();
	}
}
