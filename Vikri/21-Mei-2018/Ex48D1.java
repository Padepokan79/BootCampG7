/*
	Created By Vikri
	21/05/2018
	13:22
*/
public class Ex48D1{
	public static void main(String[] args) {
		String[] planets= {"Mercury", "Venus", "Earth", "Mars","Jupiter", "Saturn", "Uranus", "Neptune"};
		String[] matAngin= {"utara", "selatan", "barat", "timur"};
		System.out.println("");
		for (int i = 0; i < planets.length ; i++) {
			String plan = planets[i];
			System.out.println(plan+"\t"+planets[i].toUpperCase());
		}
		System.out.println("");
		for (String m : matAngin) {
			System.out.println(m+"\t"+m.toUpperCase());
		}
	}
}