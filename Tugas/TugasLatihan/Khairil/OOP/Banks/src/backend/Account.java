package backend;

public class Account {
	String nama, ids, inputString;
	int nominalDeposit, nominalWithdraw, cekSaldo, lastSaldo;
	
	public Account() {
		
	}
	
	public void addDeposit(int lastSaldo, int nominalDeposit) {
		this.nominalDeposit = nominalDeposit;
		this.lastSaldo = lastSaldo;
		this.cekSaldo = lastSaldo + nominalDeposit;
		System.out.println("Selamat anda telah menambahkan Rp. " + nominalDeposit + " ke dalam rekening anda");
		System.out.println("Saldo anda saat ini adalah Rp. " + this.cekSaldo);
	}
	
	public void withdrawDeposit(int lastSaldo, int nominalWithdraw) {
		this.nominalWithdraw = nominalWithdraw;
		this.lastSaldo = lastSaldo;
		this.cekSaldo = lastSaldo - nominalWithdraw;
		System.out.println("Anda melakukan penarikan sebesar Rp. " + nominalWithdraw + " dari rekening anda");
		System.out.println("Saldo anda saat ini adalah Rp. " + this.cekSaldo);
	}
	
	public void accountBalance(int cekSaldo) {
		this.cekSaldo = cekSaldo;
		System.out.println("Saldo anda saat ini adalah Rp. " + cekSaldo);		
	}	
	
	public void welcomeScreen(int cekSaldo) {
		this.cekSaldo = cekSaldo;
		System.out.print(" Dengan Saldo Sebesar Rp. " + cekSaldo);
		System.out.println();
	}
	
	public void menuScreen() {
		System.out.println("Menu:");
		System.out.println("1. Untuk Mengecek Saldo.");
		System.out.println("2. Deposit/Menabung.");
		System.out.println("3. Withdraw/Mengambil.");
		System.out.println("000. exit");
		System.out.println();
		System.out.print("Inputan anda adalah : ");
		System.out.println();
	}
	
	public void logoutScreen(String nama) {
		this.nama = nama;
		System.out.println("Terima Kasih " + nama + ", telah menggunakan aplikasi Bank 79");
	}
}