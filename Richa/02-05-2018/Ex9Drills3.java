/* 
Created by  		: Richa Fitria
Date/hour			: 2 Mei 2018/ 11.35 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class Ex9Drills3 {
	public static void main (String [] args){
		Scanner keyboard = new Scanner(System.in);
		Scanner integer = new Scanner (System.in); //untuk menghindari skip dengan lebih dari 

		String namadepan, namabelakang, tempatlahir, tanggallahir, alamat, kecamatan, kota, provinsi, greeting;
		int tahunlahir, kode, age;

		System.out.println ("Form Registrasi " );
		System.out.println();

		System.out.print ("Nama Depan : " );
		namadepan = keyboard.next ();

		System.out.print ("Nama Belakang : " );
		namabelakang = keyboard.next ();

		System.out.print ("Tempat Lahir : " );
		tempatlahir = keyboard.next ();

		System.out.print ("Tanggal Lahir : " );
		tanggallahir = integer.nextLine ();

		System.out.print ("Tahun Lahir : " );
		tahunlahir = keyboard.nextInt ();
		System.out.println();

		System.out.print ("Alamat : " );
		alamat = integer.nextLine ();

		System.out.print ("Kecamatan : " );
		kecamatan = keyboard.next ();

		System.out.print ("Kota/Kabupaten : " );
		kota = integer.nextLine ();

		System.out.print ("Provinsi : " );
		provinsi = integer.nextLine ();

		System.out.print ("Kode Pos : " );
		kode = integer.nextInt ();
		System.out.println();

		age = 2018-tahunlahir;

		greeting = namadepan + namabelakang + ", " + age + " tahun. Lahir di " + tempatlahir + ", " + tanggallahir + ".\nBeralamat di " + alamat + ", Kec. " + kecamatan + " " + kota + " " + provinsi + ".\nKode Pos " + kode + ".";


		System.out.println ("======================================");
		System.out.println ("=         REGISTRASI BERHASIL        =");
		System.out.println ("======================================");
		System.out.println();
		System.out.println("Selamat Datang,");
		System.out.println(greeting);
		System.out.println();
		System.out.println("Terimakasih Sudah bergabung Dengan Kami.");

	}
}


