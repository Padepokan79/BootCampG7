package test2;

import java.util.Scanner;

public class Segitiga {
	int tinggi, alas, luas, kel, s1, s2, s3;
	String bangunan;
	
	public Segitiga() {
		
	}

// proses hitung luas dan keliling segitiga
	void segitiga(int t, int si1, int si2, int si3) {
		tinggi = t;
		s1 = si1;
		s2 = si2;
		s3 = si3;
		
		luas = (s1*tinggi)/2;
		kel = s1 + s2 + s3;
	}

// output
	void text(String a) {
		bangunan = a;
		System.out.println("Keliling "+bangunan+" Adalah: "+kel);
		System.out.println("Luas "+bangunan+" Adalah: "+luas);
	}

// tanya luas atau keliling yang ingin ditampilkan
	void tanyaLuas(String bgn) {
		Scanner scaning = new Scanner(System.in);
		String tanya;
		System.out.print("Pilih Luas / Keliling: ");
		tanya = scaning.next();
		
		bangunan = bgn;
		if(tanya.equals("Luas")) {
			System.out.println("Luas "+bangunan+" Adalah: "+luas);
		} else {
			System.out.println("Keliling "+bangunan+" Adalah: "+kel);
		}
		
	}
}
