/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 18 May 2018 12:58    
     * Updated By : 
     * Updated At : 
*/

public class TugasDoWhilePedagangKue{
	public static void main(String[] args) {

		int kue = 200, waktu = 15,detailWaktu = 0,
		waktuBerjualan = ((60*8)+30)/waktu;

		do{
			kue = kue - 3 ;
			detailWaktu++;
		}while (detailWaktu <= waktuBerjualan);

		System.out.println("Sisa Kue adalah: "+kue);
		
	}
}