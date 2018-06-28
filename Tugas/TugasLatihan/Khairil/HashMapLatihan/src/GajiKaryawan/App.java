package GajiKaryawan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	
	public Karyawan karyawan;
	public Programmer programmer;
	public Tester tester;
	public Analis analis;
	public Pph pph;
	private static Scanner input;
	private static Scanner input1;
	private static Scanner input2;

	public static void main(String[] args) {
		String inputNama, inputLokasiKerja, inputPosisi, inputSkill, inputStatus; 
		int inputNip, inputPengalaman, inputJamLembur, inputFixBug, inputTestCase;
		double total = 0;
		
		inputFixBug = inputTestCase = 0;
		
		input = new Scanner(System.in);
		input1 = new Scanner(System.in);
		input2 = new Scanner(System.in);
		
		System.out.print("Posisi \t\t : ");
		inputPosisi = input1.nextLine();
		System.out.println("Cek Gaji Karyawan " + inputPosisi);
		System.out.println();
		System.out.print("NIP \t\t : ");
		inputNip = input.nextInt();
		System.out.print("Nama \t\t : ");
		inputNama = input1.nextLine();
		System.out.print("Status (Kawin/Tidak Kawin) : ");
		inputStatus = input2.nextLine();
		System.out.print("Lokasi Kerja \t : ");
		inputLokasiKerja = input2.nextLine();
		System.out.print("Skill (Junior/Middle/Senior) : ");
		inputSkill = input1.nextLine();
		System.out.print("Pengalaman Kerja : ");
		inputPengalaman = input2.nextInt();
		System.out.print("Jam Lembur \t : ");
		inputJamLembur = input2.nextInt();
		if(inputPosisi.equalsIgnoreCase("Programmer")) {
			System.out.print("Fix Bug \t : ");
			inputFixBug = input2.nextInt();			
		}
		else if(inputPosisi.equalsIgnoreCase("Tester")) {
			System.out.print("Test Case (min. 100) : ");
			inputTestCase = input2.nextInt();
		}
		else {
			System.out.println();
		}
		
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		Karyawan karyawan = new Karyawan(inputNama, inputLokasiKerja, inputNip);
		Programmer programmer = new Programmer(karyawan, inputJamLembur, inputFixBug);
		Tester tester = new Tester(karyawan, inputJamLembur, inputTestCase);
		Analis analis = new Analis(karyawan, inputJamLembur);
		
		Pph pph = new Pph();
		karyawan.setUmkKerja(inputPosisi, inputSkill);
		karyawan.setUmkKerja(inputPengalaman);
		karyawan.setUmkKerja(inputLokasiKerja);
		
		if(inputPosisi.equalsIgnoreCase("Programmer")) {
			programmer.bulanan();
			programmer.lemburan();
			programmer.bonusan();
			programmer.tunjang();
			programmer.getBPJSKesehatan(programmer.totHasil());
			programmer.getBPJSKetenagaKerjaan(programmer.totHasil());
			HashMap<String, String> summaryProgrammer = new LinkedHashMap<>();
			System.out.println(karyawan.toString());
			summaryProgrammer.put("", programmer.toString());
			summaryProgrammer.put("Total Gaji Kotor : Rp ", String.format("%.2f", programmer.getTotalGaji()));
			summaryProgrammer.put("Total Beban : Rp ", String.format("%.2f", programmer.getBebanGaji()));
			summaryProgrammer.put("Total Gaji Bersih : Rp ", String.format("%.2f", programmer.getTotalBersih()));
//			System.out.println(karyawan.toString());
//			System.out.println(programmer.toString());
//			System.out.println("Total Gaji Kotor : " + programmer.getTotalGaji());
//			System.out.println("Total Beban	\t : " + programmer.getBebanGaji());
//			System.out.println();
//			System.out.println("Total Gaji Bersih : " + programmer.getTotalBersih());
			double gajiSetahun = pph.hitungGajiSetahun( programmer.getTotalBersih());
			double hitungpph = pph.hitungPph(gajiSetahun, inputStatus);
			double hitungBulanPph = pph.pphBulanan(hitungpph);
			total = programmer.getTotalBersih() - hitungBulanPph;
			summaryProgrammer.put("Gaji yang diterima : Rp ", String.format("%.2f", total));
//			System.out.println("Gaji yang diterima : " + total);
			for(Map.Entry<String, String> summarize1 : summaryProgrammer.entrySet()) {
				System.out.println(summarize1.getKey() + "" + summarize1.getValue());
			}
		}
		else if(inputPosisi.equalsIgnoreCase("Tester")) {
			tester.bulanan();
			tester.lemburan();
			tester.bonusan();
			tester.tunjang();
			tester.getBPJSKesehatan(tester.totHasil());
			tester.getBPJSKetenagaKerjaan(tester.totHasil());
			HashMap<String, String> summaryTester = new LinkedHashMap<>();
			System.out.println(karyawan.toString());
			summaryTester.put("", tester.toString());
			summaryTester.put("Total Gaji Kotor : Rp ", String.format("%.2f", tester.getTotalGaji()));
			summaryTester.put("Total Beban : Rp ", String.format("%.2f", tester.getBebanGaji()));
			summaryTester.put("Total Gaji Bersih : Rp ", String.format("%.2f", tester.getTotalBersih()));
//			System.out.println(karyawan.toString());
//			System.out.println(tester.toString());
//			System.out.println("Total Gaji Kotor : " + tester.getTotalGaji());
//			System.out.println("Total Beban	\t : " + tester.getBebanGaji());
//			System.out.println();
//			System.out.println("Total Gaji Bersih : " + tester.getTotalBersih());
			double gajiSetahun = pph.hitungGajiSetahun( tester.getTotalBersih());
			double hitungpph = pph.hitungPph(gajiSetahun, inputStatus);
			double hitungBulanPph = pph.pphBulanan(hitungpph);
			total = tester.getTotalBersih() - hitungBulanPph;
			summaryTester.put("Gaji yang diterima : Rp ", String.format("%.2f", total));
//			System.out.println("Gaji yang diterima : " + total);
			for(Map.Entry<String, String> summarize2 : summaryTester.entrySet()) {
				System.out.println(summarize2.getKey() + "" + summarize2.getValue());
			}
		}
		else if(inputPosisi.equalsIgnoreCase("Analis")) {
			analis.bulanan();
			analis.lemburan();
			analis.tunjang();
			analis.getBPJSKesehatan(analis.totHasil());
			analis.getBPJSKetenagaKerjaan(analis.totHasil());
			HashMap<String, String> summaryAnalis = new LinkedHashMap<>();
			System.out.println(karyawan.toString());
			summaryAnalis.put("", analis.toString());
			summaryAnalis.put("Total Gaji Kotor : Rp ", String.format("%.2f", analis.getTotalGaji()));
			summaryAnalis.put("Total Beban : Rp ", String.format("%.2f", analis.getBebanGaji()));
			summaryAnalis.put("Total Gaji Bersih : Rp ", String.format("%.2f", analis.getTotalBersih()));
//			System.out.println(karyawan.toString());
//			System.out.println(analis.toString());
//			System.out.println("Total Gaji Kotor : " + analis.getTotalGaji());
//			System.out.println("Total Beban	\t : " + analis.getBebanGaji());
//			System.out.println();
//			System.out.println("Total Gaji Bersih : " + analis.getTotalBersih());
			double gajiSetahun = pph.hitungGajiSetahun( analis.getTotalBersih());
			double hitungpph = pph.hitungPph(gajiSetahun, inputStatus);
			double hitungBulanPph = pph.pphBulanan(hitungpph);
			total = analis.getTotalBersih() - hitungBulanPph;
			summaryAnalis.put("Gaji yang diterima : Rp ", String.format("%.2f", total));
//			System.out.println("Gaji yang diterima : " + total);
			for(Map.Entry<String, String> summarize3 : summaryAnalis.entrySet()) {
				System.out.println(summarize3.getKey() + "" + summarize3.getValue());
			}
		}
		else {
			System.out.println("Posisi yang dapat diakses hanya Programmer, Analis, dan Tester");
		}
		
	}

}
