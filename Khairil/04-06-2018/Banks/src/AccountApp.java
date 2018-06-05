import java.util.Scanner;
import backend.Validasi;

public class AccountApp {

	public static void main(String[] args) {
		String inputNama, inputNoId, inputDeposit, inputMenu;
		Boolean step = false;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Validasi interfe = new Validasi();
		inputNama = inputNoId = inputDeposit = inputMenu = "";

		System.out.println("Selamat Datang di Bank 79");

		System.out.println("Untuk Pembuatan Akun Bank Baru.");
		System.out.println("Silahkan Masukan Nama anda : ");
		inputNama = input.nextLine();
		while(step == false) {
			if(interfe.mustString(inputNama, step) ) {
				if(inputNama.length() == 0 ) {
					System.out.println("Inputan harus diisi");
					System.out.println("Silahkan Diulang");
					step = false;
				}
				else {
					step = true;
				}
			}
			else {
				System.out.println("Inputan tidak boleh angka");
				System.out.println("Silahkan Diulang");				
				step = false;				
			}
		}
		System.out.println("Masukan Nomor identitas : "); 
		inputNoId = input1.nextLine();
		while(step == false) {
			if(interfe.mustNumber(inputNoId, step) ) {
				if(inputNama.length() == 0 ) {
					System.out.println("Inputan harus diisi");
					System.out.println("Silahkan Diulang");
					step = false;
				}
				else {
					step = true;
				}
			}
			else {
				System.out.println("Inputan tidak boleh huruf");
				System.out.println("Silahkan Diulang");				
				step = false;				
			}
		}
		System.out.println("Silahkan Besar Deposit pertama anda : "); 
		inputDeposit = input.nextLine();

		System.out.println("Selamat Datang Hendra.");

		System.out.println("Akun anda adalah " + inputNoId + " a/n " + inputNama + " Dengan Saldo Sebesar Rp. " + inputDeposit);

		System.out.println("Menu:");
		System.out.println("1. Untuk Mengecek Saldo.");
		System.out.println("2. Deposit/Menabung.");
		System.out.println("3. Withdraw/Mengambil.");
		System.out.println("000. exit");
		inputMenu = input.nextLine();	
	}
}