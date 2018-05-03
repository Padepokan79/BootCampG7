/*
     Creator     : Khairil
     Created At  : 2 Mei 2018 11:05 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

public class Drills3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner terserah = new Scanner(System.in);
		Scanner gitulah  = new Scanner(System.in);
		String firstName, lastName, placeBirth, monthBirth, dateBirth, addr, kec, kab, kot, prov, prov1, registered;
		int yearBirth, postalCode, age;

		System.out.print("Nama Depan    : ");
		firstName = keyboard.next();

		System.out.print("Nama Belakang : ");
		lastName = keyboard.next();

		System.out.print("Tempat Lahir  : ");
		placeBirth = keyboard.next();

		System.out.print("Tanggal Lahir : ");
		dateBirth = keyboard.next();
		monthBirth = keyboard.next();

		System.out.print("Tahun Lahir   : ");
		yearBirth = keyboard.nextInt();

		age = 2018 - yearBirth;

		System.out.println();
		System.out.print("Alamat        : ");
		addr = terserah.nextLine();		

		System.out.print("Kecamatan     : ");
		kec = keyboard.next();

		System.out.print("Kota/Kabupaten: ");
		kab = terserah.nextLine();

		System.out.print("Provinsi      : ");
		prov = gitulah.nextLine();

		System.out.print("Kode Pos      : ");
		postalCode = terserah.nextInt();		

		registered = "Selamat Datang, \n\n" + firstName + " " + lastName + ", " + age + " tahun. Lahir di " + placeBirth + ", " + dateBirth + " " + monthBirth + " " + yearBirth + " " ;
		registered = registered + "\nBeralamat di " + addr + ", Kec. " + kec + " " + kab + " " + prov;
		registered = registered + "\nKode Pos : " + postalCode; 

		System.out.println("========================================");
		System.out.println("-        REGISTRASI BERHASIL           -");
		System.out.println("========================================");
		System.out.println();
		System.out.println(registered);		
	}
}