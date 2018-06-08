
public class Account {
	String nama, identitas;
	int saldo,deposit,withdraw;
	
	public Account() {
		
	}
	
	public Account(String nama, String identitas, int deposit) {
		this.nama = nama;
		this.identitas = identitas;
		this.deposit = deposit;
		saldo = deposit;
		
	}
	
	void tampil()
	{
		System.out.println("Selamat datang "+nama);
		System.out.println("Akun anda adalah "+identitas+ " a/n " + nama +" Dengan saldo sebesar Rp." + saldo);
	}
	
	void saldo() {
		System.out.println("Saldo kamu  Rp."+ saldo);
	}
	
	void deposit(int d)
	{	deposit = d;	
		saldo += d;
		System.out.println("Selamat uang sebesar Rp."+ d + " berhasil ditambahkan");
	}
	
	void withdraw(int w) {
		withdraw = w;
			if(saldo >= withdraw)
			{
				saldo-= withdraw;
				System.out.println("Kamu berhasil menarik uang sebesar Rp."+ withdraw);
				System.out.println("Saldo kamu  saat ini Rp."+ saldo);
			}
			else
			{
				System.out.println("Saldo kamu  tidak mencukupi untuk penarikan silahkan nabung.");
			}
	}
	
	
}
