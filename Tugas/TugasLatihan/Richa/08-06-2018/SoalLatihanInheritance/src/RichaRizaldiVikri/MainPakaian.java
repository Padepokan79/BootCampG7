package RichaRizaldiVikri;

import java.util.Random;

public class MainPakaian {

	public static void main(String[] args) {
		
		String ukuran, warna, merek, jenisBahan, madeIn, cocok;
		double harga;
		
		Pakaian pk = new Pakaian ();
		Jaket jk = new Jaket("M", "pink", "adidas", "katun", "china", 100000, "tertutup");
		
		
		if (jk.getMerek().equals("nike") || jk.getMerek().equals("adidas")) {
			jk.setHarga(250000);
		}
		else {
			jk.setHarga (50000);
		}
		
		if (jk.getWarna().equals("pink") || jk.getWarna().equals ("kuning")) {
			cocok = "wanita";
		}
		else {
			cocok = "pria";
		}
		
		System.out.println(jk.printPakaian());
		if (jk.getUkuran().equals("S") || jk.getUkuran().equals ("M")) {
			jk.setHarga(jk.getHarga()-15000);
		}
		else if (jk.getUkuran().equals("L") || jk.getUkuran().equals ("XL")) {
			jk.setHarga(jk.getHarga()+10000);
		}
		

		System.out.println("Kecocokan: " + cocok);
		System.out.println("Harga final: " + jk.getHarga());
		
		System.out.println();
		
		
		Kaos ks = new Kaos("XL", "hitam", "zara", "plastik", "japan", 400000, "panjang");
		
		if (ks.getMerek().equals("nike") || ks.getMerek().equals("adidas")) {
			ks.setHarga(250000);
		}
		else {
			ks.setHarga (50000);
		}
		
		if (ks.getWarna().equals("pink") || ks.getWarna().equals ("kuning")) {
			cocok = "wanita";
		}
		else {
			cocok = "pria";
		}
		
		System.out.println(ks.printPakaian());
		if (ks.getUkuran().equals("S") || ks.getUkuran().equals ("M")) {
			ks.setHarga(ks.getHarga()-15000);
		}
		else if (ks.getUkuran().equals("L") || ks.getUkuran().equals ("XL")) {
			ks.setHarga(ks.getHarga()+10000);
		}
		

		System.out.println("Kecocokan: " + cocok);
		System.out.println("Harga final: " + ks.getHarga());
		

	}

}
