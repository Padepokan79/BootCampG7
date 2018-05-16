/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Arief02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		String merek;
		int ram, hdd, harga, qtyRAM, qtyMin, qtyMax, qtyHdd, maxHarga, nol;
		double processor, processA, processB, processC;
		boolean hargaAll, spesifikasi, spesifikasi2, spekLag;

		qtyRAM = 8;
		qtyMin = 7000000;
		qtyMax = 10000000;
		qtyHdd = 1024;
		maxHarga = 1000000;
		nol = 0;
		processA = 2.8;
		processB = 3.5;
		processC = 4.2;


		System.out.println("___________________________________________");
		System.out.println("        PORORO LAPTOP AND PC CENTER        ");
		System.out.println("___________________________________________");
		System.out.println("");
		
		System.out.print("Merek (y/t)\t\t: ");
		merek 	= key.next();

		System.out.print("RAM\t\t\t: ");
		ram 	= key.nextInt();

		System.out.print("HDD (dalam GB) \t\t: ");
		hdd 	= key.nextInt();

		System.out.print("Processor\t\t: ");
		processor 	= key.nextDouble();

		System.out.print("Harga\t\t\t: ");
		harga 	= key.nextInt();

		hargaAll = (harga >= qtyMin && harga < qtyMax);
		spesifikasi = (ram >= qtyRAM && hdd >= qtyHdd && processor >= processA && processor <= processB);
		spesifikasi2 = (processor >= processC || merek.equals("y"));
		spekLag = (ram < qtyRAM || hdd < qtyHdd);

		if (hargaAll) {
			if (spesifikasi) {
				System.out.println("Status\t\t\t: Setuju untuk dibeli");
			}else if (spesifikasi2) {
				if (merek.equals("y")) {
					System.out.println("Status\t\t\t: Anda FanBoy ");
				}else{
					System.out.println("Status\t\t\t: Setuju untuk dibeli ");
				}
			}else if (spekLag) {
				System.out.println("Status\t\t\t: Laptop nge lag ");
			}
		}else if (harga > maxHarga) {
			if(merek.equals("y")){
				System.out.println("Status\t\t\t: Anda Sultan FanBoy");
			}else if (spesifikasi2) {
				if (merek.equals("y")) {
					System.out.println("Status\t\t\t: Anda FanBoy ");
				}else{
					System.out.println("Status\t\t\t: Setuju untuk dibeli ");
				}
			}else if (spekLag) {
				System.out.println("Status\t\t\t: Laptop nge lag ");
			}
		}else{
			System.out.println("tidak sesuai");
		}
		System.out.println("");
		System.out.println("___________________________________________");
		System.out.println("           Semoga bermanfaat             ");
		System.out.println("___________________________________________");
		
		
	}
}			