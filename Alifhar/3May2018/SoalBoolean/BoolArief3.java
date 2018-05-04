/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	14.04
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolArief3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int ram;
		double processor, hdd;
		boolean boleh;

		System.out.print("\nJumlah RAM: ");
		ram=keyboard.nextInt();
		System.out.print("Kapasitas HDD (dalam TB): ");
		hdd=keyboard.nextDouble();
		System.out.print("Kecepatan Processor: ");
		processor=keyboard.nextDouble();
		
		boleh=( ram>=8 && hdd>=1.0 && (processor>=3.0 && processor<=4.5) );
		System.out.println("Spesifikasi laptop sesuai: "+boleh);
	}
}