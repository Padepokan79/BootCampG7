package perhitunganBangun;

import java.util.Scanner;

public class PerhitunganBangunDatar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		int  valid=0,validasi=1, kategoriSebenarnya, sisi, 
				pilihanSebenarnya, panjang, lebar, jari2, tinggi ;
		String kategori, pilihan;
		double phi;
		
		SegiEmpat object1 = new SegiEmpat();
		Lingkaran object2 = new Lingkaran();
		SegiTiga object3 = new SegiTiga();
		
		System.out.println("MENGHITUNG BANGUN DATAR");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Lingkaran");
		System.out.println("4. Segitiga");
		System.out.println();
		
//		sisi = key.nextInt();
//		persegi.persegi(sisi);
		
		
		do {
			System.out.println("Masukan kategori yang anda inginkan : ");
			kategori = key.next();
			if (kategori.matches("-?[0-9]+")) {
				kategoriSebenarnya = Integer.parseInt(kategori);
				do {
					if (kategoriSebenarnya<5) {
						if (kategoriSebenarnya==1) { //Persegi
							System.out.println("Masukan sisi yang diinginkan : ");
							sisi = key.nextInt();
							do {
								System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
								pilihan = key.next();
								if (pilihan.matches("-?[0-9]+")) {
									pilihanSebenarnya = Integer.parseInt(pilihan);
									if (pilihanSebenarnya==1) {
										object1.luasPersegi(sisi);
									}
									else if (pilihanSebenarnya==2) {
										object1.kelilingPersegi(sisi);
									}
									valid=1;
								}
								else {
									System.out.println("Masukan harus berupa angka");
									valid=0;
								}
							} while (valid<validasi);
						}
						else if (kategoriSebenarnya==2) { //PersegiPanjang
							do {
								System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
								pilihan = key.next();
								if (pilihan.matches("-?[0-9]+")) {
									pilihanSebenarnya = Integer.parseInt(pilihan);
									if (pilihanSebenarnya==1) {
										System.out.println("Masukan panjang yang diinginkan : ");
										panjang = key.nextInt();
										System.out.println("Masukan lebar yang diinginkan : ");
										lebar= key.nextInt();
										object1.luasPersegiPanjang(lebar, panjang);;
									}
									else if (pilihanSebenarnya==2) {
										System.out.println("Masukan panjang yang diinginkan : ");
										panjang = key.nextInt();
										System.out.println("Masukan lebar yang diinginkan : ");
										lebar= key.nextInt();
										object1.kelilingPersegiPanjang(panjang, lebar);
									}
									valid=1;
								}
								else {
									System.out.println("Masukan harus berupa angka");
									valid=0;
								}
							} while (valid<validasi);
						}
						else if (kategoriSebenarnya==3) { //Lingkaran
							do {
								System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
								pilihan = key.next();
								if (pilihan.matches("-?[0-9]+")) {
									pilihanSebenarnya = Integer.parseInt(pilihan);
									if (pilihanSebenarnya==1) {
										System.out.println("Masukan jari-jari yang diinginkan : ");
										jari2 = key.nextInt();
										if (jari2%7==0) {
											phi = 22/7;
										}
										else {
											phi = 3.14;
										}
										object2.printLuasLingkaran(phi, jari2);
									}
									else if (pilihanSebenarnya==2) {
										System.out.println("Masukan jari-jari yang diinginkan : ");
										jari2 = key.nextInt();
										if (jari2%7==0) {
											phi = 22/7;
										}
										else {
											phi = 3.14;
										}
										object2.printKelilingLingkaran(phi, jari2);
									}
									valid=1;
								}
								else {
									System.out.println("Masukan harus berupa angka");
									valid=0;
								}
							} while (valid<validasi);
						}
						else if (kategoriSebenarnya==4) { //Segitiga
							do {
								System.out.println("Masukan 1 untuk luas dan 2 untuk keliling");
								pilihan = key.next();
								if (pilihan.matches("-?[0-9]+")) {
									pilihanSebenarnya = Integer.parseInt(pilihan);
									if (pilihanSebenarnya==1) {
										System.out.println("Masukan alas yang diinginkan : ");
										sisi = key.nextInt();
										System.out.println("Masukan tinggi yang diinginkan : ");
										tinggi = key.nextInt();
										object3.printLuasSegitiga(tinggi, sisi);
									}
									else if (pilihanSebenarnya==2) {
										System.out.println("Masukan sisi yang diinginkan : ");
										sisi = key.nextInt();
										object3.printKelilingSegitiga(sisi);
									}
									valid=1;
								}
								else {
									System.out.println("Masukan harus berupa angka");
									valid=0;
								}
							} while (valid<validasi);
						}
						valid=1;
					}
					else {
						valid=0;
					} 
				} while (valid<validasi);
				valid=1;
			}
			else {
				System.out.println("Input diharuskan angka");
				valid=0;
			}
		} while (valid<validasi);
		
	}

}
