/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 17 May 2018 12:52    
     * Updated By : 
     * Updated At : 
*/

public class TugasWhileKelipatan{
	public static void main(String[] args) {

		int angkaMaks = 100, angkaMinum= 1;

		while (angkaMinum <= angkaMaks) {
			int mod1 = angkaMinum%2;
			int mod2 = angkaMinum%4;

			if (mod1 > 0 || mod2 == 0) {
				System.out.println(angkaMinum);
			}
			angkaMinum +=1;
		}

	}
}