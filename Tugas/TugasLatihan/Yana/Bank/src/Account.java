
public class Account {
	String 	namaA;
	int 	idA, depositA, withdrawA, uangTabunganA;
	
	public Account() {
	}
	
	public Account(String nama, int id, int deposit) {
		namaA 		= nama;
		idA 		= id;
		depositA 	= deposit;
	}
	
	int saldo() {
		return uangTabunganA;
	}
	
	void deposit(int deposit) {
		depositA 		= deposit;
		uangTabunganA 	+= depositA;
	}

	void withdraw(int withdraw) {
		withdrawA 		= withdraw;
		uangTabunganA 	-= withdrawA;
	}
	
	void cetakSaldo() {
		System.out.println("Sisa saldo Anda sebesar Rp. "+uangTabunganA);
	}
	
	void cetakDeposit() {
		System.out.println("Selamat  Uang sebesar Rp "+depositA+" telah ditambahkan.");
	}
	
	void cetakWithdraw() {
		System.out.println("Uang sebesar Rp "+withdrawA+" telah berhasil diambil.");
	}
}
