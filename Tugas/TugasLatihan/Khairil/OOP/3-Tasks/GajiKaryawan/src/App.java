import java.util.Scanner;
import backend.*;

public class App {
	
	public Karyawan karyawan;
	public Programmer programmer;
	public Tester tester;
	public Analis analis;
	public Pph pph;

	public static void main(String[] args) {
		String inputNama, inputLokasiKerja, inputPosisi, inputSkill, inputStatus; 
		int inputNip, inputPengalaman, inputJamLembur, inputFixBug, inputTestCase;
		double total = 0;
		
		inputFixBug = inputTestCase = 0;
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
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
			System.out.println(karyawan.toString());
			System.out.println(programmer.toString());
			System.out.println("Total Gaji Kotor : " + programmer.getTotalGaji());
			System.out.println("Total Beban	\t : " + programmer.getBebanGaji());
			System.out.println();
			System.out.println("Total Gaji Bersih : " + programmer.getTotalBersih());
			double gajiSetahun = pph.hitungGajiSetahun( programmer.getTotalBersih());
			double hitungpph = pph.hitungPph(gajiSetahun, inputStatus);
			double hitungBulanPph = pph.pphBulanan(hitungpph);
			total = programmer.getTotalBersih() - hitungBulanPph;
			System.out.println("Gaji yang diterima : " + total);
		}
		else if(inputPosisi.equalsIgnoreCase("Tester")) {
			tester.bulanan();
			tester.lemburan();
			tester.bonusan();
			tester.tunjang();
			tester.getBPJSKesehatan(tester.totHasil());
			tester.getBPJSKetenagaKerjaan(tester.totHasil());
			System.out.println(karyawan.toString());
			System.out.println(tester.toString());
			System.out.println("Total Gaji Kotor : " + tester.getTotalGaji());
			System.out.println("Total Beban	\t : " + tester.getBebanGaji());
			System.out.println();
			System.out.println("Total Gaji Bersih : " + tester.getTotalBersih());
			double gajiSetahun = pph.hitungGajiSetahun( tester.getTotalBersih());
			double hitungpph = pph.hitungPph(gajiSetahun, inputStatus);
			double hitungBulanPph = pph.pphBulanan(hitungpph);
			total = tester.getTotalBersih() - hitungBulanPph;
			System.out.println("Gaji yang diterima : " + total);
		}
		else if(inputPosisi.equalsIgnoreCase("Analis")) {
			analis.bulanan();
			analis.lemburan();
			analis.tunjang();
			analis.getBPJSKesehatan(analis.totHasil());
			analis.getBPJSKetenagaKerjaan(analis.totHasil());
			System.out.println(karyawan.toString());
			System.out.println(analis.toString());
			System.out.println("Total Gaji Kotor : " + analis.getTotalGaji());
			System.out.println("Total Beban	\t : " + analis.getBebanGaji());
			System.out.println();
			System.out.println("Total Gaji Bersih : " + analis.getTotalBersih());
			double gajiSetahun = pph.hitungGajiSetahun( analis.getTotalBersih());
			double hitungpph = pph.hitungPph(gajiSetahun, inputStatus);
			double hitungBulanPph = pph.pphBulanan(hitungpph);
			total = analis.getTotalBersih() - hitungBulanPph;
			System.out.println("Gaji yang diterima : " + total);
		}
		else {
			System.out.println("Posisi yang dapat diakses hanya Programmer, Analis, dan Tester");
		}
		
	}

}
