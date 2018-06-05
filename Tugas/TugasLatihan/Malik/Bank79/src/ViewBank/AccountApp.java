package ViewBank;

import java.util.Scanner;
import ControllBank.Account;
import Validasi.ValidasiBatasInputMenu;
import Validasi.ValidasiHuruf;
import Validasi.ValidasiInputUang;
public class AccountApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Selamat Datang di Bank 79");
		System.out.println();
		System.out.println("Untuk pembuatan akun Bank baru, Silahkan isi data");
		System.out.println();
		Account acc1 = inputanIdentitas(scan);
		menu();
		prosesPilihanMenu(scan, acc1);
	}

	public static Account inputanIdentitas(Scanner scan) {
		String namaStr,idStr;
		int deposit;
		boolean cek = false;
		cek = true;
		do {
			System.out.print("Masukan Nama            : ");
			namaStr = scan.next();
			cek = validasiAngka(namaStr);
		}while(cek == true);
		do {
			System.out.print("Masukan Nomor Identitas : ");
			idStr = scan.next();
			cek = ValidasiHuruf.validasiHuruf(idStr);
		}while(cek == true);
		deposit = ValidasiInputUang.validasiInputUang("Masukan Deposit pertama : ", scan, cek);
		Account acc1 = new Account(namaStr,idStr,deposit);
		acc1.selamatDatang();
		return acc1;
	}

	public static void menu() {
		System.out.println();
		System.out.println("Menu");
		System.out.println("1. Cek Saldo");
		System.out.println("2. Menabung");
		System.out.println("3. Mengambil");
		System.out.println("000. Exit");
		System.out.println();
	}

	public static void prosesPilihanMenu(Scanner scan, Account acc1) {
		int pilihMenu;
		int uangTabung;
		int uangAmbil;
		boolean cek;
		do {
			System.out.println();
			cek = true;
			pilihMenu = ValidasiBatasInputMenu.validasiBatasInputMenu("Pilih Menu : ",scan,cek);
			
			
			if (pilihMenu == 1) {
				acc1.cekSaldo();
			}else if (pilihMenu == 2) {
				cek = true;
				uangTabung = ValidasiInputUang.validasiInputUang("Masukan besar uang yang akan ditabungkan : Rp. ", scan, cek);
				acc1.menabung(uangTabung);
				acc1.tambahTabungan();
			}else if (pilihMenu == 3) {
				cek = true;
				uangAmbil = ValidasiInputUang.validasiPinjamUang("Masukan besar uang yang akan diambil : Rp. ", scan, cek);
				acc1.ambilTabungan(uangAmbil);
				acc1.tabunganAmbil();
			}
			cek = false;
			if (pilihMenu == 000) {
				cek = true;
			}
		}while(cek == false);
	}

	public static boolean validasiAngka(String namaStr) {
		boolean cek;
		if (namaStr.matches("([0-9])*")) {
			System.out.println("Inputan harus huruf");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}

}
