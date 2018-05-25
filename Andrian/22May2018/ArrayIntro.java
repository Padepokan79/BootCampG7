/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/

	public class ArrayIntro {
		public static void main(String[] args) {
			String[] planets = {"Mercury", "Venus", "Earth", "Mars",
								 "jupiter", "Saturn", "Uranus", "Neptune"};

			for ( String p : planets ) {
				System.out.println( p +"\t"+ p.toUpperCase());
			}
		}
	}