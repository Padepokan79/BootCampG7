/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.40
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolYana1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int umur;
		String kelamin, pendidikan, java, angular, php, pengalaman;
		boolean diterima;

		System.out.print("\nJenis Kelamin (pria/wanita): ");
		kelamin=keyboard.next();
		System.out.print("Umur: ");
		umur=keyboard.nextInt();
		System.out.print("Pendidikan (SMA/S1/S2/S3) ");
		pendidikan=keyboard.next();
		System.out.print("Punya keahlian Java (ya/tidak): ");
		java=keyboard.next();
		System.out.print("Punya keahlian ANgularJS (ya/tidak): ");
		angular=keyboard.next();
		System.out.print("Punya keahlian PHP (ya/tidak): ");
		php=keyboard.next();
		System.out.print("Punya Pengalaman (ya/tidak): ");
		pengalaman=keyboard.next();

		diterima=(kelamin.equals("pria") && umur>=23 && (pendidikan.equals("S1") || pendidikan.equals("S2") || pendidikan.equals("S3")) && java.equals("ya") && (angular.equals("ya")||php.equals("ya")) && pengalaman.equals("ya") );
		
		System.out.println("Anda diterima "+diterima);
	}
}