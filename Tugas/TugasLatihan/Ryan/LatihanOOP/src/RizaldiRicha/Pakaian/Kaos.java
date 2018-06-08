package RizaldiRicha.Pakaian;

public class Kaos extends Pakaian {
	
	private String motif;
	
	public Kaos(String ukuran, String warna, String merk, String jenisBahan, String madeIn, String motif) {
		super(ukuran, warna, merk, jenisBahan, madeIn);
		this.motif = motif;
		
	}
	
	String getMotif() {
		return motif;
	}
	
	public String toString() {
		return super.toString()+
				"\nMotif : "+motif;
	}
	
}

