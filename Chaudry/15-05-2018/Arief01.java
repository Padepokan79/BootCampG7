/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Arief01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		boolean serasi, rodaDua;
		int tanggal, jenisKendaraan, kapasitas, platNomor;
		String libur, izin, pengawal;

		System.out.println("___________________________________________");
		System.out.println("Jalan Bebas Hambatan dan Kenangan Pasupati");
		System.out.println("___________________________________________");
		System.out.println("");
		System.out.print("Plat Nomor\t\t: ");
		platNomor 	= key.nextInt();

		System.out.print("Tanggal\t\t\t: ");
		tanggal = key.nextInt();

		System.out.print("Hari Libur (y/t)\t: ");
		libur 	= key.next();

		System.out.print("Jenis Kendaraan roda\t: ");
		jenisKendaraan 	= key.nextInt();

		System.out.print("Kapasitas Mesin\t\t: ");
		kapasitas 	= key.nextInt();

		System.out.print("Surat Izin (y/t)\t: ");
		izin 	= key.next();

		System.out.print("Pengawalan\t\t: ");
		pengawal 	= key.next();



		platNomor 	= platNomor%2;
		tanggal 	= tanggal%2;
		serasi		= platNomor == tanggal;
		rodaDua 	= (kapasitas >= 1000 || (kapasitas < 1000 && izin.equals("y") && pengawal.equals("y")));

		if (libur.equals("y")) {
			if (serasi || !serasi) {
				if (jenisKendaraan > 2 || (jenisKendaraan == 2 && rodaDua)) {

					System.out.println("Status\t\t\t: Bebas masuk hari libur");

				}else{
					System.out.println("Status\t\t\t: Tidak diperbolehkan masuk hari libur");
				}
			}else{
				System.out.println("Status\t\t\t: Tidak diperbolehkan masuk hari libur");
			}

		}else{
			if ( serasi ) {
					if (jenisKendaraan > 2 || (jenisKendaraan == 2 && rodaDua)) {
						System.out.println("Status\t\t\t: Diijinkan memasuki Tol");
					}else {
						System.out.println("Status\t\t\t: Tidak Diijinkan memasuki TOl");
					}
			}
		}

		System.out.println("");
		System.out.println("___________________________________________");
		System.out.println("Semoga selamat sampai tujuan");
		System.out.println("___________________________________________");
		
		
	}
}