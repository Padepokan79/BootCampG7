package perhitunganBangun;

import java.util.Scanner;

public class PerhitunganBangunDatar {
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
			System.out.println("Perhitungan Bangun Datar");
			System.out.println();
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Lingkaran");
			System.out.println("4. Segitiga");
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
					System.out.println("Perhitungan Persegi");
					System.out.println("\t1. Hitung Luas");
					System.out.println("\t2. Hitung Keliling");
					System.out.print("Masukan: ");
					subMenu = inputKey.next();
					valid = vld.validate(subMenu, valid);
					if (valid==1) {
						subMenuInt = Integer.parseInt(subMenu);
						if(subMenuInt==1) {
							System.out.print("Luas: ");
							System.out.print("Masukan Nilai Sisi: ");
							s = inputKey.nextInt();
							System.out.println("Hasil Perhitungan");
							s4.luasPersegi(s);
							valid +=1 ;
						}else if(subMenuInt==2) {
							System.out.print("Keliling: ");
							System.out.print("Masukan Nilai Sisi: ");
							s = inputKey.nextInt();
							System.out.println("Hasil Perhitungan");
							s4.kelilingPersegi(s);
							valid +=1 ;
						}else {
							System.out.println("Menu Tidak Ada !!");
							valid = 0;
						}
					}else {
						valid = 0;
					}
				}else if (menuInt==2) {
					System.out.println("Perhitungan Persegi Panjang");
					System.out.println("\t1. Hitung Luas");
					System.out.println("\t2. Hitung Keliling");
					System.out.print("Masukan: ");
					subMenu = inputKey.next();
					valid = vld.validate(subMenu, valid);
					if (valid==1) {
						subMenuInt = Integer.parseInt(subMenu);
						if(subMenuInt==1) {
							System.out.print("Luas: ");
							System.out.print("Masukan Nilai Panjang: ");
							p = inputKey.nextInt();
							System.out.print("Masukan Nilai Lebar: ");
							l = inputKey.nextInt();
							System.out.println("Hasil Perhitungan");
							s4.luasPersegiPanjang(p, l);
							valid +=1 ;
						}else if(subMenuInt==2) {
							System.out.print("Keliling: ");
							System.out.print("Masukan Nilai Panjang: ");
							p = inputKey.nextInt();
							System.out.print("Masukan Nilai Lebar: ");
							l = inputKey.nextInt();
							System.out.println("Hasil Perhitungan");
							s4.kelilingPersegiPanjang(p, l);
							valid +=1 ;
						}else {
							System.out.println("Menu Tidak Ada !!");
							valid = 0;
						}
					}else {
						valid = 0;
					}
				}else if (menuInt==3) {
					System.out.println("Perhitungan Lingkaran");
					System.out.println("\t1. Hitung Luas");
					System.out.println("\t2. Hitung Keliling");
					System.out.print("Masukan: ");
					subMenu = inputKey.next();
					valid = vld.validate(subMenu, valid);
					if (valid==1) {
						subMenuInt = Integer.parseInt(subMenu);
						if(subMenuInt==1) {
							System.out.print("Luas: ");
							System.out.print("Masukan Nilai Jari-jari: ");
							r = inputKey.nextInt();
							if (r % 7 == 0) {
								p = 22.0/7.0;
							}else {
								p = 3.14;
							}
							lng.luasLingkaran(r, p);
							valid +=1 ;
						}else if(subMenuInt==2) {
							System.out.print("Keliling: ");
							System.out.print("Masukan Nilai Jari-jari: ");
							r = inputKey.nextInt();
							if (r % 7 == 0) {
								p = 22.0/7.0;
							}else {
								p = 3.14;
							}
							lng.kelilingLingkaran(r, p);
							valid +=1 ;
						}else {
							System.out.println("Menu Tidak Ada !!");
							valid = 0;
						}
					}else {
						valid = 0;
					}
				}else if (menuInt==4) {
					System.out.println("Perhitungan Segitiga");
					System.out.println("\t1. Hitung Luas");
					System.out.println("\t2. Hitung Keliling");
					System.out.print("Masukan: ");
					subMenu = inputKey.next();
					valid = vld.validate(subMenu, valid);
					if (valid==1) {
						subMenuInt = Integer.parseInt(subMenu);
						if(subMenuInt==1) {
							System.out.print("Luas: ");
							System.out.print("Masukan Nilai Sisi: ");
							s = inputKey.nextInt();
							s3.luasSegitiga(s, s);
							valid +=1 ;
						}else if(subMenuInt==2) {
							System.out.print("Keliling: ");
							System.out.print("Masukan Nilai Sisi: ");
							s = inputKey.nextInt();
							s3.kelillingSegitiga(s);
							valid +=1 ;
						}else {
							System.out.println("Menu Tidak Ada !!");
							valid = 0;
						}
					}else {
						valid = 0;
					}
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
