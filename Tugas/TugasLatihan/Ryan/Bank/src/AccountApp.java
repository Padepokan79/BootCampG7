import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Validasi valid = new Validasi();
		
		String nama="", iden="", depo="", pilih="";
		int identitas=0, deposit=0;
		boolean cek=false;
		
		///////////////////
		System.out.println("========================\r\n" + 
				"\r\n" + 
				"Selamat Datang di Bank 79\r\n" + 
				"\r\n" + 
				"Untuk Pembuatan Akun Bank Baru.\r\n");
		nama = valid.valid(cek, nama, "Masukan Nama : ");
		iden = valid.validas(cek, iden, "No identitas : ");
		identitas = valid.konvert(iden);
		depo = valid.validas(cek, depo, "Deposit Awal : ");
		deposit = valid.konvert(depo);
		Account account = new Account(nama, identitas, deposit);
		
		account.tampilProfil();
		
		do {
			account.menu();
			System.out.print("\nPilih Menu : ");
			pilih = key.next();
			account.pilihMenu(pilih);
		}while(!(pilih.equals("000")));
		
	}

}
