
public class Account {
	String 	idA, namaA;
	int 	depositA, withdrawA, uangTabunganA;
	
	public Account() {
	}
	
//	public Account(String id, int deposit) {
//		idA 		= id;
//		depositA 	= deposit;
//	}

//	public Account(int deposit) {
//		depositA = deposit;
//	}
	
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
