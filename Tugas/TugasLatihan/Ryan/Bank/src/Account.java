
public class Account {
	
	String nama, tambah, ambil;
	int identitas, deposit=0, tambahSaldo, tarik;
	boolean cek;
	public Account(String nama, int identitas, int deposit) {
		this.nama = nama;
		this.identitas = identitas;
		this.deposit = deposit;
	}
	
	void menabung() {
		Validasi valid = new Validasi();
		tambah = valid.validas(cek, tambah, "Masukan besaran uang yang akan ditabungkan : ");
		tambahSaldo = valid.konvert(tambah);
		deposit = deposit+tambahSaldo;
		System.out.println("Selamat uang sebesar Rp. "+tambahSaldo+" telah ditambahkan.");
	}
	
	void withdraw() {
		Validasi valid = new Validasi();
		ambil = valid.validas(cek, ambil, "Masukan besaran uang yang akan ditarik : ");
		tarik = valid.konvert(ambil);
		if (deposit < tarik) {
			System.out.println("Maaf Saldo tidak mencukupi");
		}
		else {
			deposit = deposit-tarik;
			System.out.println("Selamat uang telah ditarik Rp. "+tarik+"\nSisa Saldo Rp. "+deposit);
		}		
	}
	
	void tampilProfil() {
		System.out.println("\nSelamat datang "+nama+".\nAkun anda adalah "+identitas+" a/n "+nama+" Dengan Saldo Sebesar Rp. "+deposit);
	}
	
	void menu() {
		System.out.println("\nMenu:\r\n" + 
				"1. Untuk Mengecek Saldo.\r\n" + 
				"2. Deposit/Menabung.\r\n" + 
				"3. Withdraw/Mengambil.\r\n" + 
				"000. exit");
	}
	
	void pilihMenu(String pilihan) {
		int menu = Integer.parseInt(pilihan);
		
		if (menu == 1) {
			tampilProfil();
		}
		else if(menu == 2) {
			menabung();
		}
		else if(menu == 3) {
			withdraw();
		}
		else if (menu == 000) {
			if (pilihan.equals("000")) {
				System.out.println("Terimakasih telah menggunakan layanan kami.");
			}
			else {
				System.out.println("Maaf Silahkan Input kembali");
			}
		}
	}
}
