package ControllBank;

public class Account {
	String id, nama;
	public static int saldoTabung,uangTabungan,ambilTabungan;
	
	public Account() {}
	
	public Account(String nama, String id, int deposit) {
		this.nama 	= nama;
		this.id   	= id;
		saldoTabung = deposit;
	}
	
	public void cekSaldo() {
		System.out.println("Sisa saldo anda sebesar Rp. "+saldoTabung);
	}
	
	public void ambilTabungan(int ambilTabungan) {
		this.ambilTabungan = ambilTabungan;
		saldoTabung = saldoTabung - ambilTabungan;
	}
	
	public void menabung(int uangTabungan) {
		this.uangTabungan = uangTabungan;
		saldoTabung = saldoTabung + uangTabungan;
	}
	
	public void tambahTabungan() {
		System.out.println("Selamat uang sebesar Rp. "+uangTabungan+" telah ditambahkan");
	}
	
	public void tabunganAmbil() {
		System.out.println("Selamat uang sebesar Rp. "+ambilTabungan+" telah diambil");
	}
	
	public void selamatDatang() {
		System.out.println("Selamat Datang "+nama+".\nAkun anda adalah "+id+" a/n "+nama+" dengan saldo sebesar Rp. "+saldoTabung);
	}
}
