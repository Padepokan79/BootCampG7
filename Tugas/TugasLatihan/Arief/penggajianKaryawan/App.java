package penggajianKaryawan;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputKey = new Scanner(System.in);
		
		String nama, posisi, grade, tptKerja;
		int nik, masKer, lembur;
		
		System.out.print("Masukan Nama: ");
		nama = inputKey.next();
		System.out.print("Masukan NIK: ");
		nik = inputKey.nextInt();
		System.out.print("Posisi: ");
		posisi = inputKey.next();
		System.out.print("Grade Posisi: ");
		grade = inputKey.next();
		System.out.print("Masa Kerja: ");
		masKer = inputKey.nextInt();
		System.out.print("Penempatan Kerja: ");
		tptKerja= inputKey.next();
		
		Karyawan kry = new Karyawan(nama, nik);
		
		kry.setPosisi(posisi);
		kry.setGrade(grade);
		kry.setMasKerja(masKer);
		kry.setPenempatanKerja(tptKerja);
		
		kry.setUmkKerja(kry.getPosisi(), kry.getGrade());
		kry.setUmkKerja(kry.getMasKerja());
		kry.setUmkKerja(kry.getPenempatanKerja());
		if (posisi.equalsIgnoreCase("Programmer")) {
			System.out.print("Jumlah jam Lembur: ");
			lembur= inputKey.nextInt();
			Programmer prg = new Programmer(kry, 5, 100);
			prg.bulanan();
			prg.lemburan(lembur);
			prg.bonusan();
			prg.tunjang();
			prg.getBPJSKesehatan(prg.totHasil());
			prg.getBPJSKetenagaKerjaan(prg.totHasil());
			System.out.println(prg.toString());
		} else if (posisi.equalsIgnoreCase("Analis")) {
			Analis als = new Analis(kry, 5);
			als.bulanan();
			als.lemburan();
			als.bonusan();
			als.tunjang();
			als.getBPJSKesehatan(als.totHasil());
			als.getBPJSKetenagaKerjaan(als.totHasil());
			System.out.println(als.toString());
		} else if (posisi.equalsIgnoreCase("Tester")) {
			Tester tst = new Tester(kry, 5, 100);
			tst.bulanan();
			tst.lemburan();
			tst.bonusan();
			tst.tunjang();
			tst.getBPJSKesehatan(tst.totHasil());
			tst.getBPJSKetenagaKerjaan(tst.totHasil());
			System.out.println(tst.toString());
		} else {
			System.out.println("Diluar Jangkauan");
		}
//		System.out.println(kry.toString());
		

	}

}
