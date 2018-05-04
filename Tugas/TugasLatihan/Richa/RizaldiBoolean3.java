/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 11.28 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class RizaldiBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String air;
		double o2, temperatur;
		int umur, totaludara;
		boolean yaAir, tinggal;

		System.out.println ("Planet baru!");

		System.out.print ("Ada air? (ya/tidak) ");
		air = keyboard.next ();

		yaAir = air.equals ("ya");
		
		totaludara = 500000; //ton/kubik

		System.out.print ("Kerapatan O2 (ton/kubik): ");
		o2= keyboard.nextDouble ();

		o2 = (o2/totaludara)* 100; // dalam persen


		System.out.print ("Temperatur: ");
		temperatur = keyboard.nextDouble ();

		System.out.print ("Umur: ");
		umur = keyboard.nextInt ();

		tinggal = (yaAir &&  o2>20 && (temperatur <= 40 && temperatur >= 32) && (umur <=2000000000 && umur >=45));

		System.out.println ("Planet baru ini dapat ditinggali? " + tinggal);
	}
}

