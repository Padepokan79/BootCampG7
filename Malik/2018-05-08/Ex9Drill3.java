/*
nama : Malik Chaudhary
time : 08-05-2018 3:41PM
*/
import java.util.Scanner;
public class Ex9Drill3{
	public static void main(String[] args){
		String namaDepan, namaBelakang, tempatLahir, tglLahir, alamat, kec, kota, prov, kodPos;
		int thnSkrg, usia, tahunLahir;	   

		Scanner input = new Scanner(System.in);	

		Scanner input2 = new Scanner(System.in);	


		System.out.print("Masukan nama depan :");
		namaDepan = input.next();

		System.out.print("Masukan nama belakang :");
		namaBelakang = input.next();

		System.out.print("Masukan tempat lahir :");
		tempatLahir = input.next();

		System.out.print("Masukan tanggal lahir :");
		tglLahir = input2.nextLine();

		System.out.print("Masukan tahun lahir :");
		tahunLahir = input.nextInt();

		System.out.print("Masukan alamat :");
		alamat = input2.nextLine();

		System.out.print("Masukan kecamatan :");
		kec = input.next();

		System.out.print("Masukan kota :");
		kota = input2.nextLine();

		System.out.print("Masukan provinsi :");
		prov = input2.nextLine();

		System.out.print("Masukan kode pos :");
		kodPos = input.next();

		thnSkrg = 2018;
		usia = thnSkrg-tahunLahir;

		System.out.println("==============================");
		System.out.println("=        REGISTRASI          =");
		System.out.println("==============================");
		System.out.print("Selamat Datang,\n"+namaDepan+" "+namaBelakang+", "+usia+" tahun. Lahir di "+tempatLahir+", "+tglLahir+" "+tahunLahir+".\nBeralamat di "+alamat+", Kec. "+kec+" "+kota+" "+prov+".\nKode Pos "+kodPos+".\n\nTerimakasih sudah bergabung dengan kami.");

	}
}