/*
	 Program     : Soal 2 - Arief
     Creator     : Khairil
     Created At  : 15 Mei 2018 13:16 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class AriefIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputMerk;
		int inputRam,inputHdd,inputHarga;
		double inputProcessor;
		boolean bolBudget, rangeProc, sideProc, underFans, highBudget, merkBohay1, merkBohay2, fanBoy, sultan, descProc;

		System.out.println("___________________________________________");
		System.out.println();
		System.out.println("	PORORO LAPTOP AND PC CENTER            ");
		System.out.println("___________________________________________");
		System.out.println();
		System.out.print("Merek		: ");
		inputMerk = keyboard.next();
		System.out.print("RAM		: ");
		inputRam = keyboard.nextInt();
		System.out.print("HDD(GB)   : ");
		inputHdd = keyboard.nextInt();
		System.out.print("Processor	: ");
		inputProcessor = keyboard.nextDouble();
		System.out.print("Harga		: ");
		inputHarga = keyboard.nextInt();

		merkBohay1 = inputMerk.equals("ASUS");
		merkBohay2 = inputMerk.equals("Alienware");
		bolBudget = inputHarga >= 7000000 && inputHarga <= 10000000;
		highBudget = inputHarga > 10000000;
		rangeProc = inputProcessor >= 2.8 && inputHarga <= 3.5;
		sideProc  = inputRam >= 8 && inputHdd >= 1024;
		descProc  = inputProcessor >= 4.2 || ( merkBohay1 || merkBohay2 ); 
		fanBoy = (merkBohay1 || merkBohay2);
		underFans = inputRam < 8 || inputHdd < 500;
		sultan = inputHarga > 10000000 && ( merkBohay1 || merkBohay2 );

		if( bolBudget ) {
			if( rangeProc && sideProc ) {
				System.out.println("Setuju Untuk Membeli");
			}
			else if( rangeProc && underFans ) {
				System.out.println("Laptop Ngelag");	
			}
			else if( descProc ) {
				if( fanBoy ) {
					System.out.println("Anda Fanboy");
				}
				else {
					System.out.println("Setuju Untuk Membeli");	
				}
			}
		}
		else if( highBudget ) {
			if( sultan ) {
				System.out.println("Anda Sultan Fanboy");
			}
			else if( descProc ) {
				if( fanBoy ) {
					System.out.println("Anda Fanboy");
				} 
				else {
					System.out.println("Setuju Untuk Membeli");	
				}
			}
			else {
				System.out.println("Ga Sreg");
			}
		}
		else {
			System.out.println("Ga Sreg");
		}
	}
}