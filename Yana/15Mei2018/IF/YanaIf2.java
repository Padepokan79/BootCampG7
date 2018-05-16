/*
Created by	: Yana
Time		: 14 Mei 2018 23.49
*/

import java.util.Scanner;

public class YanaIf2{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int		kodeJurusan, kodeInformatika, kodeSistemInformasi, kodeKomputer, semester;
		String	nilaiAlgoritma, nilaiBasisData, nilaiStrukturData, nilaiJaringan, nilaiRakitan;
		double	ipk;
		boolean syaratSemester, syaratIPK, syaratBeasiswaA, syaratBeasiswaB;

		kodeInformatika		= 345;
		kodeSistemInformasi	= 321;
		kodeKomputer		= 531;

		System.out.print("Masukkan kode jurusan: ");
		kodeJurusan = keyboard.nextInt();
		System.out.print("Masukkan semester: ");
		semester = keyboard.nextInt();
		System.out.print("Masukkan IPK: ");
		ipk = keyboard.nextDouble();

		syaratSemester 	= semester >= 3 && semester <= 5;

		if ( kodeJurusan == kodeInformatika || kodeJurusan == kodeSistemInformasi ) {

			System.out.print("Masukkan nilai Prak. Algoritma (A/B/C/D): ");
			nilaiAlgoritma = keyboard.next();
			System.out.print("Masukkan nilai Prak. Basis Data (A/B/C/D): ");
			nilaiBasisData = keyboard.next();
			System.out.print("Masukkan nilai Prak. Struktur Data (A/B/C/D): ");
			nilaiStrukturData = keyboard.next();


			syaratIPK		= ipk >= 3.0 && ipk <= 4.0;
			syaratBeasiswaA	= syaratSemester && syaratIPK && 
			nilaiAlgoritma.equals("A") && ( nilaiBasisData.equals("A") || 
				nilaiStrukturData.equals("A"));

			if ( syaratBeasiswaA && kodeJurusan == kodeInformatika ) {
				System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika");				
			}else if ( syaratBeasiswaA && kodeJurusan == kodeSistemInformasi ) {
				System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Sistem Informasi");				
			}else{
				System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika atau Sistem Informasi");
			}

		}else if ( kodeJurusan == kodeKomputer ) {

			System.out.print("Masukkan nilai Prak. Jaringan (A/B/C/D): ");
			nilaiJaringan = keyboard.next();
			System.out.print("Masukkan nilai Prak. Rakitan (A/B/C/D): ");
			nilaiRakitan = keyboard.next();

			syaratIPK		= ipk > 3.25 && ipk <= 4.0;
			syaratBeasiswaB	= syaratSemester && syaratIPK && 
			nilaiJaringan.equals("A") && nilaiRakitan.equals("A");

			if ( syaratBeasiswaB ) {
				System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik KOmputer");
			}else{
				System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik KOmputer");
			}

		}			
	}
}