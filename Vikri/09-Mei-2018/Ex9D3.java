/*
	Created by vikri
	09/05/2018
	11:16
*/
import java.util.Scanner;

public class Ex9D3{
	public static void main(String[] args) {
		String namaDepan, namaBelakang, tempatLahir, 
		tanggalLahir, alamat, kec, kota, provinsi, deskripsi;
		int tahunLahir, kodePos, tahun;
		Scanner ketik = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Nama Depan : ");
		namaDepan = ketik.next();

		System.out.print("Nama Belakang : ");
		namaBelakang = ketik.next();

		System.out.print("Tempat Lahir : ");
		tempatLahir = ketik.next();

		System.out.print("Tanggal Lahir : ");
		tanggalLahir = input.nextLine();

		System.out.print("Tahun Lahir : ");
		tahunLahir = ketik.nextInt();

		System.out.print("Alamat : ");
		alamat = input.nextLine();

		System.out.print("kecamatan : ");
		kec = ketik.next();
	
		System.out.print("Kota : ");
		kota = input.nextLine();

		System.out.print("Provinsi : ");
		provinsi = input.nextLine();

		System.out.print("Kode Pos : ");
		kodePos = ketik.nextInt();

		System.out.println("===========================");
		System.out.println("    Registrasi Berhasil");
		System.out.println("===========================");

		tahun = 2018-tahunLahir;
		deskripsi = "Selamat Datang,\n"+namaDepan+" "+namaBelakang+
							", "+tahun+" tahun. Lahir di "+tempatLahir+", "+tanggalLahir+" "+tahunLahir+
							". \nBeralamat di "+alamat+", Kec." +kec+" "+kota+" "+provinsi+
							". \nKode Pos "+kodePos+".\n\n"+
							"Terimakasih Sudah Bergabung dengan kami";
		System.out.println(deskripsi);

	}
}