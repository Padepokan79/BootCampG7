package Bangun;
import java.util.Scanner;

public class PerhitunganBangunDatar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//objek dengan konstaktor polos lebih ribet dan ketika variabel di objek jadi private
		//variabel tidak sembarangan dapat di panggil
		SegiEmpat se1 = new SegiEmpat();
		Lingkaran l1 = new Lingkaran();
		Segitiga s1 = new Segitiga();
		Validasi val = new Validasi();
		
		
		String pilih="", nilaiPLT="",menu="",ulang,pilihPersegi="1",pilihPerPanjang="2",pilihLingkaran="3", pilihSegitiga="4";
		boolean cek=false;
		
		do {
			menu="m";
			System.out.println("Perhitungan Bangun Datar");
			System.out.println("========================");
			System.out.println("1.Persegi");
			System.out.println("2.Persegi Panjang");
			System.out.println("3.Lingkaran");
			System.out.println("4.Segitiga");
			System.out.println("========================");
			System.out.print("Pilih Perhitungan : ");
			pilih = val.validasiInput(nilaiPLT, cek, menu);
			
			menu="p";
			if(pilih.equals(pilihPersegi) ) {
				System.out.print("Masukan Sisi Persegi :");
				nilaiPLT=val.validasiInput(nilaiPLT, cek, menu);
				se1.sisi = Double.parseDouble(nilaiPLT);
				se1.cariLKVPersegi(se1.sisi);
				se1.tampilPersegiLK();
			}
			
			else if(pilih.equals(pilihPerPanjang)) {
				System.out.print("Masukan Panjang Persegi Panjang:");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				se1.panjang = Double.parseDouble(nilaiPLT);
				System.out.print("Masukan Lebar Persegi Panjang :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				se1.lebar= Double.parseDouble(nilaiPLT);
				se1.cariLKPersegiPanjang(se1.panjang, se1.lebar);
				se1.tampilPersegiPanjangLK();
			}
			else if(pilih.equals(pilihLingkaran)) {
				System.out.print("Masukan jari-jari :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				l1.jari2 = Double.parseDouble(nilaiPLT);
				l1.cariLuasLingkaran(l1.jari2);
				l1.tampilLuasLingkaran();
			}
			else if(pilih.equals(pilihSegitiga)) {
				System.out.print("Masukan Alas   :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				s1.alas = Double.parseDouble(nilaiPLT);
				System.out.print("Masukan Tinggi :");
				nilaiPLT= val.validasiInput(nilaiPLT, cek, menu);
				s1.tinggi = Double.parseDouble(nilaiPLT);
				s1.cariLuasSegitiga(s1.alas, s1.tinggi);
				s1.tampilLuasSegitiga();
			}
			
			System.out.print("Coba lagi (y/n)??");
			ulang =keyboard.next();
		}while(ulang.equals("y"));
	}
}
