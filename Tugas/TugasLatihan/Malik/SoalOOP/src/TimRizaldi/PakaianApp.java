package TimRizaldi;

import java.util.Random;
import java.util.Scanner;
public class PakaianApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand  = new Random();
		String ukuran, warna, merek, jenisBahan, madeIn;
		double harga=0;
		
		System.out.println();
		System.out.println("==============================");
		System.out.println("SELAMAT DATANG DI TOKO PAKAIAN");
		System.out.println("==============================");
		System.out.println();
//		System.out.print("Masukan ukuran       : ");
//		ukuran = scan.next();
//		System.out.print("Masukan warna        : ");
//		warna = scan.next();
//		System.out.print("Masukan jenis bahan  : ");
//		jenisBahan = scan.next();
//		System.out.print("Masukan madeIn       : ");
//		madeIn = scan.next();
//		System.out.print("Masukan merek        : ");
//		merek = scan.next();
//		System.out.print("Masukan Harga        : ");
//		harga = scan.nextDouble();
		
		int random = rand.nextInt(400000)+100000;
		Pakaian pk = new Pakaian("S", "hitam", "nike", "kulit", "indonesia", random);
		Jaket   jk = new Jaket(pk, "tebal", "ada");
		
		
		System.out.println("==================");
		System.out.println("     PAKAIAN");
		System.out.println("==================");
		pk.merek();
		pk.ukuran();
		System.out.println(pk.toTampil());System.out.println();
		System.out.println("Kategori harga\t: "+pk.nilai());
		System.out.println("Rekomendasi\t: "+pk.warna());
		
		System.out.println();
		System.out.println("==================");
		System.out.println("      JAKET");
		System.out.println("==================");
		System.out.println(jk.toTampil());System.out.println();
		System.out.println("Kategori harga\t: "+jk.nilai());
		System.out.println("Rekomendasi\t: "+jk.getPak().warna());
		
		
	}

}
