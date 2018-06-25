package perhitunganBangun;

import java.util.Scanner;

public class PerhitunganBangunDatarV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		String menu, jawab ;
		int valid=0, validasi=1, menuInt=0;
		double panjangInt=0, lebarInt=0, tinggiInt=0, sisiInt, jari2Int=0, phi=0, alasInt=0;
		
		SegiEmpat object1 = new SegiEmpat();
		Lingkaran object2 = new Lingkaran();
		SegiTiga object3 = new SegiTiga();
		Validasi vld = new Validasi();
		
		
		
		
		do {
			do {
				do {
					System.out.println("MENGHITUNG BANGUN DATAR");
					System.out.println("1. Persegi");
					System.out.println("2. Persegi Panjang");
					System.out.println("3. Lingkaran");
					System.out.println("4. Segitiga");
					System.out.println();
					System.out.println("Pilih menu : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						menuInt = Integer.parseInt(menu);
						if (!(menuInt>=1 && menuInt<=4)) {
							System.out.println("nilai yang anda masukan melebihi indeks");
							valid =0;
						}
					}
					else
						valid+=1;
				} while (valid<validasi);
				
			} while (valid<validasi);
			
			valid = 0;
			//System.out.println(menuInt);
			if (menuInt==1) {
				menu ="";
				do {
					System.out.println("Masukan nilai sisi : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						panjangInt = Integer.parseInt(menu);
						valid+=1;
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				do {
					System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						menuInt = Integer.parseInt(menu);
						if (menuInt==1) {
							object1.luasPersegi(panjangInt);
							valid+=1;
						}
						else if (menuInt==2) {
							object1.kelilingPersegi(panjangInt);
							valid+=1;
						}
						else if (menuInt>2) {
							valid=0;
						}
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				
			}
			else if (menuInt==2) {
				menu ="";
				do {
					System.out.println("Masukan nilai panjang : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						panjangInt = Integer.parseInt(menu);
						valid+=1;
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				do {
					menu="";
					System.out.println("Masukan nilai lebar : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						lebarInt = Integer.parseInt(menu);
						valid+=1;
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				do {
					System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						menuInt = Integer.parseInt(menu);
						if (menuInt==1) {
							object1.luasPersegiPanjang(lebarInt, panjangInt);
							valid+=1;
						}
						else if (menuInt==2) {
							object1.kelilingPersegiPanjang(panjangInt, lebarInt);
							valid+=1;
						}
						else if (menuInt>2) {
							valid=0;
						}
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				
			}
			else if (menuInt==3) {
				menu ="";
				do {
					System.out.println("Masukan nilai jari-jari : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						jari2Int = Integer.parseInt(menu);
						if (jari2Int%7==0) {
							phi = 22.0/7.0;
						}
						else {
							phi = 3.14;
						}
						valid+=1;
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				do {
					System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
					menu = key.next();
					if (menu.matches("-?[0-9]+")) {
						menuInt = Integer.parseInt(menu);
						if (menuInt==1) {
							object2.printLuasLingkaran(phi, jari2Int);
							valid+=1;
						}
						else if (menuInt==2) {
							object2.printKelilingLingkaran(phi, jari2Int);
							valid=1;
						}
						else if (menuInt>2) {
							valid=0;
						}
					}
					else {
						System.out.println("Masukan harus berupa angka");
						valid=0;
					}
				} while (valid<validasi);
			}
			else if (menuInt==4) {
				menu ="";
				do {
					System.out.println("Masukan nilai alas/sisi : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						alasInt = Integer.parseInt(menu);
						valid+=1;
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				
				do {
					menu="";
					System.out.println("Masukan nilai tinggi : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					if (valid==1) {
						tinggiInt = Integer.parseInt(menu);
						valid+=1;
					}
					else {
						valid=0;
					}
				} while (valid<validasi);
				
				do {
					System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
					menu = key.next();
					if (menu.matches("-?[0-9]+")) {
						menuInt = Integer.parseInt(menu);
						if (menuInt==1) {
							object3.printLuasSegitiga(alasInt, tinggiInt);
							valid+=1;
						}
						else if (menuInt==2) {
							object3.printKelilingSegitiga(alasInt);
							valid=1;
						}
						else if (menuInt>2) {
							valid=0;
						}
					}
					else {
						System.out.println("Masukan harus berupa angka");
						valid=0;
					}
				} while (valid<validasi);
		}
			
			System.out.println();
			System.out.println("Tulis \"ya\" jika ingin melanjutkan menghitung bangun ruang ? ");
			jawab = key.next();
		} while (jawab.equals("ya")||jawab.equals("iya")||jawab.equals("lanjut"));

	}

}
