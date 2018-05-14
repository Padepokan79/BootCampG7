/*
created by : Malik chaudhary
time : 10-05-2018 2:46PM 
soal :

Lowongan pekerjaan
- Laki-laki
- Umur min 23
- Pendidikan S1/S2/S3
- Keahlian : - Java dan ANgularJs
	     - Java dan PHP
- Pengalaman : ya
*/

import java.util.Scanner;
public class YanaBoolean1{
	public static void main(String[] args){

		String kelamin, pendidikan, keahlian, keahlian2, pengalaman;
		int usia, minUsia;
		boolean hasil, ya, tidak, cewe, cowo, smp,sma,smk,s1,s2,s3, keahlianJava, keahlianAngular, keahlianPhp, keahlianJava2, keahlianAngular2, keahlianPhp2;

		Scanner pekerjaan = new Scanner(System.in);

		System.out.print("jenis kelamin (pria/wanita): ");
 		kelamin = pekerjaan.next();	

 		System.out.print("usia anda : ");
 		usia = pekerjaan.nextInt();	

 		System.out.print("pendidikan anda (smp/sma/smk/d1/d2/d3/d4/s1/s2/s3): ");
 		pendidikan = pekerjaan.next();	

 		System.out.print("Keahlian bahasa pemrograman anda 1 : ");
 		keahlian = pekerjaan.next();

 		System.out.print("Keahlian bahasa pemrograman anda 2 : ");
 		keahlian2 = pekerjaan.next();	

 		System.out.print("memiliki pengalaman (ya/tidak): ");
 		pengalaman = pekerjaan.next();	
			
 		cewe = kelamin.equals("wanita");
 		cowo = kelamin.equals("pria");

 		minUsia = 23;
 		s1 = pendidikan.equals("s1");
 		s2 = pendidikan.equals("s2");
 		s3 = pendidikan.equals("s3");

 		keahlianJava = keahlian.equals("Java");
 		keahlianAngular = keahlian.equals("AngularJs");
 		keahlianPhp = keahlian.equals("PHP");

 		keahlianJava2 = keahlian2.equals("Java");
 		keahlianAngular2 = keahlian2.equals("AngularJs");
 		keahlianPhp2 = keahlian2.equals("PHP");

 		ya = pengalaman.equals("ya");
 	    tidak = pengalaman.equals("tidak");

 		hasil = ( cowo && usia >= minUsia && ( s1 || s2 || s3 ) && ( keahlianJava && keahlianAngular2 || ( keahlianJava && keahlianPhp2 ) ) && ya );
	
		System.out.print("Apakah anda diterima : "+hasil); 
	}
}