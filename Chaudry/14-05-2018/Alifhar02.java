/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Alifhar02{
	public static void main(String[] args){
		String warna;
		int speed, rilis;
		double speedAwal, speedAkhir;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);


		speedAwal = (20/0.5); // jarak / waktu(dalam jam)

		System.out.print("Apa warna mobil anda? ");
		warna 	= key2.nextLine();

		System.out.print("Berapa kecepatan mobil anda? ");
		speed 	= key.nextInt();

		System.out.print("Keluaran tahun berapa mobil anda? ");
		rilis 	= key.nextInt();

		speedAkhir = speedAwal + speed;
		hasil 	= ( warna.equals("biru") && speedAkhir >= 70 && (rilis == 2016 || rilis == 2017) );

		System.out.print("Apa mobil anda sesuai dengan kriteria ? " + hasil);
		 
	}
}