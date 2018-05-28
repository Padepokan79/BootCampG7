/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 13:22
     * Updated By : 
     * Updated At : 
*/

public class ArrayIntro{
	public static void main(String[] args) {

		String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};

		for (String p : planets) {
			System.out.println(p + "\t" + p.toUpperCase());
		}
	}
}