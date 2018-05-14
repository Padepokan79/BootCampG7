/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At :    
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex15Drill1{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print("How Old Are You? ");
		age = keyboard.nextInt();

		System.out.println("You are : ");
		if (age < 13) {
			System.out.println("\ttoo young to create facebook account");
		}
		if (age < 16) {
			System.out.println("\ttoo young to get a driver's license");
		}
		if (age < 18) {
			System.out.println("\ttoo young to get a tattoo");
		}
		if (age < 21) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if (age < 35) {
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)");
		}

	}

	// Tidak Akan ada output karena usia lebih dari 35 tahun tidak ada yang cocok dengan pilihan
}