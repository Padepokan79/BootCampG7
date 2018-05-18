//created by:Hendra Kurniawan 
//Date: 18 Mei 2018 Time:9:07 AM
//Modified by :
import java.util.Scanner;

public class Ex11Drills3{
	public static void main(String[] args) {
		double hargaIndomie, hargaABC, hargaFrestea, hargaPiatos, hargaLays, totalHarga;
		double jumlahIndomie, jumlahABC, jumlahFrestea, jumlahPiatos, jumlahLays;
		double jumlahHargaIndomie, jumlahHargaABC, jumlahHargaFrestea, jumlahHargaPiatos,jumlahHargaLays;
		String barangIndomie, barangABC, barangFrestea, barangPiatos,barangLays;
		
		Scanner keyboard = new Scanner(System.in);
		barangIndomie = "Indomie";
		hargaIndomie = 2500;
		System.out.print("Masukan Jumlah Indomie : ");
		jumlahIndomie = keyboard.nextDouble();
		jumlahHargaIndomie = hargaIndomie * jumlahIndomie;

		barangABC = "ABC Susu";
		hargaABC = 1500;
		System.out.print("\nMasukan Jumlah ABC Susu : ");
		jumlahABC = keyboard.nextDouble();
		jumlahHargaABC = hargaABC * jumlahABC;

		barangFrestea = "Frestea";
		hargaFrestea = 4500;
		System.out.print("\nMasukan Jumlah Frestea : ");
		jumlahFrestea = keyboard.nextDouble();
		jumlahHargaFrestea = hargaFrestea * jumlahFrestea;

		barangPiatos ="Piatoss";
		hargaPiatos = 6500;
		System.out.print("\nMasukan Jumlah Piatos : ");
		jumlahPiatos = keyboard.nextDouble();
		jumlahHargaPiatos = hargaPiatos * jumlahPiatos;

		barangLays = "Lays";
		hargaLays = 7000;
		System.out.print("\nMasukan Jumlah Lays : ");
		jumlahLays = keyboard.nextDouble();
		jumlahHargaLays = hargaLays * jumlahLays;

		totalHarga = jumlahHargaLays+jumlahHargaPiatos+jumlahHargaFrestea+jumlahHargaABC+jumlahHargaIndomie;

		System.out.println("+------------------------------------------------+");
		System.out.println("|                                                |");
		System.out.println("|      APRILMART                                 |");
		System.out.println("|                                                |");
		System.out.println("| 2018-05-17	09:38AM                          |");
		System.out.println("| Nama Barang | Harga  | Jumlah | Jumlah Harga   |");
		System.out.println("| "+barangIndomie+"     |RP."+hargaIndomie+" | "+jumlahIndomie+"      | Rp."+jumlahHargaIndomie+"        |");
		System.out.println("| "+barangABC+"    |Rp."+hargaABC+" | "+jumlahABC+"      | Rp."+jumlahHargaABC+"  |");
		System.out.println("| "+barangFrestea+"     |Rp."+hargaFrestea+" | "+jumlahFrestea+"      | Rp."+jumlahHargaFrestea+"  |");
		System.out.println("| "+barangPiatos+"     |Rp."+hargaPiatos+" | "+jumlahPiatos+"      | Rp."+jumlahHargaPiatos+"  |");
		System.out.println("| "+barangLays+"        |Rp."+hargaLays+" | "+jumlahLays+"      | Rp."+jumlahHargaLays+"  |");
		System.out.println("|                                                |");
		System.out.println("|  Total Harga                  | Rp."+totalHarga+"     |");
		System.out.println("|                                                |");
		System.out.println("+------------------------------------------------+");	
	}

}