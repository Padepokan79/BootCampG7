package Rizaldi;

public class Kaos extends Pakaian {
	private Pakaian pakaian;
	String jenisPakai;
	
	public Kaos() {
		
	}
	public Kaos(String ukuran, String warna, double harga, String merek, String jenisBahan, String madeIn, String jenis) {
		super(ukuran, warna, harga, merek, jenisBahan, madeIn);
		jenisPakai 		= jenis;
	}
	
	String getJenisPakai() {
		return jenisPakai;
	}
	
	public String toString() {
		return super.toString() + ", Jenis Pakaian : "+getJenisPakai();
	}
}
