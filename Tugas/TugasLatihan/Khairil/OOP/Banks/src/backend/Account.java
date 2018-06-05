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
		System.out.println("Selamat anda telah menambahkan " + nominalDeposit + " ke dalam rekening anda");
	}
	
	public void withdrawDeposit(int lastSaldo, int nominalWithdraw) {
		this.nominalWithdraw = nominalWithdraw;
		this.lastSaldo = lastSaldo;
		this.cekSaldo = lastSaldo - nominalWithdraw;
		System.out.println("Anda melakukan penarikan sebesar " + nominalWithdraw + " dari rekening anda");		
	}
	
	public void accountBalance(int cekSaldo) {
		this.cekSaldo = cekSaldo;
		System.out.println("Saldo anda saat ini adalah : " + cekSaldo);		
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
	}
	
	public void logoutScreen(String nama) {
		this.nama = nama;
		System.out.println("Terima Kasih " + nama + ", telah menggunakan aplikasi Bank 79");
	}
}