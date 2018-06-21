package ChaudryHendraRyan;

public class Ayam extends Unggas{
	private Unggas unggas;
	
	public Ayam() {
		
	}
	
	
	public void bunyi() {
		System.out.println("Unggas ini bersuara " + getSuara());
	}
	
	
	public Ayam(Unggas unggas) {
		this.unggas = unggas;
	}
	
	public String toString() {
		return "" + unggas;
	}
}
