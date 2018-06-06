import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		Validasi val = new Validasi();
		
		boolean cek = false;
		String nama="",identitas="",deposit="",withdraw="",pilih="",valHuruf="h",valAngka="a",valMenu="m",pilihSaldo="1",pilihDeposit="2",pilihWithdraw="3";
		
		System.out.println("Selamat Datang di Bank 79");
		System.out.println("Untuk pembuatan akun baru");
		nama=val.inputDanValidasi("Silahkan masukan nama anda : ", nama, cek, key, valHuruf);
		identitas = val.inputDanValidasi("Masukan nomor identitas : ", identitas, cek, key, valAngka);
		deposit = val.inputDanValidasi("Besar deposit pertama anda : ", deposit, cek, key, valAngka);
		Account acc = new Account(nama, identitas, val.convertToInt(deposit));
		
		acc.tampil();
		do {
			System.out.println("======================");
			System.out.println("         Menu");
			System.out.println("======================");
			System.out.println("1.Mengecek saldo");
			System.out.println("2.Deposit/Menabung");
			System.out.println("3.Withdraw/Mengambil");
			System.out.println("000.Exit");
			System.out.println("======================");
			
			pilih = val.inputDanValidasi("Masukan pilihan : ", pilih, cek, key, valMenu);
			System.out.println("======================");
			
			if(pilih.equals(pilihSaldo)) {
				acc.saldo();
			}
			else if(pilih.equals(pilihDeposit)) {
				
				deposit = val.inputDanValidasi("Masukan besar uang yang ditabungkan : ", deposit, cek, key, valAngka); 
				acc.deposit(val.convertToInt(deposit));
			}
			else if(pilih.equals(pilihWithdraw)) {
				withdraw = val.inputDanValidasi("Masukan besar uang yang diambil : ", withdraw, cek, key, valAngka);
				acc.withdraw(val.convertToInt(withdraw));
			}
			System.out.println("======================");
		}while(!pilih.equals("000"));
		
	}
}


/*
 *
 *
 *
 */