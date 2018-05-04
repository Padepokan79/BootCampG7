/*
Create by	: Yana
Time 		: 3 Mei 2018 20.05
Update by	:
*/

import java.util.Scanner;

public class AriefBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double	ram, penyimpanan, processor;
		boolean hasil;

		System.out.print("RAM (GB): ");
		ram	= keyboard.nextDouble();
		System.out.print("Penyimpanan (GB): ");
		penyimpanan	= keyboard.nextDouble();
		System.out.print("Processor (GHz:) ");
		processor	= keyboard.nextDouble();

		hasil	= ( ram >= 8 && penyimpanan >= 1024 && processor >= 3.0 && processor <= 4.5 );

		
		System.out.println("Komputer sesuai: " +hasil);
	}
}