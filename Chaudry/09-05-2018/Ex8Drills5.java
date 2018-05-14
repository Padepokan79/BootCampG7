/*
	DATA CREATED 	: 09 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ex8Drills5{
	public static void main(String[] args){
		String kalimat, namaDepan, namaBelakang, tmptLahir, tglLahir, alamat, kcmtn, kota, provinsi;
		int thnLahir, kodePos, usia, tahunNow;

		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.print("Nama Depan : " );
		namaDepan 	= key.next();
		System.out.println();

		System.out.print("Nama Belakang : " );
		namaBelakang 	= key.next();
		System.out.println();

		System.out.print("Tempat Lahir : " );
		tmptLahir 	= key.next();
		System.out.println();

		System.out.print("Tanggal Lahir : " );
		tglLahir 	= key2.nextLine();
		System.out.println();

		System.out.print("Tahun Lahir : " );
		thnLahir 	= key.nextInt();
		System.out.println();

		System.out.print("Alamat : " );
		alamat 	= key2.nextLine();
		System.out.println();

		System.out.print("Kecamatan : " );
		kcmtn 	= key2.nextLine();
		System.out.println();

		System.out.print("Kota/Kabupaten : " );
		kota 	= key2.nextLine();
		System.out.println();

		System.out.print("Provinsi : " );
		provinsi 	= key2.nextLine();
		System.out.println();

		System.out.print("Kode Pos : " );
		kodePos 	= key.nextInt();
		System.out.println();

		tahunNow 	= 2018;
		usia 		= tahunNow - thnLahir;
		kalimat 	= namaDepan+" "+namaBelakang+", "+usia+" tahun. Lahir di "+tmptLahir+", "+tglLahir+" "+thnLahir+".\nBeralamat di "+alamat+", Kec. "+kcmtn+" "+kota+" "+provinsi+".\nKode Pos "+kodePos; 


		System.out.println();
		System.out.println();
		System.out.println("=============================================");
		System.out.println("=            REGISTRASI BERHASIL            =");
		System.out.println("=============================================");
		System.out.println();
		System.out.println("Selamat Datang,\n" + kalimat);
		System.out.println();
		System.out.println("Terima kasih sudah bergabung dengan kami.");


	}
}