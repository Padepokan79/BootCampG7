/*
Create by	: Yana
Time 		: 3 Mei 2018 20.00
Update by	:
*/

import java.util.Scanner;

public class AriefBoolean1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		platNomor, tanggal, converPlatNomor, convertTanggal;
		boolean hasil;

		System.out.print("Plat Noomor: ");
		platNomor	= keyboard.nextInt();
		System.out.print("Tanggal: ");
		tanggal	= keyboard.nextInt();


		converPlatNomor	= platNomor%2;
		convertTanggal	= tanggal%2;

		hasil	= ( converPlatNomor == convertTanggal );

		
		System.out.println("Plat dan tanggal sesuai " +hasil);
	}
}