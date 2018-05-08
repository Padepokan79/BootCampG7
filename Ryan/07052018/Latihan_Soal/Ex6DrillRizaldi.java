/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 07 Mei 2018 14:52    
     * Updated By : 
     * Updated At : 
*/
public class Ex6DrillRizaldi{
	public static void main(String[] args) {
		double uangAwal, hargaBaju, uangPendaftaran, hadiahLomba, hargaBoneka, sisaUang;

		uangAwal = 1000000;
		hargaBaju = 200000;
		uangPendaftaran = 50000;
		hadiahLomba = 1500000;
		hargaBoneka = 80000;

		sisaUang = uangAwal - hargaBaju - uangPendaftaran + hadiahLomba - hargaBoneka ;
		System.out.println("Sisa uang Dina adalah : "+sisaUang);
	}	
}
