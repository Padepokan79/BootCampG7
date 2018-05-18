/*
Created  by 	: Yana
Time			: 17 Mei 2018 05.52
*/

import java.util.Scanner;

public class BintangKetupat{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int tingkat, n,  tinggiAtas, tinggiBawah,
			spasiKiriAtas, isiAtas, spasiKiriBawah, isiBawah;

		System.out.print("Jumlah Tingkatan: ");
		tingkat = keyboard.nextInt();

		n = tingkat/2;

		for (tinggiAtas=0; tinggiAtas < n+1; tinggiAtas++) {
			for ( spasiKiriAtas=0; spasiKiriAtas < n-tinggiAtas; spasiKiriAtas++) {
				System.out.print(" ");
			}
			for ( isiAtas=0; isiAtas<2*tinggiAtas+1; isiAtas++) {
				if (tinggiAtas==0 || isiAtas==0 ||isiAtas==2*tinggiAtas) {					
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (tinggiAtas=n-1; tinggiAtas >= 0; tinggiAtas--) {
			for ( spasiKiriAtas=0; spasiKiriAtas < n-tinggiAtas; spasiKiriAtas++) {
				System.out.print(" ");
			}
			for ( isiAtas=0; isiAtas<2*tinggiAtas+1; isiAtas++) {
				if (tinggiAtas==0 || isiAtas==0 ||isiAtas==2*tinggiAtas) {					
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}