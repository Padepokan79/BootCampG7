/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Arief01{
	public static void main(String[] args){
		
		String hari;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Kapan toko mulai beraktifitas? ");
		hari 	= key.next();

		hasil 	= ( hari.equals("senin") || hari.equals("selasa") || hari.equals("rabu") || hari.equals("kamis") || hari.equals("sabtu") );

		System.out.print("Hari ini toko elektronik buka ? " + hasil);
		 
	}
}