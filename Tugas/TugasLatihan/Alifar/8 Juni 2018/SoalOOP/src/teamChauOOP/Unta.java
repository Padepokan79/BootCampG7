package teamChauOOP;

public class Unta {
	private Unggas unggas=new Unggas();
	private String warnaBulu, suara;
	private int lamaBertelur;
	
	public Unta(Unggas unggas, String warnaBulu, String suara, int lamaBertelur) {
		super();
		this.unggas = unggas;
		this.warnaBulu = warnaBulu;
		this.suara = suara;
		this.lamaBertelur = lamaBertelur;
	}

	String bunyi() {
		return suara;
	}
	
	String terbang() {
		return "Tidak Bisa Terbang";
	}
	
	@Override
	public String toString() {
		return "Unta [unggas=" + unggas + ", warnaBulu=" + warnaBulu + ", suara=" + suara + ", lamaBertelur="
				+ lamaBertelur + "]";
	}

}
