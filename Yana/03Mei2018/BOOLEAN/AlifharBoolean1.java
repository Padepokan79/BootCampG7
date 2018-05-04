/*
Create by	: Yana
Time 		: 3 Mei 2018 20.21
Update by	:
*/

import java.util.Scanner;

public class AlifharBoolean1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double 	kerapihan, kecepatanKerja, pengalaman;
		int		umur;
		boolean hasil;


		System.out.print("Kecepatan Kerja: ");
		kecepatanKerja	= keyboard.nextDouble();
		System.out.print("Kerapihan: ");
		kerapihan	= keyboard.nextDouble();
		System.out.print("Pengalaman Kerja: ");
		pengalaman	= keyboard.nextDouble();
		System.out.print("Umur: ");
		umur	= keyboard.nextInt();


		hasil	= ( kecepatanKerja > 8.0 && kecepatanKerja <= 10.0 && kerapihan >= 9.0 && kerapihan <= 10.0 &&
				  ( umur > 30 || pengalaman  >= 3 )  );
		
		
		System.out.println("Partner cocok: " +hasil);
	}
}