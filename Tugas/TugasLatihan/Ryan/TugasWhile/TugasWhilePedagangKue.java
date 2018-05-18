/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 17 May 2018 12:54    
     * Updated By : 
     * Updated At : 
*/

public class TugasWhilePedagangKue{
	public static void main(String[] args) {

		int kue = 200, waktu = 15,detailWaktu = 0,
		waktuBerjualan = ((60*8)+30)/waktu;

		while (detailWaktu <= waktuBerjualan) {
			kue = kue - 3 ;
			detailWaktu++;
		}
		System.out.println("Sisa Kue adalah: "+kue);
		
	}
}