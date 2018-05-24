//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 7:31 AM
//Modified :
import java.util.Scanner;

public class AriefIf1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int tanggal,pNomor,jKendaraan,kapMesin;
		String libur,suratIzin,status="", pengawalan;


		System.out.println("-------------------------------------------");
		System.out.println("Jalan Bebas Hambatan dan Kenangan Pasoepati");
		System.out.println("-------------------------------------------");
		System.out.print("Plat Nomor       :");
		pNomor = keyboard.nextInt();
		System.out.print("Tanggal          :");
		tanggal = keyboard.nextInt();
		System.out.print("Hari Libur  (y/n):");
		libur = keyboard.next();
		System.out.println("Jenis Kendaraan         ");
		System.out.println("-------------------------");
		System.out.println("1.Roda Dua");
		System.out.println("2.Roda Empat");
		System.out.print("Pilih Jenis Kendaraan (1/2):");
		jKendaraan = keyboard.nextInt();
		System.out.print("Kapasitas Mesin (0-10000cc):");
		kapMesin = keyboard.nextInt();
		System.out.print("Surat Izin  (y/n):");
		suratIzin = keyboard.next();
		System.out.print("Pengawalan  (y/n):");
		pengawalan = keyboard.next();

		if(libur.equals("y"))
		{
			status ="Semua Kendaraan Bisa Masuk";
		}
		else if((pNomor%2 == tanggal%2 && tanggal%2 == 0)&&(jKendaraan==2 || kapMesin>1000))	
		{
			status ="Kendaraan Plat Nomor Genap Bisa Masuk";
		}
		else if((pNomor%2 == tanggal%2 && tanggal%2 == 1)&&(jKendaraan==2 || kapMesin>1000))
		{
			status ="Kendaraan Plat Nomor Ganjil Bisa Masuk";
		}

		if(jKendaraan==1 && kapMesin <1000)
		{
			status="Dilarang Masuk Kapanpun!!";
		}
		if(suratIzin.equals("y")&&pengawalan.equals("y"))
		{
			status ="Kendaraan Apapun Boleh Masuk !";
		}
		

		System.out.println(status);









		
	}
}