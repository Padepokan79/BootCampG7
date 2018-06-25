/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 01.21 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class Exercise48Drills1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String [] planets = { "Mercury", "Venus", "Earth", "Mars","Jupiter", "Saturn", "Uranus", "Neptune" };

		String buah [] = {"Pisang", "Mangga", "Apel", "jeruk", "Pepaya", "Alpukat"};

		for (int index = 0; index < planets.length; index++) {
			System.out.println(planets[index] + "\t" + planets[index].toUpperCase());
		}

		System.out.println();

		//foreach
		for (String namaBuah : buah) {
			System.out.println(namaBuah + "\t" + namaBuah.toUpperCase());
		}

		System.out.println();
		//bentuk lain 


		for (int i = 0; i < planets.length; i++) {
			String planet = planets [i];
			System.out.println(planets[i] + "\t" + planet.toUpperCase());
		}

	}
}