package Kereta;

public class Kereta {
	private String kelas;
	private int hargaTiket;
	
	public Kereta(String kelas, int hargaTiket) {
		this.kelas = kelas;
		this.hargaTiket = hargaTiket;
	}
	
	public Kereta() {
		
	}

	void setKelas(String kelas) {
		this.kelas = kelas;
	}
	
	String getKelas() {
		return kelas;
	}
	
	void setHarga(int hargaTiket) {
		this.hargaTiket = hargaTiket;
	}
	
	int getHarga() {
		return hargaTiket;
	}
	
	String sammery() {
		return "Nama Kelas : " + kelas + "\tHarga Tiket : " + hargaTiket;
	}
	
}
