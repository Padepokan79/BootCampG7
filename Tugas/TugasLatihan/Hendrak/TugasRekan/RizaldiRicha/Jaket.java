package RizaldiRicha;

public class Jaket extends Pakaian{
	private Pakaian pakaian;

	public Jaket() {
		
	}
	
	public Jaket(Pakaian pakaian) {
		this.pakaian = pakaian;
	}
	
	public Jaket(String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga) {
		super(ukuran, warna, merek, jenisBahan, madeIn, harga);
	}
	
	
	public String tampil() {
		return super.tampil();
	}
	
}
