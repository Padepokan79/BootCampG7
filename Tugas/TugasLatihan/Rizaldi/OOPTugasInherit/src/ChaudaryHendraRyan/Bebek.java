package ChaudaryHendraRyan;

public class Bebek extends Unggas{
	
	private String terbang;
	public Bebek() {
		
	}
	
	public Bebek(String nama, String warnaBulu, String alatPernafasan, String suara, int lamaHidup, int ukuran, int lamaBertelur, String terbang){
		super(nama, warnaBulu, alatPernafasan, suara, lamaHidup, ukuran, lamaBertelur);
		this.terbang = terbang;
	}
	
	// GETTER
	String getTerbang() {
		return terbang;
	}
	// SETTER
	void setTerbang(String terbang) {
		this.terbang = terbang;
	}
	
	void terbang(){
		if(getName().equals("bebek")) {
			terbang="Bisa terbang";
		}
		else {
			terbang="Gak bisa terbang";
		}
	}
}
