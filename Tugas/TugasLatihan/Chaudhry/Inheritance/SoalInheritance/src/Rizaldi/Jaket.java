package Rizaldi;

public class Jaket extends Pakaian {
	private String jenisJaket;
	private double harga;
	
	public Jaket() {
		
	}
	public Jaket(String ukuran, String warna, double harga, String merek, String jenisBahan, String madeIn, String jenis) {
		super(ukuran, warna, harga, merek, jenisBahan, madeIn);
		jenisJaket 		= jenis;
	}
	
	String getJenisJaket() {
		return jenisJaket;
	}
	
	public String toString() {
		return super.toString() + ", Jenis Jaket : "+getJenisJaket();
	}
}
