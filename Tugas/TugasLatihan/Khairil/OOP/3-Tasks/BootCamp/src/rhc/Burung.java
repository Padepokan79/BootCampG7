package rhc;

class Burung extends Unggas {
	
	private String nama, warnaBulu;
	private Unggas unggas;

	public Burung(Unggas unggas, String nama, String warnaBulu) {
		this.unggas = unggas;
		this.nama = nama;
		this.warnaBulu = warnaBulu;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	String getNama() {
		return nama;
	}
	
	public void setWarnaBulu(String warnaBulu) {
		this.warnaBulu = warnaBulu;
	}
	
	String getWarnaBulu() {
		return warnaBulu;
	}
	
	Unggas getUnggas() {
		return unggas;
	}
	
	String printBurung() {
		return "Nama burung " + nama + ", warna bulunya " + warnaBulu + " " + unggas.printUnggas();
	}
}