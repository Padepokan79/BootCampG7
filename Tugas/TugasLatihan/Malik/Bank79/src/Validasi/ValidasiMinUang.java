package Validasi;

import ControllBank.Account;

public class ValidasiMinUang {
	
	public ValidasiMinUang() {}
	
	// Validasi minimal pinjaman uang
	public static boolean validasiMinUang(String uangTabungStr, boolean cek) {
		if (uangTabungStr.matches("([0-9])*")) {
			if (Integer.parseInt(uangTabungStr) < 1000) {
				System.out.println("Uang tidak boleh kurang dari Rp. 1000");
				cek = true;
			}else {
				cek = false;
			}
		}
		return cek;
	}
	
	// validasi bila meminjam lebih dari saldo
	public static boolean validasiMaxPinjam(String uangTabungStr, boolean cek) {
		if (uangTabungStr.matches("([0-9])*")) {
			if (Integer.parseInt(uangTabungStr) > Account.saldoTabung) {
				System.out.println("Uang tidak boleh lebih dari saldo");
				cek = true;
			}else {
				cek = false;
			}
		}
		return cek;
	}
	
	// Validasi untuk pinjaman bilsa saldo 0
	public static boolean validasiPinjamHabis(String uangTabungStr, boolean cek) {
		if (uangTabungStr.matches("([0-9])*")) {
			if (uangTabungStr.equals("3")) {
				if (Account.saldoTabung == 0) {
					System.out.println("Anda tidak memiliki saldo,\nSilahkan menabung dahulu");
					cek = true;
				}
			}
		}
		return cek;
	}
}
