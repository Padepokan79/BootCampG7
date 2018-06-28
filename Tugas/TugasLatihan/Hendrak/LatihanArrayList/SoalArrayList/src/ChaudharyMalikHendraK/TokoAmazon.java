package ChaudharyMalikHendraK;

public class TokoAmazon {
	String namaBarang;
	private int hargaBarang;
	int terjualHari1,terjualHari2,terjualHari3,terjualHari4,terjualHari5,terjualHari6;
	public TokoAmazon() {
		
	}
	
	public TokoAmazon(String namaBarang, int hargaBarang, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6) {
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
		terjualHari1 = hari1;
		terjualHari2 = hari2;
		terjualHari3 = hari3;
		terjualHari4 = hari4;
		terjualHari5 = hari5;
		terjualHari6 = hari6;
	}
	
	public int getHargaBarang() {
		return hargaBarang;
	}

	public TokoAmazon(String namaBarang, int hargaBarang) {
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
	}
}
