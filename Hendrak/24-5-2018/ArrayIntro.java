//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 1:49 PM
//Modified :
public class ArrayIntro {
	public static void main(String[] args) {
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		
		for (String p : planets)
		{
			System.out.println(p + "\t" + p.toUpperCase() );
		}

	}
}