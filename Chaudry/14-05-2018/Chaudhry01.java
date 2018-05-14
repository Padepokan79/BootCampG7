/*
	DATA CREATED 	: 13 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Chaudhry01{
	public static void main(String[] args){
		
		String gender, status, wargaNegara, tindakPidana;
		int tinggi, usia;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? (pria/wanita) ");
		gender 	= key.next();

		System.out.print("Berapa tinggi badan anda sekarang? ");
		tinggi 	= key.nextInt();

		System.out.print("Berapa usia anda sekarang? ");
		usia 	= key.nextInt();

		System.out.print("Apa status hubungan anda? (belum/menikah/janda/duda) ");
		status 	= key.next();

		System.out.print("Anda berkewarganegaraan? ");
		wargaNegara 	= key2.nextLine();

		System.out.print("Apa sebelumnya anda pernah melakukan pidana? (ya/tidak) ");
		tindakPidana 	= key.next();


		hasil 	= ( ((gender.equals("pria") && tinggi >= 165) || (gender.equals("wanita") && tinggi >= 160)) && usia >= 18 && usia < 22 && status.equals("belum") && wargaNegara.equals("indonesia") && tindakPidana.equals("tidak") ); 

		System.out.println("Apa anda telah memenuhi syarat? " + hasil);
		 
	}
}