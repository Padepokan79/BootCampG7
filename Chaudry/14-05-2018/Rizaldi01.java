/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Rizaldi01{
	public static void main(String[] args){
		
		String makan, minum, berak;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Makanan apa yang anda berikan? ");
		makan 	= key.nextLine();

		System.out.print("Minuman apa yang anda berikan? ");
		minum 	= key.nextLine();

		System.out.print("Dimanakah kucing anda berak? ");
		berak 	= key.nextLine();

		hasil 	= ((makan.equals("rumput") || makan.equals("dedak")) && minum.equals("air hujan") && berak.equals("pasir"));

		System.out.print("Apakah anda termasuk kriteria kami? " + hasil);
		 
	}
}