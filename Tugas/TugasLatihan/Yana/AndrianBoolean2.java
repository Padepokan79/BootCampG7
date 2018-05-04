/*
Create by	: Yana
Time 		: 3 Mei 2018 20.40
Update by	:
*/

import java.util.Scanner;

public class AndrianBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String	jenisKelamin, ktp;
		int		umur, penghasilan, tinggi;
		boolean hasil;


		System.out.print("Jenis Kelamin: L/P ");
		jenisKelamin	= keyboard.next();
		System.out.print("Memiliki KTP: Y/T ");
		ktp	= keyboard.next();
		System.out.print("Umur: ");
		umur	= keyboard.nextInt();
		System.out.print("Penghasilan ");
		penghasilan	= keyboard.nextInt();
		System.out.print("Tinggi Badan: ");
		tinggi	= keyboard.nextInt();


		hasil	= ( ktp.equals("Y") && umur > 25 && penghasilan >= 3000000 && ( ( jenisKelamin.equals("L") && tinggi >= 160 ) || ( jenisKelamin.equals("P") && tinggi >= 153 ) ) );
		
		System.out.println("Dipersilahkan ke konser: " +hasil);
	}
}