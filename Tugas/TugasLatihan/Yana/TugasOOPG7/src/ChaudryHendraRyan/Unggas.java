package ChaudryHendraRyan;

public class Unggas {
	private String alatPernapasan, suara;
	
	public Unggas() {
	}
	
	public Unggas(String alatPernapasan, String suara) {
		this.alatPernapasan	= alatPernapasan;
		this.suara 			= suara;
	}
	
	String tampilUanggas() {
		return "Alat Pernapasan : "+alatPernapasan+", Suara : "+suara;
	}
}
