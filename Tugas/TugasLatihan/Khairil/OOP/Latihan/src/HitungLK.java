import java.util.Scanner;
import validasi.*;
import luasKeliling.*;

public class HitungLK {

	private static Scanner input;

	public static void main(String[] args) {
		String inputanPil, inputanMenu, inputanSisi, inputanPanjang, inputanLebar, inputanJari, inputanAlas, inputanTinggi;
		int inputanPilih, inputanMen, inputanSisiInt, inputanPanjangInt, inputanLebarInt, inputanJariInt, inputanAlasInt, inputanTinggiInt;
		boolean cek = false;
		ValidAngka valAngka = new ValidAngka();
		Lingkaran ling = new Lingkaran();
		Segitiga tiga = new Segitiga();
		SegiEmpat empat = new SegiEmpat();
		input = new Scanner(System.in);
		inputanMenu = inputanSisi = inputanPanjang = inputanLebar = inputanPil = "";
		inputanMen = inputanSisiInt = inputanAlasInt = inputanTinggiInt = inputanPilih = 0;
		inputanPanjangInt = inputanLebarInt = 0;
		
		System.out.println("Silahkan Pilih : ");
		System.out.println("1. Bujur Sangkar");
		System.out.println("2. Lingkaran");
		System.out.println("3. Segitiga");
		System.out.println("4. Persegi Panjang");
		while(cek == false) {
			System.out.println("Input pilihan anda:");
			inputanMenu = input.nextLine();
			
			if(valAngka.harusAngka(inputanMenu, cek)) {
				cek = true;
				if(inputanMen < 1 && inputanMen > 4) {
					System.out.println("Inputan salah.");
					System.out.println("Coba lagi");
					cek = false;					
				}
				else {
					cek = true;
				}
			}
			else {
				System.out.println("Inputan harus angka.");
				System.out.println("Coba lagi");				
				cek = false;
			}
		}
		inputanMen = Integer.parseInt(inputanMenu);
		
		if(inputanMen == 1) {
			System.out.println("Segiempat");
			while(cek == true) {
				System.out.println("Input sisi:");
				inputanSisi = input.nextLine();
				if(valAngka.harusAngka(inputanSisi, cek)) {
					inputanSisiInt = Integer.parseInt(inputanSisi);
					System.out.println("Silahkan Pilih : ");
					System.out.println("1. Luas");
					System.out.println("2. Keliling");
					inputanPil = input.nextLine();
					if(valAngka.harusAngka(inputanPil, cek)) {
						inputanPilih = Integer.parseInt(inputanPil);
						if(inputanPilih == 1) {
							empat.luasSegiEmpat(inputanSisiInt);
							empat.printLuasSegiEmpat();
							cek = false;
						}
						else if(inputanPilih == 2) {
							empat.kelilingSegiEmpat(inputanSisiInt);
							empat.printKelilingSegiEmpat();
							cek = false;
						}
					}
					else {
						System.out.println("Inputan harus angka.");
						System.out.println("Coba lagi");				
						cek = true;						
					}
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}
		}
		else if(inputanMen == 2) {
			System.out.println("Lingkaran");
			while(cek == true) {
				System.out.println("Input jari:");
				inputanJari = input.nextLine();
				if(valAngka.harusAngka(inputanJari, cek)) {
					inputanJariInt = Integer.parseInt(inputanJari);
					System.out.println("Silahkan Pilih : ");
					System.out.println("1. Luas");
					System.out.println("2. Keliling");
					inputanPil = input.nextLine();
					if(valAngka.harusAngka(inputanPil, cek)) {
						inputanPilih = Integer.parseInt(inputanPil);
						if(inputanPilih == 1) {
							ling.luasLingkaran(inputanJariInt);
							ling.printLuasLingkaran();
							cek = false;
						}
						else if(inputanPilih == 2) {
							ling.kelilingLingkaran(inputanJariInt);
							ling.printKelilingLingkaran();
							cek = false;
						}
					}
					else {
						System.out.println("Inputan harus angka.");
						System.out.println("Coba lagi");				
						cek = true;						
					}					
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}				
			cek = true;
		}
		else if(inputanMen == 3) {
			System.out.println("Segitiga");
			while(cek == true) {
				System.out.println("Input alas : ");
				inputanAlas = input.nextLine();
				if(valAngka.harusAngka(inputanAlas, cek)) {
					inputanAlasInt = Integer.parseInt(inputanAlas);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}
				System.out.println("Input tinggi : ");
				inputanTinggi = input.nextLine();
				if(valAngka.harusAngka(inputanTinggi, cek)) {
					inputanTinggiInt = Integer.parseInt(inputanTinggi);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}	
			System.out.println("Silahkan Pilih : ");
			System.out.println("1. Luas");
			System.out.println("2. Keliling");
			inputanPil = input.nextLine();
			if(valAngka.harusAngka(inputanPil, cek)) {
				inputanPilih = Integer.parseInt(inputanPil);
				if(inputanPilih == 1) {
					tiga.luasSegitiga(inputanAlasInt, inputanTinggiInt);
					tiga.printLuasSegitiga();
					cek = false;
				}
				else if(inputanPilih == 2) {
					tiga.kelilingSegitiga(inputanAlasInt);
					tiga.printKelilingSegitiga();
					cek = false;
				}
			}
			else {
				System.out.println("Inputan harus angka.");
				System.out.println("Coba lagi");				
				cek = true;						
			}
			cek = true;
		}
		else if(inputanMen == 4) {
			System.out.println("Persegi Panjang");
			while(cek == true) {
				System.out.println("Input Panjang : ");
				inputanPanjang = input.nextLine();
				if(valAngka.harusAngka(inputanPanjang, cek)) {
					inputanPanjangInt = Integer.parseInt(inputanPanjang);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}
				System.out.println("Input Lebar : ");
				inputanLebar = input.nextLine();
				if(valAngka.harusAngka(inputanLebar, cek)) {
					inputanLebarInt = Integer.parseInt(inputanLebar);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}
			
			if(valAngka.harusAngka(inputanPil, cek)) {
				inputanPilih = Integer.parseInt(inputanPil);
				if(inputanPilih == 1) {
					empat.luasSegiPanjang(inputanPanjangInt, inputanLebarInt);
					empat.printLuasSegiPanjang();
					cek = false;
				}
				else if(inputanPilih == 2) {
					empat.kelilingSegiPanjang(inputanPanjangInt, inputanLebarInt);					
					empat.printKelilingSegiPanjang();
					cek = false;
				}
			}
			else {
				System.out.println("Inputan harus angka.");
				System.out.println("Coba lagi");				
				cek = true;						
			}
			cek = true;
		}
		else {
			cek = false;
			System.out.println("Inputan salah.");
			System.out.println("Coba lagi");
		}
	}
}
