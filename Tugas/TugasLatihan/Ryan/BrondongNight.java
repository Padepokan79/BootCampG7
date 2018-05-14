/*
     * Selasa, Brondong Night
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 12:39
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BrondongNight{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String gender;
		int age;
		double cute;
		boolean allowed, allowed1;

		System.out.println("Apa jenis kelamin anda? L/P");
		gender = keyboard.next();

		System.out.println("Dalama skala 0.0 sampai 10.0, berapa nilai penampilan anda? ");
		cute = keyboard.nextDouble();

		System.out.println("Umur Anda? ");
		age = keyboard.nextInt();

		allowed = ((gender.equals("P") && (age>=30 && age<=45) && cute>=8) || (gender.equals("L") && (age>=20 && age<=25) && cute<8));

		System.out.println("Oke Berdasarkna kualifikasi, anda dinyatakan : "+allowed);
	}
}