package BangunRuang;
import java.util.*;
public class Persegi {
	int sisi, luas, kel, panjang, lebar, tinggi, vol;
	String bangunan;

	public Persegi() {
		
	}

// proses hitung volume balok
	void balok(int p, int l, int t) {
		panjang = p;
		lebar = l;
		tinggi = t;
		
		vol = panjang * lebar * tinggi; 
	}

// proses hitung volume kubus
	void kubus(int sis) {
		sisi = sis;
		vol = sisi*sisi*sisi;
	}

// proses hitung keliling dan luas persegi
	void persegi(int s) {
		sisi = s;
		
		kel = sisi*4;
		luas = sisi*sisi;
	}

// proses hitung keliling dan luas  persegi panjang
	void persegiPanjang(int p, int l) {
		panjang = p;
		lebar = l;
		kel = 2*(panjang+lebar);
		luas = panjang*lebar;
	}

// tambahan outputan
	void text(String s) {
		bangunan = s;
		System.out.println("Volume "+bangunan+" Adalah: "+vol);
	}

// proses pertanyaan apakah luas atau keliling yang ingin ditampilkan
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
