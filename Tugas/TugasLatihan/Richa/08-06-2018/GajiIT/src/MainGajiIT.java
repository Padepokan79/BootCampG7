/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.Scanner;

public class MainGajiIT {

	public static void main(String[] args) {
		
	//class yang diambil
	Scanner keyboard = new Scanner (System.in);
	Karyawan kar = new Karyawan();
	Programmer pg = new Programmer ();
	Analis sa = new Analis ();
	Tester ts = new Tester ();
	
	String nama, nik, penempatan, tingkat, bagian, apakahMenikah;
	int lamaKerja, fixBug, testCase, jamLembur;
		
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
	System.out.println(nama + "(" + nik + ")");
	System.out.println();
	System.out.println("-----------------------------------------------");
	System.out.println("Gaji Pokok\t: ");
	System.out.println("T. Keluarga\t:");
	System.out.println("T. Pegawai\t:");
	System.out.println("T. Transport\t:");
	System.out.println("Lembur\t:");
	System.out.println("Bonus\t:");
	System.out.println("Total penghasilan kotor\t: ");
	System.out.println("-----------------------------------------------");
	System.out.println("Potongan BPJS Kesehatan\t:");
	System.out.println("Potongan BPJS Ketenagakerjaan\t:");
	System.out.println("Potongan PPH\t:");
	System.out.println("Total penghasilan bersih\t:");
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