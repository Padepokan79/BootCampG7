package rhc;

public class Burung extends Unggas {
	
	private String nama, warnaBulu, kemampuan,suara;
	private int ukuran,lamaHidup, lamaBertelur;
	Unggas unggas = new Unggas();
	
	public Burung() {
		
	}
	
	public Burung (Unggas unggas, String nama, String warnaBulu, int ukuran, String kemampuan, int lamaHidup, int lamaBertelur, String suara) {
		this.nama = nama;
		this.unggas = unggas;
		this.warnaBulu = warnaBulu;
		this.ukuran = ukuran;
		this.kemampuan = kemampuan;
		this.lamaHidup = lamaHidup;
		this.lamaBertelur = lamaBertelur;
	}
	
	Unggas getUnggas() {
		return unggas;
	}
	
	String getSuara() {
		return suara;
	}
	
	int getLamaHidup() {
		return lamaHidup;
	}
	
	int getLamaBertelur() {
		return lamaBertelur;
	}
	
	int getUkuran() {
		return ukuran;
	}
	
	String getNama() {
		return nama;
	}
	
	String getWarnaBulu() {
		return warnaBulu;
	}
	
	void setKemampuan(String kemampuan) {
		this.kemampuan = kemampuan;
	}
	
	String printBurung() {
		return unggas.toString()+" \nNama : "+nama+"\nWarna bulu : "+warnaBulu+
				"\nUkuran : "+ukuran+"\nKemampuan : "+kemampuan+"\nBer"+suara+" sebagai ciri khas\n"+
				lamaHidup+" tahun dan mengerami telur selama "+lamaBertelur;
	}

}
