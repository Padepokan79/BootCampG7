package kereta;

public class Kereta {
	private String nama;
	private int tiket, penumpang, jumlah, total, perhari;
	int hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getTiket() {
		return tiket;
	}

	public int getPerhari() {
		return perhari;
	}

	public void setPerhari(int perhari) {
		this.perhari = perhari;
	}

	public void setTiket(int tiket) {
		this.tiket = tiket;
	}

	public int getHari1() {
		return hari1;
	}

	public void setHari1(int hari1) {
		this.hari1 = hari1;
	}

	public int getHari2() {
		return hari2;
	}

	public void setHari2(int hari2) {
		this.hari2 = hari2;
	}

	public int getHari3() {
		return hari3;
	}

	public void setHari3(int hari3) {
		this.hari3 = hari3;
	}

	public int getHari4() {
		return hari4;
	}

	public void setHari4(int hari4) {
		this.hari4 = hari4;
	}

	public int getHari5() {
		return hari5;
	}

	public void setHari5(int hari5) {
		this.hari5 = hari5;
	}

	public int getHari6() {
		return hari6;
	}

	public void setHari6(int hari6) {
		this.hari6 = hari6;
	}

	public int getHari7() {
		return hari7;
	}

	public void setHari7(int hari7) {
		this.hari7 = hari7;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public Kereta(String nama,int harga, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7){
		setHari1(hari1);
		setHari2(hari2);
		setHari3(hari3);
		setHari4(hari4);
		setHari5(hari5);
		setHari6(hari6);
		setHari7(hari7);
		
		setTiket(harga);
		setNama(nama);
		jumlah += (harga*hari1)+(harga*hari2)+(harga*hari3)+(harga*hari4)+(harga*hari5)+(harga*hari6)+(harga*hari7);
		hari1 = harga*hari1;
		hari2 = harga*hari2;
	}
	
	public String toString() {
		return "Jumlah Seminggu Kereta "+getNama()+": "+getJumlah();
	}
}
