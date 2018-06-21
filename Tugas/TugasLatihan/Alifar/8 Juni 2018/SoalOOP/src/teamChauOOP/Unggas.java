package teamChauOOP;

public class Unggas {
	private String nama, alatPernapasan;
	private int lamaHidup, ukuran;
	
	public Unggas() {}

	public Unggas(String nama, String alatPernapasan, int lamaHidup, int ukuran) {
		this.nama = nama;
		this.alatPernapasan = alatPernapasan;
		this.lamaHidup = lamaHidup;
		this.ukuran = ukuran;
	}

	@Override
	public String toString() {
		return "Unggas [nama=" + nama + ", alatPernapasan=" + alatPernapasan + ", lamaHidup=" + lamaHidup + ", ukuran="
				+ ukuran + "]";
	}
	
}
