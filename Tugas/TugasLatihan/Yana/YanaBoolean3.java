/*
Create by	: Yana
Time 		: 3 Mei 2018 12.28
Update by	:
*/

import java.util.Scanner;

public class SoalBooleanYana3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		Scanner line	 = new Scanner(System.in);

		int		semester;
		String	jenisKelamin, jenisBeasiswa, status;
		double  ipk, nilaiAlgoritma, nilaiDatabase, nilaiPemrograman, nilaiRataan;
		boolean hasilPPA, hasilPPB;

		System.out.print("Jenis Kelamin \"L\" atau \"P\": ");
		jenisKelamin = keyboard.next();

		System.out.print("Semester: ");
		semester = keyboard.nextInt();

		System.out.print("Jenis Beasiswa \"PPA\" atau \"PPB\": ");
		jenisBeasiswa = keyboard.next();

		System.out.print("IPK: ");
		ipk = keyboard.nextDouble();

		System.out.print("Status Ekonomi \"Mampu\" atau \"Tidak Mampu\": ");
		status = line.nextLine();

		System.out.print("Nilai Matakuliah Algoritma: ");
		nilaiAlgoritma = keyboard.nextDouble();

		System.out.print("Nilai Matakuliah Database: ");
		nilaiDatabase = keyboard.nextDouble();

		System.out.print("Nilai Matakuliah Pemrograman: ");
		nilaiPemrograman = keyboard.nextDouble();


		nilaiRataan	= ( nilaiDatabase + nilaiPemrograman ) / 2;
		hasilPPA	= ( ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && semester >= 3 && semester <= 5 &&
					  ( jenisBeasiswa.equals("PPA") && ipk >= 2.75 && ipk <= 4.00 && status.equals("Tidak Mampu") ) );
		hasilPPB	= ( ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && semester >= 3 && semester <= 5 && 
					  jenisBeasiswa.equals("PPB") && ipk >= 3.00 && ipk <= 4.00 && nilaiAlgoritma >= 8.0 && nilaiAlgoritma <= 10.0
					  && nilaiRataan >= 8.0 && nilaiRataan <= 10.0 );


		System.out.println();
		System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa PPA Informatika: " +hasilPPA);
		System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa PPB Informatika: " +hasilPPB);
	}
}