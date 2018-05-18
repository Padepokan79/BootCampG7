/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 18 May 2018 12:56    
     * Updated By : 
     * Updated At : 
*/

public class TugasDoWhileKelipatan{
	public static void main(String[] args) {

		int angkaMaks = 100, angkaMinum= 1;

		do{
			int mod1 = angkaMinum%2;
			int mod2 = angkaMinum%4;

			if (mod1 > 0 || mod2 == 0) {
				System.out.println(angkaMinum);
			}
			angkaMinum +=1;
		}while (angkaMinum <= angkaMaks);
			
	}
}