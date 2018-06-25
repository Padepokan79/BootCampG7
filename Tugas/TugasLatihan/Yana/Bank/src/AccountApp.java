import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		boolean validation = false;
		String 	masukkan, nama="", pilihMenu;
		int 	id, deposit, withdraw, saldo, menu, end;
		
		id = deposit = withdraw = saldo = end = menu = 0;
		
		//Account account2 = new Account(nama, id, deposit);
		//inisialisasi
		account.idA 			= id;
		account.namaA 			= nama;
		account.depositA		= deposit;
		account.uangTabunganA 	= saldo;
		account.withdrawA 		= withdraw;		
		
		System.out.println("Selamat Datang di Bank 79");
		System.out.println("Untuk Pembuatan Akun Bank Baru.");
		
		do {
			System.out.print("Silahkan masukkan Nama Anda: ");
			masukkan 	= input.nextLine();
			validation 	= validasiHuruf(validation, masukkan);
			nama 		= masukkan;
		}while(validation == false);
		validation 	= false;
		id 			= inputan("Masukan Nomor identitas: ", masukkan, input, validation);
		deposit 	= inputan("Silahkan Besar Deposit pertama anda: ", masukkan, input, validation);		
		
		account.deposit(deposit);
		
		System.out.println("Selamat Datang "+nama+".");
		System.out.println("Akun Anda adalah "+id+" a/n "+nama);
		System.out.println("Dengan Saldo Sebesar Rp. "+deposit);
		System.out.println();
		
		//pilihan menu
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1. Untuk Mengecek Saldo.");
			System.out.println("2. Deposit/Menabung.");
			System.out.println("3. Withdraw/Mengambil.");
			System.out.println("000. Exit");
			System.out.println();
		
			//menu = inputan("Masukkan pilihan: ", masukkan, input, validation);
			do {
				System.out.print("Masukkan pilihan: ");
				pilihMenu = input.next();
				if (validasiAngka(validation, pilihMenu) || pilihMenu.equals("000")) {
					validation = true;
					menu = Integer.parseInt(pilihMenu);					
					if (menu == 1) {
						//cek saldo
						validation = false;
						account.cetakSaldo();			
					}
					else if (menu == 2) {
						//deposit
						validation 	= false;
						deposit 	= inputan("Masukan Besar uang yang akan ditabungkan: ", masukkan, input, validation);
						account.deposit(deposit);
						account.cetakDeposit();
					}
					else if (menu == 3) {
						//pengambilan
						validation 	= false;
						withdraw 	= inputan("Masukan Besar uang yang akan diambil: ", masukkan, input, validation);
						if (withdraw > account.uangTabunganA) {
							System.out.println("Saldo tidak mencukupi");
						}
						else {
							account.withdraw(withdraw);
							account.cetakWithdraw();					
						}
					}
					else if (menu > 3) {
						System.out.println("pilihan tidak sesuai");
					}
					else if (pilihMenu.equals("000")) {
						System.out.println("exit");
						end = 1;
					}
				}
			}while(validation = false);
			validation = false;
		}while(end==0);
	}

	private static boolean validasiHuruf(boolean validation, String masukkan) {
		if (masukkan.matches("[a-zA-Z]+")) {
			validation = true;
		}
		else {
			System.out.println("Masukkan tidak boleh angka/simbol");
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
			else if(masukkan.equals("000")) {
			}
			else {
				System.out.println("Inputan tidak boleh "+masukkan);
			}
		}
		else {
			System.out.println("Masukkan tidak boleh huruf/simbol");
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