/*
created by : malik chaudhary
time : 09-05-2018 2:59PM
soal :
sebuah perusahaan majalah ternama di dunia, mengadakan rekruitmen untuk calon model baru pria. 
adapun syarat yang mereka ajukan yang harus dipenuhi oleh para calon pelamarnya, diantaranya minimal tinggi 175 cm, tampan, 
warna kulit tidak terlalu diperhatikan.

penampilan 7

*/

import java.util.Scanner;
public class SoalMalikBoolean1{
	public static void main(String[] args){
		int tinggi, minTinggi, minTampan;
		boolean tampan;
		String warna, kulitHitam, kulitPutih, kulitCoklat;
		boolean hasil;

		minTinggi = 175;
		minTampan = 7;

		Scanner soal1 = new Scanner(System.in);

		System.out.println("===========================");
		System.out.println("      CALON MODEL BARU     ");
		System.out.println("===========================");
		System.out.println();
		System.out.print("Tinggi badan : ");
		tinggi = soal1.nextInt();
		System.out.print("Seberapa tampan anda ( skala 0 - 10 ) : ");
		tampan = soal1.nextDouble();
		System.out.print("Warna kulit (Hitam, Putih, Coklat): ");
		warna = soal1.next();

		kulitHitam = warna.equals("Hitam");
		kulitPutih = warna.equals("Putih");
		kulitCoklat = warna.equals("Coklat");

		hasil = ( tinggi >= minTinggi && tampan >= minTampan && ( kulitPutih || kulitHitam || kulitCoklat ) );

		System.out.print("-----------------------------");
		System.out.print("Apakah anda diterima ? "+hasil);
		System.out.print("-----------------------------");


	}
}