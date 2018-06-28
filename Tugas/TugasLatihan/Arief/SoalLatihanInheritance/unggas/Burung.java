package unggas;

public class Burung extends Unggas{

	String nama, warnaBulu, terbang;
	int ukuran;
	Unggas ung = new Unggas();

	public Burung() {
		// TODO Auto-generated constructor stub
	}
	
	public Burung(Unggas ung, String nama, String warnaBulu, int ukuran, String terbang) {
		this.ung = ung;
		this.nama = nama;
		this.warnaBulu = warnaBulu;
		this.ukuran = ukuran;
		this.terbang = terbang;
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
		return "Burung " + nama + " " + ung.printUnggas() + " berwarna " + warnaBulu + ", sebesar " + ukuran + " cm " + " terbang " + terbang;
	}

}
