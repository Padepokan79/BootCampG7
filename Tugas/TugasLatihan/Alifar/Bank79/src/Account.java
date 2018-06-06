
public class Account {
	String id, nama;
	int tabungan;
	
	public Account(String fullName, String idNumber, int money) {
		nama=fullName;
		id=idNumber;
		tabungan=money;
	}
	
	void cekSaldo() {
		System.out.println("Nama            : "+nama);
		System.out.println("Nomor Identitas : "+id);
		System.out.println("Sisa Saldo anda sebesar Rp. "+tabungan);
	}
	
	void deposit(int uang) {
		System.out.println("Uang sebesar Rp. "+uang+" berhasil ditambahkan ke tabungan");
		tabungan+=uang;
	}
	
	void withdraw(int uang) {
		if(uang<=tabungan) {
			System.out.println("Uang sebesar Rp. "+uang+" berhasil diambil dari tabungan");
			tabungan-=uang;
		}
		else
			System.out.println("Saldo anda tidak mencukupi");
	}
	
}
