/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	13.41
	* Updated by:
	*
*/
public class Ex48Drills1{
	public static void main(String[] args) {
		String[] planets={"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String[] values={"A","B","C","D","E"};

		for(String p:planets){
			System.out.println(p+"\t"+p.toUpperCase());
		}
		for(String value : values)
			System.out.print(value+"\t");
	}
}