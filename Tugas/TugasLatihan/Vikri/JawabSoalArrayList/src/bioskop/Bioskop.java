package bioskop;

public class Bioskop {
	private String kelas;
	private int harga, hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	public String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

	public Bioskop() {
		
	}
	public Bioskop(String kelas, int harga, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.kelas = kelas;
		this.harga = harga;
		this.hari1 = hari1;
		this.hari2 = hari2;
		this.hari3 = hari3;
		this.hari4 = hari4;
		this.hari5 = hari5;
		this.hari6 = hari6;
		this.hari7 = hari7;
	}
	public String getKelas() {
		return kelas;
	}
	public int getHarga() {
		return harga;
	}
	public int getHari1() {
		return hari1;
	}
	public int getHari2() {
		return hari2;
	}
	public int getHari3() {
		return hari3;
	}
	public int getHari4() {
		return hari4;
	}
	public int getHari5() {
		return hari5;
	}
	public int getHari6() {
		return hari6;
	}
	public int getHari7() {
		return hari7;
	}
}
