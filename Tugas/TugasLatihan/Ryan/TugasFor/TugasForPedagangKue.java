/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 12:09    
     * Updated By : 
     * Updated At : 
*/

public class TugasForPedagangKue{
	public static void main(String[] args) {

		int kue = 200, waktu = 15,
		waktuBerjualan = ((60*8)+30)/waktu;

		for (int i = 0;i <= waktuBerjualan ;i++ ) {
			kue = kue - 3 ;
		}
		System.out.println(kue);
	}
}