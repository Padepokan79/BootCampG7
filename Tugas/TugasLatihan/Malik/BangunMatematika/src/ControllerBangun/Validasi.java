package ControllerBangun;

import java.util.Scanner;
public class Validasi {
	static Scanner scan = new Scanner(System.in);
	String pilihan;
	
	public Validasi() {}
		/// Method untuk proses validasi anti huruf
		public static void validasiAntiHurufMenu(String pilihan) {
			if(!pilihan.matches("([0-9])*")) {
				System.out.println("Inputan menu harus angka");
			}
		}
		
		/// Method untuk proses validasi batas inputan pada menu
		public static boolean validasiBatasInputMenu(String pilihan, boolean cek) {
			if (pilihan.matches("(-?[0-9])*")) {
				if (Integer.parseInt(pilihan) > 0 && Integer.parseInt(pilihan) < 5) {
					cek = true;	
				}else {
					cek = false;
					if (Integer.parseInt(pilihan) < 1) {
						System.out.println("Inputan menu tidak boleh kurang dari 1");
					}else {
						System.out.println("Inputan menu tidak boleh lebih dari 4");
					}
				}
			}
			return cek;
		}
		
		/// Method untuk proses validasi angka tidak boleh dibawah 1
		public static boolean validasiDibawahSatu(String sisiStr, boolean cek) {
			if (sisiStr.matches("(-?[0-9])*")) {
				if (Integer.parseInt(sisiStr) > 0) {
					cek = true;	
				}else {
					cek = false;
					if (Integer.parseInt(sisiStr) < 1) {
						System.out.println("Inputan menu tidak boleh kurang dari 1");
					}
				}
			}
			return cek;
		}
		
		/// Method untuk proses input validasi
		public static double inputValidasi(String pertanyaan, String inputStr, boolean cek, double input) {
			do {
				System.out.print(pertanyaan);
				inputStr = scan.next();
				cek = validasiDibawahSatu(inputStr, cek);
				validasiAntiHurufMenu(inputStr);
			}while(cek == false);
			
			input = Double.parseDouble(inputStr);
			return input;
		}
		
		/// Method untuk proses input validasi menu
		public static int inputValidasiMenu(boolean cek) {
			String pilihan;
			int pilihanInt;
			do {
				System.out.print("Pilih Menu (1-4): ");
				pilihan = scan.next();
				Validasi.validasiAntiHurufMenu(pilihan);
				cek = Validasi.validasiBatasInputMenu(pilihan, cek);	
			}while(cek == false);
			
			pilihanInt = Integer.parseInt(pilihan);
			return pilihanInt;
		}
}
