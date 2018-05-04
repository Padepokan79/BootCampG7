/*
Create by	: Yana
Time 		: 3 Mei 2018 15.28
Update by	:
*/

import java.util.Scanner;

public class RizaldiBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String	air, siangMalam; 
		double	kadarO2, inputO2, udara;
		int		umur, temperatur;
		boolean hasil;

		System.out.print("Apakah ada air? \"Y\"/\"T\": ");
		air		= keyboard.next();
		System.out.print("Kadar Oksigen: ");
		inputO2	= keyboard.nextDouble();
		System.out.print("Total Udara: ");
		udara	= keyboard.nextDouble();
		System.out.print("Temperatur: ");
		temperatur	= keyboard.nextInt();
		System.out.print("Siang / Malam: ");
		siangMalam	= keyboard.next();
		System.out.print("AUmur Planet: ");
		umur		= keyboard.nextInt();

		kadarO2	= 20 * udara / 100;

		hasil	= ( air.equals("Y") && udara == 500000 && inputO2 == kadarO2 && temperatur >= 32 && temperatur <= 40 && siangMalam.equals("Y") && umur >= 45 && umur <= 200 );

		System.out.println("Benar Planet yang dicari: " + hasil);
	}
}