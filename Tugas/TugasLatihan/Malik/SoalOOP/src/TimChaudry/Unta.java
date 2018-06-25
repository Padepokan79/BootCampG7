package TimChaudry;

public class Unta extends Unggas{
	private String suara, warnaBulu;
	private int lamaBertelur;
	private Unggas unggas;
	
	public Unta(Unggas unggas, String suara, String warnaBulu, int lamaBertelur) {
		this.unggas = unggas;
		this.suara = suara;
		this.warnaBulu = warnaBulu;
		this.lamaBertelur = lamaBertelur;
	}
	
	String bunyi() {
		return suara;
	}
	
	String terbang() {
		return "tidak bisa terbang";
	}

	@Override
	public String toString() {
		return unggas.toString()+" Unta [suara=" + suara + ", warnaBulu=" + warnaBulu + ", lamaBertelur=" + lamaBertelur + "]";
	}
	
	
	
}
