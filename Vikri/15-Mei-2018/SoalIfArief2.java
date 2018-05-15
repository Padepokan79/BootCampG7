/*
	Created By Vikri
	15/05/2018
*/
import java.util.Scanner;
public class SoalIfArief2{
	public static void main(String[] args) {
		int budget, ram, hdd, harga;
		double processor;
		String merek;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------");
		System.out.println(" Pororo Laptop And Pc Center");
		System.out.println("-----------------------------");

		System.out.print("Merek : ");
		merek = string.nextLine();

		System.out.print("Ram : ");
		ram = input.nextInt();

		System.out.print("HDD : ");
		hdd = input.nextInt();

		System.out.print("Processor : ");
		processor = input.nextDouble();

		System.out.print("Harga : ");
		harga = input.nextInt();

		System.out.println("");

		if (ram>=8) {
			if (hdd>=1000||hdd>500) {
				if (processor>=2.8&&processor<=3.5) {
					if (harga>=7000000&&harga<=10000000) {
						System.out.println("Setuju Untuk Dibeli");
					} else {
						System.out.println("Terlalu Murah/Mahal");
					}
				} else if (processor>=4.2) {
					if (merek.equals("Asus")||merek.equals("Apple")) {
						if (harga>=10000000) {
							System.out.println("Anda Sultan Fanboy");	
						} else {
							System.out.println("Anda Fanboy");	
						}
					} else {
						System.out.println("Setuju Untuk Dibeli");
					}
				} else {
					System.out.println("Laptop Nge Lag");
				}
			} else {
				System.out.println("Laptop nge lag");
			}
		} else {
			System.out.println("Laptop nge lag");
		}
	}
}