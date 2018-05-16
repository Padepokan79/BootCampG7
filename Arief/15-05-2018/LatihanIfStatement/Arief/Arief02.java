/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Arief02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int harga, hargaMin, hargaMax, ram, ramMin, hdd, hddMin;
		double procie, procieMin, prociemax;
		String merek;
		boolean allowed, sultan, ngelag;

		procieMin = 2.8;
		prociemax = 2.5;
		hargaMin = 7000000;
		hargaMax = 10000000;
		ramMin = 8;
		hddMin = 500;

		System.out.print( "Merek: " );
		merek = inputKey.next();

		System.out.print( "RAM: " );
		ram = inputKey.nextInt();

		System.out.print( "HDD: " );
		hdd = inputKey.nextInt();

		System.out.print( "Processor: " );
		procie = inputKey.nextDouble();

		System.out.print( "Harga: " );
		harga = inputKey.nextInt();

		allowed = (harga >= hargaMin) && (harga <= hargaMax) && (ram >= ramMin) && (hdd >= hddMin);
		sultan = harga > hargaMax;
		ngelag = (ram < ramMin) || (hdd < hddMin);

		if (allowed) {
			System.out.println("Setuju untuk dibeli");
		}else if (sultan) {
			System.out.println("Anda Sultan Fanboy");
		}else if (ngelag) {
			System.out.println("Laptop Ngelag");
		}else if (merek.equals("ROG")) {
			System.out.println("Anda Fanboy");
		}
			
	}	
}