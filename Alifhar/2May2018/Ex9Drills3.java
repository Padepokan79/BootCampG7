/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	11.28
	* Updated by:
	*
*/

import java.util.Scanner;

public class Ex9Drills3{
	public static void main(String[] args){
		String namaDep, namaBel, tempatLahir, bulanLahir, alamat, kec, kota, prov, kalimat, kalimat2, kalimat3;
		int tahunLahir, kodePos, usia;

		Scanner keyboard=new Scanner(System.in);
		Scanner baru=new Scanner(System.in);

		System.out.println("\nForm Registrasi\n");
		System.out.print("Nama Depan : ");
		namaDep=keyboard.next();
		System.out.print("Nama Belakang : ");
		namaBel=keyboard.next();
		System.out.print("Tempat Lahir : ");
		tempatLahir=keyboard.next();
		System.out.print("Tanggal Lahir : ");
		bulanLahir=baru.nextLine();
		System.out.print("Tahun Lahir : ");
		tahunLahir=keyboard.nextInt();
		System.out.print("\nAlamat : ");
		alamat=baru.nextLine();
		System.out.print("Kecamatan : ");
		kec=keyboard.next();
		System.out.print("Kota/Kabupaten : ");
		kota=baru.nextLine();
		System.out.print("Privinsi : ");
		prov=baru.nextLine();
		System.out.print("Kode Pos : ");
		kodePos=keyboard.nextInt();

		usia=2018-tahunLahir;
		kalimat=namaDep+" "+namaBel+", "+usia+" tahun. Lahir di"+tempatLahir+", "+bulanLahir+" "+tahunLahir+".\n"+
				"Beralamat di "+alamat+", Kec. "+kec+" "+kota+" "+prov+".\n"+
				"Kode Pos "+kodePos+".";

		System.out.println("\n=========================================");
		System.out.println("=      REGISTRASI BERHASIL              =");
		System.out.println("=========================================");
		System.out.println("\nSelamat Datang,");
		System.out.println(kalimat);
		System.out.println("Terimakasih sudah bergabung dengan kami");
	}
}