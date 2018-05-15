/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	09.33
	* Updated by:
	*
*/

import java.util.Scanner;

public class IfArief1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int tanggal, kapasitas, jenis, plat;
		String libur, izin, kawal, status;

		System.out.println("_____________________________________________\n");
		System.out.println("Jalan Bebas Hambatan dan Kenangan PasoePati");
		System.out.println("_____________________________________________\n");
		System.out.print("Masukkan Plat         : ");
		plat=scan.nextInt();
		System.out.print("Tanggal               : ");
		tanggal=scan.nextInt();
		System.out.print("Hari Libur     (y/n)  : ");
		libur=scan.next();
		System.out.print("Jenis Kendaraan       : ");
		jenis=scan.nextInt();
		System.out.print("Kapasitas Mesin       : ");
		kapasitas=scan.nextInt();
		System.out.print("Surat Izin     (y/n)  : ");
		izin=scan.next();
		System.out.print("Pengawalan     (y/n)  : ");
		kawal=scan.next();

		if(libur.equals("y"))
			status="Bebas Masuk Hari Libur";
		else if(izin.equals("y") && kawal.equals("y"))
			status="Silahkan Masuk";
		else if(jenis==2 && kapasitas<1000)
			status="Kendaraan Roda 2 dilarang masuk";
		else if(tanggal%2==plat%2)
			status="Diijinkan Memasuki toll";
		else if(plat%2==0)
			status="Khusus kendaraan dengan plat ganjil";
		else
			status="Khusus kendaraan dengan plat genap";
	
		System.out.println("\nStatus                : "+status);
		System.out.println("_____________________________________________\n");
		System.out.println("     Semoga Selamat Sampai Tujuan");
		System.out.println("_____________________________________________\n");
	}
}
