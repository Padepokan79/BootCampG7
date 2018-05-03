/*
Date Created	: 2 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ex9Drills3{
	public static void main ( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		Scanner inputKey2 = new Scanner(System.in);
		String firstName, lastName, birthPlace, birthDay, address, village, city, province, filledForm;
		int birthYear, postcode, yearNow, age;

		yearNow = 2018;

		System.out.println("Form Registrasi");

		System.out.print("Nama Depan : ");
		firstName = inputKey.next();

		System.out.print("\nNama Belakang : ");
		lastName = inputKey.next();

		System.out.print("\nTempat Lahir : ");
		birthPlace = inputKey.next();

		System.out.print("\nTanggal Lahir : ");
		birthDay = inputKey2.nextLine();

		System.out.print("\nTahun Lahir : ");
		birthYear = inputKey.nextInt();
		age = yearNow - birthYear;

		System.out.print("\nAlamat : ");
		address = inputKey2.nextLine();

		System.out.print("\nKecamatan : ");
		village = inputKey2.nextLine();

		System.out.print("\nKota/Kabupaten : ");
		city = inputKey2.nextLine();

		System.out.print("\nProvinsi : ");
		province = inputKey2.nextLine();

		System.out.print("\nKode Pos : ");
		postcode = inputKey.nextInt();

		filledForm = firstName + " " + lastName + ", " + age + " Tahun. " + "Lahir di " + birthPlace + ", " + birthDay + " " + birthYear +
					".\n" + "Beralamat di "+ address + ", Kec. " + village + " Kota " + city + " " + province +
					".\n" + "Kode Pos " + postcode + ".";

		System.out.println("==================================================================================");
		System.out.println("=                              REGISTRASI BERHASIL                               =");
		System.out.println("==================================================================================");
		System.out.println();
		System.out.println("Selamat Datang, ");
		System.out.println();
		System.out.println(filledForm);
		System.out.println();
		System.out.println("Terima Kasih sudah bergabung dengan kami.");




	}
}

/*
Form Registrasi

Nama Depan : Budi
Nama Belakang : Rianto
Tempat Lahir : Bandung
Tanggal Lahir: 21 April
Tahun Lahir : 1990 integer

Alamat : Jl. Haji Akbar no. 9
Kecamatan : Cicendo
Kota/Kabupaten : Kota Bandung
Provinsi : Jawa Barat
Kode Pos :40171 integer

Output Yang Diinginkan:

======================================
=         REGISTRASI BERHASIL	     =
======================================

Selamat Datang,
Budi Rianto, 28 tahun. Lahir di Bandung, 21 April 1990.
Beralamat di Jl. Haji Akbar no. 9, Kec. Cicendo Kota Bandung Jawa Barat.
Kode Pos 40171.

Terimakasih Sudah bergabung Dengan Kami.
*/