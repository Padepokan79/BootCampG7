/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.30
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolRizaldi3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int umur;
		double o2, udara=500000, temperatur, persen=20.0/100.0;
		String air;
		boolean lulus;

		System.out.print("\nTerdapat air (ya/tidak): ");
		air=keyboard.next();
		System.out.print("Kadar O2: ");
		o2=keyboard.nextDouble();
		System.out.print("Temperatir dalam derajat: ");
		temperatur=keyboard.nextDouble();
		System.out.print("Terdapat siang dan malam (ya/tidak): ");
		keyboard.next();
		System.out.print("Umur Planet: ");
		umur=keyboard.nextInt();

		lulus=(air.equals("ya") && o2==(persen*udara) && temperatur>=32 && temperatur<=40 && umur>=45 && umur<=200);
		
		System.out.println("Planet dapat ditinggali "+lulus);
	}
}