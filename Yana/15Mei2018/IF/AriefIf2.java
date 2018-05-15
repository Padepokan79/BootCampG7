/*
Created by	: Yana
Time		: 15 Mei 2018 13.08
*/

import java.util.Scanner;

public class AriefIf2{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		boolean targetBudget, targetProcessor, syarat1, syarat2, maksyakeun, sultan, fanboy;
		String 	merek;
		int 	ram, hdd, harga;
		double 	processor;

		System.out.println("___________________________________________");
		System.out.println();
		System.out.println("        PORORO LAPTOP AND PC CENTER       ");
		System.out.println("___________________________________________");

		System.out.print("Merek Terkenal (Y/N) : ");
		merek = keyboard.next();
		System.out.print("RAM                  : ");
		ram = keyboard.nextInt();
		System.out.print("HDD                  : ");
		hdd = keyboard.nextInt();
		System.out.print("Processor            : ");
		processor = keyboard.nextDouble();
		System.out.print("Harga                : ");
		harga = keyboard.nextInt();

		targetBudget 	= harga >= 7000000 && harga <= 10000000;
		targetProcessor = processor >= 2.8 && processor <= 3.5;
		syarat1			= ram >= 8 && hdd >= 1024;
		syarat2			= processor >= 4.2 || merek.equals("Y");
		maksyakeun		= ram < 8 || hdd < 500;
		sultan 			= harga > 10000000 && merek.equals("Y");
		fanboy 			= merek.equals("Y");

		if ( targetBudget ) {
			if ( targetProcessor && syarat1) {
				System.out.println("\nSetuju untuk dibeli");
			}
			else if ( targetProcessor && maksyakeun) {
				System.out.println("\nSetuju membeli laptop ngelag");
			}
			else if ( syarat2 ) {
				if (fanboy) {
					System.out.println("Anda Fanboy");					
				}
				else{					
					System.out.println("Anda setuju untuk membeli");
				}
			}
		}
		else if ( harga > 10000000) {
			if ( sultan) {
				System.out.println("\nAnda Sultan Fanboy");
			}
			else if ( syarat2) {
				if (fanboy) {
					System.out.println("\nAnda Fanboy");					
				} else {
					System.out.println("\nAnda setuju membeli");
				}
			}
			else{
				System.out.println("\nTidak ada yang sesuai");
			}
		}
		else {
			System.out.println("\nTidak ada yang sesuai");
		}

		System.out.println("___________________________________________");
		System.out.println();
		System.out.println("             SEMOGA BERMANFAAT             ");
		System.out.println("___________________________________________");
	}
}

/*
2. Laptop Keroro

Keroro ingin membeli laptop baru agar bisa main game high-end terbaru, budget yang ia keluarkan ingin 7.000.000 dan 
tidak lebih dari 10.000.000 dengan spesifikasi RAM 8GB, HDD 1TB, Kecepatan Processor ada di rentang 2.8 GHz ~ 3.5 GHz, 
namun ia akan tetap membeli berapapun harganya jika Kecepatan processor setidaknya 4.2 GHz atau merek gaming ternama. 
disisi lain ia tidak suka laptop dengan spesifikasi RAM lebih sedikit dari 8 GB, atau HDD kurang dari 500GB

OUTPUT
___________________________________________

	PORORO LAPTOP AND PC CENTER
___________________________________________

Merek		:
RAM		:
HDD		:
Processor	:
Harga		:

Status		: Anda Fanboy			>> Jika Merek ternama yang dibeli
		  Setuju untuk dibeli		>> Jika semua terpenuhi
		  Laptop Ngelag			>> Ram / HDD dibawah keinginan
		  Anda Sultan Fanboy		>> Jika Laptop Mahal dan Merk Ternama
___________________________________________

	     Semoga Bermanfaat
___________________________________________
*/