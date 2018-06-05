package Bank;

public class Account {
	int saldo, besarUang;
	
	public Account() {
		
	}
	
	public Account(int s){
		saldo = s;
	}
	
	int cekSaldo() {
		this.saldo = saldo;
		return saldo;
	}
	
	int addDeposit() {
		saldo += besarUang;
		return saldo;
	}
	
	int mengambil() {
		saldo -= besarUang;
		return saldo;
	}
	
}
