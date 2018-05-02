/*
Create by	: Yana
Time 		: 2 Mei 2018 11.29
Update by	:
*/

import java.util.Scanner;

public class FormRegistrasi{
	public static void main(String[] args){

		Scanner keyboard 	= new Scanner(System.in);
		Scanner line 		= new Scanner(System.in);

		String	namaDepan, namaBelakang, tempatLahir, tanggalLahir, alamat, kecamatan, kota, provinsi, deskripsi;
		int		tahunLahir, kodePos, tahunSekarang, usia;


		System.out.print("Nama Depan : ");
		namaDepan = keyboard.next();

		System.out.print("Nama Belakang : ");
		namaBelakang = keyboard.next();

		System.out.print("Tempat Lahir : ");
		tempatLahir = keyboard.next();

		System.out.print("Tanggal Lahir : ");
		tanggalLahir = line.nextLine();

		System.out.print("Tahun Lahir : ");
		tahunLahir = keyboard.nextInt();

		System.out.print("Alamat : ");
		alamat = line.nextLine();

		System.out.print("Kecamatan : ");
		kecamatan = keyboard.next();

		System.out.print("Kota/Kabupaten : ");
		kota = line.nextLine();

		System.out.print("Provinsi : ");
		provinsi = line.nextLine();

		System.out.print("Kode POS : ");
		kodePos = keyboard.nextInt();


		tahunSekarang	= 2018;
		usia			= tahunSekarang - tahunLahir;
		deskripsi		= namaDepan+" "+namaBelakang+", "+usia+ " tahun. Lahir di "+tempatLahir+", "+tanggalLahir+" "+tahunLahir+". \nBeralamat di "+alamat+", "+kecamatan+" "+kota+" "+provinsi+". \nKode Pos "+kodePos+".";


		System.out.println("======================================");
		System.out.println("=              BERHASIL              =");
		System.out.println("======================================");
		System.out.println();
		System.out.println("Selamat Datang,");
		System.out.println(deskripsi);		
		System.out.println();
		System.out.println("Terima kasih sudah bergabung dengan Kami.");
	}
}