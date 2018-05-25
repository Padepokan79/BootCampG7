/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class ArrayIntro {
	public static void main(String[] args) {
		String[] planets = { "Mercury", "venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" },
				months = { "January", "February", "March", "April", "May", "June", "juli", "August", "September", "October", "November", "December" };

		for ( String p : planets ) {
			System.out.println( p + "\t" + p.toUpperCase() );
		}
		for ( int index = 0 ; index < months.length ; index++ ) {
			String month = months[index];
			System.out.println( month + "\t\t" + month.toUpperCase() );
		}
	}
}