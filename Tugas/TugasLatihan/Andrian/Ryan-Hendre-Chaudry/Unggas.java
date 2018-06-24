package rhc;

public class Unggas {
	private String alatPernapasan;
	
	public Unggas () {}
	public Unggas (String alatPenarpasan) {
		this.alatPernapasan = alatPenarpasan;
		

	}
	
	String getAlatPernapasan() {
		return alatPernapasan;
	}
	
	public String toString() {
		return "Uanggas, dengan "+alatPernapasan+" sebagai alat perapasan";
	}
}
