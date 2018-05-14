/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Khairil01{
	public static void main(String[] args){
		
		String gender, status, domisili;
		int nilai;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Apakah anda pernah mengikuti seleksi olimpiade? (ya/tidak) ");
		status 	= key.next();

		System.out.print("Anda berdomisili dimana? ");
		domisili 	= key2.nextLine();

		System.out.print("Berapa nilai MTK anda? (selama 2 semester) ");
		nilai 	= key.nextInt();


		hasil 	= ( (gender.equals("pria") || gender.equals("wanita")) && status.equals("tidak") && domisili.equals("bandung") && nilai >= 8 );

		System.out.print("Apakah anda lolos seleksi? " + hasil);
		 
	}
}