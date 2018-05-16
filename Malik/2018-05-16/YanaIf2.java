/*
Created By	: Malik Chaudhary
Time 		: 16-05-2018 7:47AM

Soal :

A. Jurusan Teknik Informatika (KODE: 345) & Sistem Informasi (KODE: 321)
Syarat:
- Semester 3 - 5
- ipk min. 3.0
- nilai prak. Algoritma : A
- nilai prak. Basis Data : A atau prak Struktur Data : A

B. Jurusan Teknik Komputer (KODE: 531)
Syarat:
- Semester 3 - 5
- ipk min 3.25
- nilai prak. Jaringan : A
- nilai prak. Rakitan min. : B

Contoh output:

=============================
Jurusan : 531
Semester : 4
Ipk : 3.5
Nilai prak. Jaringan : A
Nilai prak. Rakitan : A

Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer.
=============================
*/

import java.util.Scanner;
public class YanaIf2{
	public static void main(String[] args){
		Scanner kuliah = new Scanner(System.in);

		int jurusan, semester, minSemester, maxSemester, kodeSatu, kodeDua, kodeTiga;
		double ipk, maxIpk, minIpk;
		String nilaiJaringan, nilaiRakitan, nilaiAlgoritma, nilaiBasis, nilaiData, minNilai, maxNilai;

		minSemester		= 3;
		maxSemester		= 5;
		maxIpk			= 3.25;
		minIpk			= 3.0;
		kodeSatu		= 345;
		kodeDua			= 321;
		kodeTiga		= 531;
		minNilai		= "B";
		maxNilai		= "A";

		System.out.println("==============================");
		System.out.print("Jurusan : ");
		jurusan = kuliah.nextInt();

		if ( jurusan == kodeSatu || jurusan == kodeDua ) {
			System.out.print("Semester : ");
			semester = kuliah.nextInt();
			System.out.print("Ipk : ");
			ipk = kuliah.nextDouble();
			System.out.print("Nilai Prak. Algoritma : ");
			nilaiAlgoritma = kuliah.next();
			System.out.print("Nilai Prak. Basisdata : ");
			nilaiBasis = kuliah.next();
			System.out.print("Nilai Prak. Struktur data : ");
			nilaiData = kuliah.next();
			System.out.println(""); 
				if ( semester >= minSemester && semester <= maxSemester ) {
					if ( ipk >= minIpk ) {
						if ( nilaiAlgoritma.equals(maxNilai) ) {
							if ( nilaiBasis.equals(maxNilai) || nilaiData.equals(maxNilai) ) {
								System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
							}else{
								System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
							}
						}
					}
				}

		}else if ( jurusan == kodeTiga ) {
			System.out.print("Semester : ");
			semester = kuliah.nextInt();
			System.out.print("Ipk : ");
			ipk = kuliah.nextDouble();
			System.out.print("Nilai Prak. Jaringan : ");
			nilaiJaringan = kuliah.next();
			System.out.print("Nilai Prak. Rakitan : ");
			nilaiRakitan = kuliah.next();
			System.out.println("");	
				if ( semester >= minSemester && semester <= maxSemester ) {
					if ( ipk >= maxIpk ) {
						if ( nilaiJaringan.equals(maxNilai) ) {
							if ( nilaiRakitan.equals(minNilai) ) {
								System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
							}else{
								System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
							}
						}
					}
				}
		}
		

		
	}
}