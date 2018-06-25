package unggas;

public class Ayam extends Unggas{
	
	String nama, warnaBulu;
	int ukuran;
	Unggas ung = new Unggas();
	
	public Ayam() {
		// TODO Auto-generated constructor stub
	}
	
	public Ayam(Unggas ung, String nama, String warnaBulu, int ukuran) {
		this.ung = ung;
		this.nama = nama;
		this.warnaBulu = warnaBulu;
		this.ukuran = ukuran;
	}
	
	String getNama() {
		return nama;
	}
	
	String getWarnaBulu() {
		return warnaBulu;
	}
	
	int getUkuran() {
		return ukuran;
	}
	
	String printUnggas() {
		return "Ayam " + nama + " " + ung.printUnggas() + " berwarna " + warnaBulu + ", sebesar " + ukuran + " cm";
	}

}
