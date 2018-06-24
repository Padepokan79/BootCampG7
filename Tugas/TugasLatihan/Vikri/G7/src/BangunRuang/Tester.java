package BangunRuang;

import java.util.*;
public class Tester {
	private static Scanner scan, input;

	public static void main(String[] args) {
		String bangunDatar;
		
		Persegi kotak = new Persegi();
		Lingkaran bulet = new Lingkaran();
		Segitiga segi= new Segitiga();
		Validate valid= new Validate();
		
		scan = new Scanner(System.in);
		input = new Scanner(System.in);
	
	// validasi bangun datar mana yang bisa dihitung luas dan kelilingnya
		do {
			System.out.print("Pilih Bangun Datar: ");
			bangunDatar = scan.nextLine();
			valid.valBangunRuang(bangunDatar);
		}while(valid.batas2 > 0);
				
		if(bangunDatar.equals("Persegi")) {
			String sisy;
			do {
				System.out.print("Masukan Jumlah sisi: ");
				 sisy = input.next();
				valid.valAngka(sisy);
			}while(valid.batas3 > 0);
			
			int sisiy = Integer.parseInt(sisy);
			kotak.persegi(sisiy);			
			kotak.tanyaLuas(bangunDatar);
		}else if(bangunDatar.equals("Persegi Panjang")) {
			String lebar, panjang;
			do {
				System.out.print("Masukan Jumlah Panjang: ");
				panjang = input.next();
				valid.valAngka(panjang);
			}while(valid.batas3 > 0);
			
			do {
				System.out.print("Masukan Jumlah Lebar: ");
				lebar = input.next();
				valid.valAngka(lebar);
			}while(valid.batas3>0);
			
			int l = Integer.parseInt(lebar);
			int p = Integer.parseInt(panjang);
			kotak.persegiPanjang(p, l);
			kotak.tanyaLuas(bangunDatar);
		} else if(bangunDatar.equals("Lingkaran")) {
			String jari;
			do {
				System.out.print("Masukan Jari: ");
				jari = input.next();
				valid.valAngka(jari);
			}while(valid.batas3>0);
			
			Double j = Double.parseDouble(jari);
			bulet.lingkaran(j);
			bulet.tanyaLuas(bangunDatar);
		} else if(bangunDatar.equals("Segitiga")) {
			String sisi1, sisi2, sisi3, tinggi;
			do {
				System.out.print("Masukan Sisi ke 1: ");
				sisi1 = input.next();
				valid.valAngka(sisi1);
			}while(valid.batas3>0);
			
			do {
				System.out.print("Masukan Sisi ke 2: ");
				sisi2 = input.next();
				valid.valAngka(sisi2);
			}while(valid.batas3>0);
			
			do {
				System.out.print("Masukan Sisi ke 3: ");
				sisi3 = input.next();
				valid.valAngka(sisi3);
			}while(valid.batas3>0);
			
			do {
				System.out.print("Masukan tinggi: ");
				tinggi = input.next();
				valid.valAngka(tinggi);
			}while(valid.batas3>0);
			
			int sisiSatu, sisiDua, sisiTiga, tg;
			sisiSatu = Integer.parseInt(sisi1);
			sisiDua= Integer.parseInt(sisi1);
			sisiTiga= Integer.parseInt(sisi1);
			tg = Integer.parseInt(tinggi);
			
			segi.segitiga(tg, sisiSatu, sisiDua, sisiTiga);
			segi.tanyaLuas(bangunDatar);
		} else {
			System.out.println("Ulang");
		}
	}
}
