/*
created by : Malik chaudhary
time : 10-05-2018 2:09PM 
soal :

manusia mencari planet baru dengan karakteristik : ada air, kadar O2 20% dari total udara,total udara adalah 500rb ton/kubik 
temperaturnya 32 sd 40 derajat selsius,
boleh ada siang dan malam, dan umur planet harus 45 sd 200 milyar tahun.
*/

import java.util.Scanner;
public class RizaldiBoolean2{
	public static void main(String[] args){

		String air, status;
		int oksigen, temperatur, usia, maxUdara, minTemperatur, maxTemperatur, minUsia, maxUsia;
		double minOksigen;
		boolean adaStatus, tidakStatus, hasil, ya, tidak;
		
		Scanner planet = new Scanner(System.in);

		System.out.print("Apakah mengandung air ? (ya/tidak) : ");
 		air = planet.next();	

		System.out.print("Tingkat kadar oksigen di udara (ton/kubik): ");
 		oksigen = planet.nextInt();


 		System.out.print("Temperatur planet : ");
 		temperatur = planet.nextInt();


 		System.out.print("Usia planet : ");
 		usia = planet.nextInt();


 		System.out.print("Siang dan malam ? (ada/tidak) : ");
 		status = planet.next();

 		maxUdara = 500000;
 		minOksigen = 20.0/100 * maxUdara;
 		maxTemperatur = 40;
 		minTemperatur = 32;
 		minUsia = 4500;
 		maxUsia = 20000;
 		adaStatus = status.equals("ada");
 		tidakStatus = status.equals("tidak");
 		ya = air.equals("ya");
 		tidak = air.equals("tidak");


 		hasil = ( ya && oksigen == minOksigen && ( temperatur >= minTemperatur || temperatur <= maxTemperatur ) && ( adaStatus || tidakStatus ) && ( usia >= minUsia || usia <= maxUsia ) );

 		System.out.print("Apakah planet layak huni : "+hasil); 
	}
}