package ChaudryHendraRyan;

public class Gagak extends Unggas{
	
	public Gagak() {
		
	}
	
	public Gagak(String nama, String warna, String alatNapas, String suara, int lamaH, int ukuran, int lamaT) {
		super(nama, warna, alatNapas, suara, lamaH, ukuran, lamaT);
	}
	
	@Override
	public String getNama() {
		return super.getNama();
	}
	
	public void terbang()
	{
		System.out.println( getNama() + " adalah unggas yang bisa terbang !!!");
	}
	
	public String toString() {
		return super.toString();
	}
}
