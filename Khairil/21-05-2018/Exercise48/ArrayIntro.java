/*
	 Program     : Exercise 48 - Array Intro
     Creator     : Khairil
     Created At  : 21 Mei 2018 13:21 PM     
     Updated By  : 
     Update Date : 
*/
public class ArrayIntro {
	public static void main( String[] args ) {
		int index;
		String[] planets = { "Mercury", "Venus", "Earth", "Mars",
						"Jupiter", "Saturn", "Uranus", "Neptune" };

		for ( String p : planets ) {
			System.out.println( p + "\t" + p.toUpperCase() );
		}

		for (index = 0; index < planets.length; index++) {
			String planet = planets[index];
			System.out.println(planet);
		}
	}
}