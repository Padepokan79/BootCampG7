/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 2.20 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class AndrianBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String gender;
		int hadiah;
		double penampilan;
		boolean masuk;

		System.out.println ("Permission untuk join ke rave party Nesa");
		System.out.println ("++++++++++++++++++++++++++++++++++++++++");

		System.out.print ("Gender kamu (L/P): ");
		gender = keyboard.next ();
		System.out.print ("Total nilai hadiah kamu: ");
		hadiah = keyboard.nextInt ();
		System.out.print ("Penampilan kamu (0.0 - 10.0): ");
		penampilan = keyboard.nextDouble ();

		masuk = (penampilan >= 8.5 && hadiah >5000000 ) || (penampilan <= 8.5 && hadiah > 20000000);

		System.out.print ("Kamu sesuai kriteria? " + masuk);
	}
}
