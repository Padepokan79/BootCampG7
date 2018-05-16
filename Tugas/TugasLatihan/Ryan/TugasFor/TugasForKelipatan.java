/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 11:40    
     * Updated By : 
     * Updated At : 
*/

public class TugasForKelipatan{
	public static void main(String[] args) {

		int angkaMaks = 1000;

		System.out.println("Angka Kelipatan ");
		for (int i = 1 ; i <= angkaMaks ; i ++) {
			int mod1 = i%2;
			int mod2 = i%4;

			if (mod1 > 0 || mod2 == 0) {
				System.out.println(i);
			}
			
		}


	}
}