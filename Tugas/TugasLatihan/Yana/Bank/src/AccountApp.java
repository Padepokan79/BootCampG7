import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		boolean validation = false;
		String 	masukkan="", nama="";
		int 	id, deposit, withdraw, saldo, menu, end;
		
		id = deposit = withdraw = saldo = end = 0;
		
		System.out.println("Selamat Datang di Bank 79");
		System.out.println("Untuk Pembuatan Akun Bank Baru.");
		
//		nama = inputan("Silahkan Masukan Nama anda: ", masukkan, input, validation);
		System.out.print("Silahkan masukkan Nama Anda: ");
		nama 		= input.nextLine();
		id 			= inputan("Masukan Nomor identitas: ", masukkan, input, validation);
		deposit 	= inputan("Silahkan Besar Deposit pertama anda: ", masukkan, input, validation);		
		
		account.deposit(deposit);
		

		System.out.println("Selamat Datang "+nama+".");
		System.out.println("Akun Anda adalah "+id+" a/n "+nama);
		System.out.println("Dengan Saldo Sebesar Rp. "+account.uangTabunganA);
		System.out.println();
		
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1. Untuk Mengecek Saldo.");
			System.out.println("2. Deposit/Menabung.");
			System.out.println("3. Withdraw/Mengambil.");
			System.out.println("000. Exit");
			System.out.println();
		
			menu = inputan("Masukkan pilihan: ", masukkan, input, validation);
//			do {
//				System.out.print("Masukkan pilihan: ");
//				masukkan = input.next();
//				menu = Integer.parseInt(masukkan);
//				if (validasiAngka(validation, "menu") && menu > 0 && menu < 4 || menu == 000) {
//					validation = true;
//				}	
//			}while(validation == false);

			
			if (menu == 1) {
				validation = false;
				account.cetakSaldo();			
			}
			else if (menu == 2) {
				validation = false;
				deposit 	= inputan("Masukan Besar uang yang akan ditabungkan: ", masukkan, input, validation);
				account.deposit(deposit);
				account.cetakDeposit();
			}
			else if (menu == 3) {
				validation = false;
				withdraw 	= inputan("Masukan Besar uang yang akan diambil: ", masukkan, input, validation);
				account.withdraw(withdraw);
				account.cetakWithdraw();
			}
		}while(end==0);
	}

	private static boolean validasiHuruf(boolean validation, String masukkan) {
		if (masukkan.matches("[a-bA-B]")) {
			validation = true;
		}
		return validation;
	}

	public static int toInt(String masukkan) {
		return Integer.parseInt(masukkan);
	}

	private static boolean validasiAngka(boolean validation, String masukkan) {
		if (masukkan.matches("[0-9]+")) {
			if (Integer.parseInt(masukkan) > 0) {
				validation = true;				
			}
		}
		return validation;
	}
	
	public static int inputan(String judulPertanyaan, String masukkan, Scanner input, boolean validasi) {
		do {
			System.out.println(judulPertanyaan);
			masukkan = input.next();
			validasi = validasiAngka(validasi, masukkan);
		}while(validasi == false);
		return toInt(masukkan);
	}
}