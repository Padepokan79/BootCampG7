package Bank;

public class Account {
	int saldo, identitas, besarUang;
	String nama;
	
	public Account() {
		
	}
	public Account(String nam, int id, int sald){
		nama 		= nam;
		identitas	= id;
		saldo 		= sald;
	}
	
	
	
	
	void addDeposit(int besarUang) {
		this.besarUang = besarUang;
		saldo += besarUang;
	}
	void mengambil(int besarUang) {
		this.besarUang = besarUang;
		saldo -= besarUang;
	}
	
	
	
	void printBiodata() {
		System.out.println("");
		System.out.println("Selamat Datang, "+nama);
		System.out.println("Akun anda adalah "+identitas+" a/n "+nama+" Dengan saldo sebesar "+saldo);
		System.out.println("");
		System.out.println("---------------------------");
	}
	void printSaldo() {
		System.out.println("Sisa Saldo anda saat ini Sebesar Rp "+saldo);
		System.out.println("");
	}
	void printMenabung() {
		System.out.println("Selamat Uang sebesar Rp "+besarUang+" telah ditambahkan");
		System.out.println("");
	}
	void printMenarik() {
		System.out.println("");
	}
	
}
