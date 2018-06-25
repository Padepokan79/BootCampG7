package Menghitung;

import java.util.Scanner;

public class Tester {
	
	public Tester() {
		
	}
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BangunDatar bd = new BangunDatar();
		BangunRuang br = new BangunRuang();
		validasi validasi = new validasi();
		Tester tester = new Tester();
		
		String inputPilihan, namaBangun, kondisi, inputLanjut, pilihan, tampungNilai;
		String inputSisi, inputSisiA, inputSisiB, inputSisiC, inputPanjang, inputLebar, inputTinggi, inputJari;
		int conversiInputan, maxInput, minInput, conversiSisi;
		int persegi = 1, persegiPjg = 2, segitiga = 3, lingkaran = 4, kubus = 5, balok = 6, tabung = 7, bola = 8;  
		double sisi, panjang, lebar, alas, tinggi, jari;
		boolean status = false;
		
		conversiInputan = 0;
		maxInput 		= 8;
		minInput		= 1;
		inputPilihan	= namaBangun = "";
		inputSisi		= inputPanjang = inputLebar = inputSisiB = inputSisiC = inputTinggi = inputJari = tampungNilai = "";
		

		do {
			System.out.println("| Pilih untuk menghitung : ");
			System.out.println("");
			System.out.println("Bangun Datar");
			System.out.println("| [1] -> Persegi      [2] -> Persegi Panjang");
			System.out.println("| [3] -> Segitiga     [4] -> Lingkaran");

			System.out.println("");
			System.out.println("Bangun Ruang");
			System.out.println("| [5] -> Kubus        [6] -> Balok");
			System.out.println("| [7] -> Tabung       [8] -> Bola");
			kondisi = "menu";
			
			pilihan = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
			
			kondisi = "hitung";
				System.out.println("");
				if(pilihan.equals("1")) {
					System.out.println("Sisinya  :");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.sisi = Double.parseDouble(tampungNilai);
					bd.persegi(bd.sisi);
					
				}
				else if(pilihan.equals("2")) {
					System.out.print("Panjangnya : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.panjang = Double.parseDouble(tampungNilai);
					
					System.out.print("Lebar      : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.lebar = Double.parseDouble(tampungNilai);
					bd.persegiPanjang(bd.panjang, bd.lebar);
					
				}
				else if(pilihan.equals("3")) {
					System.out.print("Sisi A   : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.sisiA = Double.parseDouble(tampungNilai);
					
					System.out.print("Sisi B   : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.sisiB = Double.parseDouble(tampungNilai);
					
					System.out.print("Sisi C   : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.sisiC = Double.parseDouble(tampungNilai);
					
					System.out.print("Tinggi   : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					bd.tinggi = Double.parseDouble(tampungNilai);
					bd.segitiga(bd.sisiA, bd.sisiB, bd.sisiC, bd.tinggi);
					
				}
				else if(pilihan.equals("4")) {
					namaBangun = "Lingkaran";
					System.out.print("Jari-Jarinya : ");
					inputJari = key.nextLine();
					validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);			
					bd.lingkaran(Integer.parseInt(inputJari));
					
				}
				else if(pilihan.equals("5")) {
					System.out.print("Sisinya : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.sisi = Double.parseDouble(tampungNilai);
					br.kubus(br.sisi);
					
				}
				else if(pilihan.equals("6")) {
					System.out.print("Panjangnya : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.panjang = Double.parseDouble(tampungNilai);
					
					System.out.print("Lebarnya   : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.lebar = Double.parseDouble(tampungNilai);
					
					System.out.print("Tingginya  : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.tinggi = Double.parseDouble(tampungNilai);
					br.balok(br.panjang, br.lebar, br.tinggi);
				}
				else if(pilihan.equals("7")) {
					namaBangun = "Tabung";
					System.out.print("Jari-Jarinya : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.jari = Double.parseDouble(tampungNilai);
					
					validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					System.out.print("Tingginya    : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.tinggi = Double.parseDouble(tampungNilai);
					br.tabung(br.jari, br.tinggi);
				}
				else if(pilihan.equals("8")) {
					namaBangun = "Bola";
					System.out.print("Jari-Jarinya : ");
					tampungNilai = validasi.validasiHuruf(inputPilihan, key, conversiInputan, status, kondisi);
					br.jari = Double.parseDouble(tampungNilai);

					br.bola(br.jari);
				}
				
				System.out.println("");
				
				do {
					System.out.println("Main lagi | Y/T | : ");
					inputLanjut = key.nextLine();
					
					if(!inputLanjut.matches("[YT]*")) {
						System.out.println("Perintah tidak sesuai");
					}
					
				}while(!inputLanjut.matches("[YT]*"));
				
		}while(inputLanjut.equals("Y"));
		
	}

}
