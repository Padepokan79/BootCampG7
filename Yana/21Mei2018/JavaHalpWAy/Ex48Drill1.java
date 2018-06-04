/*
Created by	 : Yana
Time 		 : 21 Mei 2018 13.24
*/

public class Ex48Drill1{
	public static void main(String[] args) {
		
		String[] planets = { "Mercury", "Venus"};
		String[] teletubies = { "Tingkiwingki", "Dipsi", "Lala", "Poo"};

		for ( String name : teletubies) {
			System.out.println(name);
		}
		for (int name=0; name < teletubies.length; name++) {	
			String 	teletubie = teletubies[name];
			System.out.println(teletubies[name]+"\t"+teletubie.toUpperCase());
		}
	}
}