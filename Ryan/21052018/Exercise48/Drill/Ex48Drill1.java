/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 13:22
     * Updated By : 
     * Updated At : 
*/

public class Ex48Drill1{
	public static void main(String[] args) {

		String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
          int[] angka = {2, 3, 5, 7, 9, 12, 14, 92};

		for (String p : planets) {
			System.out.println(p + "\t" + p.toUpperCase());
		}
          System.out.println();
          for (int ang : angka ) {
               System.out.print(ang+" ");
          }
          System.out.println();
          for (int index=0;index < angka.length ; index++) {
               System.out.print(angka[index]);
               System.out.print("/");
          }
	}
}