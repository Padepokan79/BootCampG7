package RizaldiRicha;

public class Kaos extends Pakaian{
	private Pakaian pakaian;
	
	public Kaos() {
		
	}
	
	public Kaos(Pakaian pakaian) {
		this.pakaian = pakaian;
	}
	
	public Kaos(String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga) {
		super(ukuran, warna, merek, jenisBahan, madeIn, harga);
	}
	
	public String tampil() {
		return super.tampil();
	}
	
}
