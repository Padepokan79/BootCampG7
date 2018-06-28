package rrv;

import java.util.*;

public class App {

	private static Scanner key;

	public static void main(String[] args) {
		key = new Scanner (System.in);
		Random rand = new Random();
//		String ukuran, jenisBahan, merek, madeIn, warna;
//		double hara;
//		
//		System.out.println("Masukan ukuran anda : ");
//		ukuran = key.next();
//		System.out.println("Masukan jenis bahan yang diingiakan : ");
//		jenisBahan = key.next();				
//		System.out.println("Masukan merek : ");
//		merek = key.next();
//		System.out.println("Masukan warna : ");
//		warna = key.next();
//		System.out.println("Masukan tempat produksi : ");
//		madeIn = key.next();
//		
//		if (merek.equals("nike")||merek.equals("adidas")) {
//			hara = 200000 + (50000 * rand.nextDouble());
//			System.out.println(hara);
//		}
//		else {
//			System.out.println("Masukan nilai Harga : ");
//			hara = key.nextDouble();
//		}
//		
//		Pakaian pakaian = new Pakaian(ukuran, jenisBahan);
//		Jaket jaket1 = new Jaket(pakaian, merek, madeIn, warna,hara); 
//
//		System.out.println();
//		System.out.println("Kategori pakaian sesuai warna :");
//		jaket1.kategoriWarna(jaket1.getWarna());
//		System.out.println("Kategori pakaian sesuai harga :");
//		jaket1.kategoriHarga(jaket1.getHarga());
//		System.out.println();
//		jaket1.kategoriUkuran(pakaian.getUkuran());
//		System.out.println(jaket1.printJaket());
////		
		
		String namaPenyakit, gejala, areaSakit, keparahan;
		char bpjs;
		
		System.out.println("Masukan nama penyakit : ");
		namaPenyakit = key.next();
		System.out.println();
		System.out.println("Masukan gejala penyakit : ");
		gejala = key.next();
		//flue.setNamaPenyakit(gejala);
		System.out.println();
		System.out.println("Masukan area sakit : ");
		areaSakit = key.next();
		//flue.setNamaPenyakit(areaSakit);
		System.out.println();
		System.out.println("Keparahan : ");
		keparahan = key.next();
		System.out.println();
		System.out.println("Apakah anda pengguna BPJS : ");
		bpjs = key.next().charAt(0);
		//flue.setNamaPenyakit(namaPenyakit);
		
		
		Penyakit penyakit1 = new Penyakit(namaPenyakit);
		Flue flue = new Flue(penyakit1,gejala, areaSakit, bpjs);
		
		System.out.println(flue.printFlue());
		System.out.print("Besaran biaya yang harus dibayarkan : ");
		System.out.println(flue.kategoriTingkatKeparahan(keparahan));
		System.out.print("Besaran biaya yang harus dibayarkan jika anda menggunakan BPJS : ");
		System.out.println(flue.kategoriAsuransi(bpjs, keparahan));
		
	}

}
