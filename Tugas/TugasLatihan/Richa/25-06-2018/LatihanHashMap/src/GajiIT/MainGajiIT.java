package GajiIT;
/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.*;
import java.util.Map.Entry;

public class MainGajiIT {

	public static void main(String[] args) {
		
	//class yang diambil
	Scanner keyboard = new Scanner (System.in);
	Karyawan kar = new Karyawan();
	Programmer pg = new Programmer ();
	Analis sa = new Analis ();
	Tester ts = new Tester ();
	
	HashMap<String, Double> umkLocation = new HashMap<String, Double > ();

	umkLocation.put("Bandung", 3091345.56);
	umkLocation.put("Jakarta", 3648035.0);
	umkLocation.put("Karawang", 3919291.19);
	
	String nama, nik, penempatan, tingkat, bagian, apakahMenikah;
	int lamaKerja, fixBug=0, testCase=0, jamLembur;
	double gapok=0, tunjNikah =0, tunjTrans = 0, bonus=0, totalTunj, totalKotor = 0, totalBersih =0, totalGaji;
	
	
		
	System.out.println("==============================================");
	System.out.println("                GAJI KARYAWAN IT              ");
	System.out.println("==============================================");
	System.out.println("Data pegawai");
	System.out.print ("Masukkan nama\t:");
	nama = keyboard.nextLine();
	kar.setNama(nama);
	
	System.out.print("Masukkan NIK\t:");
	nik = keyboard.next();
	kar.setNik(nik);
	
	System.out.println("Penempatan kerja (Jakarta/Bandung/Karawang)");
	penempatan = keyboard.next();
	kar.setPenempatanKerja(penempatan);
	
	
	System.out.println("Tingkatan kerja (junior/middle/senior)");
	tingkat = keyboard.next();
	kar.setLvlKaryawan(tingkat);

	System.out.print("Lama berkerja (dalam tahun):");
	lamaKerja = keyboard.nextInt();
	kar.setMasaKerja(lamaKerja);
	
	System.out.print("Bagian (PG/SA/TS)\t: ");
	bagian = keyboard.next();
	kar.setBagianKaryawan(bagian);
	
	if (kar.getBagianKaryawan().equalsIgnoreCase ("PG")) {
		System.out.print("Berapa kali fixing bug? ");
		fixBug = keyboard.nextInt();
	}
	else if (kar.getBagianKaryawan().equalsIgnoreCase ("TS")) {
		System.out.print("Berapa kali testcase? ");
		testCase = keyboard.nextInt();
	}
	
	System.out.println("Masukkan jam lembur\t:");
	jamLembur = keyboard.nextInt();
	System.out.println("-----------------------------------------------");
	System.out.println("Data keluarga pegawai");
	System.out.println("Apakah anda sudah menikah? y/t");
	apakahMenikah = keyboard.next();
	System.out.println("-----------------------------------------------");
	System.out.println("Rincian Gaji");
	System.out.println("Nama: " + kar.getNama() + "\nNIK: " + kar.getNik());
	
	//MENGHITUNG GAJI POKOK
	System.out.print ("Gaji Pokok\t: Rp. ");
	if (kar.getBagianKaryawan().equalsIgnoreCase("PG")) {
		pg.setLvlKaryawan(kar.getLvlKaryawan());
		pg.setMasaKerja(kar.getMasaKerja());
		pg.setPenempatanKerja(kar.getPenempatanKerja());
		for(Map.Entry <String, Double> lokasi : umkLocation.entrySet()){  
			if (pg.getPenempatanKerja().equalsIgnoreCase(lokasi.getKey())) {
				gapok = pg.calculateGapok(lokasi.getValue());
			}
		}  
	}
	else if (kar.getBagianKaryawan().equalsIgnoreCase("SA")) {
		sa.setLvlKaryawan(kar.getLvlKaryawan());
		sa.setMasaKerja(kar.getMasaKerja());
		sa.setPenempatanKerja(kar.getPenempatanKerja());
		for(Map.Entry <String, Double> lokasi : umkLocation.entrySet()){  
			if (sa.getPenempatanKerja().equalsIgnoreCase(lokasi.getKey())) {
				gapok = sa.calculateGapok(lokasi.getValue());
			}
		}  
	}
	else if (kar.getBagianKaryawan().equalsIgnoreCase("TS")) {
		ts.setLvlKaryawan(kar.getLvlKaryawan());
		ts.setMasaKerja(kar.getMasaKerja());
		ts.setPenempatanKerja(kar.getPenempatanKerja());
		for(Map.Entry <String, Double> lokasi : umkLocation.entrySet()){  
			if (ts.getPenempatanKerja().equalsIgnoreCase(lokasi.getKey())) {
				gapok = ts.calculateGapok(lokasi.getValue());
			}
		}  
	}
	
	System.out.printf ("%.2f", gapok);
	System.out.println();
	
	//MENGHITUNG T.KELUARGA
	System.out.print ("T. Keluarga\t: Rp.  ");
	if (apakahMenikah.equalsIgnoreCase("y")) {
		boolean isMaried = true;
		tunjNikah = kar.TunjanganKeluarga(isMaried, gapok);
	}
	else if (apakahMenikah.equalsIgnoreCase("t")) {
		boolean isMaried = false;
		tunjNikah = kar.TunjanganKeluarga(isMaried, gapok);
	}
	
	System.out.printf("%.2f", tunjNikah);
	System.out.println();

	//MENGHITUNG TUNJANGAN PEGAWAI
	System.out.print("T. Pegawai\t: Rp.  ");
	System.out.println(kar.TunjanganPegawai());
	
	//MENGHITUNG TUNJANGAN TRANSPORT
	System.out.print ("T. Transport\t: Rp. ");
	if (kar.getPenempatanKerja().equalsIgnoreCase("Jakarta")) {
		tunjTrans = 1000000;
		System.out.println(tunjTrans);
	}
	else {
		tunjTrans = 0;
		System.out.println("\t\t" + tunjTrans);
	}
	
	
	//MENGHITUNG LEMBUR
	System.out.print ("Lembur\t\t: Rp.  ");
	System.out.println(kar.lembur(jamLembur, gapok));
	
	//MENGHITUNG BONUS
	System.out.print("Bonus\t\t: Rp.  ");
	if (kar.getBagianKaryawan().equalsIgnoreCase("PG")) {
		bonus = pg.bonus(fixBug);
		
	}
	else if (kar.getBagianKaryawan().equalsIgnoreCase("TS")) {
		bonus = ts.bonus(testCase);
	}
	System.out.println(bonus);
	
	//TOTAL TUNJANGAN
	totalTunj  = tunjNikah + tunjTrans + kar.TunjanganPegawai();
	
	//MENGHITUNG PENGHASILAN KOTOR
	System.out.print ("Total penghasilan kotor\t: Rp. ");
	System.out.printf ("%.2f", gapok + totalTunj+bonus+ kar.lembur(jamLembur, gapok));
	System.out.println();
	
	System.out.println("-----------------------------------------------");
	System.out.print ("Potongan BPJS Kesehatan\t\t: Rp. ");
	System.out.println(kar.bpjs(gapok+totalTunj));
	
	System.out.print("Potongan BPJS Ketenagakerjaan\t: Rp. ");
	System.out.println(kar.bpjs(gapok+totalTunj));
	
	totalBersih = gapok + totalTunj+bonus+ kar.lembur(jamLembur, gapok) - (2*kar.bpjs(gapok + totalTunj)) ;
	System.out.print("Potongan PPH\t: Rp. ");
	kar.pkp(totalBersih, kar.ptkp());
	System.out.println(kar.pph());
	
	System.out.print("Total penghasilan yang diterima\t:");
	System.out.printf("%.2f",totalGaji = totalBersih -kar.pph());
	System.out.println();
	
	System.out.println("==============================================");
		
	}

}

/*
Contoh output:

==============================================
 			GAJI KARYAWAN IT
==============================================
Data pegawai
Masukkan nama		: Richa Fitria
Masukkan NIK		: 16326163623
Penempatan kerja (Jakarta/Bandung/Karawang)
Karawang
Tingkatan kerja (junior/middle/senior)
middle
Lama berkerja (dalam tahun):
2
Bagian (PG/SA/TS)	: SA
-----------------------------------------------
Data keluarga pegawai
Apakah anda sudah menikah? y/t
-----------------------------------------------
Rincian Gaji
Richa Fitria (16326163623)
Middle SA (2 Tahun)
Karawang
-----------------------------------------------
Gaji Pokok	: 
T. Keluarga	:
T. Pegawai	:
T. Transport:
Lembur		:
Bonus		:
Total penghasilan kotor : 
-----------------------------------------------
Potongan BPJS Kesehatan 	:
Potongan BPJS Ketenagakerjaan	:
Potongan PPH			:
Total penghasilan bersih :
===============================================
*/