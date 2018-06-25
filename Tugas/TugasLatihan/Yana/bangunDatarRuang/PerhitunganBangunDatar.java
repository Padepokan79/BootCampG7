package bangunDatarRuang;

import java.util.Scanner;
public class PerhitunganBangunDatar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String 	inputMenu, masukan;
		boolean validasi = false;
		//persegi
		int 	inputSisi, inputPanjang, inputLebar;
		//lingkaran
		int 	inputr;
		double 	inputphi;
		//segitiga
		int 	inputSisi1, inputSisi2, InputSisi3;
		
		do {
			System.out.println("Perhitungan Bangun Datar");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Lingkaran");
			System.out.println("4. Segitiga");
			System.out.println("===============================");
			System.out.print("Masukkan pilihan anda: ");
			inputMenu = input.nextLine();
			System.out.println();
			//validasi
			if (inputMenu.matches("[0-9]+")) {
				if (Integer.parseInt(inputMenu) > 0 && Integer.parseInt(inputMenu) < 5) {
					validasi = true;
				}
				else {
					System.out.println();
					System.out.println("Gunakan angka 1-4");
					System.out.println();
				}
			}
			else {
				System.out.println();
				System.out.println("Tidak boleh kosong/menggunakan huruf");
				System.out.println();
			}
		}while(validasi == false);
		
		validasi = false;
			
			if (inputMenu.equals("1")) {
				SegiEmpat segiempat = new SegiEmpat();
				//Persegi
				do {
					System.out.print("Masukkan sisi: ");
					masukan = input.nextLine();
					validasi = validasiInput(validasi, masukan);
				}while(validasi == false);
				
				//inisialisasi
				inputSisi = Integer.parseInt(masukan);
				segiempat.sisiSE 		= inputSisi;
				
				//menghitung dan printluas persegi
				System.out.println();
				segiempat.luasPersegi();
				segiempat.printLuasPersegi();
				
				//menghitung keliling persegi
				segiempat.kelililingPersegi();
				segiempat.printKelilingPersegi();
			}
			else if (inputMenu.equals("2")) {
				SegiEmpat segiempat = new SegiEmpat();
				//persegi panjang
				do {
					System.out.print("Masukkan panjang: ");
					masukan = input.nextLine();
					validasi = validasiInput(validasi, masukan);
				} while (validasi == false);
				inputPanjang = Integer.parseInt(masukan);
				
				do {
					System.out.print("Masukkan lebar: ");
					masukan = input.nextLine();
					validasi = validasiInput(validasi, masukan);
				} while (validasi == false);
				inputLebar = Integer.parseInt(masukan);
				
				//inisialisasi
				segiempat.panjangSE 	= inputPanjang;
				segiempat.lebarSE 		= inputLebar;
				
				//menghitung luas persegi panjang
				System.out.println();
				segiempat.luasPersegiPanjang();
				segiempat.printLuasPersegiPanjang();
				
				//menghitung keliling persegi panjang
				segiempat.kelilingPersegiPanjang();
				segiempat.printKelilingPersegiPanjang();
			}
			else if (inputMenu.equals("3")) {
				Lingkaran lingkaran = new Lingkaran();
				//lingkaran
				do {
					System.out.print("Masukkan Jari-jari: ");
					masukan = input.nextLine();	
					validasi = validasiInput(validasi, masukan);
				} while (validasi == false);
				inputr = Integer.parseInt(masukan);
				inputphi = 3.14;
				
				//inisialisasi
				lingkaran.phiL 	= inputphi;
				lingkaran.rL 	= inputr;
				
				//menghitung dan cetak luas lingkaran
				System.out.println();
				lingkaran.luasLingkaran();
				lingkaran.printLuasLingkaran();
				
				//menghitung dan cetak keliling lingkaran
				lingkaran.kelilingLingkaran();
				lingkaran.printKelilingLingkaran();
			}
			else if (inputMenu.equals("4")) {
				SegiTiga segitiga 	= new SegiTiga();
				//segitiga
				do {
					System.out.print("Masukkan Sisi A: ");
					masukan = input.nextLine();	
					validasi = validasiInput(validasi, masukan);
				} while (validasi == false);
				inputSisi1 = Integer.parseInt(masukan);
				
				do {
					System.out.print("Masukkan Sisi B: ");
					masukan = input.nextLine();	
					validasi = validasiInput(validasi, masukan);
				} while (validasi == false);
				inputSisi2 = Integer.parseInt(masukan);
				
				do {
					System.out.print("Masukkan Sisi C: ");
					masukan = input.nextLine();	
					validasi = validasiInput(validasi, masukan);
				} while (validasi == false);
				InputSisi3 = Integer.parseInt(masukan);
				
				//inisialisasi
				segitiga.sisiST1 = inputSisi1;
				segitiga.sisiST2 = inputSisi2;
				segitiga.sisiST3 = InputSisi3;
				
				//menghitung dan cetak luas segitiga
				segitiga.luasSegitiga();
				segitiga.printLuasSegitig();
				
				//menghitung dan cetak keliling segitiga
				segitiga.kelilingSegitiga();
				segitiga.printKelilingSegitiga();
			}
	}

	private static boolean validasiInput(boolean validasi, String masukan) {
		if(masukan.matches("[0-9]+") && !masukan.matches("-?[0-9]")){
			if (Integer.parseInt(masukan) > 0) {
				validasi = true;
			}
			else {
				System.out.println("Masukkan angka lebih dari 0");
			}
		}
		else {
			System.out.println("Tidak boleh memasukkan huruf / simbol");
		}
		return validasi;
	}
}
