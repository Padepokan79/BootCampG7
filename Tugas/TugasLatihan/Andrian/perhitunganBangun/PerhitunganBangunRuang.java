package perhitunganBangun;

import java.util.Scanner;

public class PerhitunganBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		String menu, jawab ;
		int valid=0, validasi=1, menuInt=0;
		double panjangInt,lebarInt, tinggiInt, sisiInt, jari2Int, phi;
		
		SegiEmpat object1 = new SegiEmpat();
		Lingkaran object2 = new Lingkaran();
		SegiTiga object3 = new SegiTiga();
		Validasi vld = new Validasi();
		
		
		
		
		do {
			do {
				do {
					System.out.println("MENGHITUNG BANGUN RUANG");
					System.out.println("1. Balok");
					System.out.println("2. Kubus");
					System.out.println("3. Tabung");
					System.out.println("4. Bola");
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
					System.out.println("Masukan nilai panjang : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, validasi);
					panjangInt = Integer.parseInt(menu);
				} while (valid<validasi);
				do {
					System.out.println("Masukan nilai lebar : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					lebarInt = Integer.parseInt(menu);
				} while (valid<validasi);
				do {
					System.out.println("Masukan nilai tinggi : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					tinggiInt = Integer.parseInt(menu);
				} while (valid<validasi);
				object1.balok(panjangInt, lebarInt, tinggiInt);
			}
			else if (menuInt==2) {
				menu ="";
				do {
					System.out.println("Masukan nilai sisi : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, validasi);
					sisiInt = Integer.parseInt(menu);
				} while (valid<validasi);
				object1.kubus(sisiInt);
			}
			else if (menuInt==3) {
				menu ="";
				do {
					System.out.println("Masukan nilai tinggi : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, validasi);
					tinggiInt = Integer.parseInt(menu);
				} while (valid<validasi);
				do {
					System.out.println("Masukan nilai jari-jari : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					jari2Int = Integer.parseInt(menu);
				} while (valid<validasi);
				if (jari2Int%7==0) {
					phi = 22.0/7.0;
				}
				else {
					phi = 3.14;
				}
				object2.printTabung(tinggiInt, phi, jari2Int);
			}
			else if (menuInt==4) {
				menu ="";
				do {
					System.out.println("Masukan nilai jari-jari : ");
					menu = key.next();
					valid = vld.menuValidasi(menu, valid);
					jari2Int = Integer.parseInt(menu);
				} while (valid<validasi);
				if (jari2Int%7==0) {
					phi = 22.0/7.0;
				}
				else {
					phi = 3.14;
				}
				object2.printBola(phi, jari2Int);
			}
			
			System.out.println();
			System.out.println("Tulis \"ya\" jika ingin melanjutkan menghitung bangun ruang ? ");
			jawab = key.next();
		} while (jawab.equals("ya")||jawab.equals("iya")||jawab.equals("lanjut"));

	}

}
