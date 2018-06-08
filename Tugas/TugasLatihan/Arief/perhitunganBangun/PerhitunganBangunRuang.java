package perhitunganBangun;

import java.util.Scanner;

public class PerhitunganBangunRuang {
	private static Scanner inputKey;

	public static void main(String[] args) {
		inputKey = new Scanner(System.in);
		SegiEmpat s4 = new SegiEmpat();
		SegiTiga s3 = new SegiTiga();
		Validation vld = new Validation();
		Lingkaran lng = new Lingkaran();
		
		int valid, validation, menuInt, subMenuInt;
		double s, p, l, t, r, a;
		String menu, subMenu, restMenu, restart = "";

		subMenuInt = menuInt = valid = 0;
		s = p = l = t = r = a = 0;
		validation = 1;
		
		do {
			System.out.println("Perhitungan Bangun Ruang");
			System.out.println();
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Bola");
			System.out.println("4. Tabung");
			System.out.println();
		
			do {
				System.out.print("Pilih Menu: ");
				menu = inputKey.next();
				valid = vld.validate(menu, valid);
				if (valid==1) {
					menuInt = Integer.parseInt(menu);
					if(menuInt>4) {
						System.out.println("Menu Tidak Ada !!");
						valid = 0;
					}else {
						valid+=1;
					}
				}else {
					valid = 0;
				}
			} while (valid < validation);
			
			valid = 0;
			do {
				if (menuInt==1) {
					System.out.println("Volume Kubus");
							System.out.print("Masukan Nilai Sisi: ");
							s = inputKey.nextInt();
							System.out.println("Hasil Perhitungan");
							s4.volumeKubus(s);
							valid +=1 ;
				}else if (menuInt==2) {
					System.out.println("Volume Balok");
							System.out.print("Masukan Nilai Panjang: ");
							p = inputKey.nextInt();
							System.out.print("Masukan Nilai Lebar: ");
							l = inputKey.nextInt();
							System.out.print("Masukan Nilai Tinggi: ");
							t = inputKey.nextInt();
							System.out.println("Hasil Perhitungan");
							s4.volumeBalok(p, l, t);
							valid +=1 ;
				}else if (menuInt==3) {
					System.out.println("Volume Bola");
							System.out.print("Masukan Nilai Jari-jari: ");
							r = inputKey.nextInt();
							if (r % 7 == 0) {
								p = 22.0/7.0;
							}else {
								p = 3.14;
							}
							lng.bola(r, p);
							valid +=1 ;
				}else if (menuInt==4) {
					System.out.println("Volume Tabung");
							System.out.print("Masukan Nilai Jari-jari: ");
							r = inputKey.nextInt();
							System.out.print("Masukan Nilai Tinggi: ");
							t = inputKey.nextInt();
							if (r % 7 == 0) {
								p = 22.0/7.0;
							}else {
								p = 3.14;
							}
							lng.tabung(r, p, t);
							valid +=1 ;
				}
			} while (valid < validation);
			
			do {
				System.out.println("Restart program ?? (Y/T)");
				restMenu = inputKey.next();
				restMenu = vld.restValidate(restMenu);
				if (restMenu.equals("T")) {
					restart = "T";
				}else if (restMenu.equals("Y")) {
					restart = "Y";
				}
			} while (restMenu.equals("X"));
			
		} while (restart.equals("Y"));
			
		System.out.println("PROGRAM BERAKHIR");
	}
}
