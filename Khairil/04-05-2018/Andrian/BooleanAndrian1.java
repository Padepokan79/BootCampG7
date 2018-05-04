/*
	 Program     : Boolean Andrian 1 / Rave Party
     Creator     : Khairil
     Created At  : 3 Mei 2018 13:15 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanAndrian1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputteman, temanY, jk, l, p;
		int inputHadiah, hadiahMin, hadiahAlternate;
		double inputHandBeauty, handBeauty, hb;
		boolean raveParty;

		System.out.print( "Teman Nesa Bukan ? Y atau T  :  " );
		inputteman = keyboard.next();

		System.out.print( "Kamu Laki-laki apa Perempuan ? Input L atau P  :  " );
		jk = keyboard.next();

		System.out.print( "Bawa hadiah nya berapa nih ?  : " );
		inputHadiah = keyboard.nextInt();

		System.out.print( "Kamu Ganteng atau Cantik ga ? Skala 0.0 s.d. 10.0  :  " );
		inputHandBeauty = keyboard.nextDouble();

		temanY = "Y";
		l = "L";
		p = "P";
		hadiahMin = 5000000;
		hadiahAlternate = 20000000;
		handBeauty = 8.5;

		raveParty = ( inputteman.equals(temanY) && ( (inputHadiah >= hadiahMin && inputHandBeauty >= 8.5) || (inputHadiah >= hadiahAlternate) )   );
		System.out.println( "Ternyata kamu ke rave party nya : " + raveParty );		
	}
}