package RizaldiRicha.Pakaian;

public class Jaket extends Pakaian {
	
	private String jenis, nama;
	
	public Jaket(String nama, String ukuran, String warna, String merk, String jenisBahan, String madeIn, String jenis) {
		super(ukuran, warna, merk, jenisBahan, madeIn);
		this.nama = nama;
		this.jenis = jenis;
		
	}
	
	String getNama() {
		return nama;
	}
	String getJenis() {
		return jenis;
	}
	
	public String toString() {
		return "Nama : "+nama+"\n"+
				super.toString()+
				"\nJenis : "+jenis;
	}
	
}
