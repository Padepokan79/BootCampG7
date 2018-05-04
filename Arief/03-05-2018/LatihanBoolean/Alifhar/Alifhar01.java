/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Alifhar01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		double speed, look, age, exp, minSpeed, maxSpeed, minLook, maxLook, minAge, defExp;
		boolean allowed;

		minLook = 9.0;
		maxLook = 10.0;
		minSpeed = 8.0;
		maxSpeed = 10.0;
		minAge = 30;
		defExp = 3;

		System.out.println( "Pencarian Partner" );
		System.out.println();

		System.out.print( "Kecepatan bekerja, skala 0.0 ~ 10.0: " );
		speed = inputKey.nextDouble();

		System.out.print( "Penampilan, skala 0.0 ~ 10.0: " );
		look = inputKey.nextDouble();

		System.out.print( "Usia : " );
		age = inputKey.nextDouble();

		System.out.print( "Lama Pengalaman : " );
		exp = inputKey.nextDouble();

		allowed = ((speed >= minSpeed && speed <= maxSpeed) && (look >= minLook && look <= maxLook) && ((age >= minAge) || (exp == defExp)));

		System.out.println();
		System.out.println( "Memenuhi syarat jadi partner? " + allowed );

	}
}
