package ViewBank;

import java.util.Scanner;
import ControllBank.Account;
import Validasi.ValidasiHuruf;
import Validasi.ValidasiMinUang;
public class AccountApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String namaStr, idStr, depositStr, pilihMenuStr, uangTabungStr, uangAmbilStr = null;
		int deposit, pilihMenu, uangTabung, uangAmbil;
		boolean cek = false;
		
		System.out.print("Masukan Nama            : ");
		namaStr = scan.next();
		System.out.print("Masukan Nomor Identitas : ");
		idStr = scan.next();
		System.out.print("Masukan Deposit pertama : ");
		depositStr = scan.next();
		deposit = Integer.parseInt(depositStr);
		Account acc1 = new Account(namaStr,idStr,deposit);
		acc1.selamatDatang();
		
		System.out.println();
		System.out.println("Menu");
		System.out.println("1. Cek Saldo");
		System.out.println("2. Menabung");
		System.out.println("3. Mengambil");
		System.out.println();
		
		while(cek == false) {
			System.out.println();
			System.out.print("Pilih Menu : ");
			pilihMenuStr = scan.next();
			pilihMenu = Integer.parseInt(pilihMenuStr);
			if (pilihMenu == 1) {
				acc1.cekSaldo();
			}else if (pilihMenu == 2) {
				cek = true;
				do {
					System.out.print("Masukan besar uang yang akan ditabungkan : Rp. ");
					uangTabungStr = scan.next();
					cek = ValidasiHuruf.validasiHuruf(uangTabungStr);
					cek = ValidasiMinUang.validasiMinUang(uangTabungStr, cek);
				}while(cek == true);
				uangTabung = Integer.parseInt(uangTabungStr);
				acc1.menabung(uangTabung);
				acc1.tambahTabungan();
			}else if (pilihMenu == 3) {
				System.out.print("Masukan besar uang yang akan diambil : Rp. ");
				uangAmbilStr = scan.next();
				uangAmbil = Integer.parseInt(uangAmbilStr);
				acc1.ambilTabungan(uangAmbil);
				acc1.tabunganAmbil();
			}
			cek = false;
		}
	}

	

	

}
