/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Richa03{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int ageWife, ageHusband, ageDiff, fight, defFight, salary, defSalary;
		boolean allowed;

		defFight = 5;
		defSalary = 5000000;
		ageDiff = 9;
		
		System.out.println("Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!");
		System.out.println();

		System.out.print( "Umur Suami: ");
		ageHusband = inputKey.nextInt();

		System.out.print( "Umur Istri: ");
		ageWife = inputKey.nextInt();

		System.out.print( "Dalam sebulan berapa kali frekuensi kalian bertengkar? " );
		fight = inputKey.nextInt();

		System.out.print( "Berapa gaji suami dalam sebulan? " );
		salary = inputKey.nextInt();

		allowed = ((ageWife <= (ageHusband + ageDiff) && (ageWife >= (ageHusband - ageDiff))) &&(fight <= defFight) && (salary >defSalary));

		System.out.println();
		System.out.println("Ini hasilnya....");
		System.out.println("Apakah kalian cocok menjadi suami istri? " + allowed );

	}
}
